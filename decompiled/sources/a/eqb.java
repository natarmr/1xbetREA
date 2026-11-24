package a;

import java.net.UnknownHostException;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class eqb extends w46 {
    public final vzg0 b;
    public final f4u c;
    public final lef0 d;
    public final cyh e;
    public final z4w0 f;
    public final mne g;
    public final ort h;
    public final oeg0 i;
    public final duj j;
    public final pru k;
    public final ctf0 l;
    public final rou m;
    public final zg n;
    public final au0 o;
    public final p7m0 p;
    public final p7m0 q;
    public final p7m0 r;
    public final p7m0 s;
    public final ol60 t;
    public final p7m0 u;
    public final qoj0 v;
    public final qoj0 w;
    public final qoj0 x;
    public c4m0 y;
    public boolean z;

    public eqb(vzg0 vzg0Var, f4u f4uVar, lef0 lef0Var, cyh cyhVar, z4w0 z4w0Var, mne mneVar, ort ortVar, oeg0 oeg0Var, duj dujVar, m1e m1eVar, pru pruVar, ctf0 ctf0Var, rou rouVar, zg zgVar, au0 au0Var) {
        oeg0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = vzg0Var;
        this.c = f4uVar;
        this.d = lef0Var;
        this.e = cyhVar;
        this.f = z4w0Var;
        this.g = mneVar;
        this.h = ortVar;
        this.i = oeg0Var;
        this.j = dujVar;
        this.k = pruVar;
        this.l = ctf0Var;
        this.m = rouVar;
        this.n = zgVar;
        this.o = au0Var;
        zpb zpbVar = (zpb) vzg0Var.a("SCREEN_STATE_KEY");
        this.p = q7m0.a(zpbVar == null ? zpb.f44752a : zpbVar);
        this.q = q7m0.a("");
        this.r = q7m0.a("");
        Boolean bool = Boolean.FALSE;
        this.s = q7m0.a(bool);
        this.t = new ol60(1, i99.b);
        this.u = q7m0.a(bool);
        this.v = ckb.F();
        this.w = ckb.F();
        this.x = ckb.F();
        w();
        slb.U(new fnq(m1eVar.b(), new aqb(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a));
    }

    public final boolean A(String str) {
        str.getClass();
        this.b.e("SAVED_LOGIN_STATE_KEY", str);
        boolean zG = new Regex("^[0-9].*").g(str);
        boolean z = false;
        p7m0 p7m0Var = this.p;
        if (zG) {
            z(p7m0Var, zpb.g);
        } else if (new Regex("[^a-zA-Z0-9]").a(str)) {
            z(p7m0Var, zpb.f);
        } else if (str.length() > 20) {
            z(p7m0Var, zpb.e);
        } else if (str.length() >= 5) {
            z(p7m0Var, zpb.f44752a);
            z = true;
        }
        twn.A(z, this.s, null);
        return z;
    }

    public final void w() {
        Boolean bool = Boolean.TRUE;
        p7m0 p7m0Var = this.u;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        sac.i0(jiu0.a(this), "PinLoginViewModel.getLoginRequirements", 2, 0L, kotlin.collections.a.c(UnknownHostException.class), null, new d09((Object) this, (yje) null, (byte) 27), null, this.g.b, new zhb(1, this, eqb.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), new h8a(this, (byte) 10), 84);
    }

    public final void x(Throwable th) {
        String message;
        if (!(th instanceof UnknownHostException) && (message = th.getMessage()) != null) {
            if (message.length() > 0) {
                this.v.g(message);
            }
            if (th instanceof zhi0) {
                int errorCode = ((zhi0) th).c.getErrorCode();
                String strValueOf = String.valueOf(errorCode);
                zg zgVar = this.n;
                zgVar.getClass();
                strValueOf.getClass();
                i8i.D("error_code", strValueOf, zgVar.f44322a, "acc_change_log_error");
                String strValueOf2 = String.valueOf(errorCode);
                au0 au0Var = this.o;
                au0Var.getClass();
                strValueOf2.getClass();
                b1j.v(strValueOf2, au0Var.f1455a, 11362L);
            }
        }
        this.j.a(th);
    }

    public final void y() {
        i1w0 i1w0VarC = this.i.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void z(p7m0 p7m0Var, zpb zpbVar) {
        this.b.e("SCREEN_STATE_KEY", zpbVar);
        p7m0Var.getClass();
        p7m0Var.o(null, zpbVar);
    }
}
