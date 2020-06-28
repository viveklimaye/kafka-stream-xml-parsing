package com.example.application;

import java.util.function.Function;

import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Predicate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.models.BaseModel;
import com.example.models.ResultInfoModel;
import com.example.models.StudentInfoModel;

@SpringBootApplication
public class KafkaStreamsXMLParsingApp {

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamsXMLParsingApp.class, args);
	}

	public static class KafkaStreamsXMLParsingApplication {
		@Bean
		public Function<KStream<Object, String>, KStream<?, BaseModel>[]> process() {
			Predicate<Object, BaseModel> isStudentInfo = (k, v) -> v.getCurrentClassName().equalsIgnoreCase(StudentInfoModel.class.getName());
			Predicate<Object, BaseModel> isResultInfo =  (k, v) -> v.getCurrentClassName().equalsIgnoreCase(ResultInfoModel.class.getName());
			
			return null;
			
		}
	}

}