package a;

/* JADX INFO: loaded from: classes4.dex */
public enum h8l0 implements sgf0 {
    SMALL_HEADER_SEGMENTS("smallHeaderSegments"),
    NO_HEADER_LARGE_TABS("noHeaderLargeTabs"),
    LARGE_HEADER_MEDIUM_TABS("largeHeaderMediumTabs"),
    SMALL_HEADER_MEDIUM_TABS_BACKGROUND("smallHeaderMediumTabsBackground");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12632a;

    h8l0(String str) {
        this.f12632a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "sportFeedHeaderStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f12632a;
    }
}
