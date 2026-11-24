package a;

/* JADX INFO: loaded from: classes6.dex */
public enum taj implements a960 {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f33614a;

    /* JADX WARN: Multi-variable type inference failed */
    taj(int i) {
        this.f33614a = i;
    }

    @Override // a.a960
    public final int a() {
        return this.f33614a;
    }
}
