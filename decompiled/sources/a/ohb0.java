package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ohb0 implements sgf0 {
    SMALL_CIRCLES("smallCircles"),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL_SQUARES("smallSquares"),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL_SQUARES_NO_HEADER("smallSquaresNoHeader"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM_RECTANGLES("mediumRectangles");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25258a;

    ohb0(String str) {
        this.f25258a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "popularScreenGamesCollectionStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f25258a;
    }
}
