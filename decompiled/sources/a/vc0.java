package a;

/* JADX INFO: loaded from: classes5.dex */
public enum vc0 implements sgf0 {
    SIMPLE("simple"),
    PICTURE("picture");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37164a;

    vc0(String str) {
        this.f37164a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorBrandScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f37164a;
    }
}
