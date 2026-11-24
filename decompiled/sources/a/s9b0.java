package a;

/* JADX INFO: loaded from: classes5.dex */
public enum s9b0 implements sgf0 {
    LIVE_GAMES("live"),
    LINE_GAMES("line"),
    CYBER("cyber"),
    ONE_X_GAMES("xgames"),
    AGGREGATOR("casino"),
    DAY_EXPRESS("express"),
    LIVE_CHAMPS("live_champs"),
    LINE_CHAMPS("line_champs");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31846a;

    s9b0(String str) {
        this.f31846a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "popularCategories";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f31846a;
    }
}
