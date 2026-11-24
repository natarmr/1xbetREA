package a;

/* JADX INFO: loaded from: classes2.dex */
public final class x6w0 implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5d0 f40385a;
    public final n5d0 b;
    public final n5d0 c;

    public x6w0(kys0 kys0Var, n5d0 n5d0Var, n5d0 n5d0Var2, n5d0 n5d0Var3) {
        this.f40385a = n5d0Var;
        this.b = n5d0Var2;
        this.c = n5d0Var3;
    }

    @Override // a.o5d0
    public final Object get() {
        wsb0 wsb0Var = (wsb0) this.f40385a.get();
        akh0 akh0Var = (akh0) this.b.get();
        vby vbyVar = (vby) this.c.get();
        wsb0Var.getClass();
        akh0Var.getClass();
        vbyVar.getClass();
        return new r5w0(wsb0Var, akh0Var, vbyVar);
    }
}
