package a;

/* JADX INFO: loaded from: classes.dex */
public enum gzp {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12190a;

    gzp(String str) {
        this.f12190a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12190a;
    }
}
