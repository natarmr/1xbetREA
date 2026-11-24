package a;

/* JADX INFO: loaded from: classes5.dex */
public enum nnu0 implements sgf0 {
    SQUARE_S("squareS"),
    /* JADX INFO: Fake field, exist only in values array */
    SQUARE_S_NO_TITLE("squareSNoTitle"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_HORIZONTAL_NO_TITLE("rectangleHorizontalNoTitle");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23842a;

    nnu0(String str) {
        this.f23842a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "virtualEsportsBannerStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f23842a;
    }
}
