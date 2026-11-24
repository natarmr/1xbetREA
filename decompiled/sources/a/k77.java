package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public enum k77 implements sgf0, Serializable {
    NO_TABS_CLASSIC("noTabsClassic"),
    TABS_EXPANDABLE_CARDS("tabsExpandableCards"),
    NO_TABS_EXPANDABLE_CARDS("noTabsExpandableCards"),
    COMPACT_NO_EXPAND("compactNoExpand"),
    TABS_AND_ACCORDEON("tabsAndAccordeon"),
    OLD_HISTORY("oldHistory");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17805a;

    k77(String str) {
        this.f17805a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "betHistoryStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f17805a;
    }
}
