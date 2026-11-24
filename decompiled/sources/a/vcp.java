package a;

/* JADX INFO: loaded from: classes5.dex */
public enum vcp implements sgf0 {
    Classic("classic"),
    NoTabsDashboard("noTabsDashboard"),
    /* JADX INFO: Fake field, exist only in values array */
    CardsInHeader("cardsInHeader"),
    CategoryImageHeader("categoryImageHeader");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37196a;

    vcp(String str) {
        this.f37196a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "favoriteStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f37196a;
    }
}
