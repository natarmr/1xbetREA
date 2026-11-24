package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class lbf extends w46 {
    public final lqb b;
    public final duj c;
    public final mne d;
    public final jh70 e;
    public final byf0 f;
    public final rjo g;
    public final i1w0 h;
    public final paf i;
    public final mi70 j;
    public final e0c k;
    public final rou l;
    public final qud m;
    public final m1e n;
    public final nr o;
    public final s64 p;
    public final p7m0 q;
    public final ol60 r;
    public final p7m0 s;
    public c4m0 t;
    public bby u;
    public boolean v;

    public lbf(vzg0 vzg0Var, lqb lqbVar, duj dujVar, mne mneVar, jh70 jh70Var, byf0 byf0Var, rjo rjoVar, i1w0 i1w0Var, paf pafVar, mi70 mi70Var, e0c e0cVar, rou rouVar, qud qudVar, m1e m1eVar, nr nrVar, s64 s64Var) {
        m1eVar.getClass();
        this.b = lqbVar;
        this.c = dujVar;
        this.d = mneVar;
        this.e = jh70Var;
        this.f = byf0Var;
        this.g = rjoVar;
        this.h = i1w0Var;
        this.i = pafVar;
        this.j = mi70Var;
        this.k = e0cVar;
        this.l = rouVar;
        this.m = qudVar;
        this.n = m1eVar;
        this.o = nrVar;
        this.p = s64Var;
        this.q = q7m0.a(dbf.f5801a);
        this.r = new ol60(3);
        this.s = q7m0.a(new w190());
    }

    public final void w(Throwable th) {
        kuw kuwVar;
        if (th != null) {
            boolean z = th instanceof SocketTimeoutException;
            ol60 ol60Var = this.r;
            if (z || (th instanceof UnknownHostException)) {
                ol60Var.f(abf.f575a);
                return;
            } else if (th instanceof u3c) {
                ol60Var.f(new raf(R.string.short_password));
                return;
            }
        }
        zhi0 zhi0Var = th instanceof zhi0 ? (zhi0) th : null;
        int errorCode = (zhi0Var == null || (kuwVar = zhi0Var.c) == null) ? 0 : kuwVar.getErrorCode();
        if (errorCode != 0) {
            String strValueOf = String.valueOf(errorCode);
            nr nrVar = this.o;
            nrVar.getClass();
            strValueOf.getClass();
            i8i.D("error_code", strValueOf, (kt2) nrVar.b, "acc_change_password_error");
            b1j.r(errorCode, this.p.f31684a, 3245L);
        }
        this.c.b(th, new cnc(this, (byte) 22));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(zje zjeVar) {
        gbf gbfVar;
        if (zjeVar instanceof gbf) {
            gbfVar = (gbf) zjeVar;
            int i = gbfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbfVar.k = i - Integer.MIN_VALUE;
            } else {
                gbfVar = new gbf(this, zjeVar);
            }
        } else {
            gbfVar = new gbf(this, zjeVar);
        }
        Object objA = gbfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = gbfVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            gbfVar.k = 1;
            objA = this.l.a(false, gbfVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        m2c0 m2c0Var = (m2c0) objA;
        jqt0 jqt0Var = m2c0Var.k;
        return ((jqt0Var == jqt0.e) || (jqt0Var == jqt0.d)) ? m2c0Var.Z : "";
    }

    public final void y(boolean z) {
        this.r.f(new vaf(z));
    }
}
