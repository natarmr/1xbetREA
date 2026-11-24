package a;

/* JADX INFO: loaded from: classes5.dex */
public enum i8l0 implements sgf0 {
    /* JADX INFO: Fake field, exist only in values array */
    COLORED_3D("colored3d"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN_COLOR("plainColor"),
    MONOCHROME("monochrome");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14345a;

    i8l0(String str) {
        this.f14345a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "sportFeedListIconStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f14345a;
    }
}
