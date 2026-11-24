package a;

/* JADX INFO: loaded from: classes5.dex */
public enum gh0 implements sgf0 {
    LINE("line"),
    /* JADX INFO: Fake field, exist only in values array */
    BACKGROUND_COMPACT("backgroundCompact"),
    /* JADX INFO: Fake field, exist only in values array */
    BACKGROUND_LINE("backgroundLine"),
    /* JADX INFO: Fake field, exist only in values array */
    CARD_COMPACT("cardCompact"),
    /* JADX INFO: Fake field, exist only in values array */
    CARD_LINE("cardLine");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11274a;

    gh0(String str) {
        this.f11274a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorCategoryBannerStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f11274a;
    }
}
