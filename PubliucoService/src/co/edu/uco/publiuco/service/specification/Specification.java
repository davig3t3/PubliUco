package co.edu.uco.publiuco.service.specification;

public interface Specification<T>{
	
	boolean isSatisfied(T Domain);

}
