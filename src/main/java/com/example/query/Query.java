package com.example.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    //these need to be mentioned in schema i.e grqphqls file then only it will be displayed
    // else writing the methods here and not mentioning in graphqls file will not display any output
    //for this the schema file is query.graphqls

    public String firstQuery(){
         return "First Query";
     }

    public String secondQuery(){
        return "Second Query";
    }

}
