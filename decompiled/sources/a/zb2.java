package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class zb2 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final mne o;
    public final vzg0 p;
    public final hru q;
    public final zpu r;
    public final i1w0 s;
    public final gle0 t;
    public final duj u;
    public final m1e v;
    public final eyg0 w;
    public c4m0 x;
    public c4m0 y;
    public bby z;

    public zb2(mne mneVar, vzg0 vzg0Var, hru hruVar, zpu zpuVar, g2v g2vVar, i1w0 i1w0Var, gle0 gle0Var, ctf0 ctf0Var, duj dujVar, m1e m1eVar, pru pruVar, eyg0 eyg0Var) {
        wb2 wb2Var = new wb2(pruVar, vzg0Var, g2vVar, (byte) 0);
        uc ucVar = new uc(ctf0Var, (byte) 19);
        rwj rwjVar = mneVar.f22085a;
        super(null, wb2Var, ucVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = mneVar;
        this.p = vzg0Var;
        this.q = hruVar;
        this.r = zpuVar;
        this.s = i1w0Var;
        this.t = gle0Var;
        this.u = dujVar;
        this.v = m1eVar;
        this.w = eyg0Var;
    }

    public final void M(Date date) {
        e3c.n(this.y);
        yje yjeVar = null;
        this.y = sac.T(new fnq(bkb.i0(new vsg0(new xb2((Object) this, (Object) date, yjeVar, (byte) 0)), "AltResultsResultsViewModel.loadData", 3, 0L, q3d.j(oqt0.class, zhi0.class, UnknownHostException.class), null, null, 52), new ee0((Object) this, (Object) date, yjeVar, (byte) 6), (byte) 4), d5c.S(jiu0.a(this), this.o.b), new i8(2, this, zb2.class, "onDataLoadError", "onDataLoadError(Ljava/lang/Throwable;)V", 4, (byte) 19));
    }

    public final void N(Throwable th) {
        Object value;
        String message;
        th.printStackTrace();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, dc2.a((dc2) value, iun.f15405a, null, false, false, false, true, false, null, null, 8142)));
        if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
            P();
            return;
        }
        if (!(th instanceof zhi0)) {
            this.u.a(th);
            return;
        }
        zhi0 zhi0Var = (zhi0) th;
        if (zhi0Var.c != i2o.IncorrectDataError) {
            zhi0Var = null;
        }
        if (zhi0Var == null || (message = zhi0Var.getMessage()) == null) {
            return;
        }
        G(new bc2(message));
    }

    public final void O() {
        e3c.n(this.z);
        this.z = i3t0.K(this, null, new ln1(1, this, zb2.class, "onDataLoadError", "onDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 16), new pn(this, null, (byte) 5), 1);
    }

    public final void P() {
        e3c.n(this.x);
        this.x = sac.T(new fnq(this.v.b(), new pa((Object) this, (yje) null, (byte) 21), (byte) 4), d5c.S(jiu0.a(this), this.o.b), new yb2(this, null, (byte) 1));
    }

    @Override // a.diu0
    public final void v() {
        chf0 chf0Var = qx40.f29464a;
        qx40.a(zb2.class.getSimpleName());
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        ub2 ub2Var = (ub2) obj;
        ub2Var.getClass();
        super.x(ub2Var);
        if (ub2Var instanceof lb2) {
            lb2 lb2Var = (lb2) ub2Var;
            if (lb2Var.equals(jb2.f16217a)) {
                P();
                return;
            }
            if (lb2Var.equals(kb2.f17991a)) {
                e3c.n(this.x);
                e3c.n(this.y);
                e3c.n(this.z);
                return;
            } else if (lb2Var.equals(ib2.f14465a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!(ub2Var instanceof tb2)) {
            t9f.b();
            return;
        }
        tb2 tb2Var = (tb2) ub2Var;
        boolean z = tb2Var instanceof nb2;
        byte b = 17;
        i1w0 i1w0Var = this.s;
        if (z) {
            i1w0Var.d(new df1(this, cui0.b(Long.valueOf(((nb2) tb2Var).f23219a)), b));
            return;
        }
        boolean z2 = tb2Var instanceof sb2;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        vzg0 vzg0Var = this.p;
        if (z2) {
            G(new ac2(true));
            long j = ((sb2) tb2Var).f31910a;
            LinkedHashSet linkedHashSetE = ((dc2) D()).b.contains(Long.valueOf(j)) ? eui0.e(((dc2) D()).b, Long.valueOf(j)) : eui0.h(((dc2) D()).b, Long.valueOf(j));
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, dc2.a((dc2) value5, null, linkedHashSetE, false, false, false, false, false, null, null, 8189)));
            vzg0Var.e("SAVED_SELECTED_SPORTS_IDS_KEY", linkedHashSetE);
            return;
        }
        if (tb2Var.equals(qb2.f28426a)) {
            O();
            return;
        }
        if (tb2Var instanceof mb2) {
            jtl jtlVar = ((mb2) tb2Var).f21485a;
            if (jtlVar.equals(rk.Y)) {
                i1w0Var.d(new df1(this, ((dc2) D()).b, b));
                return;
            } else {
                if (jtlVar.equals(rk.B)) {
                    G(new ac2(false));
                    return;
                }
                return;
            }
        }
        if (tb2Var instanceof rb2) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value4, dc2.a((dc2) value4, null, null, false, false, false, false, false, ((rb2) tb2Var).f30162a, null, 7679)));
            return;
        }
        if (tb2Var.equals(pb2.f26684a)) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, dc2.a((dc2) value3, null, null, false, true, false, false, false, null, null, 8183)));
            Date date = ((dc2) D()).k;
            if (date != null) {
                M(date);
                return;
            } else {
                O();
                return;
            }
        }
        if (!(tb2Var instanceof ob2)) {
            t9f.b();
            return;
        }
        boolean z3 = ((ob2) tb2Var).f24956a;
        if (z3) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value2 = p7m0Var4.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value2, dc2.a((dc2) value2, null, null, z3, false, false, false, false, null, null, 8187)));
        } else {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value = p7m0Var5.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value, dc2.a((dc2) value, null, xun.f41520a, false, false, false, false, false, null, null, 8185)));
            vzg0Var.e("SAVED_SELECTED_SPORTS_IDS_KEY", null);
        }
        this.w.n(z3);
    }
}
