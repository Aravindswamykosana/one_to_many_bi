package one_to_many_bi.Controller;

import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("arvind");
	}
}
