package a;

/* JADX INFO: loaded from: classes5.dex */
public enum bu6 implements sgf0 {
    SNACKBAR("snackbar"),
    BOTTOM_SHEET_BLACK_TEXT("bottomSheetBlackText"),
    BOTTOM_SHEET_COLORED_TEXT("bottomSheetColoredText"),
    /* JADX INFO: Fake field, exist only in values array */
    ALERT_BLACK_TEXT("alertBlackText"),
    /* JADX INFO: Fake field, exist only in values array */
    ALERT_COLORED_TEXT("alertColoredText");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3215a;

    bu6(String str) {
        this.f3215a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "betDoneScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f3215a;
    }
}
