package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ye implements sgf0 {
    SINGLE_PAGE("singlepage"),
    /* JADX INFO: Fake field, exist only in values array */
    TABS("tabs"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPACT_LIST("compactList"),
    COMPACT_CARDS("compactCards");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42464a;

    ye(String str) {
        this.f42464a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "accountManagementScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f42464a;
    }
}
