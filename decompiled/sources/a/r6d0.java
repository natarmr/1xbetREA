package a;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes5.dex */
public final class r6d0 extends w46 {
    public final bzu b;
    public final euc c;
    public final pv00 d;
    public final i1w0 e;
    public final ljf0 f;
    public final mne g;
    public final s31 h;
    public final s64 i;
    public bby j;
    public final p7m0 k;

    public r6d0(bzu bzuVar, euc eucVar, pv00 pv00Var, i1w0 i1w0Var, ljf0 ljf0Var, f4u f4uVar, mne mneVar, s31 s31Var, s64 s64Var) {
        eucVar.getClass();
        this.b = bzuVar;
        this.c = eucVar;
        this.d = pv00Var;
        this.e = i1w0Var;
        this.f = ljf0Var;
        this.g = mneVar;
        this.h = s31Var;
        this.i = s64Var;
        p7m0 p7m0VarA = q7m0.a(new o6d0(new j6d0(false, u6d0.f35133a, "", 0, "", ""), false, false, false));
        this.k = p7m0VarA;
        p7m0VarA.o(null, new o6d0(f4uVar.c(), false, false, false));
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.j;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
    }

    public final void w() {
        Object value;
        p7m0 p7m0Var = this.k;
        z(((o6d0) p7m0Var.getValue()).f24729a);
        ((rny) ((ony) this.d.f27640a)).a("UserProxySuccessfulSaved", tny.c);
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, o6d0.a((o6d0) value, null, false, false, 3)));
        y();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(zje zjeVar) {
        p6d0 p6d0Var;
        Object objC;
        Object value;
        if (zjeVar instanceof p6d0) {
            p6d0Var = (p6d0) zjeVar;
            int i = p6d0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6d0Var.k = i - Integer.MIN_VALUE;
            } else {
                p6d0Var = new p6d0(this, zjeVar);
            }
        } else {
            p6d0Var = new p6d0(this, zjeVar);
        }
        Object objD0 = p6d0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = p6d0Var.k;
        byte b = 0;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            bzu bzuVar = this.b;
            j6d0 j6d0Var = ((o6d0) this.k.getValue()).f24729a;
            p6d0Var.k = 1;
            l6d0 l6d0Var = ((m6d0) bzuVar.b).f21264a;
            OkHttpClient okHttpClient = new OkHttpClient(l6d0Var.f19502a.c(kcx.W(j6d0Var), iun.f15405a));
            azj0 azj0Var = l6d0Var.b;
            sgy sgyVarB = sre0.f32672a.b(uyk.class);
            azj0Var.getClass();
            synchronized (azj0Var) {
                objC = azj0Var.c(sgyVarB, okHttpClient, "https://1xbet.com/");
            }
            objD0 = qjj.d0(l6d0Var.c.b, new k6d0((uyk) objC, l6d0Var, yjeVar, b), p6d0Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        if (((Boolean) objD0).booleanValue()) {
            w();
        } else {
            p7m0 p7m0Var = this.k;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, o6d0.a((o6d0) value, null, true, false, 9)));
        }
        return Unit.f46060a;
    }

    public final void y() {
        i1w0 i1w0Var = this.e;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void z(j6d0 j6d0Var) {
        ljf0 ljf0Var = this.f;
        ljf0Var.getClass();
        m6d0 m6d0Var = (m6d0) ljf0Var.f20148a;
        m6d0Var.getClass();
        l6d0 l6d0Var = m6d0Var.f21264a;
        e6d0 e6d0VarW = kcx.W(j6d0Var);
        euc eucVar = l6d0Var.f19502a;
        eucVar.getClass();
        e6d0 e6d0VarH0 = eucVar.f8413a.H0();
        if (!e6d0VarW.equals(e6d0VarH0)) {
            synchronized (eucVar) {
                try {
                    zn00 zn00Var = eucVar.f8413a;
                    ((vwb0) zn00Var.b).h("PREF_PROXY_SETTINGS", ((vby) zn00Var.f44650a).d(e6d0.Companion.serializer(), e6d0VarW));
                    eucVar.g = null;
                    eucVar.i = null;
                    eucVar.j = null;
                    eucVar.k = null;
                    Iterator it = eucVar.h.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (e6d0VarW.f7278a || e6d0VarH0.f7278a) {
                        eucVar.g = new duc(eucVar.a(iun.f15405a));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        euc eucVar2 = this.c;
        synchronized (eucVar2) {
            eucVar2.g = null;
            eucVar2.i = null;
            eucVar2.j = null;
            eucVar2.k = null;
            Iterator it2 = eucVar2.h.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
    }
}
