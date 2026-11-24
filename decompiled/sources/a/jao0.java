package a;

/* JADX INFO: loaded from: classes5.dex */
public enum jao0 implements sgf0 {
    MAIN_BUTTON_ACCENT("mainButtonAccentIcons"),
    /* JADX INFO: Fake field, exist only in values array */
    MAIN_BUTTON_LOGO("mainButtonLogoIcons"),
    /* JADX INFO: Fake field, exist only in values array */
    BUBBLE_SELECTION("bubbleSelectionIcons"),
    /* JADX INFO: Fake field, exist only in values array */
    COLOR_SELECTION("colorSelectionIcons"),
    /* JADX INFO: Fake field, exist only in values array */
    BACKGROUND_SELECTION("backgroundSelectionIcons");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16200a;

    jao0(String str) {
        this.f16200a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "tabbarStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f16200a;
    }
}
