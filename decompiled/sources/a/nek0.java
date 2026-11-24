package a;

/* JADX INFO: loaded from: classes5.dex */
public enum nek0 implements sgf0 {
    MONOCHROME_WITH_WHITE_ICON("monochromeWithWhiteIcon"),
    /* JADX INFO: Fake field, exist only in values array */
    MONOCHRONE_NO_ICON("monochromeNoIcon"),
    /* JADX INFO: Fake field, exist only in values array */
    MONOCHROME_WITH_COLLORED_ICON("monochromeWithColloredIcon"),
    /* JADX INFO: Fake field, exist only in values array */
    COLLORED_BACKGROUND_NO_ICON("colloredBackgroundNoIcon");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23390a;

    nek0(String str) {
        this.f23390a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "snackbarStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f23390a;
    }
}
