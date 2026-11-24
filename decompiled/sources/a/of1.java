package a;

/* JADX INFO: loaded from: classes5.dex */
public enum of1 implements sgf0 {
    CELLS("cells"),
    /* JADX INFO: Fake field, exist only in values array */
    SQUARE("square"),
    /* JADX INFO: Fake field, exist only in values array */
    CIRCLE("circle"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_HORIZONTAL("rectangleHorizontal"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_VERTICAL("rectangleVertical");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25144a;

    of1(String str) {
        this.f25144a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorPromoSocialStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f25144a;
    }
}
