package a;

import android.os.Trace;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mz3 extends pm80 implements jff0 {
    public static final or3 v = new or3((byte) 10);
    public a4d h;
    public boolean i;
    public bby j;
    public vne l;
    public Function1 n;
    public pz3 q;
    public gz3 r;
    public final p7m0 s;
    public final p7m0 t;
    public final xae0 u;
    public final pz40 f = androidx.compose.runtime.e.e(null);
    public float g = 1.0f;
    public long k = 9205357640488583168L;
    public Function1 m = v;
    public qge o = gqw0.B;
    public boolean p = true;

    public mz3(gz3 gz3Var) {
        this.r = gz3Var;
        this.s = q7m0.a(gz3Var);
        p7m0 p7m0VarA = q7m0.a(hz3.f13888a);
        this.t = p7m0VarA;
        this.u = vtb.N(p7m0VarA);
    }

    @Override // a.pm80
    public final boolean a(float f) {
        this.g = f;
        return true;
    }

    @Override // a.pm80
    public final boolean b(a4d a4dVar) {
        this.h = a4dVar;
        return true;
    }

    @Override // a.jff0
    public final void c() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objK = k();
            jff0 jff0Var = objK instanceof jff0 ? (jff0) objK : null;
            if (jff0Var != null) {
                jff0Var.c();
            }
            l();
            this.i = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // a.jff0
    public final void f() {
        bby bbyVar = this.j;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.j = null;
        Object objK = k();
        jff0 jff0Var = objK instanceof jff0 ? (jff0) objK : null;
        if (jff0Var != null) {
            jff0Var.f();
        }
        this.i = false;
    }

    @Override // a.jff0
    public final void g() {
        bby bbyVar = this.j;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.j = null;
        Object objK = k();
        jff0 jff0Var = objK instanceof jff0 ? (jff0) objK : null;
        if (jff0Var != null) {
            jff0Var.g();
        }
        this.i = false;
    }

    @Override // a.pm80
    public final long i() {
        pm80 pm80VarK = k();
        if (pm80VarK != null) {
            return pm80VarK.i();
        }
        return 9205357640488583168L;
    }

    @Override // a.pm80
    public final void j(fhl fhlVar) {
        long jD = fhlVar.d();
        if (!h7k0.b(this.k, jD)) {
            this.k = jD;
        }
        pm80 pm80VarK = k();
        if (pm80VarK != null) {
            pm80VarK.e(fhlVar, fhlVar.d(), this.g, this.h);
        }
    }

    public final pm80 k() {
        return (pm80) ((hgk0) this.f).getValue();
    }

    public final void l() {
        gz3 gz3Var = this.r;
        if (gz3Var == null) {
            return;
        }
        vne vneVar = this.l;
        yje yjeVar = null;
        if (vneVar == null) {
            Intrinsics.h(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL);
            throw null;
        }
        ex1 ex1Var = new ex1((Object) this, (Object) gz3Var, yjeVar, (byte) 4);
        CoroutineContext coroutineContext = vneVar.getCoroutineContext();
        int i = iut0.b;
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.d1);
        lne lneVar = element instanceof lne ? (lne) element : null;
        c4m0 c4m0VarV = (lneVar == null || lneVar.equals(tvk.b)) ? qjj.V(vneVar, tvk.b, yne.d, ex1Var) : qjj.V(d5c.a(new lzj(vneVar.getCoroutineContext())), new mzj(lneVar), yne.d, ex1Var);
        bby bbyVar = this.j;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.j = c4m0VarV;
    }

    public final void m() {
        if (this.r != null) {
            if (this.i) {
                l();
            }
        } else {
            bby bbyVar = this.j;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.j = null;
        }
    }

    public final void n(gz3 gz3Var) {
        if (Intrinsics.d(this.r, gz3Var)) {
            return;
        }
        this.r = gz3Var;
        m();
        if (gz3Var != null) {
            p7m0 p7m0Var = this.s;
            p7m0Var.getClass();
            p7m0Var.o(null, gz3Var);
        }
    }

    public final o1x o(o1x o1xVar, boolean z) {
        k1x k1xVarA = o1x.a(o1xVar);
        k1xVarA.d = new xr(o1xVar, this);
        m1x m1xVar = o1xVar.v;
        if (m1xVar.i == null) {
            k1xVarA.r = s7k0.f31754a;
        }
        if (m1xVar.j == null) {
            qge qgeVar = this.o;
            int i = iut0.b;
            k1xVarA.s = (Intrinsics.d(qgeVar, gqw0.B) || Intrinsics.d(qgeVar, gqw0.f1)) ? j1h0.b : j1h0.f15734a;
        }
        if (m1xVar.k == null) {
            k1xVarA.t = asb0.b;
        }
        if (z) {
            kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
            k1xVarA.j = gVar;
            k1xVarA.k = gVar;
            k1xVarA.l = gVar;
        }
        return k1xVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public final void p(lz3 lz3Var) {
        u1x u1xVar;
        pm80 pm80VarA;
        Function1 function1;
        Object objA;
        jff0 jff0Var;
        jff0 jff0Var2;
        p7m0 p7m0Var = this.t;
        lz3 lz3Var2 = (lz3) p7m0Var.getValue();
        lz3 lz3Var3 = (lz3) this.m.invoke(lz3Var);
        p7m0Var.n(lz3Var3);
        qge qgeVar = this.o;
        if (!(lz3Var3 instanceof kz3)) {
            if (lz3Var3 instanceof iz3) {
                u1xVar = ((iz3) lz3Var3).b;
            } else {
                pm80VarA = null;
            }
            if (pm80VarA == null) {
                pm80VarA = lz3Var3.a();
            }
            ((hgk0) this.f).setValue(pm80VarA);
            if (lz3Var2.a() != lz3Var3.a()) {
                objA = lz3Var2.a();
                if (objA instanceof jff0) {
                    jff0Var = (jff0) objA;
                } else {
                    jff0Var = null;
                }
                if (jff0Var != null) {
                    jff0Var.g();
                }
                Object objA2 = lz3Var3.a();
                jff0Var2 = objA2 instanceof jff0 ? (jff0) objA2 : null;
                if (jff0Var2 != null) {
                    jff0Var2.c();
                }
            }
            function1 = this.n;
            if (function1 != null) {
                function1.invoke(lz3Var3);
            }
        }
        u1xVar = ((kz3) lz3Var3).b;
        hms0 hms0VarA = ((wls0) qbc.P(u1xVar.getRequest(), t1x.f33190a)).a(q8a.f28290a, u1xVar);
        if (hms0VarA instanceof nef) {
            pm80 pm80VarA2 = lz3Var2.a();
            if (!(lz3Var2 instanceof jz3)) {
                pm80VarA2 = null;
            }
            pm80 pm80VarA3 = lz3Var3.a();
            uen uenVar = wen.b;
            pm80VarA = new lef(pm80VarA2, pm80VarA3, qgeVar, ibc.v0(((nef) hms0VarA).c, bfn.MILLISECONDS), ((u1xVar instanceof hhn0) && ((hhn0) u1xVar).g) ? false : true, ((Boolean) qbc.P(u1xVar.getRequest(), r1x.b)).booleanValue());
        } else {
            pm80VarA = null;
        }
        if (pm80VarA == null) {
            pm80VarA = lz3Var3.a();
        }
        ((hgk0) this.f).setValue(pm80VarA);
        if (lz3Var2.a() != lz3Var3.a()) {
            objA = lz3Var2.a();
            if (objA instanceof jff0) {
                jff0Var = (jff0) objA;
            } else {
                jff0Var = null;
            }
            if (jff0Var != null) {
                jff0Var.g();
            }
            Object objA3 = lz3Var3.a();
            if (objA3 instanceof jff0) {
            }
            if (jff0Var2 != null) {
                jff0Var2.c();
            }
        }
        function1 = this.n;
        if (function1 != null) {
            function1.invoke(lz3Var3);
        }
    }
}
