package a;

/* JADX INFO: loaded from: classes3.dex */
public final class v4u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1u f36798a;

    public v4u(l1u l1uVar) {
        l1uVar.getClass();
        this.f36798a = l1uVar;
    }

    public final double a(gxo gxoVar) {
        gxoVar.getClass();
        int iOrdinal = gxoVar.ordinal();
        l1u l1uVar = this.f36798a;
        if (iOrdinal == 0) {
            return l1uVar.a();
        }
        if (iOrdinal == 1) {
            return l1uVar.a() * 2.0d;
        }
        if (iOrdinal == 2) {
            return l1uVar.a() * 5.0d;
        }
        t9f.b();
        return 0.0d;
    }
}
