package a;

/* JADX INFO: loaded from: classes5.dex */
public enum bmb0 implements sgf0 {
    LIVE("live"),
    LINE("line"),
    ESPORTS("esports"),
    XGAMES("xgames"),
    AGGREGATOR("casino"),
    VIRTUAL("virtual"),
    EXPRESS("express"),
    CHAMPSLIVE("champslive"),
    CHAMPSLINE("champsline"),
    UNKNOWN("");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2829a;

    bmb0(String str) {
        this.f2829a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "popularTabs";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f2829a;
    }
}
