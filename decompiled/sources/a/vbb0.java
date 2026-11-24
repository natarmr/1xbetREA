package a;

/* JADX INFO: loaded from: classes5.dex */
public enum vbb0 implements sgf0 {
    SQUARE_S("squareS"),
    /* JADX INFO: Fake field, exist only in values array */
    SQUARE_S_NO_TITLE("squareSNoTitle"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_HORIZONTAL_NO_TITLE("rectangleHorizontalNoTitle"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_VERTICAL("rectangleVertical");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37134a;

    vbb0(String str) {
        this.f37134a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "popularEsportsBannerStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f37134a;
    }
}
