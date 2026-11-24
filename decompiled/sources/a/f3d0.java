package a;

/* JADX INFO: loaded from: classes2.dex */
public enum f3d0 implements vlx {
    TRUE(0),
    FALSE(1),
    NULL(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f8857a;

    /* JADX WARN: Multi-variable type inference failed */
    f3d0(int i) {
        this.f8857a = i;
    }

    @Override // a.vlx
    public final int a() {
        return this.f8857a;
    }
}
