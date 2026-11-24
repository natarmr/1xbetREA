package a;

/* JADX INFO: loaded from: classes5.dex */
public enum v5l0 implements sgf0 {
    LARGE_CARD_LARGE_SPORT_ICON("largeCardLargeSportIcon"),
    SMALL_CARD_NO_TEAM_LOGO("smallCardNoTeamLogo"),
    MEDIUM_CARD_SMALL_TEAM_LOGO("mediumCardSmallTeamLogo"),
    LARGE_CARD_WATERMARK("largeCardWatermark"),
    LARGE_CARD_LARGE_TEAM_LOGO("largeCardLargeTeamLogo");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36831a;

    v5l0(String str) {
        this.f36831a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "sportEventCardStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f36831a;
    }
}
