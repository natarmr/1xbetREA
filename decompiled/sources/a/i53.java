package a;

/* JADX INFO: loaded from: classes.dex */
public final class i53 implements c53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oms0 f14174a;
    public u12 b;
    public final pz40 c = androidx.compose.runtime.e.e(new qkx(0));
    public final hz40 d;

    public i53(oms0 oms0Var, u12 u12Var) {
        this.f14174a = oms0Var;
        this.b = u12Var;
        long[] jArr = u1h0.f34903a;
        this.d = new hz40();
    }

    @Override // a.c53
    public final lie a(lie lieVar, u7k0 u7k0Var) {
        lieVar.d = u7k0Var;
        return lieVar;
    }

    @Override // a.ams0
    public final Object b() {
        return this.f14174a.f().b();
    }

    @Override // a.ams0
    public final Object d() {
        return this.f14174a.f().d();
    }
}
