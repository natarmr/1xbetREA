package a;

/* JADX INFO: loaded from: classes5.dex */
public enum amb0 implements sgf0 {
    TOP("top"),
    SPORT("sport"),
    CYBER("esports"),
    AGGREGATOR("casino"),
    ONE_X_GAMES("xgames");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1100a;

    amb0(String str) {
        this.f1100a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "popularCategories";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f1100a;
    }
}
