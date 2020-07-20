package vo;

import java.util.Date;

public class Order {
	private int oid;
	private String cname;
	private int money;
	private String consumer;
	private String telephone;
	private Date comedate;
	private Date departuredate;
	private String ostate;
	private Date date;
	private int hid;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getConsumer() {
		return consumer;
	}
	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getComedate() {
		return comedate;
	}
	public void setComedate(Date comedate) {
		this.comedate = comedate;
	}
	public Date getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(Date departuredate) {
		this.departuredate = departuredate;
	}
	public String getOstate() {
		return ostate;
	}
	public void setOstate(String ostate) {
		this.ostate = ostate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", cname=" + cname + ", money=" + money + ", consumer=" + consumer + ", telephone="
				+ telephone + ", comedate=" + comedate + ", departuredate=" + departuredate + ", ostate=" + ostate
				+ ", date=" + date + ", hid=" + hid + "]";
	}
	
	
}
