package a;

/* JADX INFO: loaded from: classes5.dex */
public enum udl0 implements sgf0 {
    CLASSIC("classic"),
    ADVANCED("advanced"),
    DASHBOARD("dashboard"),
    LITE("lite");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35485a;

    udl0(String str) {
        this.f35485a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "gameScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f35485a;
    }
}
