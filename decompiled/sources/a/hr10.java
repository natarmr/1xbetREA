package a;

/* JADX INFO: loaded from: classes5.dex */
public enum hr10 implements sgf0 {
    SQUARE_S("squareS"),
    /* JADX INFO: Fake field, exist only in values array */
    SQUARE_S_NO_TITLE("squareSNoTitle"),
    /* JADX INFO: Fake field, exist only in values array */
    SQUARE_L("squareL"),
    /* JADX INFO: Fake field, exist only in values array */
    SQUARE_L_NO_TITLE("squareLNoTitle"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_VERTICAL("rectangleVertical"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_VERTICAL_NO_TITLE("rectangleVerticalNoTitle"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_HORIZONTAL("rectangleHorizontal"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_HORIZONTAL_NO_TITLE("rectangleHorizontalNoTitle"),
    /* JADX INFO: Fake field, exist only in values array */
    CARD_HORIZONTAL("cardHorizontal");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13509a;

    hr10(String str) {
        this.f13509a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "mainBannerStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f13509a;
    }
}
