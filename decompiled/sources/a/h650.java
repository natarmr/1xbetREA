package a;

/* JADX INFO: loaded from: classes5.dex */
public enum h650 implements sgf0 {
    /* JADX INFO: Fake field, exist only in values array */
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
    CARD_HORIZONTAL("cardHorizontal");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12513a;

    h650(String str) {
        this.f12513a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "myAggregatorPromotionsBannerStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f12513a;
    }
}
