package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ua20 implements sgf0 {
    MEDIUM_NO_GAME_INFO("mediumNoGameInfo"),
    MEDIUM_CUSTOM_BACKGROUND("mediumCustomBackground"),
    LITE_NO_TABS("liteNoTabs"),
    FULLSCREEN_SLIDER("fullscreenSlider");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35311a;

    ua20(String str) {
        this.f35311a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "makeBetScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f35311a;
    }
}
