package a;

import android.content.ClipDescription;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k7q0 {
    public final cgx0 A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7t0 f17837a;
    public djz d;
    public Function0 g;
    public iuc h;
    public vne i;
    public hw90 j;
    public omv k;
    public cqq l;
    public final pz40 m;
    public final pz40 n;
    public long o;
    public o9q0 p;
    public long q;
    public final pz40 r;
    public final pz40 s;
    public int t;
    public a8q0 u;
    public cgx0 v;
    public o9q0 w;
    public final pz40 x;
    public final hcp0 y;
    public final i7q0 z;
    public qe60 b = pwt0.f27727a;
    public Function1 c = new t6q0(7);
    public final pz40 e = androidx.compose.runtime.e.e(new a8q0((String) null, 0, 7));
    public vuu0 f = gfk0.f;

    public k7q0(q7t0 q7t0Var) {
        this.f17837a = q7t0Var;
        Boolean bool = Boolean.TRUE;
        this.m = androidx.compose.runtime.e.e(bool);
        this.n = androidx.compose.runtime.e.e(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = androidx.compose.runtime.e.e(null);
        this.s = androidx.compose.runtime.e.e(null);
        this.t = -1;
        this.u = new a8q0((String) null, 0L, 7);
        this.x = androidx.compose.runtime.e.e(Boolean.FALSE);
        hcp0 hcp0Var = new hcp0((byte) 2);
        hcp0Var.c = iwq0.f15503a;
        this.y = hcp0Var;
        this.z = new i7q0(this);
        this.A = new cgx0(this);
    }

    public static a8q0 b(j83 j83Var, long j) {
        return new a8q0(j83Var, j, (o9q0) null);
    }

    public final c4m0 a(boolean z) {
        vne vneVar = this.i;
        yje yjeVar = null;
        if (vneVar != null) {
            return qjj.W(vneVar, null, yne.d, new din0(this, z, yjeVar, (byte) 4), 1);
        }
        return null;
    }

    public final void c() {
        vne vneVar = this.i;
        if (vneVar != null) {
            qjj.W(vneVar, null, yne.d, new z2n0(this, null, (byte) 12), 1);
        }
    }

    public final void d(ne60 ne60Var) {
        if (!o9q0.c(l().b)) {
            djz djzVar = this.d;
            b9q0 b9q0VarD = djzVar != null ? djzVar.d() : null;
            int iE = (ne60Var == null || b9q0VarD == null) ? o9q0.e(l().b) : this.b.n(b9q0VarD.b(true, ne60Var.f23370a));
            a8q0 a8q0VarA = a8q0.a(l(), null, s7n0.e(iE, iE), 5);
            this.c.invoke(a8q0VarA);
            this.w = new o9q0(a8q0VarA.b);
        }
        r((ne60Var == null || l().f440a.b.length() <= 0) ? dmv.f6336a : dmv.c);
        u(false);
    }

    public final void e(boolean z) {
        cqq cqqVar;
        djz djzVar = this.d;
        if (djzVar != null && !djzVar.b() && (cqqVar = this.l) != null) {
            cqq.a(cqqVar);
        }
        this.u = l();
        u(z);
        r(dmv.b);
    }

    public final Pair f() {
        String str;
        o9q0 o9q0Var;
        j83 j83VarK = k();
        if (j83VarK == null || (str = j83VarK.b) == null || (o9q0Var = this.w) == null) {
            return null;
        }
        long j = o9q0Var.f24893a;
        return new Pair(str, new o9q0(s7n0.e(this.b.s((int) (j >> 32)), this.b.s((int) (j & 4294967295L)))));
    }

    public final ne60 g() {
        return (ne60) ((hgk0) this.s).getValue();
    }

    public final boolean h() {
        return ((Boolean) ((hgk0) this.m).getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) ((hgk0) this.n).getValue()).booleanValue();
    }

    public final long j(boolean z) {
        b9q0 b9q0VarD;
        long j;
        djz djzVar = this.d;
        if (djzVar == null || (b9q0VarD = djzVar.d()) == null) {
            return 9205357640488583168L;
        }
        a9q0 a9q0Var = b9q0VarD.f2224a;
        bw40 bw40Var = a9q0Var.b;
        j83 j83VarK = k();
        if (j83VarK == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.d(j83VarK.b, a9q0Var.f491a.f43981a.b)) {
            return 9205357640488583168L;
        }
        a8q0 a8q0VarL = l();
        if (z) {
            long j2 = a8q0VarL.b;
            int i = o9q0.c;
            j = j2 >> 32;
        } else {
            long j3 = a8q0VarL.b;
            int i2 = o9q0.c;
            j = j3 & 4294967295L;
        }
        int iS = this.b.s((int) j);
        boolean zG = o9q0.g(l().b);
        long j4 = a9q0Var.c;
        int iD = bw40Var.d(iS);
        if (iD >= bw40Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = a9q0Var.a(((!z || zG) && (z || !zG)) ? Math.max(iS + (-1), 0) : iS) == a9q0Var.j(iS);
        bw40Var.k(iS);
        int length = ((j83) bw40Var.f3309a.f38604a).b.length();
        ArrayList arrayList = bw40Var.h;
        yn80 yn80Var = (yn80) arrayList.get(iS == length ? arrayList.size() - 1 : b8k0.B(iS, arrayList));
        s03 s03Var = yn80Var.f42927a;
        int iD2 = yn80Var.d(iS);
        y8q0 y8q0Var = s03Var.d;
        return (((long) Float.floatToRawIntBits(l1e0.c(bw40Var.b(iD), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(l1e0.c(z2 ? y8q0Var.i(iD2, false) : y8q0Var.j(iD2, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    public final j83 k() {
        djz djzVar = this.d;
        if (djzVar != null) {
            return (j83) djzVar.f6209a.b;
        }
        return null;
    }

    public final a8q0 l() {
        return (a8q0) ((hgk0) this.e).getValue();
    }

    public final void m() {
        c4m0 c4m0Var;
        j5q0 j5q0Var = (j5q0) this.y.b;
        if (j5q0Var == null || (c4m0Var = j5q0Var.u) == null) {
            return;
        }
        c4m0Var.cancel(null);
        j5q0Var.u = null;
    }

    public final void n(o9q0 o9q0Var) {
        j83 j83VarK;
        String str;
        vne vneVar;
        if (o9q0Var == null) {
            return;
        }
        long j = o9q0Var.f24893a;
        hw90 hw90Var = this.j;
        if (hw90Var == null || (j83VarK = k()) == null || (str = j83VarK.b) == null) {
            return;
        }
        qe60 qe60Var = this.b;
        long jE = s7n0.e(qe60Var.s((int) (j >> 32)), qe60Var.s((int) (j & 4294967295L)));
        if (str.length() <= 0 || o9q0.c(jE) || (vneVar = this.i) == null) {
            return;
        }
        qjj.W(vneVar, null, null, new mee(hw90Var, str, jE, o9q0Var, this, qe60Var, (yje) null), 3);
    }

    public final void o() {
        vne vneVar = this.i;
        if (vneVar != null) {
            qjj.W(vneVar, null, yne.d, new e7q0(this, null, (byte) 1), 1);
        }
    }

    public final void p(ne60 ne60Var) {
        ((hgk0) this.s).setValue(ne60Var);
    }

    public final void q(blv blvVar) {
        ((hgk0) this.r).setValue(blvVar);
    }

    public final void r(dmv dmvVar) {
        djz djzVar = this.d;
        if (djzVar != null) {
            if (djzVar.a() == dmvVar) {
                djzVar = null;
            }
            if (djzVar != null) {
                ((hgk0) djzVar.k).setValue(dmvVar);
            }
        }
    }

    public final void s() {
        djz djzVar;
        d5q0 d5q0Var;
        rfk0 rfk0VarJ = vdx.J();
        yje yjeVar = null;
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            if (!i() || ((djzVar = this.d) != null && !((Boolean) ((hgk0) djzVar.q).getValue()).booleanValue())) {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                return;
            }
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            hcp0 hcp0Var = this.y;
            if (((iwq0) hcp0Var.c) == iwq0.f15503a) {
                adx.c("ToolbarRequester is not initialized.");
            }
            j5q0 j5q0Var = (j5q0) hcp0Var.b;
            if (j5q0Var == null || !j5q0Var.n) {
                return;
            }
            c4m0 c4m0Var = j5q0Var.u;
            if ((c4m0Var == null || !c4m0Var.isActive()) && (d5q0Var = (d5q0) mbc.R(j5q0Var, e5q0.b)) != null) {
                j5q0Var.u = qjj.W(j5q0Var.N0(), null, yne.d, new kpb0((Object) j5q0Var, (Object) d5q0Var, yjeVar, (byte) 21), 1);
            }
        } catch (Throwable th) {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(zje zjeVar) {
        j7q0 j7q0Var;
        if (zjeVar instanceof j7q0) {
            j7q0Var = (j7q0) zjeVar;
            int i = j7q0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7q0Var.l = i - Integer.MIN_VALUE;
            } else {
                j7q0Var = new j7q0(this, zjeVar);
            }
        } else {
            j7q0Var = new j7q0(this, zjeVar);
        }
        Object objValueOf = j7q0Var.j;
        Object obj = wne.f39444a;
        int i2 = j7q0Var.l;
        if (i2 == 0) {
            z1x.P(objValueOf);
            iuc iucVar = this.h;
            if (iucVar != null) {
                j7q0Var.i = this;
                j7q0Var.l = 1;
                if (!(iucVar instanceof zw2)) {
                    c99.s(kng0.k("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", sre0.f32672a.b(iucVar.getClass()).v()));
                    return null;
                }
                ClipDescription primaryClipDescription = ((zw2) iucVar).f45086a.f().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = j7q0Var.i;
        z1x.P(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        ((hgk0) this.x).setValue(bool);
        return Unit.f46060a;
    }

    public final void u(boolean z) {
        djz djzVar = this.d;
        if (djzVar != null) {
            ((hgk0) djzVar.l).setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    public final long v(a8q0 a8q0Var, long j, boolean z, boolean z2, w4i0 w4i0Var, boolean z3, pmv pmvVar) {
        b9q0 b9q0VarD;
        long j2;
        int i;
        long j3;
        u4i0 u4i0Var;
        boolean z4;
        boolean z5;
        omv omvVar;
        djz djzVar = this.d;
        if (djzVar == null || (b9q0VarD = djzVar.d()) == null) {
            return o9q0.b;
        }
        qe60 qe60Var = this.b;
        long j4 = a8q0Var.b;
        j83 j83Var = a8q0Var.f440a;
        int i2 = o9q0.c;
        long jE = s7n0.e(qe60Var.s((int) (j4 >> 32)), this.b.s((int) (j4 & 4294967295L)));
        int iB = b9q0VarD.b(false, j);
        int i3 = (z2 || z) ? iB : (int) (jE >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iB;
        } else {
            j2 = 4294967295L;
            i = (int) (jE & 4294967295L);
        }
        cgx0 cgx0Var = this.v;
        int i4 = -1;
        if (z || cgx0Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = this.t;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        a9q0 a9q0Var = b9q0VarD.f2224a;
        if (z) {
            u4i0Var = null;
        } else {
            int i6 = (int) (jE >> 32);
            int i7 = (int) (jE & j3);
            u4i0Var = new u4i0(new t4i0(pzw.J(a9q0Var, i6), i6, 1L), new t4i0(pzw.J(a9q0Var, i7), i7, 1L), o9q0.g(jE));
        }
        cgx0 cgx0Var2 = new cgx0(z2, u4i0Var, new hu5(i3, i, i4, a9q0Var), (byte) 13);
        if (u4i0Var != null && cgx0Var != null && z2 == cgx0Var.b) {
            hu5 hu5Var = (hu5) cgx0Var.d;
            if (i3 == hu5Var.b && i == hu5Var.c) {
                return j4;
            }
        }
        this.v = cgx0Var2;
        this.t = iB;
        u4i0 u4i0VarA = w4i0Var.a(cgx0Var2);
        long jE2 = s7n0.e(this.b.n(u4i0VarA.f35050a.b), this.b.n(u4i0VarA.b.b));
        if (o9q0.b(jE2, j4)) {
            return j4;
        }
        boolean z6 = o9q0.g(jE2) != o9q0.g(j4) && o9q0.b(s7n0.e((int) (jE2 & j3), (int) (jE2 >> 32)), j4);
        boolean z7 = o9q0.c(jE2) && o9q0.c(j4);
        if (z3 && j83Var.b.length() > 0 && !z6 && !z7 && pmvVar != null && (omvVar = this.k) != null) {
            ((tv90) omvVar).a(pmvVar.f27257a);
        }
        this.c.invoke(b(j83Var, jE2));
        this.w = new o9q0(jE2);
        if (!z3) {
            u(!o9q0.c(jE2));
        }
        djz djzVar2 = this.d;
        if (djzVar2 != null) {
            ((hgk0) djzVar2.q).setValue(Boolean.valueOf(z3));
        }
        djz djzVar3 = this.d;
        if (djzVar3 != null) {
            ((hgk0) djzVar3.m).setValue(Boolean.valueOf(!o9q0.c(jE2) && cvm0.k(this, true)));
        }
        djz djzVar4 = this.d;
        if (djzVar4 != null) {
            if (o9q0.c(jE2)) {
                z4 = false;
            } else {
                z4 = false;
                if (cvm0.k(this, false)) {
                    z5 = true;
                }
                ((hgk0) djzVar4.n).setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            ((hgk0) djzVar4.n).setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        djz djzVar5 = this.d;
        if (djzVar5 != null) {
            ((hgk0) djzVar5.o).setValue(Boolean.valueOf((o9q0.c(jE2) && cvm0.k(this, true)) ? true : z4));
        }
        return jE2;
    }
}
