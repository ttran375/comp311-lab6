package com.cc.airline;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SeatingPlanTest.class,
        TicketTest.class,
        SellTicketTest.class
})
public class AirTicketTestSuite {
    // This class remains empty, it is used only as a holder for the above
    // annotations
}
