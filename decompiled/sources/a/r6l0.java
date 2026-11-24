package a;

/* JADX INFO: loaded from: classes5.dex */
public enum r6l0 implements sgf0 {
    CLASSIC_CARD_SPORT_ICON("classicCardSportIcon"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPACT_CARD_SPORT_ICON("compactCardSportIcon"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPACT_CARD_ROUND_BACKGROUND("compactCardRoundBackground"),
    /* JADX INFO: Fake field, exist only in values array */
    CLASSIC_CARD_RECT_BACKGROUND("classicCardRectBackground");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29939a;

    r6l0(String str) {
        this.f29939a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "sportExpressCardStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f29939a;
    }
}
