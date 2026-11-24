package a;

/* JADX INFO: loaded from: classes2.dex */
public enum e4d0 implements vlx {
    IN(0),
    OUT(1),
    INV(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f7177a;

    /* JADX WARN: Multi-variable type inference failed */
    e4d0(int i) {
        this.f7177a = i;
    }

    @Override // a.vlx
    public final int a() {
        return this.f7177a;
    }
}
