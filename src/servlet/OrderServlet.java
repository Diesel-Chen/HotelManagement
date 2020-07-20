package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import base.BaseServlet;
import dao.CategoryDao;
import dao.HouseDao;
import dao.OrderDao;
import vo.Category;
import vo.House;
import vo.Order;
import vo.Page;


public class OrderServlet extends BaseServlet {
	
	public String findAllOrdersByPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int pageSize = 7;
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		OrderDao oDao = new OrderDao();
		List<Order> list = oDao.findAllOrdersByPage(currentPage,pageSize);
		request.setAttribute("list", list);
		int totalRecord = oDao.findAllCounts();
		int totalPage = totalRecord % pageSize == 0 ? totalRecord / pageSize : (totalRecord / pageSize)+1;
		String url = "OrderServlet?method=findAllOrdersByPage";
		Page pageInfo = new Page(currentPage,totalPage,pageSize,totalRecord,url);
		request.setAttribute("pageInfo", pageInfo);
		return "/jsp/order.jsp";
	}
	public String findOrderByConsumer(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String consumer = request.getParameter("consumer");
		OrderDao oDao = new OrderDao();
		Order order =  oDao.findOrderByConsumer(consumer);
		request.setAttribute("order", order);
		return "/jsp/order.jsp";
	}
	public String findOrderByState(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int pageSize = 7;
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		String state = request.getParameter("state");
		request.setAttribute("state", state);
		OrderDao oDao = new OrderDao();
		List<Order> list =  oDao.findOrderByState(state,currentPage,pageSize);
		request.setAttribute("list",list);
		int totalRecord = oDao.findCountsByState(state);
		int totalPage = totalRecord % pageSize == 0 ? totalRecord / pageSize : (totalRecord / pageSize)+1;
		String url = "OrderServlet?method=findOrderByState";
		Page pageInfo = new Page(currentPage,totalPage,pageSize,totalRecord,url);
		request.setAttribute("pageInfo", pageInfo);
		return "/jsp/order.jsp";
	}
	public String orderQuXiaoByOid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//���ݶ�����Ÿı䶩��״̬
		int oid = Integer.parseInt(request.getParameter("oid"));
		OrderDao oDao = new OrderDao();
		oDao.orderQuXiaoByOid(oid);
		
		//���ݷ����Ÿı�Ԥ����״̬
		int hid = Integer.parseInt(request.getParameter("hid"));
		HouseDao hDao = new HouseDao();
		hDao.houseQuXiaoYuDing(hid);
		
		//�ѷ�������ⷿ����ͷ�Ϊ��
		oDao.deleteHid(oid);
		return "/OrderServlet?method=findAllOrdersByPage&currentPage=1";
	}
	public String orderQueDingByOid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String cname = request.getParameter("cname");
		//���ݶ�����Ÿı䶩��״̬
		int oid = Integer.parseInt(request.getParameter("oid"));
		OrderDao oDao = new OrderDao();
		oDao.orderQueDingByOid(oid);
		
		//���ݲ�ͬ���ͷ�������ҳ�һ�����շ��䣡����
		HouseDao hDao = new HouseDao();
		House house = hDao.findrandHouseByCname(cname);
		System.out.println(house.getHid());
		
		//����Ӧ�Ķ�����ŷ��䣨����Ԥ��������
		oDao.addHid(house.getHid(),oid);
		
		//�ҳ��ķ����޸ķ���ΪԤ��״̬
		hDao.houseYuding(house.getHid());
		return "/OrderServlet?method=findAllOrdersByPage&currentPage=1";
	}
}
