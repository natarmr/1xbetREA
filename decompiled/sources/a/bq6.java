package a;

/* JADX INFO: loaded from: classes5.dex */
public enum bq6 implements sgf0 {
    LARGE_CARD_LARGE_SPORT_ICON("largeCardLargeSportIcon"),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL_CARD_NO_TEAM_LOGO("smallCardNoTeamLogo"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM_CARD_SMALL_TEAM_LOGO("mediumCardSmallTeamLogo"),
    /* JADX INFO: Fake field, exist only in values array */
    LARGE_CARD_WATERMARK("largeCardWatermark"),
    /* JADX INFO: Fake field, exist only in values array */
    LARGE_CARD_LARGE_TEAM_LOGO("largeCardLargeTeamLogo");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3013a;

    bq6(String str) {
        this.f3013a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "betconstructorCardStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f3013a;
    }
}
