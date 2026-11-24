package a;

/* JADX INFO: loaded from: classes2.dex */
public enum x3d0 implements vlx {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f40213a;

    /* JADX WARN: Multi-variable type inference failed */
    x3d0(int i) {
        this.f40213a = i;
    }

    @Override // a.vlx
    public final int a() {
        return this.f40213a;
    }
}
