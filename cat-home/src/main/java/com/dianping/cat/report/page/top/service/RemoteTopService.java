/*
 * Copyright (c) 2011-2018, Meituan Dianping. All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dianping.cat.report.page.top.service;

import java.io.IOException;

import org.xml.sax.SAXException;

import com.dianping.cat.consumer.top.TopAnalyzer;
import com.dianping.cat.consumer.top.model.entity.TopReport;
import com.dianping.cat.consumer.top.model.transform.DefaultSaxParser;
import com.dianping.cat.report.service.BaseRemoteModelService;

public class RemoteTopService extends BaseRemoteModelService<TopReport> {
	public RemoteTopService() {
		super(TopAnalyzer.ID);
	}

	@Override
	protected TopReport buildModel(String xml) throws SAXException, IOException {
		return DefaultSaxParser.parse(xml);
	}

	@Override
	public boolean isServersFixed() {
		return false;
	}
}
