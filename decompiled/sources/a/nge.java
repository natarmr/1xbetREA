package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/nge;", "La/um40;", "La/oge;", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class nge extends um40 {
    public final o1x b;
    public final gbe0 c;
    public final fz3 d;
    public final Function1 e;
    public final Function1 f;
    public final u12 g;
    public final qge h;
    public final a4d i;
    public final boolean j;
    public final pz3 k;
    public final String l;

    public nge(o1x o1xVar, gbe0 gbe0Var, fz3 fz3Var, Function1 function1, Function1 function2, u12 u12Var, qge qgeVar, a4d a4dVar, boolean z, pz3 pz3Var, String str) {
        this.b = o1xVar;
        this.c = gbe0Var;
        this.d = fz3Var;
        this.e = function1;
        this.f = function2;
        this.g = u12Var;
        this.h = qgeVar;
        this.i = a4dVar;
        this.j = z;
        this.k = pz3Var;
        this.l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nge) {
            nge ngeVar = (nge) obj;
            if (this.b.equals(ngeVar.b) && this.c == ngeVar.c && Intrinsics.d(this.d, ngeVar.d) && Intrinsics.d(this.e, ngeVar.e) && Intrinsics.d(this.f, ngeVar.f) && Intrinsics.d(this.g, ngeVar.g) && Intrinsics.d(this.h, ngeVar.h) && Float.compare(1.0f, 1.0f) == 0 && Intrinsics.d(this.i, ngeVar.i) && this.j == ngeVar.j && Intrinsics.d(this.k, ngeVar.k) && Intrinsics.d(this.l, ngeVar.l)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        fz3 fz3Var = this.d;
        gbe0 gbe0Var = this.c;
        o1x o1xVar = this.b;
        gz3 gz3Var = new gz3(gbe0Var, o1xVar, fz3Var);
        mz3 mz3Var = new mz3(gz3Var);
        mz3Var.m = this.e;
        mz3Var.n = this.f;
        mz3Var.o = this.h;
        mz3Var.p = true;
        mz3Var.q = this.k;
        mz3Var.n(gz3Var);
        s7k0 s7k0Var = o1xVar.r;
        return new oge(mz3Var, this.g, this.h, this.i, this.j, this.l, s7k0Var instanceof t4e ? (t4e) s7k0Var : null);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        oge ogeVar = (oge) lm40Var;
        long jI = ogeVar.v.i();
        t4e t4eVar = ogeVar.u;
        fz3 fz3Var = this.d;
        gbe0 gbe0Var = this.c;
        o1x o1xVar = this.b;
        gz3 gz3Var = new gz3(gbe0Var, o1xVar, fz3Var);
        mz3 mz3Var = ogeVar.v;
        mz3Var.m = this.e;
        mz3Var.n = this.f;
        qge qgeVar = this.h;
        mz3Var.o = qgeVar;
        mz3Var.p = true;
        mz3Var.q = this.k;
        mz3Var.n(gz3Var);
        boolean zB = h7k0.b(jI, mz3Var.i());
        ogeVar.o = this.g;
        s7k0 s7k0Var = o1xVar.r;
        ogeVar.u = s7k0Var instanceof t4e ? (t4e) s7k0Var : null;
        ogeVar.p = qgeVar;
        ogeVar.q = 1.0f;
        ogeVar.r = this.i;
        ogeVar.s = this.j;
        String str = ogeVar.t;
        String str2 = this.l;
        if (!Intrinsics.d(str, str2)) {
            ogeVar.t = str2;
            s0x.S(ogeVar);
        }
        boolean zD = Intrinsics.d(t4eVar, ogeVar.u);
        if (!zB || !zD) {
            n7x.I(ogeVar);
        }
        vfc.J(ogeVar);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31;
        Function1 function1 = this.f;
        int iA = defpackage.c.a((this.h.hashCode() + ((this.g.hashCode() + twn.a(1, (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31, 31)) * 31)) * 31, 1.0f, 31);
        a4d a4dVar = this.i;
        int iE = brm0.e((iA + (a4dVar == null ? 0 : a4dVar.hashCode())) * 31, 31, this.j);
        pz3 pz3Var = this.k;
        int iHashCode2 = (iE + (pz3Var == null ? 0 : pz3Var.hashCode())) * 31;
        String str = this.l;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.b);
        sb.append(", imageLoader=");
        sb.append(this.c);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.d);
        sb.append(", transform=");
        sb.append(this.e);
        sb.append(", onState=");
        sb.append(this.f);
        sb.append(", filterQuality=Low, alignment=");
        sb.append(this.g);
        sb.append(", contentScale=");
        sb.append(this.h);
        sb.append(", alpha=1.0, colorFilter=");
        sb.append(this.i);
        sb.append(", clipToBounds=");
        sb.append(this.j);
        sb.append(", previewHandler=");
        sb.append(this.k);
        sb.append(", contentDescription=");
        return axq.n(sb, this.l, Separators.RPAREN);
    }
}
