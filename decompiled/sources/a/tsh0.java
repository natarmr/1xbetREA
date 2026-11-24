package a;

/* JADX INFO: loaded from: classes5.dex */
public enum tsh0 implements sgf0 {
    CLASSIC("classic"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_HEADER("customHeader"),
    GIFT("gift");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34461a;

    tsh0(String str) {
        this.f34461a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "securitySettingsStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f34461a;
    }
}
