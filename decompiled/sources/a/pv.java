package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class pv extends w46 {
    public final vzg0 b;
    public final mne c;
    public final do20 d;
    public final rou e;
    public final qu f;
    public final ik4 g;
    public final duj h;
    public final ctf0 i;
    public final mi70 j;
    public final i1w0 k;
    public final dq00 l;
    public final cyh m;
    public final z4w0 n;
    public final p7m0 o;
    public final ol60 p;
    public bby q;
    public final c4m0 r;

    public pv(vzg0 vzg0Var, mne mneVar, do20 do20Var, rou rouVar, qu quVar, ik4 ik4Var, duj dujVar, ctf0 ctf0Var, mi70 mi70Var, i1w0 i1w0Var, m1e m1eVar, dq00 dq00Var, cyh cyhVar, z4w0 z4w0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = vzg0Var;
        this.c = mneVar;
        this.d = do20Var;
        this.e = rouVar;
        this.f = quVar;
        this.g = ik4Var;
        this.h = dujVar;
        this.i = ctf0Var;
        this.j = mi70Var;
        this.k = i1w0Var;
        this.l = dq00Var;
        this.m = cyhVar;
        this.n = z4w0Var;
        this.o = q7m0.a(new jv(false, ctf0Var.f(R.string.open_app, new Object[0]), "", false, true, new c6q0("", e6q0.f7299a, o6q0.f24750a, r7q0.f29989a, true, false, null, ctf0Var.b.a(R.string.tfa_code, Arrays.copyOf(new Object[0], 0)), null, false, 0, null, 257152)));
        byte b = 3;
        this.p = new ol60(3);
        c4m0 c4m0Var = this.r;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.r = sac.T(new fnq(m1eVar.b(), new pa((Object) this, yjeVar, (byte) 5), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new pd(2, yjeVar, b));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(zje zjeVar) {
        ov ovVar;
        if (zjeVar instanceof ov) {
            ovVar = (ov) zjeVar;
            int i = ovVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovVar.k = i - Integer.MIN_VALUE;
            } else {
                ovVar = new ov(this, zjeVar);
            }
        } else {
            ovVar = new ov(this, zjeVar);
        }
        Object objA = ovVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ovVar.k;
        byte b = 0;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objA);
            ovVar.k = 1;
            objA = this.e.a(false, ovVar);
            if (objA != wneVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objA);
                return objA;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        m2c0 m2c0Var = (m2c0) objA;
        String strValueOf = String.valueOf(m2c0Var.S);
        String str = m2c0Var.Z;
        strValueOf.getClass();
        vsg0 vsg0Var = new vsg0(new nv(new fnq(this.m.a(new zl60("Set2Fa", str, strValueOf)), new l1(this, yjeVar, (byte) 5), (byte) 4), yjeVar, b));
        ovVar.k = 2;
        Object objK = ntb.K(vsg0Var, ovVar);
        return objK == wneVar ? wneVar : objK;
    }

    public final bby w(bvc bvcVar, Function1 function1, Function2 function2) {
        return sac.V(bvcVar, new t0(1, function1, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 20), new nc(this, (byte) 5), this.c.f22085a, new m1(this, function2, null), 8);
    }

    public final void x() {
        i1w0 i1w0Var = this.k;
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

    public final void y(Throwable th) {
        if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
            this.p.f(gv.f11953a);
            return;
        }
        this.h.b(th, new oc(2, this, pv.class, "onErrorHandlerCalled", "onErrorHandlerCalled(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(ynb0 ynb0Var, zje zjeVar) {
        mv mvVar;
        if (zjeVar instanceof mv) {
            mvVar = (mv) zjeVar;
            int i = mvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvVar.k = i - Integer.MIN_VALUE;
            } else {
                mvVar = new mv(this, zjeVar);
            }
        } else {
            mvVar = new mv(this, zjeVar);
        }
        Object objR = mvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = mvVar.k;
        if (i2 == 0) {
            z1x.P(objR);
            mvVar.k = 1;
            dq00 dq00Var = this.l;
            objR = ((nvu) dq00Var.b).R(((gst0) dq00Var.c).f11847a.a().f18785a, ynb0Var, mvVar);
            if (objR == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objR);
        }
        hjj0 hjj0Var = (hjj0) objR;
        swp0 swp0Var = hjj0Var.c;
        vzg0 vzg0Var = this.b;
        vzg0Var.e("TOKEN_KEY", swp0Var);
        vzg0Var.e("HASH_KEY", hjj0Var.b);
        return objR;
    }
}
