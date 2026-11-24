package a;

/* JADX INFO: loaded from: classes2.dex */
public enum z2d0 implements vlx {
    RETURNS_CONSTANT(0),
    CALLS(1),
    RETURNS_NOT_NULL(2),
    RETURNS_RESULT_OF(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f43665a;

    /* JADX WARN: Multi-variable type inference failed */
    z2d0(int i) {
        this.f43665a = i;
    }

    @Override // a.vlx
    public final int a() {
        return this.f43665a;
    }
}
