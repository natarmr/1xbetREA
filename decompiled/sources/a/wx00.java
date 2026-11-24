package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wx00 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public final psc A;
    public final yzn0 B;
    public final sqx C;
    public final yox o;
    public final noc p;
    public final woc q;
    public final pek0 r;
    public final nr s;
    public final wsf0 t;
    public final zsr u;
    public final duj v;
    public final rqj0 w;
    public final mne x;
    public final s64 y;
    public final nrc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx00(boolean z, String str, yox yoxVar, noc nocVar, woc wocVar, pek0 pek0Var, nr nrVar, wsf0 wsf0Var, zsr zsrVar, duj dujVar, rqj0 rqj0Var, ctf0 ctf0Var, mne mneVar, s64 s64Var, nrc nrcVar, psc pscVar, yzn0 yzn0Var, ljf0 ljf0Var, gxu gxuVar, sqx sqxVar) {
        super(null, new rd7(z, (Object) str, (byte) 9), new bcn(ctf0Var, (byte) 28), cvm0.p(mneVar.c, mneVar.f22085a), null);
        zsrVar.getClass();
        ctf0Var.getClass();
        this.o = yoxVar;
        this.p = nocVar;
        this.q = wocVar;
        this.r = pek0Var;
        this.s = nrVar;
        this.t = wsf0Var;
        this.u = zsrVar;
        this.v = dujVar;
        this.w = rqj0Var;
        this.x = mneVar;
        this.y = s64Var;
        this.z = nrcVar;
        this.A = pscVar;
        this.B = yzn0Var;
        this.C = sqxVar;
        if (z) {
            sac.V(jiu0.a(this), new vx00(this, (byte) 1), null, mneVar.b, new slx(this, null, (byte) 22), 10);
        }
    }

    public static void M(wx00 wx00Var, int i) {
        String str;
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        nr nrVar = wx00Var.s;
        nrVar.getClass();
        String str2 = "logout_not_save";
        if (z) {
            str = "cancel";
        } else {
            str = z2 ? "logout" : "logout_not_save";
        }
        i8i.D("action", str, (kt2) nrVar.b, "logout_popup_approve");
        s64 s64Var = wx00Var.y;
        s64Var.getClass();
        if (z) {
            str2 = "cancel";
        } else if (z2) {
            str2 = "logout";
        }
        b1j.v(str2, s64Var.f31684a, 3256L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ox00 ox00Var = (ox00) obj;
        ox00Var.getClass();
        if (ox00Var.equals(lx00.f20790a)) {
            M(this, 2);
            return;
        }
        boolean zEquals = ox00Var.equals(mx00.f22530a);
        byte b = 10;
        yje yjeVar = null;
        mne mneVar = this.x;
        byte b2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (zEquals) {
            sac.V(jiu0.a(this), new vx00(this, b2), null, mneVar.b, new fj3((diu0) this, true, yjeVar, b), 10);
        } else {
            if (!ox00Var.equals(nx00.f24260a)) {
                t9f.b();
                return;
            }
            sac.V(jiu0.a(this), new vx00(this, objArr2 == true ? 1 : 0), null, mneVar.b, new fj3((diu0) this, (boolean) (objArr == true ? 1 : 0), yjeVar, b), 10);
        }
    }
}
