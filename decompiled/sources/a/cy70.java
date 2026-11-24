package a;

import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes3.dex */
public final class cy70 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final ctf0 o;
    public final mne p;
    public final svu q;
    public final yo4 r;
    public final zr1 s;
    public final jvp0 t;

    public cy70(vzg0 vzg0Var, ctf0 ctf0Var, rpt rptVar, mne mneVar, svu svuVar, yo4 yo4Var, zr1 zr1Var, jvp0 jvp0Var) {
        ctf0Var.getClass();
        pl70 pl70Var = new pl70(rptVar, (byte) 3);
        v510 v510Var = new v510(ctf0Var, (byte) 28);
        rwj rwjVar = mneVar.f22085a;
        super(null, pl70Var, v510Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = ctf0Var;
        this.p = mneVar;
        this.q = svuVar;
        this.r = yo4Var;
        this.s = zr1Var;
        this.t = jvp0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ux70 ux70Var = (ux70) obj;
        ux70Var.getClass();
        super.x(ux70Var);
        boolean z = ux70Var instanceof tx70;
        jvp0 jvp0Var = this.t;
        yo4 yo4Var = this.r;
        zr1 zr1Var = this.s;
        if (!z) {
            if (ux70Var.equals(qx70.f29468a)) {
                E();
                return;
            }
            if (!ux70Var.equals(px70.f27740a)) {
                t9f.b();
                return;
            }
            int iOrdinal = jvp0Var.ordinal();
            if (iOrdinal == 0) {
                yo4Var.f(kvp0.MENU_OTHER);
                zr1Var.h(lvp0.MENU_OTHER);
                return;
            } else if (iOrdinal != 1) {
                t9f.b();
                return;
            } else {
                yo4Var.f(kvp0.MAILING);
                zr1Var.h(lvp0.MAILING);
                return;
            }
        }
        tx70 tx70Var = (tx70) ux70Var;
        if (tx70Var.equals(sx70.f32962a)) {
            sac.i0(jiu0.a(this), cy70.class.getSimpleName().concat(".getTelegramBotLink"), 3, 0L, null, null, new c670(this, null, (byte) 6), null, this.p.b, new cd60((Object) this, (byte) 23), null, Response.DOES_NOT_EXIST_ANYWHERE);
            return;
        }
        if (!tx70Var.equals(rx70.f31251a)) {
            t9f.b();
            return;
        }
        int iOrdinal2 = jvp0Var.ordinal();
        if (iOrdinal2 == 0) {
            yo4Var.d(kvp0.MENU_OTHER);
            zr1Var.c(lvp0.MENU_OTHER);
        } else if (iOrdinal2 != 1) {
            t9f.b();
            return;
        } else {
            yo4Var.d(kvp0.MAILING);
            zr1Var.c(lvp0.MAILING);
        }
        G(wx70.f39918a);
    }
}
