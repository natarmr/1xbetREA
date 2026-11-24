package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t2 implements icy, rkj, bld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f33193a = new ArrayList();
    public boolean b;
    public final vby c;
    public final String d;
    public final dcy e;

    public t2(vby vbyVar, String str) {
        this.c = vbyVar;
        this.d = str;
        this.e = vbyVar.f37162a;
    }

    @Override // a.rkj
    public boolean A() {
        return !(G() instanceof bdy);
    }

    @Override // a.bld
    public final boolean B(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        return H(S(ugi0Var, i));
    }

    @Override // a.bld
    public final rkj C(vvb0 vvb0Var, int i) {
        return M(S(vvb0Var, i), vvb0Var.g(i));
    }

    @Override // a.rkj
    public final byte D() {
        return I(U());
    }

    @Override // a.bld
    public final char E(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        return J(S(ugi0Var, i));
    }

    public abstract mcy F(String str);

    public final mcy G() {
        mcy mcyVarF;
        String str = (String) CollectionsKt.f0(this.f33193a);
        return (str == null || (mcyVarF = F(str)) == null) ? T() : mcyVarF;
    }

    public final boolean H(Object obj) {
        String str = (String) obj;
        str.getClass();
        mcy mcyVarF = F(str);
        if (!(mcyVarF instanceof jdy)) {
            StringBuilder sb = new StringBuilder("Expected ");
            tre0 tre0Var = sre0.f32672a;
            sb.append(tre0Var.b(jdy.class).J());
            sb.append(", but had ");
            sb.append(tre0Var.b(mcyVarF.getClass()).J());
            sb.append(" as the serialized body of boolean");
            throw new kcy(xww.B(-1, sb.toString(), W(str), null, this.c.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
        }
        jdy jdyVar = (jdy) mcyVarF;
        try {
            scx scxVar = ncy.f23316a;
            Boolean boolB = wsm0.b(jdyVar.b());
            if (boolB != null) {
                return boolB.booleanValue();
            }
            X(jdyVar, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jdyVar, "boolean", str);
            throw null;
        }
    }

    public final byte I(Object obj) {
        String str = (String) obj;
        str.getClass();
        mcy mcyVarF = F(str);
        if (!(mcyVarF instanceof jdy)) {
            StringBuilder sb = new StringBuilder("Expected ");
            tre0 tre0Var = sre0.f32672a;
            sb.append(tre0Var.b(jdy.class).J());
            sb.append(", but had ");
            sb.append(tre0Var.b(mcyVarF.getClass()).J());
            sb.append(" as the serialized body of byte");
            throw new kcy(xww.B(-1, sb.toString(), W(str), null, this.c.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
        }
        jdy jdyVar = (jdy) mcyVarF;
        try {
            long jK = ncy.k(jdyVar);
            Byte bValueOf = (-128 > jK || jK > 127) ? null : Byte.valueOf((byte) jK);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            X(jdyVar, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jdyVar, "byte", str);
            throw null;
        }
    }

    public final char J(Object obj) {
        String str = (String) obj;
        str.getClass();
        mcy mcyVarF = F(str);
        if (!(mcyVarF instanceof jdy)) {
            StringBuilder sb = new StringBuilder("Expected ");
            tre0 tre0Var = sre0.f32672a;
            sb.append(tre0Var.b(jdy.class).J());
            sb.append(", but had ");
            sb.append(tre0Var.b(mcyVarF.getClass()).J());
            sb.append(" as the serialized body of char");
            throw new kcy(xww.B(-1, sb.toString(), W(str), null, this.c.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
        }
        jdy jdyVar = (jdy) mcyVarF;
        try {
            String strB = jdyVar.b();
            strB.getClass();
            int length = strB.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strB.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(jdyVar, "char", str);
            throw null;
        }
    }

    public final double K(Object obj) {
        String str = (String) obj;
        str.getClass();
        mcy mcyVarF = F(str);
        boolean z = mcyVarF instanceof jdy;
        vby vbyVar = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            tre0 tre0Var = sre0.f32672a;
            sb.append(tre0Var.b(jdy.class).J());
            sb.append(", but had ");
            sb.append(tre0Var.b(mcyVarF.getClass()).J());
            sb.append(" as the serialized body of double");
            throw new kcy(xww.B(-1, sb.toString(), W(str), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
        }
        jdy jdyVar = (jdy) mcyVarF;
        try {
            scx scxVar = ncy.f23316a;
            double d = Double.parseDouble(jdyVar.b());
            dcy dcyVar = vbyVar.f37162a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            throw new kcy(xww.B(-1, xww.S(Double.valueOf(d), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", vbyVar.f37162a.i ? xww.R(-1, G().toString()).toString() : null));
        } catch (IllegalArgumentException unused) {
            X(jdyVar, "double", str);
            throw null;
        }
    }

    public final float L(Object obj) {
        String str = (String) obj;
        str.getClass();
        mcy mcyVarF = F(str);
        boolean z = mcyVarF instanceof jdy;
        vby vbyVar = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            tre0 tre0Var = sre0.f32672a;
            sb.append(tre0Var.b(jdy.class).J());
            sb.append(", but had ");
            sb.append(tre0Var.b(mcyVarF.getClass()).J());
            sb.append(" as the serialized body of float");
            throw new kcy(xww.B(-1, sb.toString(), W(str), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
        }
        jdy jdyVar = (jdy) mcyVarF;
        try {
            scx scxVar = ncy.f23316a;
            float f = Float.parseFloat(jdyVar.b());
            dcy dcyVar = vbyVar.f37162a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            throw new kcy(xww.B(-1, xww.S(Float.valueOf(f), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", vbyVar.f37162a.i ? xww.R(-1, G().toString()).toString() : null));
        } catch (IllegalArgumentException unused) {
            X(jdyVar, "float", str);
            throw null;
        }
    }

    public final rkj M(Object obj, ugi0 ugi0Var) {
        String str = (String) obj;
        str.getClass();
        ugi0Var.getClass();
        if (!zrm0.a(ugi0Var)) {
            this.f33193a.add(str);
            return this;
        }
        mcy mcyVarF = F(str);
        String strH = ugi0Var.h();
        boolean z = mcyVarF instanceof jdy;
        vby vbyVar = this.c;
        if (z) {
            return new jcy(qsm0.e(vbyVar, ((jdy) mcyVarF).b()), vbyVar);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        tre0 tre0Var = sre0.f32672a;
        sb.append(tre0Var.b(jdy.class).J());
        sb.append(", but had ");
        sb.append(tre0Var.b(mcyVarF.getClass()).J());
        throw new kcy(xww.B(-1, axq.n(sb, " as the serialized body of ", strH), W(str), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
    }

    public final int N(Object obj) {
        String str = (String) obj;
        str.getClass();
        mcy mcyVarF = F(str);
        if (!(mcyVarF instanceof jdy)) {
            StringBuilder sb = new StringBuilder("Expected ");
            tre0 tre0Var = sre0.f32672a;
            sb.append(tre0Var.b(jdy.class).J());
            sb.append(", but had ");
            sb.append(tre0Var.b(mcyVarF.getClass()).J());
            sb.append(" as the serialized body of int");
            throw new kcy(xww.B(-1, sb.toString(), W(str), null, this.c.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
        }
        jdy jdyVar = (jdy) mcyVarF;
        try {
            long jK = ncy.k(jdyVar);
            Integer numValueOf = (-2147483648L > jK || jK > 2147483647L) ? null : Integer.valueOf((int) jK);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            X(jdyVar, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jdyVar, "int", str);
            throw null;
        }
    }

    public final long O(Object obj) {
        String str = (String) obj;
        str.getClass();
        mcy mcyVarF = F(str);
        if (mcyVarF instanceof jdy) {
            jdy jdyVar = (jdy) mcyVarF;
            try {
                return ncy.k(jdyVar);
            } catch (IllegalArgumentException unused) {
                X(jdyVar, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        tre0 tre0Var = sre0.f32672a;
        sb.append(tre0Var.b(jdy.class).J());
        sb.append(", but had ");
        sb.append(tre0Var.b(mcyVarF.getClass()).J());
        sb.append(" as the serialized body of long");
        throw new kcy(xww.B(-1, sb.toString(), W(str), null, this.c.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
    }

    public final short P(Object obj) {
        String str = (String) obj;
        str.getClass();
        mcy mcyVarF = F(str);
        if (!(mcyVarF instanceof jdy)) {
            StringBuilder sb = new StringBuilder("Expected ");
            tre0 tre0Var = sre0.f32672a;
            sb.append(tre0Var.b(jdy.class).J());
            sb.append(", but had ");
            sb.append(tre0Var.b(mcyVarF.getClass()).J());
            sb.append(" as the serialized body of short");
            throw new kcy(xww.B(-1, sb.toString(), W(str), null, this.c.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
        }
        jdy jdyVar = (jdy) mcyVarF;
        try {
            long jK = ncy.k(jdyVar);
            Short shValueOf = (-32768 > jK || jK > 32767) ? null : Short.valueOf((short) jK);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            X(jdyVar, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jdyVar, "short", str);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String str = (String) obj;
        str.getClass();
        mcy mcyVarF = F(str);
        boolean z = mcyVarF instanceof jdy;
        vby vbyVar = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            tre0 tre0Var = sre0.f32672a;
            sb.append(tre0Var.b(jdy.class).J());
            sb.append(", but had ");
            sb.append(tre0Var.b(mcyVarF.getClass()).J());
            sb.append(" as the serialized body of string");
            throw new kcy(xww.B(-1, sb.toString(), W(str), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
        }
        jdy jdyVar = (jdy) mcyVarF;
        if (!(jdyVar instanceof xcy)) {
            throw new kcy(xww.B(-1, kng0.l("Expected string value for a non-null key '", str, "', got null literal instead"), W(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", vbyVar.f37162a.i ? xww.R(-1, G().toString()).toString() : null));
        }
        xcy xcyVar = (xcy) jdyVar;
        if (xcyVar.f40670a || vbyVar.f37162a.b) {
            return xcyVar.c;
        }
        throw new kcy(xww.B(-1, kng0.l("String literal for value of key '", str, "' should be quoted"), W(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", vbyVar.f37162a.i ? xww.R(-1, G().toString()).toString() : null));
    }

    public String R(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        return ugi0Var.e(i);
    }

    public final String S(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        String strR = R(ugi0Var, i);
        strR.getClass();
        return strR;
    }

    public abstract mcy T();

    public final Object U() {
        Object objK = hne.k(1, this.f33193a);
        this.b = true;
        return objK;
    }

    public final String V() {
        ArrayList arrayList = this.f33193a;
        return arrayList.isEmpty() ? "$" : CollectionsKt.b0(arrayList, Separators.DOT, "$.", null, null, 60);
    }

    public final String W(String str) {
        str.getClass();
        return V() + '.' + str;
    }

    public final void X(jdy jdyVar, String str, String str2) {
        throw new kcy(xww.B(-1, "Failed to parse literal '" + jdyVar + "' as " + (kotlin.text.c.x(str, "i", false) ? "an " : "a ").concat(str) + " value", W(str2), null, this.c.f37162a.i ? xww.R(-1, G().toString()).toString() : null));
    }

    @Override // a.rkj
    public bld a(ugi0 ugi0Var) {
        ugi0Var.getClass();
        mcy mcyVarG = G();
        c3x c3xVarL = ugi0Var.l();
        boolean zD = Intrinsics.d(c3xVarL, aum0.c);
        vby vbyVar = this.c;
        if (zD || (c3xVarL instanceof tua0)) {
            String strH = ugi0Var.h();
            if (mcyVarG instanceof yby) {
                return new pdy(vbyVar, (yby) mcyVarG);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            tre0 tre0Var = sre0.f32672a;
            sb.append(tre0Var.b(yby.class).J());
            sb.append(", but had ");
            sb.append(tre0Var.b(mcyVarG.getClass()).J());
            throw new kcy(xww.B(-1, axq.n(sb, " as the serialized body of ", strH), V(), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarG.toString()).toString() : null));
        }
        if (!Intrinsics.d(c3xVarL, aum0.d)) {
            String strH2 = ugi0Var.h();
            if (mcyVarG instanceof edy) {
                return new ody(vbyVar, (edy) mcyVarG, this.d, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            tre0 tre0Var2 = sre0.f32672a;
            sb2.append(tre0Var2.b(edy.class).J());
            sb2.append(", but had ");
            sb2.append(tre0Var2.b(mcyVarG.getClass()).J());
            throw new kcy(xww.B(-1, axq.n(sb2, " as the serialized body of ", strH2), V(), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarG.toString()).toString() : null));
        }
        ugi0 ugi0VarL = yqm0.l(ugi0Var.g(0), vbyVar.b);
        c3x c3xVarL2 = ugi0VarL.l();
        if (!(c3xVarL2 instanceof zvb0) && !Intrinsics.d(c3xVarL2, zgi0.b)) {
            throw xww.d(ugi0VarL);
        }
        String strH3 = ugi0Var.h();
        if (mcyVarG instanceof edy) {
            return new qdy(vbyVar, (edy) mcyVarG);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        tre0 tre0Var3 = sre0.f32672a;
        sb3.append(tre0Var3.b(edy.class).J());
        sb3.append(", but had ");
        sb3.append(tre0Var3.b(mcyVarG.getClass()).J());
        throw new kcy(xww.B(-1, axq.n(sb3, " as the serialized body of ", strH3), V(), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarG.toString()).toString() : null));
    }

    @Override // a.bld
    public final qaj b() {
        return this.c.b;
    }

    public void c(ugi0 ugi0Var) {
        ugi0Var.getClass();
    }

    @Override // a.icy
    public final vby d() {
        return this.c;
    }

    @Override // a.bld
    public final Object e(ugi0 ugi0Var, int i, jiy jiyVar, Object obj) {
        ugi0Var.getClass();
        jiyVar.getClass();
        this.f33193a.add(S(ugi0Var, i));
        Object objW = (jiyVar.getDescriptor().b() || A()) ? w(jiyVar) : null;
        if (!this.b) {
            U();
        }
        this.b = false;
        return objW;
    }

    @Override // a.icy
    public final mcy g() {
        return G();
    }

    @Override // a.rkj
    public final int h() {
        return N(U());
    }

    @Override // a.rkj
    public final long i() {
        return O(U());
    }

    @Override // a.bld
    public final int j(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        return N(S(ugi0Var, i));
    }

    @Override // a.rkj
    public final int k(ugi0 ugi0Var) {
        ugi0Var.getClass();
        String str = (String) U();
        str.getClass();
        mcy mcyVarF = F(str);
        String strH = ugi0Var.h();
        boolean z = mcyVarF instanceof jdy;
        vby vbyVar = this.c;
        if (z) {
            return ady.b(ugi0Var, vbyVar, ((jdy) mcyVarF).b(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        tre0 tre0Var = sre0.f32672a;
        sb.append(tre0Var.b(jdy.class).J());
        sb.append(", but had ");
        sb.append(tre0Var.b(mcyVarF.getClass()).J());
        throw new kcy(xww.B(-1, axq.n(sb, " as the serialized body of ", strH), W(str), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarF.toString()).toString() : null));
    }

    @Override // a.bld
    public final short l(vvb0 vvb0Var, int i) {
        return P(S(vvb0Var, i));
    }

    @Override // a.bld
    public final Object m(ugi0 ugi0Var, int i, jiy jiyVar, Object obj) {
        ugi0Var.getClass();
        jiyVar.getClass();
        this.f33193a.add(S(ugi0Var, i));
        jiyVar.getClass();
        Object objW = w(jiyVar);
        if (!this.b) {
            U();
        }
        this.b = false;
        return objW;
    }

    @Override // a.bld
    public final float n(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        return L(S(ugi0Var, i));
    }

    @Override // a.bld
    public final byte o(vvb0 vvb0Var, int i) {
        return I(S(vvb0Var, i));
    }

    @Override // a.rkj
    public final short p() {
        return P(U());
    }

    @Override // a.rkj
    public final float q() {
        return L(U());
    }

    @Override // a.bld
    public final long r(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        return O(S(ugi0Var, i));
    }

    @Override // a.rkj
    public final double s() {
        return K(U());
    }

    @Override // a.bld
    public final double t(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        return K(S(ugi0Var, i));
    }

    @Override // a.rkj
    public final boolean u() {
        return H(U());
    }

    @Override // a.rkj
    public final char v() {
        return J(U());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0092  */
    @Override // a.rkj
    public final Object w(jiy jiyVar) {
        String strB;
        jiyVar.getClass();
        if (!(jiyVar instanceof l4)) {
            return jiyVar.deserialize(this);
        }
        vby vbyVar = this.c;
        dcy dcyVar = vbyVar.f37162a;
        l4 l4Var = (l4) jiyVar;
        String strA = u7x.A(vbyVar, l4Var.getDescriptor());
        mcy mcyVarG = G();
        String strH = l4Var.getDescriptor().h();
        if (!(mcyVarG instanceof edy)) {
            StringBuilder sb = new StringBuilder("Expected ");
            tre0 tre0Var = sre0.f32672a;
            sb.append(tre0Var.b(edy.class).J());
            sb.append(", but had ");
            sb.append(tre0Var.b(mcyVarG.getClass()).J());
            throw new kcy(xww.B(-1, axq.n(sb, " as the serialized body of ", strH), V(), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarG.toString()).toString() : null));
        }
        edy edyVar = (edy) mcyVarG;
        mcy mcyVar = (mcy) edyVar.get(strA);
        if (mcyVar != null) {
            jdy jdyVarJ = ncy.j(mcyVar);
            if (jdyVarJ instanceof bdy) {
                strB = null;
            } else {
                strB = jdyVarJ.b();
            }
        } else {
            strB = null;
        }
        try {
            return jtm0.r(vbyVar, strA, edyVar, a8k0.t((l4) jiyVar, this, strB));
        } catch (fhi0 e) {
            String message = e.getMessage();
            message.getClass();
            throw new kcy(xww.B(-1, message, null, null, vbyVar.f37162a.i ? xww.R(-1, edyVar.toString()).toString() : null));
        }
    }

    @Override // a.bld
    public final String x(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        return Q(S(ugi0Var, i));
    }

    @Override // a.rkj
    public final rkj y(ugi0 ugi0Var) {
        ugi0Var.getClass();
        if (CollectionsKt.f0(this.f33193a) != null) {
            return M(U(), ugi0Var);
        }
        return new kdy(this.c, T(), this.d).y(ugi0Var);
    }

    @Override // a.rkj
    public final String z() {
        return Q(U());
    }
}
