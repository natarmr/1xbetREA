package a;

/* JADX INFO: loaded from: classes5.dex */
public enum g8l0 implements sgf0 {
    BOTTOM_SHEET("buttonBottomsheet"),
    CHIPS("chips");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10870a;

    g8l0(String str) {
        this.f10870a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "sportFeedFilterStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f10870a;
    }
}
