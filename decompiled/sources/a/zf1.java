package a;

/* JADX INFO: loaded from: classes5.dex */
public enum zf1 implements sgf0 {
    BACKGROUND_S("backgroundS"),
    /* JADX INFO: Fake field, exist only in values array */
    BACKGROUND_L("backgroundL"),
    /* JADX INFO: Fake field, exist only in values array */
    BLACK_GRADIENT("blackGradient"),
    /* JADX INFO: Fake field, exist only in values array */
    COLOR_GRADIENT_S("colorGradientS"),
    /* JADX INFO: Fake field, exist only in values array */
    COLOR_GRADIENT_L("colorGradientL");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44280a;

    zf1(String str) {
        this.f44280a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorPromoTournamentsStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f44280a;
    }
}
