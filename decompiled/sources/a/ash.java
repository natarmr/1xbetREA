package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ash implements wyg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dsh f1391a;

    public /* synthetic */ ash(dsh dshVar) {
        this.f1391a = dshVar;
    }

    public void a(long j) {
        usd usdVar = dsh.V1;
        rsh rshVarH0 = this.f1391a.H0();
        if (j == 2) {
            p7m0 p7m0Var = rshVarH0.n;
            p7m0Var.o(null, Boolean.valueOf(!((Boolean) p7m0Var.getValue()).booleanValue()));
        } else if (j == 1) {
            p7m0 p7m0Var2 = rshVarH0.m;
            p7m0Var2.o(null, Boolean.valueOf(!((Boolean) p7m0Var2.getValue()).booleanValue()));
        }
    }

    @Override // a.wyg
    public void e(p6t0 p6t0Var) {
        usd usdVar = dsh.V1;
        p6t0Var.getClass();
        boolean z = p6t0Var instanceof owr0;
        dsh dshVar = this.f1391a;
        if (!z) {
            if (p6t0Var instanceof o5s0) {
                rsh rshVarH0 = dshVar.H0();
                sac.V(jiu0.a(rshVarH0), qsh.f29258a, null, null, new e9g(rshVarH0, (o5s0) p6t0Var, null, (byte) 10), 14);
                return;
            }
            return;
        }
        owr0 owr0Var = (owr0) p6t0Var;
        hzg hzgVar = dshVar.H0().g;
        boolean z2 = owr0Var.e;
        String str = owr0Var.j;
        String str2 = owr0Var.i;
        if (z2 && str2.length() > 0) {
            uzg uzgVar = (uzg) hzgVar;
            uzgVar.getClass();
            uzgVar.i.a(str2);
        } else {
            if (!z2 || str.length() <= 0) {
                return;
            }
            ((uzg) hzgVar).m(str);
        }
    }
}
