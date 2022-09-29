package foodorder;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String toName;
	private String status;
	@OneToMany
	List<foodorder.Item> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String to) {
		this.toName = to;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<foodorder.Item> getItem() {
		return items;
	}

	public void setItem(List<foodorder.Item> list1) {
		this.items = list1;
	}

}
