//package com.example.JoinTables.Repositories;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.FieldResult;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.persistence.SqlResultSetMapping;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.example.JoinTables.Pojos.JoinResults;
//
//
//
//@Repository
//public class JoinedRepository {      
//    @PersistenceContext private EntityManager em;
//
//    static final String STATEMENT_SQLMAP = "Statement-SQL-Mapping";
//
//    public List<JoinResults> getJoinedResults() {
//        Query query = em.createNativeQuery(
//            "SELECT c.customer_id, c.first_name, c.last_name, " + 
//            "c.year_of_birth, c.most_expensive_buy_in_shop AS customer_meb," + 
//            "o.order_id, o.purchase_date, o.amount_spent," + 
//            "o.most_expensive_buy_in_shop AS order_meb" + 
//            "FROM customers AS c LEFT OUTER JOIN orders AS o" + 
//            "ON c.customer_id=o.customer_id",
//            STATEMENT_SQLMAP);
//        return query.getResultList();
//    }
//
//    @SqlResultSetMapping(name="JoinResults", classes = {
//        @ConstructorResult(targetClass = JoinResults.class,
//            columns = {
//            		@ColumnResult(name="customer_id",type = String.class),
//            		@ColumnResult(name="first_name",type = String.class), 
//            		@ColumnResult(name="last_name",type = String.class),
//            		@ColumnResult(name="year_of_birth",type = Date.class),
//            		@ColumnResult(name="customer_meb",type = String.class), 
//            		@ColumnResult(name="order_id",type = String.class),
//            		@ColumnResult(name="purchase_date",type = Date.class),
//            		@ColumnResult(name="amount_spent",type = Integer.class),
//            		@ColumnResult(name="order_meb",type = String.class)
//                }
//        )
//    }) @Entity class SQLMappingCfgEntity{@Id int id;} // <- walkaround
//
//}