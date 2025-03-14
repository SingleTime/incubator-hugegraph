/*
 * Copyright 2017 HugeGraph Authors
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.baidu.hugegraph.backend.serializer;

import com.baidu.hugegraph.HugeGraph;
import com.baidu.hugegraph.backend.id.Id;
import com.baidu.hugegraph.backend.query.ConditionQuery;
import com.baidu.hugegraph.backend.query.Query;
import com.baidu.hugegraph.backend.store.BackendEntry;
import com.baidu.hugegraph.structure.HugeEdge;
import com.baidu.hugegraph.structure.HugeEdgeProperty;
import com.baidu.hugegraph.structure.HugeIndex;
import com.baidu.hugegraph.structure.HugeVertex;
import com.baidu.hugegraph.structure.HugeVertexProperty;
import com.baidu.hugegraph.type.HugeType;

public interface GraphSerializer {

    BackendEntry writeVertex(HugeVertex vertex);

    BackendEntry writeOlapVertex(HugeVertex vertex);

    BackendEntry writeVertexProperty(HugeVertexProperty<?> prop);

    HugeVertex readVertex(HugeGraph graph, BackendEntry entry);

    BackendEntry writeEdge(HugeEdge edge);

    BackendEntry writeEdgeProperty(HugeEdgeProperty<?> prop);

    HugeEdge readEdge(HugeGraph graph, BackendEntry entry);

    BackendEntry writeIndex(HugeIndex index);

    HugeIndex readIndex(HugeGraph graph, ConditionQuery query, BackendEntry entry);

    BackendEntry writeId(HugeType type, Id id);

    Query writeQuery(Query query);
}
