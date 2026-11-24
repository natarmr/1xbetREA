package a;

/* JADX INFO: loaded from: classes2.dex */
public enum uho implements a960 {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35690a;

    /* JADX WARN: Multi-variable type inference failed */
    uho(int i) {
        this.f35690a = i;
    }

    @Override // a.a960
    public final int a() {
        return this.f35690a ? 1 : 0;
    }
}
