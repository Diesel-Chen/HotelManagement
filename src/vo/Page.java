package vo;

public class Page {
	private int currentPage;
	private int totalPage;
	private int pageSize;
	private int totalRecord;
	private String url;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Page [currentPage=" + currentPage + ", totalPage=" + totalPage + ", pageSize=" + pageSize
				+ ", totalRecord=" + totalRecord + ", url=" + url + "]";
	}
	public Page(int currentPage, int totalPage, int pageSize, int totalRecord, String url) {
		super();
		this.currentPage = currentPage;
		this.totalPage = totalPage;
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
		this.url = url;
	}
	
	
}
