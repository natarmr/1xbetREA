package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pxw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27777a;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzr b;
    public final /* synthetic */ oyw0 c;

    public /* synthetic */ pxw0(oyw0 oyw0Var, com.google.android.gms.measurement.internal.zzr zzrVar, byte b) {
        this.f27777a = b;
        this.b = zzrVar;
        this.c = oyw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        byte b = this.f27777a;
        com.google.android.gms.measurement.internal.zzr zzrVar = this.b;
        oyw0 oyw0Var = this.c;
        switch (b) {
            case 0:
                m6x0 m6x0Var = oyw0Var.f26078a;
                m6x0Var.V();
                m6x0Var.J().m1();
                m6x0Var.l0();
                s0x.H(zzrVar);
                String str = zzrVar.f45550a;
                s0x.E(str);
                int i = 0;
                if (m6x0Var.e0().x1(null, btw0.y0)) {
                    m6x0Var.S().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iV1 = m6x0Var.e0().v1(null, btw0.h0);
                    m6x0Var.e0();
                    long jLongValue = jCurrentTimeMillis - ((Long) btw0.e.a(null)).longValue();
                    while (i < iV1 && m6x0Var.F(jLongValue, null)) {
                        i++;
                    }
                } else {
                    m6x0Var.e0();
                    long jIntValue = ((Integer) btw0.l.a(null)).intValue();
                    while (i < jIntValue && m6x0Var.F(0L, str)) {
                        i++;
                    }
                }
                if (m6x0Var.e0().x1(null, btw0.z0)) {
                    m6x0Var.J().m1();
                    m6x0Var.E();
                }
                x5x0 x5x0Var = m6x0Var.j;
                int iG = esw0.g(zzrVar.f1);
                x5x0Var.m1();
                if (iG == 2 && !x5x0.p1(str)) {
                    uww0 uww0Var = x5x0Var.c.f21293a;
                    m6x0.T(uww0Var);
                    duw0 duw0VarY1 = uww0Var.y1(str);
                    if (duw0VarY1 != null && duw0VarY1.F() && !duw0VarY1.G().s().isEmpty()) {
                        m6x0Var.r().o.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        m6x0Var.S().getClass();
                        m6x0Var.m(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 1:
                m6x0 m6x0Var2 = oyw0Var.f26078a;
                m6x0Var2.V();
                m6x0Var2.J().m1();
                m6x0Var2.l0();
                s0x.E(zzrVar.f45550a);
                m6x0Var2.c0(zzrVar);
                break;
            case 2:
                m6x0 m6x0Var3 = oyw0Var.f26078a;
                m6x0Var3.V();
                m6x0Var3.J().m1();
                m6x0Var3.l0();
                s0x.E(zzrVar.f45550a);
                m6x0Var3.m0(zzrVar);
                m6x0Var3.n0(zzrVar);
                break;
            default:
                m6x0 m6x0Var4 = oyw0Var.f26078a;
                m6x0Var4.V();
                m6x0Var4.m0(zzrVar);
                break;
        }
    }
}
