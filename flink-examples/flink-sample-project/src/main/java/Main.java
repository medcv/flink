/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.flink.api.java.ExecutionEnvironment;

/**
 * Example to illustrates how to use.
 */
public class Main {

	public static void main(String[] args) throws Exception {

        // obtain the execution environment
	final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        /**
         * Here comes the core of the Flink program.
         *
         * Start with getting some data from the environment, like
         * 	env.readTextFile(textPath);
         *
         * then, transform the resulting DataSet<String> using operations
         * like
         * 	.filter()
         * 	.flatMap()
         * 	.join()
         * 	.group()
         * and many more.
         * Have a look at the programming guide for the Java API:
         *
         * http://flink.incubator.apache.org/docs/0.6-SNAPSHOT/java_api_guide.html
         *
         * and the examples
         *
         * http://flink.incubator.apache.org/docs/0.6-SNAPSHOT/java_api_examples.html
         */

        // execute program
	env.execute("Flink Java API Skeleton");
	}
}
