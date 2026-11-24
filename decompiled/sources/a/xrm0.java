package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class xrm0 extends kc5 implements icy {
    public final vby l;
    public final jrv0 m;
    public final fp n;
    public final qaj o;
    public int p;
    public drq q;
    public final dcy r;
    public final ocy s;

    public xrm0(vby vbyVar, jrv0 jrv0Var, fp fpVar, ugi0 ugi0Var, drq drqVar) {
        ugi0Var.getClass();
        this.l = vbyVar;
        this.m = jrv0Var;
        this.n = fpVar;
        this.o = vbyVar.b;
        this.p = -1;
        this.q = drqVar;
        dcy dcyVar = vbyVar.f37162a;
        this.r = dcyVar;
        this.s = dcyVar.c ? null : new ocy(ugi0Var);
    }

    @Override // a.kc5, a.rkj
    public final boolean A() {
        ocy ocyVar = this.s;
        return ((ocyVar != null ? ocyVar.b : false) || this.n.T(true)) ? false : true;
    }

    @Override // a.kc5, a.rkj
    public final byte D() {
        fp fpVar = this.n;
        long jK = fpVar.k();
        byte b = (byte) jK;
        if (jK == b) {
            return b;
        }
        fp.t(fpVar, "Failed to parse byte for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // a.kc5, a.rkj
    public final bld a(ugi0 ugi0Var) {
        ugi0Var.getClass();
        vby vbyVar = this.l;
        jrv0 jrv0VarT = yqm0.t(vbyVar, ugi0Var);
        fp fpVar = this.n;
        sbx0 sbx0Var = (sbx0) fpVar.d;
        int i = sbx0Var.b + 1;
        sbx0Var.b = i;
        if (i == ((Object[]) sbx0Var.d).length) {
            sbx0Var.l();
        }
        ((Object[]) sbx0Var.d)[i] = ugi0Var;
        fpVar.j(jrv0VarT.f17023a);
        if (fpVar.F() == 4) {
            fp.t(fpVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = jrv0VarT.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new xrm0(vbyVar, jrv0VarT, fpVar, ugi0Var, this.q);
        }
        return (this.m == jrv0VarT && vbyVar.f37162a.c) ? this : new xrm0(vbyVar, jrv0VarT, fpVar, ugi0Var, this.q);
    }

    @Override // a.bld
    public final qaj b() {
        return this.o;
    }

    @Override // a.kc5, a.bld
    public final void c(ugi0 ugi0Var) {
        ugi0Var.getClass();
        if (ugi0Var.d() == 0 && ady.c(this.l, ugi0Var)) {
            while (f(ugi0Var) != -1) {
            }
        }
        fp fpVar = this.n;
        if (fpVar.S()) {
            xww.O(fpVar, "");
            throw null;
        }
        fpVar.j(this.m.b);
        sbx0 sbx0Var = (sbx0) fpVar.d;
        int i = sbx0Var.b;
        int[] iArr = (int[]) sbx0Var.e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            sbx0Var.b = i;
        }
        if (i != -1) {
            sbx0Var.b = i - 1;
        }
    }

    @Override // a.icy
    public final vby d() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x02a5 A[EDGE_INSN: B:169:0x02a5->B:170:0x02a6 BREAK  A[LOOP:2: B:153:0x0249->B:200:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.bld
    public final int f(ugi0 ugi0Var) {
        boolean z;
        boolean z2;
        char c;
        String strG;
        fp fpVar = this.n;
        sbx0 sbx0Var = (sbx0) fpVar.d;
        ugi0Var.getClass();
        jrv0 jrv0Var = this.m;
        int iOrdinal = jrv0Var.ordinal();
        char c2 = ':';
        int i = 0;
        zS = false;
        boolean zS = false;
        boolean z3 = true;
        int iA = -1;
        if (iOrdinal == 0) {
            boolean zS2 = fpVar.S();
            while (true) {
                boolean zD = fpVar.d();
                ocy ocyVar = this.s;
                if (zD) {
                    dcy dcyVar = this.r;
                    boolean z4 = dcyVar.b;
                    String strO = z4 ? fpVar.o() : fpVar.g();
                    fpVar.j(c2);
                    vby vbyVar = this.l;
                    int i2 = iA;
                    iA = ady.a(ugi0Var, vbyVar, strO);
                    if (iA != -3) {
                        if (dcyVar.e) {
                            boolean zI = ugi0Var.i(iA);
                            ugi0 ugi0VarG = ugi0Var.g(iA);
                            if (zI && !ugi0VarG.b() && fpVar.T(z3)) {
                                z = z3;
                            } else {
                                z = z3;
                                if (Intrinsics.d(ugi0VarG.l(), zgi0.b) && ((!ugi0VarG.b() || !fpVar.T(false)) && (strG = fpVar.G(z4)) != null)) {
                                    int iA2 = ady.a(ugi0VarG, vbyVar, strG);
                                    boolean z5 = (vbyVar.f37162a.c || !ugi0VarG.b()) ? false : z;
                                    if (iA2 == -3 && (zI || z5)) {
                                        fpVar.m();
                                    }
                                }
                            }
                            zS2 = fpVar.S();
                            z3 = false;
                        }
                        if (ocyVar != null) {
                            srn srnVar = ocyVar.f25051a;
                            if (iA < 64) {
                                srnVar.f32686a |= 1 << iA;
                            } else {
                                int i3 = (iA >>> 6) - 1;
                                long[] jArr = (long[]) srnVar.d;
                                jArr[i3] = jArr[i3] | (1 << (iA & 63));
                            }
                        }
                    } else {
                        z = z3;
                        zS2 = false;
                    }
                    if (z3) {
                        if (!ady.c(vbyVar, ugi0Var)) {
                            drq drqVar = this.q;
                            if (drqVar == null || !Intrinsics.d(drqVar.b, strO)) {
                                int i4 = sbx0Var.b;
                                int[] iArr = (int[]) sbx0Var.e;
                                if (iArr[i4] == -2) {
                                    iArr[i4] = i2;
                                    i4--;
                                    sbx0Var.b = i4;
                                }
                                if (i4 != i2) {
                                    sbx0Var.b = i4 + i2;
                                }
                                fpVar.s(StringsKt.Y(0, ((String) fpVar.g).subSequence(0, fpVar.b).toString(), 6, strO), hne.l('\'', "Encountered an unknown key '", strO), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                                throw null;
                            }
                            drqVar.b = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bF = fpVar.F();
                        if (bF == 8 || bF == 6) {
                            while (true) {
                                byte bF2 = fpVar.F();
                                z2 = z;
                                if (bF2 != z2) {
                                    c = 6;
                                    if (bF2 == 8 || bF2 == 6) {
                                        arrayList.add(Byte.valueOf(bF2));
                                    } else if (bF2 == 9) {
                                        if (((Number) CollectionsKt.d0(arrayList)).byteValue() != 8) {
                                            fp.t(fpVar, "found ] instead of }", 0, null, 6);
                                            throw null;
                                        }
                                        w3d.z(arrayList);
                                    } else if (bF2 == 7) {
                                        if (((Number) CollectionsKt.d0(arrayList)).byteValue() != 6) {
                                            fp.t(fpVar, "found } instead of ]", 0, null, 6);
                                            throw null;
                                        }
                                        w3d.z(arrayList);
                                    } else if (bF2 == 10) {
                                        fp.t(fpVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    fpVar.h();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z4) {
                                    fpVar.n();
                                } else {
                                    fpVar.g();
                                }
                                z = z2;
                            }
                        } else {
                            fpVar.n();
                            z2 = z;
                            c = 6;
                        }
                        zS2 = fpVar.S();
                        z3 = z2;
                        iA = i2;
                        c2 = ':';
                    } else {
                        iA = i2;
                        z3 = z;
                        c2 = ':';
                    }
                } else {
                    int i5 = iA;
                    if (!zS2) {
                        if (ocyVar == null) {
                            iA = i5;
                            break;
                        }
                        srn srnVar2 = ocyVar.f25051a;
                        ens ensVar = (ens) srnVar2.c;
                        ugi0 ugi0Var2 = (ugi0) srnVar2.b;
                        int iD = ugi0Var2.d();
                        while (true) {
                            long j = srnVar2.f32686a;
                            if (j == -1) {
                                if (iD <= 64) {
                                    iA = i5;
                                    break;
                                }
                                long[] jArr2 = (long[]) srnVar2.d;
                                int length = jArr2.length;
                                loop3: while (true) {
                                    if (i >= length) {
                                        iA = i5;
                                        break;
                                    }
                                    int i6 = i + 1;
                                    int i7 = i6 * 64;
                                    long j2 = jArr2[i];
                                    while (true) {
                                        if (j2 != -1) {
                                            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                            j2 |= 1 << iNumberOfTrailingZeros;
                                            int i8 = iNumberOfTrailingZeros + i7;
                                            if (((Boolean) ensVar.invoke(ugi0Var2, Integer.valueOf(i8))).booleanValue()) {
                                                jArr2[i] = j2;
                                                iA = i8;
                                                break;
                                            }
                                        } else {
                                            jArr2[i] = j2;
                                            i = i6;
                                        }
                                    }
                                }
                            } else {
                                int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                                srnVar2.f32686a |= 1 << iNumberOfTrailingZeros2;
                                if (((Boolean) ensVar.invoke(ugi0Var2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                    iA = iNumberOfTrailingZeros2;
                                    break;
                                }
                            }
                        }
                    } else {
                        xww.O(fpVar, "object");
                        throw null;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zS3 = fpVar.S();
            if (fpVar.d()) {
                int i9 = this.p;
                if (i9 != -1 && !zS3) {
                    fp.t(fpVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                iA = i9 + 1;
                this.p = iA;
            } else if (zS3) {
                xww.O(fpVar, "array");
                throw null;
            }
        } else {
            int i10 = this.p;
            Object[] objArr = i10 % 2 != 0;
            if (objArr != true) {
                fpVar.j(':');
            } else if (i10 != -1) {
                zS = fpVar.S();
            }
            if (fpVar.d()) {
                if (objArr != false) {
                    int i11 = this.p;
                    int i12 = fpVar.b;
                    if (i11 == -1) {
                        if (zS) {
                            fp.t(fpVar, "Unexpected leading comma", i12, null, 4);
                            throw null;
                        }
                    } else if (!zS) {
                        fp.t(fpVar, "Expected comma after the key-value pair", i12, null, 4);
                        throw null;
                    }
                }
                iA = this.p + 1;
                this.p = iA;
            } else if (zS) {
                xww.O(fpVar, "object");
                throw null;
            }
        }
        if (jrv0Var != jrv0.MAP) {
            ((int[]) sbx0Var.e)[sbx0Var.b] = iA;
        }
        return iA;
    }

    @Override // a.icy
    public final mcy g() {
        dcy dcyVar = this.l.f37162a;
        u3u0 u3u0Var = new u3u0();
        u3u0Var.c = this.n;
        u3u0Var.b = dcyVar.b;
        return u3u0Var.g();
    }

    @Override // a.kc5, a.rkj
    public final int h() {
        fp fpVar = this.n;
        long jK = fpVar.k();
        int i = (int) jK;
        if (jK == i) {
            return i;
        }
        fp.t(fpVar, "Failed to parse int for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // a.kc5, a.rkj
    public final long i() {
        return this.n.k();
    }

    @Override // a.kc5, a.rkj
    public final int k(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return ady.b(ugi0Var, this.l, z(), " at path ".concat(((sbx0) this.n.d).f()));
    }

    @Override // a.kc5, a.bld
    public final Object m(ugi0 ugi0Var, int i, jiy jiyVar, Object obj) {
        sbx0 sbx0Var = (sbx0) this.n.d;
        ugi0Var.getClass();
        jiyVar.getClass();
        boolean z = this.m == jrv0.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) sbx0Var.e;
            int i2 = sbx0Var.b;
            if (iArr[i2] == -2) {
                ((Object[]) sbx0Var.d)[i2] = lwf.p;
            }
        }
        Object objW = w(jiyVar);
        if (z) {
            int[] iArr2 = (int[]) sbx0Var.e;
            int i3 = sbx0Var.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                sbx0Var.b = i4;
                if (i4 == ((Object[]) sbx0Var.d).length) {
                    sbx0Var.l();
                }
            }
            Object[] objArr = (Object[]) sbx0Var.d;
            int i5 = sbx0Var.b;
            objArr[i5] = ((dcy) sbx0Var.c).i ? objW : m2a.p;
            ((int[]) sbx0Var.e)[i5] = -2;
        }
        return objW;
    }

    @Override // a.kc5, a.rkj
    public final short p() {
        fp fpVar = this.n;
        long jK = fpVar.k();
        short s = (short) jK;
        if (jK == s) {
            return s;
        }
        fp.t(fpVar, "Failed to parse short for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // a.kc5, a.rkj
    public final float q() {
        fp fpVar = this.n;
        String strN = fpVar.n();
        try {
            float f = Float.parseFloat(strN);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            fp.t(fpVar, xww.S(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            fp.t(fpVar, hne.l('\'', "Failed to parse type 'float' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // a.kc5, a.rkj
    public final double s() {
        fp fpVar = this.n;
        String strN = fpVar.n();
        try {
            double d = Double.parseDouble(strN);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            fp.t(fpVar, xww.S(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            fp.t(fpVar, hne.l('\'', "Failed to parse type 'double' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // a.kc5, a.rkj
    public final boolean u() {
        boolean z;
        boolean z2;
        fp fpVar = this.n;
        int iR = fpVar.R();
        String str = (String) fpVar.g;
        if (iR == str.length()) {
            fp.t(fpVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iR) == '\"') {
            iR++;
            z = true;
        } else {
            z = false;
        }
        int iJ = fpVar.J(iR);
        if (iJ >= str.length() || iJ == -1) {
            fp.t(fpVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iJ + 1;
        int iCharAt = str.charAt(iJ) | ' ';
        if (iCharAt == 102) {
            fpVar.f(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                fp.t(fpVar, "Expected valid boolean literal prefix, but had '" + fpVar.n() + '\'', 0, null, 6);
                throw null;
            }
            fpVar.f(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (fpVar.b == str.length()) {
            fp.t(fpVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(fpVar.b) == '\"') {
            fpVar.b++;
            return z2;
        }
        fp.t(fpVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // a.kc5, a.rkj
    public final char v() {
        fp fpVar = this.n;
        String strN = fpVar.n();
        if (strN.length() == 1) {
            return strN.charAt(0);
        }
        fp.t(fpVar, hne.l('\'', "Expected single char, but got '", strN), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0146  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0147, please report this as an issue */
    @Override // a.rkj
    public final Object w(jiy jiyVar) {
        String message;
        String strB;
        vby vbyVar = this.l;
        fp fpVar = this.n;
        sbx0 sbx0Var = (sbx0) fpVar.d;
        jiyVar.getClass();
        try {
            if (!(jiyVar instanceof l4)) {
                return jiyVar.deserialize(this);
            }
            String strA = u7x.A(vbyVar, ((l4) jiyVar).getDescriptor());
            String strE = fpVar.E(strA, this.r.b);
            if (strE != null) {
                try {
                    jiy jiyVarT = a8k0.t((l4) jiyVar, this, strE);
                    drq drqVar = new drq();
                    drqVar.b = strA;
                    this.q = drqVar;
                    return jiyVarT.deserialize(this);
                } catch (fhi0 e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    String strE0 = StringsKt.e0(StringsKt.q0(message2, '\n'), Separators.DOT);
                    String message3 = e.getMessage();
                    message3.getClass();
                    String strSubstring = "";
                    int iU = StringsKt.U('\n', 0, 6, message3);
                    if (iU != -1) {
                        strSubstring = message3.substring(iU + 1, message3.length());
                    }
                    fp.t(fpVar, strE0, 0, strSubstring, 2);
                    throw null;
                }
            }
            String strA2 = u7x.A(vbyVar, ((l4) jiyVar).getDescriptor());
            mcy mcyVarG = g();
            String strH = ((l4) jiyVar).getDescriptor().h();
            if (!(mcyVarG instanceof edy)) {
                StringBuilder sb = new StringBuilder("Expected ");
                tre0 tre0Var = sre0.f32672a;
                sb.append(tre0Var.b(edy.class).J());
                sb.append(", but had ");
                sb.append(tre0Var.b(mcyVarG.getClass()).J());
                sb.append(" as the serialized body of ");
                sb.append(strH);
                throw new kcy(xww.B(-1, sb.toString(), sbx0Var.f(), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarG.toString()).toString() : null));
            }
            edy edyVar = (edy) mcyVarG;
            mcy mcyVar = (mcy) edyVar.get(strA2);
            if (mcyVar != null) {
                jdy jdyVarJ = ncy.j(mcyVar);
                strB = jdyVarJ instanceof bdy ? null : jdyVarJ.b();
            }
            try {
                return jtm0.r(vbyVar, strA2, edyVar, a8k0.t((l4) jiyVar, this, strB));
            } catch (fhi0 e2) {
                String message4 = e2.getMessage();
                message4.getClass();
                throw new kcy(xww.B(-1, message4, null, null, vbyVar.f37162a.i ? xww.R(-1, edyVar.toString()).toString() : null));
            }
            message = e.getMessage();
            message.getClass();
            if (StringsKt.O(message, "at path", false)) {
                throw e;
            }
            throw new bh40(e.getMessage() + " at path: " + sbx0Var.f(), e, e.f2587a, e.b);
        } catch (bh40 e3) {
            message = e3.getMessage();
            message.getClass();
            if (StringsKt.O(message, "at path", false)) {
                throw e3;
            }
            throw new bh40(e3.getMessage() + " at path: " + sbx0Var.f(), e3, e3.f2587a, e3.b);
        }
    }

    @Override // a.kc5, a.rkj
    public final rkj y(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return zrm0.a(ugi0Var) ? new jcy(this.n, this.l) : this;
    }

    @Override // a.kc5, a.rkj
    public final String z() {
        boolean z = this.r.b;
        fp fpVar = this.n;
        return z ? fpVar.o() : fpVar.m();
    }
}
