package a;

/* JADX INFO: loaded from: classes5.dex */
public enum rhb0 implements sgf0 {
    POPULAR_CLASSIC("popularClassic"),
    POPULAR_DASHBOARD("popularDashboard");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30482a;

    rhb0(String str) {
        this.f30482a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "popularScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f30482a;
    }
}
