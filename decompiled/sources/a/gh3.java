package a;

/* JADX INFO: loaded from: classes3.dex */
public enum gh3 implements sgf0 {
    /* JADX INFO: Fake field, exist only in values array */
    LOADER_TOP_LOGO_CENTER("loaderTop"),
    LOADER_MIDDLE_LOGO_MIDDLE("loaderMiddle"),
    /* JADX INFO: Fake field, exist only in values array */
    LOADER_MIDDLE_BOTTOM_LOGO_TOP("loaderMiddleBottom"),
    /* JADX INFO: Fake field, exist only in values array */
    LOADER_BOTTOM_LOGO_TOP("loaderBottomLogoTop"),
    /* JADX INFO: Fake field, exist only in values array */
    LOADER_BOTTOM_LOGO_MIDDLE("loaderBottomLogoMiddle");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11279a;

    gh3(String str) {
        this.f11279a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "startScreenPreset";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f11279a;
    }
}
