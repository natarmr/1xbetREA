package a;

/* JADX INFO: loaded from: classes5.dex */
public enum l9x implements sgf0 {
    COMPACT_CARDS("compactCards"),
    PLAIN_LIST_ITEMS("plainListItems");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19678a;

    l9x(String str) {
        this.f19678a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "infoScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f19678a;
    }
}
