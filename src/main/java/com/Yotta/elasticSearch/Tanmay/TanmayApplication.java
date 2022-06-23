package com.Yotta.elasticSearch.Tanmay;



import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TanmayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TanmayApplication.class, args);
	}
//	@Bean
//	public boolean createTestIndex(RestHighLevelClient client) throws Exception {
//		try {
//			DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest("hello-world");
//			client.indices().delete(deleteIndexRequest); // 1
//		} catch (Exception ignored) {
//		}
//
//		CreateIndexRequest createIndexRequest = new CreateIndexRequest("hello-world");
//		createIndexRequest.settings(
//				Settings.builder().put("index.number_of_shards", 1)
//						.put("index.number_of_replicas", 0));
//		client.indices().create(createIndexRequest, RequestOptions.DEFAULT); // 2
//
//		return true;
//	}
}
