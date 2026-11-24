package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ai0 implements sgf0 {
    CHIPS_S("chipsS"),
    /* JADX INFO: Fake field, exist only in values array */
    CHIPS_L("chipsL"),
    /* JADX INFO: Fake field, exist only in values array */
    TAB_LINE("tabsLine"),
    /* JADX INFO: Fake field, exist only in values array */
    TAB_FILLED("tabsFilled");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f900a;

    ai0(String str) {
        this.f900a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorParttypeOneFilterStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f900a;
    }
}
