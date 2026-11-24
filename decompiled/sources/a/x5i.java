package a;

/* JADX INFO: loaded from: classes3.dex */
public final class x5i implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40318a;

    /* JADX WARN: Multi-variable type inference failed */
    public x5i(int i) {
        this.f40318a = i;
    }

    @Override // a.o5d0
    public final Object get() {
        boolean z = this.f40318a;
        if (!z) {
            return new zav();
        }
        if (z) {
            return new qo();
        }
        c99.h(z ? 1 : 0);
        return null;
    }
}
