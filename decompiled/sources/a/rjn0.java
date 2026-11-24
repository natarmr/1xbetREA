package a;

/* JADX INFO: loaded from: classes5.dex */
public enum rjn0 implements sgf0 {
    COMPACT_CARDS("compactCards"),
    PLAIN_LIST_ITEMS("plainListItems");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30603a;

    rjn0(String str) {
        this.f30603a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "supportScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f30603a;
    }
}
