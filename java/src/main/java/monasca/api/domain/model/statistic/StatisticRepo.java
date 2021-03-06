/*
 * Copyright (c) 2014, 2016 Hewlett-Packard Development Company, L.P.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package monasca.api.domain.model.statistic;

import org.joda.time.DateTime;

import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

/**
 * Repository for statistics.
 */
public interface StatisticRepo {

  /**
   * Finds statistics for the given criteria.
   */
  List<Statistics> find(String tenantId, String name, Map<String, String> dimensions,
                        DateTime startTime, @Nullable DateTime endTime, List<String> statistics,
                        int period, String offset, int limit, Boolean mergeMetricsFlag,
                        String groupBy)
      throws Exception;
}
