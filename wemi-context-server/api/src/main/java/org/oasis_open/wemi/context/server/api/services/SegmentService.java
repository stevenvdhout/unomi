package org.oasis_open.wemi.context.server.api.services;

import org.oasis_open.wemi.context.server.api.*;

import java.util.List;
import java.util.Set;

/**
 * Created by loom on 24.04.14.
 */
public interface SegmentService {

    Set<User> getMatchingIndividuals (List<SegmentID> segmentIDs);
    Boolean isUserInSegment (User user, SegmentID segmentID);
    Set<SegmentID> getSegmentsForUser(User user);
    Set<SegmentID> getSegmentIDs();
    Set<SegmentDefinition> getSegmentDefinition (SegmentID segmentID);
    Set<ConditionTag> getConditionTags ();
    Set<Condition> getConditions(ConditionTag conditionTag);
    Set<ConditionParameter> getConditionParameters(Condition condition);

}
