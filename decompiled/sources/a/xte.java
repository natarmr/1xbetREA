package a;

/* JADX INFO: loaded from: classes5.dex */
public enum xte implements sgf0 {
    COEF_WITH_BIG_ACCENT_TEAM("coefWithBgAccentTeam"),
    COMPACT_ACCENT_MARKET("compactAccentMarket"),
    CHAMP_NAME_ACCENT_COEF("champNameAccentCoef"),
    BIG_TEAM_LOGO_ACCENT_TEAM("bigTeamLogoAccentTeam"),
    SMALL_TEAM_LOGO_ACCENT_COEF("smallTeamLogoAccentCoef");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41462a;

    xte(String str) {
        this.f41462a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "couponCardStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f41462a;
    }
}
