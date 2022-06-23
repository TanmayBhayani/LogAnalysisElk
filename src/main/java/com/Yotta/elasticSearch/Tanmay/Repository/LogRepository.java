package com.Yotta.elasticSearch.Tanmay.Repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.Yotta.elasticSearch.Tanmay.Model.Log;

//@Repository
public interface LogRepository extends ElasticsearchRepository<Log, Long> {

}
