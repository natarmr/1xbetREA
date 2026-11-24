package a;

/* JADX INFO: loaded from: classes5.dex */
public enum th1 implements sgf0 {
    BRAND_S("brandS"),
    BRAND_S_EXTENDED("brandSExtended"),
    BRAND_M("brandM"),
    BRAND_M_EXTENDED("brandMExtended");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33940a;

    th1(String str) {
        this.f33940a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorProviderStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f33940a;
    }
}
