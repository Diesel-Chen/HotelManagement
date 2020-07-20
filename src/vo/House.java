package vo;

public class House {
	private int hid;
	private String cname;
	private String hstate;
	private int hfloor;
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getHstate() {
		return hstate;
	}
	public void setHstate(String hstate) {
		this.hstate = hstate;
	}
	public int getHfloor() {
		return hfloor;
	}
	public void setHfloor(int hfloor) {
		this.hfloor = hfloor;
	}
	@Override
	public String toString() {
		return "House [hid=" + hid + ", cname=" + cname + ", hstate=" + hstate + ", hfloor=" + hfloor + "]";
	}
	public House(int hid, String cname, String hstate, int hfloor) {
		super();
		this.hid = hid;
		this.cname = cname;
		this.hstate = hstate;
		this.hfloor = hfloor;
	}
	public House() {
		// TODO Auto-generated constructor stub
	}
}
