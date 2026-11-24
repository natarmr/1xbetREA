package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ee1 implements sgf0 {
    CELL_STYLE("cell"),
    /* JADX INFO: Fake field, exist only in values array */
    BUTTON_STYLE("button"),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL_BANNER_STYLE("smallBanner"),
    /* JADX INFO: Fake field, exist only in values array */
    LARGE_BANNER_STYLE("largeBanner");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7646a;

    ee1(String str) {
        this.f7646a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorPromoPromocodeStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f7646a;
    }
}
