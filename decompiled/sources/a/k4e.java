package a;

import android.gov.nist.core.Separators;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class k4e {
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final w2e J;
    public final w2e K;
    public final w2e L;
    public final w2e M;
    public final w2e N;
    public final w2e O;
    public final w2e P;
    public final w2e Q;
    public final w2e[] R;
    public final ArrayList S;
    public final boolean[] T;
    public j4e[] U;
    public k4e V;
    public int W;
    public int X;
    public float Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17665a;
    public int a0;
    public nbb b;
    public int b0;
    public nbb c;
    public int c0;
    public cmw d;
    public int d0;
    public ocu0 e;
    public int e0;
    public final boolean[] f;
    public float f0;
    public boolean g;
    public float g0;
    public int h;
    public Object h0;
    public int i;
    public int i0;
    public final vdv0 j;
    public boolean j0;
    public String k;
    public String k0;
    public boolean l;
    public int l0;
    public boolean m;
    public int m0;
    public boolean n;
    public final float[] n0;
    public boolean o;
    public final k4e[] o0;
    public int p;
    public final k4e[] p0;
    public int q;
    public k4e q0;
    public int r;
    public k4e r0;
    public int s;
    public int s0;
    public int t;
    public int t0;
    public final int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    public k4e() {
        this.f17665a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new vdv0(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        w2e w2eVar = new w2e(this, 2);
        this.J = w2eVar;
        w2e w2eVar2 = new w2e(this, 3);
        this.K = w2eVar2;
        w2e w2eVar3 = new w2e(this, 4);
        this.L = w2eVar3;
        w2e w2eVar4 = new w2e(this, 5);
        this.M = w2eVar4;
        w2e w2eVar5 = new w2e(this, 6);
        this.N = w2eVar5;
        this.O = new w2e(this, 8);
        this.P = new w2e(this, 9);
        w2e w2eVar6 = new w2e(this, 7);
        this.Q = w2eVar6;
        this.R = new w2e[]{w2eVar, w2eVar3, w2eVar2, w2eVar4, w2eVar5, w2eVar6};
        this.S = new ArrayList();
        this.T = new boolean[2];
        j4e j4eVar = j4e.f15879a;
        this.U = new j4e[]{j4eVar, j4eVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new float[]{-1.0f, -1.0f};
        this.o0 = new k4e[]{null, null};
        this.p0 = new k4e[]{null, null};
        this.q0 = null;
        this.r0 = null;
        this.s0 = -1;
        this.t0 = -1;
        a();
    }

    public static void I(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        twn.w(i, str, " :   ", ",\n", sb);
    }

    public static void J(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void q(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, j4e j4eVar) {
        sb.append(str);
        sb.append(" :  {\n");
        String string = j4eVar.toString();
        if (!"FIXED".equals(string)) {
            f140.v(sb, "      behavior", " :   ", string, ",\n");
        }
        I(i, 0, "      size", sb);
        I(i2, 0, "      min", sb);
        I(i3, Integer.MAX_VALUE, "      max", sb);
        I(i4, 0, "      matchMin", sb);
        I(i5, 0, "      matchDef", sb);
        J(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void r(StringBuilder sb, String str, w2e w2eVar) {
        if (w2eVar.f == null) {
            return;
        }
        hne.B(sb, "    ", str, " : [ '");
        sb.append(w2eVar.f);
        sb.append(Separators.QUOTE);
        if (w2eVar.h != Integer.MIN_VALUE || w2eVar.g != 0) {
            sb.append(Separators.COMMA);
            sb.append(w2eVar.g);
            if (w2eVar.h != Integer.MIN_VALUE) {
                sb.append(Separators.COMMA);
                sb.append(w2eVar.h);
                sb.append(Separators.COMMA);
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        w2e w2eVar = this.K;
        w2e w2eVar2 = w2eVar.f;
        if (w2eVar2 != null && w2eVar2.f == w2eVar) {
            return true;
        }
        w2e w2eVar3 = this.M;
        w2e w2eVar4 = w2eVar3.f;
        return w2eVar4 != null && w2eVar4.f == w2eVar3;
    }

    public final boolean B() {
        return this.g && this.i0 != 8;
    }

    public boolean C() {
        if (this.l) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean D() {
        if (this.m) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public void E() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.V = null;
        this.E = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        j4e[] j4eVarArr = this.U;
        j4e j4eVar = j4e.f15879a;
        j4eVarArr[0] = j4eVar;
        j4eVarArr[1] = j4eVar;
        this.h0 = null;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        float[] fArr = this.n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void F() {
        k4e k4eVar = this.V;
        if (k4eVar != null && (k4eVar instanceof l4e)) {
            ((l4e) k4eVar).getClass();
        }
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((w2e) arrayList.get(i)).j();
        }
    }

    public final void G() {
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w2e w2eVar = (w2e) arrayList.get(i);
            w2eVar.c = false;
            w2eVar.b = 0;
        }
    }

    public void H(nr nrVar) {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.Q.k();
        this.O.k();
        this.P.k();
    }

    public final void K(int i) {
        this.c0 = i;
        this.F = i > 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
  0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public final void L(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.Y = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i2);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i;
                }
            } else {
                String strSubstring3 = str.substring(i2, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else {
                        fAbs = i3 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.Y = fAbs;
            this.Z = i3;
        }
    }

    public final void M(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        this.l = true;
    }

    public final void N(int i, int i2) {
        if (this.m) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        if (this.F) {
            this.N.l(i + this.c0);
        }
        this.m = true;
    }

    public final void O(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public final void P(j4e j4eVar) {
        this.U[0] = j4eVar;
    }

    public final void Q(float f, int i, int i2, int i3) {
        this.s = i;
        this.v = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.w = i3;
        this.x = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.s = 2;
    }

    public final void R(j4e j4eVar) {
        this.U[1] = j4eVar;
    }

    public final void S(float f, int i, int i2, int i3) {
        this.t = i;
        this.y = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.z = i3;
        this.A = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.t = 2;
    }

    public final void T(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void U(boolean z, boolean z2) {
        int i;
        int i2;
        cmw cmwVar = this.d;
        boolean z3 = z & cmwVar.g;
        ocu0 ocu0Var = this.e;
        boolean z4 = z2 & ocu0Var.g;
        int i3 = cmwVar.h.g;
        int i4 = ocu0Var.h.g;
        int i5 = cmwVar.i.g;
        int i6 = ocu0Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.a0 = i3;
        }
        if (z4) {
            this.b0 = i4;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        j4e j4eVar = j4e.f15879a;
        if (z3) {
            if (this.U[0] == j4eVar && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i10 = this.d0;
            if (i8 < i10) {
                this.W = i10;
            }
        }
        if (z4) {
            if (this.U[1] == j4eVar && i9 < (i = this.X)) {
                i9 = i;
            }
            this.X = i9;
            int i11 = this.e0;
            if (i9 < i11) {
                this.X = i11;
            }
        }
    }

    public void V(p900 p900Var, boolean z) {
        int i;
        int i2;
        ocu0 ocu0Var;
        cmw cmwVar;
        p900Var.getClass();
        int iN = p900.n(this.J);
        int iN2 = p900.n(this.K);
        int iN3 = p900.n(this.L);
        int iN4 = p900.n(this.M);
        if (z && (cmwVar = this.d) != null) {
            i7k i7kVar = cmwVar.h;
            if (i7kVar.j) {
                i7k i7kVar2 = cmwVar.i;
                if (i7kVar2.j) {
                    iN = i7kVar.g;
                    iN3 = i7kVar2.g;
                }
            }
        }
        if (z && (ocu0Var = this.e) != null) {
            i7k i7kVar3 = ocu0Var.h;
            if (i7kVar3.j) {
                i7k i7kVar4 = ocu0Var.i;
                if (i7kVar4.j) {
                    iN2 = i7kVar3.g;
                    iN4 = i7kVar4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.a0 = iN;
        this.b0 = iN2;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        j4e[] j4eVarArr = this.U;
        j4e j4eVar = j4eVarArr[0];
        j4e j4eVar2 = j4e.f15879a;
        if (j4eVar == j4eVar2 && i4 < (i2 = this.W)) {
            i4 = i2;
        }
        if (j4eVarArr[1] == j4eVar2 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i4;
        this.X = i5;
        int i6 = this.e0;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.d0;
        if (i4 < i7) {
            this.W = i7;
        } else {
            i7 = i4;
        }
        int i8 = this.w;
        j4e j4eVar3 = j4e.c;
        if (i8 > 0 && j4eVar == j4eVar3) {
            this.W = Math.min(i7, i8);
        }
        int i9 = this.z;
        if (i9 > 0 && this.U[1] == j4eVar3) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void a() {
        w2e w2eVar = this.J;
        ArrayList arrayList = this.S;
        arrayList.add(w2eVar);
        arrayList.add(this.K);
        arrayList.add(this.L);
        arrayList.add(this.M);
        arrayList.add(this.O);
        arrayList.add(this.P);
        arrayList.add(this.Q);
        arrayList.add(this.N);
    }

    public final void b(l4e l4eVar, p900 p900Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            f1t0.M(l4eVar, p900Var, this);
            hashSet.remove(this);
            c(p900Var, l4eVar.d0(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.J.f38443a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((w2e) it.next()).d.b(l4eVar, p900Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.L.f38443a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((w2e) it2.next()).d.b(l4eVar, p900Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.f38443a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((w2e) it3.next()).d.b(l4eVar, p900Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.M.f38443a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((w2e) it4.next()).d.b(l4eVar, p900Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.N.f38443a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((w2e) it5.next()).d.b(l4eVar, p900Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0210  */
    /* JADX WARN: Code duplicated, block: B:128:0x0218  */
    /* JADX WARN: Code duplicated, block: B:131:0x0221  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:137:0x023e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0247  */
    /* JADX WARN: Code duplicated, block: B:148:0x026d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0293  */
    /* JADX WARN: Code duplicated, block: B:164:0x029e  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:190:0x0302  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:256:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:266:0x03da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:277:0x0403  */
    /* JADX WARN: Code duplicated, block: B:281:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x0421  */
    /* JADX WARN: Code duplicated, block: B:287:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x042d  */
    /* JADX WARN: Code duplicated, block: B:293:0x0437  */
    /* JADX WARN: Code duplicated, block: B:296:0x043e  */
    /* JADX WARN: Code duplicated, block: B:298:0x0442  */
    /* JADX WARN: Code duplicated, block: B:301:0x045b  */
    /* JADX WARN: Code duplicated, block: B:320:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:335:0x054f  */
    /* JADX WARN: Code duplicated, block: B:351:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:354:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:355:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:358:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:380:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:382:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:384:0x0606  */
    /* JADX WARN: Code duplicated, block: B:386:0x0612  */
    /* JADX WARN: Code duplicated, block: B:388:0x0616  */
    /* JADX WARN: Code duplicated, block: B:389:0x061e  */
    /* JADX WARN: Code duplicated, block: B:395:0x0674  */
    /* JADX WARN: Code duplicated, block: B:397:0x067a  */
    /* JADX WARN: Code duplicated, block: B:399:0x0683  */
    /* JADX WARN: Code duplicated, block: B:400:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:403:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r37v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r60v0, types: [a.k4e] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    public void c(p900 p900Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r19;
        int i6;
        boolean z2;
        HashSet hashSet;
        k4e k4eVar;
        l4e l4eVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        k4e k4eVar2;
        l4e l4eVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr;
        w2e w2eVar;
        boolean[] zArr2;
        boolean z3;
        ?? r12;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        j4e j4eVar;
        j4e j4eVar2;
        boolean z5;
        j4e j4eVar3;
        boolean z6;
        float f;
        int i12;
        int i13;
        ukk0 ukk0Var;
        ukk0 ukk0Var2;
        int i14;
        int i15;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        w2e w2eVar2;
        boolean z11;
        ukk0 ukk0Var3;
        ukk0 ukk0Var4;
        int i16;
        ?? r20;
        j4e j4eVar4;
        boolean z12;
        ?? r3;
        boolean z13;
        ?? r110;
        ukk0 ukk0Var5;
        ukk0 ukk0Var6;
        ukk0 ukk0Var7;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f2;
        w2e w2eVar3;
        ?? r27;
        ocu0 ocu0Var;
        cmw cmwVar;
        int i23;
        int i24;
        ?? Z;
        boolean zA;
        cmw cmwVar2;
        ocu0 ocu0Var2;
        boolean z14;
        p900 p900Var2 = p900Var;
        w2e w2eVar4 = this.J;
        ukk0 ukk0VarK = p900Var2.k(w2eVar4);
        w2e w2eVar5 = this.L;
        ukk0 ukk0VarK2 = p900Var2.k(w2eVar5);
        w2e w2eVar6 = this.K;
        ukk0 ukk0VarK3 = p900Var2.k(w2eVar6);
        w2e w2eVar7 = this.M;
        ukk0 ukk0VarK4 = p900Var2.k(w2eVar7);
        w2e w2eVar8 = this.N;
        ukk0 ukk0VarK5 = p900Var2.k(w2eVar8);
        k4e k4eVar3 = this.V;
        j4e j4eVar5 = j4e.b;
        if (k4eVar3 != null) {
            j4e[] j4eVarArr = k4eVar3.U;
            i2 = 0;
            i4 = j4eVarArr[0] == j4eVar5 ? 1 : 0;
            int i25 = j4eVarArr[1] == j4eVar5 ? 1 : 0;
            int i26 = this.r;
            if (i26 != 1) {
                i = 1;
                if (i26 == 2) {
                    i4 = 0;
                } else if (i26 != 3) {
                }
                i3 = i25;
            } else {
                i = 1;
                i3 = 0;
            }
            i5 = this.i0;
            r19 = i3;
            boolean[] zArr3 = this.T;
            if (i5 != 8 && !this.j0) {
                ArrayList arrayList = this.S;
                int size = arrayList.size();
                i6 = i4;
                int i27 = i2;
                while (true) {
                    if (i27 >= size) {
                        if (zArr3[i2] || zArr3[i]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i28 = size;
                    HashSet hashSet2 = ((w2e) arrayList.get(i27)).f38443a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i27++;
                    size = i28;
                }
            } else {
                i6 = i4;
            }
            z2 = this.l;
            if (z2 || this.m) {
                if (z2) {
                    p900Var2.d(ukk0VarK, this.a0);
                    p900Var2.d(ukk0VarK2, this.a0 + this.W);
                    if (i6 != 0 && (k4eVar2 = this.V) != null) {
                        l4eVar2 = (l4e) k4eVar2;
                        weakReference3 = l4eVar2.L0;
                        if (weakReference3 != null || weakReference3.get() == null || w2eVar4.d() > ((w2e) l4eVar2.L0.get()).d()) {
                            l4eVar2.L0 = new WeakReference(w2eVar4);
                        }
                        weakReference4 = l4eVar2.N0;
                        if (weakReference4 != null || weakReference4.get() == null || w2eVar5.d() > ((w2e) l4eVar2.N0.get()).d()) {
                            l4eVar2.N0 = new WeakReference(w2eVar5);
                        }
                    }
                }
                if (this.m) {
                    p900Var2.d(ukk0VarK3, this.b0);
                    p900Var2.d(ukk0VarK4, this.b0 + this.X);
                    hashSet = w2eVar8.f38443a;
                    if (hashSet != null && hashSet.size() > 0) {
                        p900Var2.d(ukk0VarK5, this.b0 + this.c0);
                    }
                    if (r19 != 0 && (k4eVar = this.V) != null) {
                        l4eVar = (l4e) k4eVar;
                        weakReference = l4eVar.K0;
                        if (weakReference != null || weakReference.get() == null || w2eVar6.d() > ((w2e) l4eVar.K0.get()).d()) {
                            l4eVar.K0 = new WeakReference(w2eVar6);
                        }
                        weakReference2 = l4eVar.M0;
                        if (weakReference2 != null || weakReference2.get() == null || w2eVar7.d() > ((w2e) l4eVar.M0.get()).d()) {
                            l4eVar.M0 = new WeakReference(w2eVar7);
                        }
                    }
                }
                if (this.l && this.m) {
                    ?? r13 = i2;
                    this.l = r13;
                    this.m = r13;
                    return;
                }
            }
            zArr = this.f;
            if (z || (cmwVar2 = this.d) == null || (ocu0Var2 = this.e) == null) {
                w2eVar = w2eVar8;
                zArr2 = zArr;
            } else {
                w2eVar = w2eVar8;
                i7k i7kVar = cmwVar2.h;
                zArr2 = zArr;
                if (i7kVar.j && cmwVar2.i.j && ocu0Var2.h.j && ocu0Var2.i.j) {
                    p900Var2.d(ukk0VarK, i7kVar.g);
                    p900Var2.d(ukk0VarK2, this.d.i.g);
                    p900Var2.d(ukk0VarK3, this.e.h.g);
                    p900Var2.d(ukk0VarK4, this.e.i.g);
                    p900Var2.d(ukk0VarK5, this.e.k.g);
                    if (this.V == null) {
                        z14 = false;
                    } else {
                        if (i6 != 0 && zArr2[0] && !z()) {
                            p900Var2.f(p900Var2.k(this.V.L), ukk0VarK2, 0, 8);
                        }
                        if (r19 == 0 || !zArr2[i] || A()) {
                            z14 = false;
                        } else {
                            z14 = false;
                            p900Var2.f(p900Var2.k(this.V.M), ukk0VarK4, 0, 8);
                        }
                    }
                    this.l = z14;
                    this.m = z14;
                    return;
                }
            }
            if (this.V != null) {
                if (y(0)) {
                    ((l4e) this.V).X(this, 0);
                    int i29 = i;
                    i24 = i29 == true ? 1 : 0;
                    Z = i29;
                } else {
                    i24 = i;
                    Z = z();
                }
                if (y(i24)) {
                    ((l4e) this.V).X(this, i24);
                    zA = true;
                } else {
                    zA = A();
                }
                if (Z != 0 && i6 != 0 && this.i0 != 8 && w2eVar4.f == null && w2eVar5.f == null) {
                    p900Var2.f(p900Var2.k(this.V.L), ukk0VarK2, 0, 1);
                }
                if (!zA && r19 != 0 && this.i0 != 8 && w2eVar6.f == null && w2eVar7.f == null && w2eVar == null) {
                    p900Var2.f(p900Var2.k(this.V.M), ukk0VarK4, 0, 1);
                }
                z3 = zA;
                r12 = Z;
            } else {
                w2eVar4 = w2eVar4;
                z3 = false;
                r12 = 0;
            }
            i7 = this.W;
            i8 = this.d0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.X;
            z4 = z3;
            i10 = this.e0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            j4e[] j4eVarArr2 = this.U;
            j4eVar = j4eVarArr2[0];
            j4eVar2 = j4e.c;
            if (j4eVar != j4eVar2) {
                z5 = true;
            } else {
                z5 = false;
            }
            j4eVar3 = j4eVarArr2[1];
            if (j4eVar3 != j4eVar2) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i30 = this.Z;
            this.B = i30;
            float f3 = this.Y;
            this.C = f3;
            f = f3;
            i12 = this.s;
            i13 = this.t;
            if (f > 0.0f) {
                ukk0Var = ukk0VarK4;
                if (this.i0 != 8) {
                    if (j4eVar == j4eVar2 || i12 != 0) {
                        i14 = i12;
                    } else {
                        i14 = 3;
                    }
                    if (j4eVar3 == j4eVar2 || i13 != 0) {
                        i23 = i13;
                    } else {
                        i23 = 3;
                    }
                    if (j4eVar != j4eVar2 && j4eVar3 == j4eVar2) {
                        ukk0Var2 = ukk0VarK5;
                        if (i14 == 3 && i23 == 3) {
                            if (i30 == -1) {
                                if (z5 && !z6) {
                                    this.B = 0;
                                    i30 = 0;
                                } else if (!z5 && z6) {
                                    this.B = 1;
                                    if (i30 == -1) {
                                        this.C = 1.0f / f;
                                    }
                                    i30 = 1;
                                }
                            }
                            if (i30 == 0 && (!w2eVar6.h() || !w2eVar7.h())) {
                                this.B = 1;
                            } else if (this.B == 1 && (!w2eVar4.h() || !w2eVar5.h())) {
                                this.B = 0;
                            }
                            if (this.B == -1 && (!w2eVar6.h() || !w2eVar7.h() || !w2eVar4.h() || !w2eVar5.h())) {
                                if (w2eVar6.h() && w2eVar7.h()) {
                                    this.B = 0;
                                } else if (w2eVar4.h() && w2eVar5.h()) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                }
                            }
                            int i31 = this.B;
                            if (i31 == -1) {
                                int i32 = this.v;
                                if (i32 > 0 && this.y == 0) {
                                    this.B = 0;
                                    i31 = 0;
                                } else if (i32 == 0 && this.y > 0) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                    i31 = 1;
                                }
                            }
                            i30 = i31;
                        }
                        i6 = i6;
                        z7 = true;
                        i15 = i23;
                        int[] iArr = this.u;
                        iArr[0] = i14;
                        iArr[1] = i15;
                        if (z7 || !(i30 == 0 || i30 == -1)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z7 || !(i30 == 1 || i30 == -1)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (this.U[0] == j4eVar5 || !(this instanceof l4e)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            i8 = 0;
                        }
                        w2eVar2 = this.Q;
                        z11 = !w2eVar2.h();
                        boolean z15 = zArr3[0];
                        boolean z16 = zArr3[1];
                        if (this.p != 2 || this.l) {
                            ukk0Var3 = ukk0VarK;
                            ukk0Var4 = ukk0VarK2;
                            i16 = i14;
                            r20 = r12;
                            j4eVar4 = j4eVar5;
                            z12 = z4;
                            r3 = i6;
                            z13 = z11;
                            r110 = r19;
                        } else {
                            if (z && (cmwVar = this.d) != null) {
                                i7k i7kVar2 = cmwVar.h;
                                if (i7kVar2.j && cmwVar.i.j) {
                                    if (z) {
                                        p900Var2.d(ukk0VarK, i7kVar2.g);
                                        p900Var2.d(ukk0VarK2, this.d.i.g);
                                        if (this.V != null && i6 != 0 && zArr2[0] && !z()) {
                                            p900Var2.f(p900Var2.k(this.V.L), ukk0VarK2, 0, 8);
                                        }
                                    }
                                    ukk0Var3 = ukk0VarK;
                                    ukk0Var4 = ukk0VarK2;
                                    i16 = i14;
                                    r20 = r12;
                                    j4eVar4 = j4eVar5;
                                    z12 = z4;
                                    r3 = i6;
                                    z13 = z11;
                                    r110 = r19;
                                }
                            }
                            k4e k4eVar4 = this.V;
                            ukk0 ukk0VarK6 = k4eVar4 != null ? p900Var2.k(k4eVar4.L) : null;
                            k4e k4eVar5 = this.V;
                            ukk0 ukk0VarK7 = k4eVar5 != null ? p900Var2.k(k4eVar5.J) : null;
                            boolean z17 = zArr2[0];
                            j4e[] j4eVarArr3 = this.U;
                            i16 = i14;
                            ?? r111 = r12;
                            ?? r4 = i6;
                            boolean z18 = z11;
                            ukk0Var4 = ukk0VarK2;
                            j4eVar4 = j4eVar5;
                            ukk0Var3 = ukk0VarK;
                            p900Var2 = p900Var;
                            e(p900Var2, true, r4, r19, z17, ukk0VarK7, ukk0VarK6, j4eVarArr3[0], z10, this.J, this.L, this.a0, i8, this.d0, this.D[0], this.f0, z8, j4eVarArr3[1] == j4eVar2, r111, z4, z15, i16, i15, this.v, this.w, this.x, z18);
                            z12 = z4;
                            r20 = r111 == true ? 1 : 0;
                            r110 = r19 == true ? 1 : 0;
                            r3 = r4;
                            z13 = z18;
                        }
                        if (z || (ocu0Var = this.e) == null) {
                            ukk0Var5 = r33;
                            ukk0Var6 = ukk0Var;
                            ukk0Var7 = ukk0Var2;
                            i17 = 0;
                            i18 = 8;
                            i19 = 1;
                            i20 = 1;
                        } else {
                            i7k i7kVar3 = ocu0Var.h;
                            if (i7kVar3.j && ocu0Var.i.j) {
                                int i33 = i7kVar3.g;
                                ukk0Var5 = ukk0VarK3;
                                p900Var2.d(ukk0Var5, i33);
                                ukk0Var6 = ukk0Var;
                                p900Var2.d(ukk0Var6, this.e.i.g);
                                ukk0Var7 = ukk0Var2;
                                p900Var2.d(ukk0Var7, this.e.k.g);
                                k4e k4eVar6 = this.V;
                                if (k4eVar6 == null || z12 || r110 == 0) {
                                    i17 = 0;
                                    i18 = 8;
                                    i19 = 1;
                                } else {
                                    i19 = 1;
                                    if (zArr2[1]) {
                                        i17 = 0;
                                        i18 = 8;
                                        p900Var2.f(p900Var2.k(k4eVar6.M), ukk0Var6, 0, 8);
                                    } else {
                                        i17 = 0;
                                        i18 = 8;
                                    }
                                }
                                i20 = i17;
                            } else {
                                ukk0Var5 = r33;
                                ukk0Var6 = ukk0Var;
                                ukk0Var7 = ukk0Var2;
                                i17 = 0;
                                i18 = 8;
                                i19 = 1;
                                i20 = 1;
                            }
                        }
                        if (this.q == 2) {
                            i21 = i17;
                        } else {
                            i21 = i20;
                        }
                        if (i21 == 0 && !this.m) {
                            int i34 = (this.U[i19] == j4eVar4 && (this instanceof l4e)) ? i19 : i17;
                            int i35 = i34 != 0 ? i17 : i11;
                            k4e k4eVar7 = this.V;
                            ukk0 ukk0VarK8 = k4eVar7 != null ? p900Var2.k(k4eVar7.M) : null;
                            k4e k4eVar8 = this.V;
                            ukk0 ukk0VarK9 = k4eVar8 != null ? p900Var2.k(k4eVar8.K) : null;
                            int i36 = this.c0;
                            if (i36 <= 0) {
                                r27 = z13;
                                if (this.i0 == i18) {
                                    w2eVar3 = w2eVar;
                                    if (w2eVar3.f != null) {
                                        p900Var2.e(ukk0Var7, ukk0Var5, i36, i18);
                                        p900Var2.e(ukk0Var7, p900Var2.k(w2eVar3.f), w2eVar3.e(), i18);
                                        if (r110 != 0) {
                                            p900Var2.f(ukk0VarK8, p900Var2.k(w2eVar7), i17, 5);
                                        }
                                        r27 = i17;
                                    } else if (this.i0 == i18) {
                                        p900Var2.e(ukk0Var7, ukk0Var5, w2eVar3.e(), i18);
                                        r27 = z13;
                                    } else {
                                        p900Var2.e(ukk0Var7, ukk0Var5, i36, i18);
                                        r27 = z13;
                                    }
                                }
                            } else {
                                w2eVar3 = w2eVar;
                                if (w2eVar3.f != null) {
                                    p900Var2.e(ukk0Var7, ukk0Var5, i36, i18);
                                    p900Var2.e(ukk0Var7, p900Var2.k(w2eVar3.f), w2eVar3.e(), i18);
                                    if (r110 != 0) {
                                        p900Var2.f(ukk0VarK8, p900Var2.k(w2eVar7), i17, 5);
                                    }
                                    r27 = i17;
                                } else if (this.i0 == i18) {
                                    p900Var2.e(ukk0Var7, ukk0Var5, w2eVar3.e(), i18);
                                    r27 = z13;
                                } else {
                                    p900Var2.e(ukk0Var7, ukk0Var5, i36, i18);
                                    r27 = z13;
                                }
                            }
                            boolean z19 = zArr2[i19];
                            j4e[] j4eVarArr4 = this.U;
                            ?? r9 = i34;
                            j4e j4eVar6 = j4eVarArr4[i19];
                            int i37 = this.b0;
                            int i38 = this.e0;
                            int i39 = this.D[i19];
                            int i40 = i17;
                            float f4 = this.g0;
                            int i41 = j4eVarArr4[i40] == j4eVar2 ? 1 : i40;
                            p900Var2 = p900Var;
                            e(p900Var2, false, r110, r3, z19, ukk0VarK9, ukk0VarK8, j4eVar6, r9, this.K, this.M, i37, i35, i38, i39, f4, z9, i41, z12, r20, z16, i15, i16, this.y, this.z, this.A, r27);
                        }
                        if (z7) {
                            i22 = this.B;
                            f2 = this.C;
                            if (i22 == 1) {
                                kx3 kx3VarL = p900Var2.l();
                                kx3VarL.d.g(ukk0Var6, -1.0f);
                                kx3VarL.d.g(ukk0Var5, 1.0f);
                                kx3VarL.d.g(ukk0Var4, f2);
                                kx3VarL.d.g(ukk0Var3, -f2);
                                p900Var2.c(kx3VarL);
                            } else {
                                kx3 kx3VarL2 = p900Var2.l();
                                kx3VarL2.d.g(ukk0Var4, -1.0f);
                                kx3VarL2.d.g(ukk0Var3, 1.0f);
                                kx3VarL2.d.g(ukk0Var6, f2);
                                kx3VarL2.d.g(ukk0Var5, -f2);
                                p900Var2.c(kx3VarL2);
                            }
                        }
                        if (w2eVar2.h()) {
                            k4e k4eVar9 = w2eVar2.f.d;
                            float radians = (float) Math.toRadians(this.E + 90.0f);
                            int iE = w2eVar2.e();
                            ukk0 ukk0VarK10 = p900Var2.k(k(2));
                            ukk0 ukk0VarK11 = p900Var2.k(k(3));
                            ukk0 ukk0VarK12 = p900Var2.k(k(4));
                            ukk0 ukk0VarK13 = p900Var2.k(k(5));
                            ukk0 ukk0VarK14 = p900Var2.k(k4eVar9.k(2));
                            ukk0 ukk0VarK15 = p900Var2.k(k4eVar9.k(3));
                            ukk0 ukk0VarK16 = p900Var2.k(k4eVar9.k(4));
                            ukk0 ukk0VarK17 = p900Var2.k(k4eVar9.k(5));
                            kx3 kx3VarL3 = p900Var2.l();
                            double d = radians;
                            double dSin = Math.sin(d);
                            double d2 = iE;
                            kx3VarL3.d.g(ukk0VarK15, 0.5f);
                            kx3VarL3.d.g(ukk0VarK17, 0.5f);
                            kx3VarL3.d.g(ukk0VarK11, -0.5f);
                            kx3VarL3.d.g(ukk0VarK13, -0.5f);
                            kx3VarL3.b = -((float) (dSin * d2));
                            p900Var2.c(kx3VarL3);
                            kx3 kx3VarL4 = p900Var2.l();
                            float fCos = (float) (Math.cos(d) * d2);
                            kx3VarL4.d.g(ukk0VarK14, 0.5f);
                            kx3VarL4.d.g(ukk0VarK16, 0.5f);
                            kx3VarL4.d.g(ukk0VarK10, -0.5f);
                            kx3VarL4.d.g(ukk0VarK12, -0.5f);
                            kx3VarL4.b = -fCos;
                            p900Var2.c(kx3VarL4);
                        }
                        this.l = false;
                        this.m = false;
                    }
                    ukk0Var2 = ukk0VarK5;
                    if (j4eVar != j4eVar2 && i14 == 3) {
                        this.B = 0;
                        i8 = (int) (i9 * f);
                        i6 = i6;
                        i30 = 0;
                        if (j4eVar3 != j4eVar2) {
                            i14 = 4;
                            z7 = false;
                        }
                        i15 = i23;
                        int[] iArr2 = this.u;
                        iArr2[0] = i14;
                        iArr2[1] = i15;
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z7) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (this.U[0] == j4eVar5) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i8 = 0;
                        }
                        w2eVar2 = this.Q;
                        z11 = !w2eVar2.h();
                        boolean z110 = zArr3[0];
                        boolean z111 = zArr3[1];
                        if (this.p != 2) {
                            ukk0Var3 = ukk0VarK;
                            ukk0Var4 = ukk0VarK2;
                            i16 = i14;
                            r20 = r12;
                            j4eVar4 = j4eVar5;
                            z12 = z4;
                            r3 = i6;
                            z13 = z11;
                            r110 = r19;
                        } else {
                            ukk0Var3 = ukk0VarK;
                            ukk0Var4 = ukk0VarK2;
                            i16 = i14;
                            r20 = r12;
                            j4eVar4 = j4eVar5;
                            z12 = z4;
                            r3 = i6;
                            z13 = z11;
                            r110 = r19;
                        }
                        if (z) {
                            ukk0Var5 = r33;
                            ukk0Var6 = ukk0Var;
                            ukk0Var7 = ukk0Var2;
                            i17 = 0;
                            i18 = 8;
                            i19 = 1;
                            i20 = 1;
                        } else {
                            ukk0Var5 = r33;
                            ukk0Var6 = ukk0Var;
                            ukk0Var7 = ukk0Var2;
                            i17 = 0;
                            i18 = 8;
                            i19 = 1;
                            i20 = 1;
                        }
                        if (this.q == 2) {
                            i21 = i17;
                        } else {
                            i21 = i20;
                        }
                        if (i21 == 0) {
                        }
                        if (z7) {
                            i22 = this.B;
                            f2 = this.C;
                            if (i22 == 1) {
                                kx3 kx3VarL5 = p900Var2.l();
                                kx3VarL5.d.g(ukk0Var6, -1.0f);
                                kx3VarL5.d.g(ukk0Var5, 1.0f);
                                kx3VarL5.d.g(ukk0Var4, f2);
                                kx3VarL5.d.g(ukk0Var3, -f2);
                                p900Var2.c(kx3VarL5);
                            } else {
                                kx3 kx3VarL6 = p900Var2.l();
                                kx3VarL6.d.g(ukk0Var4, -1.0f);
                                kx3VarL6.d.g(ukk0Var3, 1.0f);
                                kx3VarL6.d.g(ukk0Var6, f2);
                                kx3VarL6.d.g(ukk0Var5, -f2);
                                p900Var2.c(kx3VarL6);
                            }
                        }
                        if (w2eVar2.h()) {
                            k4e k4eVar10 = w2eVar2.f.d;
                            float radians2 = (float) Math.toRadians(this.E + 90.0f);
                            int iE2 = w2eVar2.e();
                            ukk0 ukk0VarK18 = p900Var2.k(k(2));
                            ukk0 ukk0VarK19 = p900Var2.k(k(3));
                            ukk0 ukk0VarK110 = p900Var2.k(k(4));
                            ukk0 ukk0VarK111 = p900Var2.k(k(5));
                            ukk0 ukk0VarK112 = p900Var2.k(k4eVar10.k(2));
                            ukk0 ukk0VarK113 = p900Var2.k(k4eVar10.k(3));
                            ukk0 ukk0VarK114 = p900Var2.k(k4eVar10.k(4));
                            ukk0 ukk0VarK115 = p900Var2.k(k4eVar10.k(5));
                            kx3 kx3VarL7 = p900Var2.l();
                            double d3 = radians2;
                            double dSin2 = Math.sin(d3);
                            double d4 = iE2;
                            kx3VarL7.d.g(ukk0VarK113, 0.5f);
                            kx3VarL7.d.g(ukk0VarK115, 0.5f);
                            kx3VarL7.d.g(ukk0VarK19, -0.5f);
                            kx3VarL7.d.g(ukk0VarK111, -0.5f);
                            kx3VarL7.b = -((float) (dSin2 * d4));
                            p900Var2.c(kx3VarL7);
                            kx3 kx3VarL8 = p900Var2.l();
                            float fCos2 = (float) (Math.cos(d3) * d4);
                            kx3VarL8.d.g(ukk0VarK112, 0.5f);
                            kx3VarL8.d.g(ukk0VarK114, 0.5f);
                            kx3VarL8.d.g(ukk0VarK18, -0.5f);
                            kx3VarL8.d.g(ukk0VarK110, -0.5f);
                            kx3VarL8.b = -fCos2;
                            p900Var2.c(kx3VarL8);
                        }
                        this.l = false;
                        this.m = false;
                    }
                    if (j4eVar3 == j4eVar2 || i23 != 3) {
                        i6 = i6;
                    } else {
                        this.B = 1;
                        if (i30 == -1) {
                            float f5 = 1.0f / f;
                            this.C = f5;
                            f = f5;
                        }
                        i11 = (int) (i7 * f);
                        if (j4eVar != j4eVar2) {
                            i30 = 1;
                            i15 = 4;
                        } else {
                            i6 = i6;
                            i30 = 1;
                        }
                    }
                    z7 = true;
                    i15 = i23;
                    int[] iArr3 = this.u;
                    iArr3[0] = i14;
                    iArr3[1] = i15;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z7) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (this.U[0] == j4eVar5) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i8 = 0;
                    }
                    w2eVar2 = this.Q;
                    z11 = !w2eVar2.h();
                    boolean z112 = zArr3[0];
                    boolean z113 = zArr3[1];
                    if (this.p != 2) {
                        ukk0Var3 = ukk0VarK;
                        ukk0Var4 = ukk0VarK2;
                        i16 = i14;
                        r20 = r12;
                        j4eVar4 = j4eVar5;
                        z12 = z4;
                        r3 = i6;
                        z13 = z11;
                        r110 = r19;
                    } else {
                        ukk0Var3 = ukk0VarK;
                        ukk0Var4 = ukk0VarK2;
                        i16 = i14;
                        r20 = r12;
                        j4eVar4 = j4eVar5;
                        z12 = z4;
                        r3 = i6;
                        z13 = z11;
                        r110 = r19;
                    }
                    if (z) {
                        ukk0Var5 = r33;
                        ukk0Var6 = ukk0Var;
                        ukk0Var7 = ukk0Var2;
                        i17 = 0;
                        i18 = 8;
                        i19 = 1;
                        i20 = 1;
                    } else {
                        ukk0Var5 = r33;
                        ukk0Var6 = ukk0Var;
                        ukk0Var7 = ukk0Var2;
                        i17 = 0;
                        i18 = 8;
                        i19 = 1;
                        i20 = 1;
                    }
                    if (this.q == 2) {
                        i21 = i17;
                    } else {
                        i21 = i20;
                    }
                    if (i21 == 0) {
                    }
                    if (z7) {
                        i22 = this.B;
                        f2 = this.C;
                        if (i22 == 1) {
                            kx3 kx3VarL9 = p900Var2.l();
                            kx3VarL9.d.g(ukk0Var6, -1.0f);
                            kx3VarL9.d.g(ukk0Var5, 1.0f);
                            kx3VarL9.d.g(ukk0Var4, f2);
                            kx3VarL9.d.g(ukk0Var3, -f2);
                            p900Var2.c(kx3VarL9);
                        } else {
                            kx3 kx3VarL10 = p900Var2.l();
                            kx3VarL10.d.g(ukk0Var4, -1.0f);
                            kx3VarL10.d.g(ukk0Var3, 1.0f);
                            kx3VarL10.d.g(ukk0Var6, f2);
                            kx3VarL10.d.g(ukk0Var5, -f2);
                            p900Var2.c(kx3VarL10);
                        }
                    }
                    if (w2eVar2.h()) {
                        k4e k4eVar11 = w2eVar2.f.d;
                        float radians3 = (float) Math.toRadians(this.E + 90.0f);
                        int iE3 = w2eVar2.e();
                        ukk0 ukk0VarK116 = p900Var2.k(k(2));
                        ukk0 ukk0VarK117 = p900Var2.k(k(3));
                        ukk0 ukk0VarK118 = p900Var2.k(k(4));
                        ukk0 ukk0VarK119 = p900Var2.k(k(5));
                        ukk0 ukk0VarK1110 = p900Var2.k(k4eVar11.k(2));
                        ukk0 ukk0VarK1111 = p900Var2.k(k4eVar11.k(3));
                        ukk0 ukk0VarK1112 = p900Var2.k(k4eVar11.k(4));
                        ukk0 ukk0VarK1113 = p900Var2.k(k4eVar11.k(5));
                        kx3 kx3VarL11 = p900Var2.l();
                        double d5 = radians3;
                        double dSin3 = Math.sin(d5);
                        double d6 = iE3;
                        kx3VarL11.d.g(ukk0VarK1111, 0.5f);
                        kx3VarL11.d.g(ukk0VarK1113, 0.5f);
                        kx3VarL11.d.g(ukk0VarK117, -0.5f);
                        kx3VarL11.d.g(ukk0VarK119, -0.5f);
                        kx3VarL11.b = -((float) (dSin3 * d6));
                        p900Var2.c(kx3VarL11);
                        kx3 kx3VarL12 = p900Var2.l();
                        float fCos3 = (float) (Math.cos(d5) * d6);
                        kx3VarL12.d.g(ukk0VarK1110, 0.5f);
                        kx3VarL12.d.g(ukk0VarK1112, 0.5f);
                        kx3VarL12.d.g(ukk0VarK116, -0.5f);
                        kx3VarL12.d.g(ukk0VarK118, -0.5f);
                        kx3VarL12.b = -fCos3;
                        p900Var2.c(kx3VarL12);
                    }
                    this.l = false;
                    this.m = false;
                }
                z7 = false;
                int[] iArr4 = this.u;
                iArr4[0] = i14;
                iArr4[1] = i15;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (this.U[0] == j4eVar5) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                w2eVar2 = this.Q;
                z11 = !w2eVar2.h();
                boolean z114 = zArr3[0];
                boolean z115 = zArr3[1];
                if (this.p != 2) {
                    ukk0Var3 = ukk0VarK;
                    ukk0Var4 = ukk0VarK2;
                    i16 = i14;
                    r20 = r12;
                    j4eVar4 = j4eVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                } else {
                    ukk0Var3 = ukk0VarK;
                    ukk0Var4 = ukk0VarK2;
                    i16 = i14;
                    r20 = r12;
                    j4eVar4 = j4eVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                }
                if (z) {
                    ukk0Var5 = r33;
                    ukk0Var6 = ukk0Var;
                    ukk0Var7 = ukk0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                } else {
                    ukk0Var5 = r33;
                    ukk0Var6 = ukk0Var;
                    ukk0Var7 = ukk0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                }
                if (this.q == 2) {
                    i21 = i17;
                } else {
                    i21 = i20;
                }
                if (i21 == 0) {
                }
                if (z7) {
                    i22 = this.B;
                    f2 = this.C;
                    if (i22 == 1) {
                        kx3 kx3VarL13 = p900Var2.l();
                        kx3VarL13.d.g(ukk0Var6, -1.0f);
                        kx3VarL13.d.g(ukk0Var5, 1.0f);
                        kx3VarL13.d.g(ukk0Var4, f2);
                        kx3VarL13.d.g(ukk0Var3, -f2);
                        p900Var2.c(kx3VarL13);
                    } else {
                        kx3 kx3VarL14 = p900Var2.l();
                        kx3VarL14.d.g(ukk0Var4, -1.0f);
                        kx3VarL14.d.g(ukk0Var3, 1.0f);
                        kx3VarL14.d.g(ukk0Var6, f2);
                        kx3VarL14.d.g(ukk0Var5, -f2);
                        p900Var2.c(kx3VarL14);
                    }
                }
                if (w2eVar2.h()) {
                    k4e k4eVar12 = w2eVar2.f.d;
                    float radians4 = (float) Math.toRadians(this.E + 90.0f);
                    int iE4 = w2eVar2.e();
                    ukk0 ukk0VarK1114 = p900Var2.k(k(2));
                    ukk0 ukk0VarK1115 = p900Var2.k(k(3));
                    ukk0 ukk0VarK1116 = p900Var2.k(k(4));
                    ukk0 ukk0VarK1117 = p900Var2.k(k(5));
                    ukk0 ukk0VarK1118 = p900Var2.k(k4eVar12.k(2));
                    ukk0 ukk0VarK1119 = p900Var2.k(k4eVar12.k(3));
                    ukk0 ukk0VarK11110 = p900Var2.k(k4eVar12.k(4));
                    ukk0 ukk0VarK11111 = p900Var2.k(k4eVar12.k(5));
                    kx3 kx3VarL15 = p900Var2.l();
                    double d7 = radians4;
                    double dSin4 = Math.sin(d7);
                    double d8 = iE4;
                    kx3VarL15.d.g(ukk0VarK1119, 0.5f);
                    kx3VarL15.d.g(ukk0VarK11111, 0.5f);
                    kx3VarL15.d.g(ukk0VarK1115, -0.5f);
                    kx3VarL15.d.g(ukk0VarK1117, -0.5f);
                    kx3VarL15.b = -((float) (dSin4 * d8));
                    p900Var2.c(kx3VarL15);
                    kx3 kx3VarL16 = p900Var2.l();
                    float fCos4 = (float) (Math.cos(d7) * d8);
                    kx3VarL16.d.g(ukk0VarK1118, 0.5f);
                    kx3VarL16.d.g(ukk0VarK11110, 0.5f);
                    kx3VarL16.d.g(ukk0VarK1114, -0.5f);
                    kx3VarL16.d.g(ukk0VarK1116, -0.5f);
                    kx3VarL16.b = -fCos4;
                    p900Var2.c(kx3VarL16);
                }
                this.l = false;
                this.m = false;
            }
            ukk0Var = ukk0VarK4;
            ukk0Var2 = ukk0VarK5;
            i14 = i12;
            i15 = i13;
            z7 = false;
            int[] iArr5 = this.u;
            iArr5[0] = i14;
            iArr5[1] = i15;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (this.U[0] == j4eVar5) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i8 = 0;
            }
            w2eVar2 = this.Q;
            z11 = !w2eVar2.h();
            boolean z116 = zArr3[0];
            boolean z117 = zArr3[1];
            if (this.p != 2) {
                ukk0Var3 = ukk0VarK;
                ukk0Var4 = ukk0VarK2;
                i16 = i14;
                r20 = r12;
                j4eVar4 = j4eVar5;
                z12 = z4;
                r3 = i6;
                z13 = z11;
                r110 = r19;
            } else {
                ukk0Var3 = ukk0VarK;
                ukk0Var4 = ukk0VarK2;
                i16 = i14;
                r20 = r12;
                j4eVar4 = j4eVar5;
                z12 = z4;
                r3 = i6;
                z13 = z11;
                r110 = r19;
            }
            if (z) {
                ukk0Var5 = r33;
                ukk0Var6 = ukk0Var;
                ukk0Var7 = ukk0Var2;
                i17 = 0;
                i18 = 8;
                i19 = 1;
                i20 = 1;
            } else {
                ukk0Var5 = r33;
                ukk0Var6 = ukk0Var;
                ukk0Var7 = ukk0Var2;
                i17 = 0;
                i18 = 8;
                i19 = 1;
                i20 = 1;
            }
            if (this.q == 2) {
                i21 = i17;
            } else {
                i21 = i20;
            }
            if (i21 == 0) {
            }
            if (z7) {
                i22 = this.B;
                f2 = this.C;
                if (i22 == 1) {
                    kx3 kx3VarL17 = p900Var2.l();
                    kx3VarL17.d.g(ukk0Var6, -1.0f);
                    kx3VarL17.d.g(ukk0Var5, 1.0f);
                    kx3VarL17.d.g(ukk0Var4, f2);
                    kx3VarL17.d.g(ukk0Var3, -f2);
                    p900Var2.c(kx3VarL17);
                } else {
                    kx3 kx3VarL18 = p900Var2.l();
                    kx3VarL18.d.g(ukk0Var4, -1.0f);
                    kx3VarL18.d.g(ukk0Var3, 1.0f);
                    kx3VarL18.d.g(ukk0Var6, f2);
                    kx3VarL18.d.g(ukk0Var5, -f2);
                    p900Var2.c(kx3VarL18);
                }
            }
            if (w2eVar2.h()) {
                k4e k4eVar13 = w2eVar2.f.d;
                float radians5 = (float) Math.toRadians(this.E + 90.0f);
                int iE5 = w2eVar2.e();
                ukk0 ukk0VarK11112 = p900Var2.k(k(2));
                ukk0 ukk0VarK11113 = p900Var2.k(k(3));
                ukk0 ukk0VarK11114 = p900Var2.k(k(4));
                ukk0 ukk0VarK11115 = p900Var2.k(k(5));
                ukk0 ukk0VarK11116 = p900Var2.k(k4eVar13.k(2));
                ukk0 ukk0VarK11117 = p900Var2.k(k4eVar13.k(3));
                ukk0 ukk0VarK11118 = p900Var2.k(k4eVar13.k(4));
                ukk0 ukk0VarK11119 = p900Var2.k(k4eVar13.k(5));
                kx3 kx3VarL19 = p900Var2.l();
                double d9 = radians5;
                double dSin5 = Math.sin(d9);
                double d10 = iE5;
                kx3VarL19.d.g(ukk0VarK11117, 0.5f);
                kx3VarL19.d.g(ukk0VarK11119, 0.5f);
                kx3VarL19.d.g(ukk0VarK11113, -0.5f);
                kx3VarL19.d.g(ukk0VarK11115, -0.5f);
                kx3VarL19.b = -((float) (dSin5 * d10));
                p900Var2.c(kx3VarL19);
                kx3 kx3VarL110 = p900Var2.l();
                float fCos5 = (float) (Math.cos(d9) * d10);
                kx3VarL110.d.g(ukk0VarK11116, 0.5f);
                kx3VarL110.d.g(ukk0VarK11118, 0.5f);
                kx3VarL110.d.g(ukk0VarK11112, -0.5f);
                kx3VarL110.d.g(ukk0VarK11114, -0.5f);
                kx3VarL110.b = -fCos5;
                p900Var2.c(kx3VarL110);
            }
            this.l = false;
            this.m = false;
        }
        i = 1;
        i2 = 0;
        i3 = i2;
        i4 = i3;
        i5 = this.i0;
        r19 = i3;
        boolean[] zArr4 = this.T;
        if (i5 != 8) {
            i6 = i4;
        } else {
            i6 = i4;
        }
        z2 = this.l;
        if (z2) {
            if (z2) {
                p900Var2.d(ukk0VarK, this.a0);
                p900Var2.d(ukk0VarK2, this.a0 + this.W);
                if (i6 != 0) {
                    l4eVar2 = (l4e) k4eVar2;
                    weakReference3 = l4eVar2.L0;
                    if (weakReference3 != null) {
                        l4eVar2.L0 = new WeakReference(w2eVar4);
                    } else {
                        l4eVar2.L0 = new WeakReference(w2eVar4);
                    }
                    weakReference4 = l4eVar2.N0;
                    if (weakReference4 != null) {
                        l4eVar2.N0 = new WeakReference(w2eVar5);
                    } else {
                        l4eVar2.N0 = new WeakReference(w2eVar5);
                    }
                }
            }
            if (this.m) {
                p900Var2.d(ukk0VarK3, this.b0);
                p900Var2.d(ukk0VarK4, this.b0 + this.X);
                hashSet = w2eVar8.f38443a;
                if (hashSet != null) {
                    p900Var2.d(ukk0VarK5, this.b0 + this.c0);
                }
                if (r19 != 0) {
                    l4eVar = (l4e) k4eVar;
                    weakReference = l4eVar.K0;
                    if (weakReference != null) {
                        l4eVar.K0 = new WeakReference(w2eVar6);
                    } else {
                        l4eVar.K0 = new WeakReference(w2eVar6);
                    }
                    weakReference2 = l4eVar.M0;
                    if (weakReference2 != null) {
                        l4eVar.M0 = new WeakReference(w2eVar7);
                    } else {
                        l4eVar.M0 = new WeakReference(w2eVar7);
                    }
                }
            }
            if (this.l) {
                ?? r14 = i2;
                this.l = r14;
                this.m = r14;
                return;
            }
        } else {
            if (z2) {
                p900Var2.d(ukk0VarK, this.a0);
                p900Var2.d(ukk0VarK2, this.a0 + this.W);
                if (i6 != 0) {
                    l4eVar2 = (l4e) k4eVar2;
                    weakReference3 = l4eVar2.L0;
                    if (weakReference3 != null) {
                        l4eVar2.L0 = new WeakReference(w2eVar4);
                    } else {
                        l4eVar2.L0 = new WeakReference(w2eVar4);
                    }
                    weakReference4 = l4eVar2.N0;
                    if (weakReference4 != null) {
                        l4eVar2.N0 = new WeakReference(w2eVar5);
                    } else {
                        l4eVar2.N0 = new WeakReference(w2eVar5);
                    }
                }
            }
            if (this.m) {
                p900Var2.d(ukk0VarK3, this.b0);
                p900Var2.d(ukk0VarK4, this.b0 + this.X);
                hashSet = w2eVar8.f38443a;
                if (hashSet != null) {
                    p900Var2.d(ukk0VarK5, this.b0 + this.c0);
                }
                if (r19 != 0) {
                    l4eVar = (l4e) k4eVar;
                    weakReference = l4eVar.K0;
                    if (weakReference != null) {
                        l4eVar.K0 = new WeakReference(w2eVar6);
                    } else {
                        l4eVar.K0 = new WeakReference(w2eVar6);
                    }
                    weakReference2 = l4eVar.M0;
                    if (weakReference2 != null) {
                        l4eVar.M0 = new WeakReference(w2eVar7);
                    } else {
                        l4eVar.M0 = new WeakReference(w2eVar7);
                    }
                }
            }
            if (this.l) {
                ?? r15 = i2;
                this.l = r15;
                this.m = r15;
                return;
            }
        }
        zArr = this.f;
        if (z) {
            w2eVar = w2eVar8;
            zArr2 = zArr;
        } else {
            w2eVar = w2eVar8;
            zArr2 = zArr;
        }
        if (this.V != null) {
            if (y(0)) {
                ((l4e) this.V).X(this, 0);
                int i210 = i;
                i24 = i210 == true ? 1 : 0;
                Z = i210;
            } else {
                i24 = i;
                Z = z();
            }
            if (y(i24)) {
                ((l4e) this.V).X(this, i24);
                zA = true;
            } else {
                zA = A();
            }
            if (Z != 0) {
            }
            if (!zA) {
                p900Var2.f(p900Var2.k(this.V.M), ukk0VarK4, 0, 1);
            }
            z3 = zA;
            r12 = Z;
        } else {
            w2eVar4 = w2eVar4;
            z3 = false;
            r12 = 0;
        }
        i7 = this.W;
        i8 = this.d0;
        if (i7 >= i8) {
            i8 = i7;
        }
        i9 = this.X;
        z4 = z3;
        i10 = this.e0;
        if (i9 < i10) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        j4e[] j4eVarArr5 = this.U;
        j4eVar = j4eVarArr5[0];
        j4eVar2 = j4e.c;
        if (j4eVar != j4eVar2) {
            z5 = true;
        } else {
            z5 = false;
        }
        j4eVar3 = j4eVarArr5[1];
        if (j4eVar3 != j4eVar2) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i310 = this.Z;
        this.B = i310;
        float f6 = this.Y;
        this.C = f6;
        f = f6;
        i12 = this.s;
        i13 = this.t;
        if (f > 0.0f) {
            ukk0Var = ukk0VarK4;
            if (this.i0 != 8) {
                if (j4eVar == j4eVar2) {
                    i14 = i12;
                } else {
                    i14 = i12;
                }
                if (j4eVar3 == j4eVar2) {
                    i23 = i13;
                } else {
                    i23 = i13;
                }
                if (j4eVar != j4eVar2) {
                    ukk0Var2 = ukk0VarK5;
                    if (j4eVar != j4eVar2) {
                        if (j4eVar3 == j4eVar2) {
                        }
                        z7 = true;
                    } else {
                        if (j4eVar3 == j4eVar2) {
                        }
                        z7 = true;
                    }
                    i15 = i23;
                    int[] iArr6 = this.u;
                    iArr6[0] = i14;
                    iArr6[1] = i15;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z7) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (this.U[0] == j4eVar5) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i8 = 0;
                    }
                    w2eVar2 = this.Q;
                    z11 = !w2eVar2.h();
                    boolean z118 = zArr4[0];
                    boolean z119 = zArr4[1];
                    if (this.p != 2) {
                        ukk0Var3 = ukk0VarK;
                        ukk0Var4 = ukk0VarK2;
                        i16 = i14;
                        r20 = r12;
                        j4eVar4 = j4eVar5;
                        z12 = z4;
                        r3 = i6;
                        z13 = z11;
                        r110 = r19;
                    } else {
                        ukk0Var3 = ukk0VarK;
                        ukk0Var4 = ukk0VarK2;
                        i16 = i14;
                        r20 = r12;
                        j4eVar4 = j4eVar5;
                        z12 = z4;
                        r3 = i6;
                        z13 = z11;
                        r110 = r19;
                    }
                    if (z) {
                        ukk0Var5 = r33;
                        ukk0Var6 = ukk0Var;
                        ukk0Var7 = ukk0Var2;
                        i17 = 0;
                        i18 = 8;
                        i19 = 1;
                        i20 = 1;
                    } else {
                        ukk0Var5 = r33;
                        ukk0Var6 = ukk0Var;
                        ukk0Var7 = ukk0Var2;
                        i17 = 0;
                        i18 = 8;
                        i19 = 1;
                        i20 = 1;
                    }
                    if (this.q == 2) {
                        i21 = i17;
                    } else {
                        i21 = i20;
                    }
                    if (i21 == 0) {
                    }
                    if (z7) {
                        i22 = this.B;
                        f2 = this.C;
                        if (i22 == 1) {
                            kx3 kx3VarL111 = p900Var2.l();
                            kx3VarL111.d.g(ukk0Var6, -1.0f);
                            kx3VarL111.d.g(ukk0Var5, 1.0f);
                            kx3VarL111.d.g(ukk0Var4, f2);
                            kx3VarL111.d.g(ukk0Var3, -f2);
                            p900Var2.c(kx3VarL111);
                        } else {
                            kx3 kx3VarL112 = p900Var2.l();
                            kx3VarL112.d.g(ukk0Var4, -1.0f);
                            kx3VarL112.d.g(ukk0Var3, 1.0f);
                            kx3VarL112.d.g(ukk0Var6, f2);
                            kx3VarL112.d.g(ukk0Var5, -f2);
                            p900Var2.c(kx3VarL112);
                        }
                    }
                    if (w2eVar2.h()) {
                        k4e k4eVar14 = w2eVar2.f.d;
                        float radians6 = (float) Math.toRadians(this.E + 90.0f);
                        int iE6 = w2eVar2.e();
                        ukk0 ukk0VarK111110 = p900Var2.k(k(2));
                        ukk0 ukk0VarK111111 = p900Var2.k(k(3));
                        ukk0 ukk0VarK111112 = p900Var2.k(k(4));
                        ukk0 ukk0VarK111113 = p900Var2.k(k(5));
                        ukk0 ukk0VarK111114 = p900Var2.k(k4eVar14.k(2));
                        ukk0 ukk0VarK111115 = p900Var2.k(k4eVar14.k(3));
                        ukk0 ukk0VarK111116 = p900Var2.k(k4eVar14.k(4));
                        ukk0 ukk0VarK111117 = p900Var2.k(k4eVar14.k(5));
                        kx3 kx3VarL113 = p900Var2.l();
                        double d11 = radians6;
                        double dSin6 = Math.sin(d11);
                        double d12 = iE6;
                        kx3VarL113.d.g(ukk0VarK111115, 0.5f);
                        kx3VarL113.d.g(ukk0VarK111117, 0.5f);
                        kx3VarL113.d.g(ukk0VarK111111, -0.5f);
                        kx3VarL113.d.g(ukk0VarK111113, -0.5f);
                        kx3VarL113.b = -((float) (dSin6 * d12));
                        p900Var2.c(kx3VarL113);
                        kx3 kx3VarL114 = p900Var2.l();
                        float fCos6 = (float) (Math.cos(d11) * d12);
                        kx3VarL114.d.g(ukk0VarK111114, 0.5f);
                        kx3VarL114.d.g(ukk0VarK111116, 0.5f);
                        kx3VarL114.d.g(ukk0VarK111110, -0.5f);
                        kx3VarL114.d.g(ukk0VarK111112, -0.5f);
                        kx3VarL114.b = -fCos6;
                        p900Var2.c(kx3VarL114);
                    }
                    this.l = false;
                    this.m = false;
                }
                ukk0Var2 = ukk0VarK5;
                if (j4eVar != j4eVar2) {
                    if (j4eVar3 == j4eVar2) {
                    }
                    z7 = true;
                } else {
                    if (j4eVar3 == j4eVar2) {
                    }
                    z7 = true;
                }
                i15 = i23;
                int[] iArr7 = this.u;
                iArr7[0] = i14;
                iArr7[1] = i15;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (this.U[0] == j4eVar5) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                w2eVar2 = this.Q;
                z11 = !w2eVar2.h();
                boolean z1110 = zArr4[0];
                boolean z1111 = zArr4[1];
                if (this.p != 2) {
                    ukk0Var3 = ukk0VarK;
                    ukk0Var4 = ukk0VarK2;
                    i16 = i14;
                    r20 = r12;
                    j4eVar4 = j4eVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                } else {
                    ukk0Var3 = ukk0VarK;
                    ukk0Var4 = ukk0VarK2;
                    i16 = i14;
                    r20 = r12;
                    j4eVar4 = j4eVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                }
                if (z) {
                    ukk0Var5 = r33;
                    ukk0Var6 = ukk0Var;
                    ukk0Var7 = ukk0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                } else {
                    ukk0Var5 = r33;
                    ukk0Var6 = ukk0Var;
                    ukk0Var7 = ukk0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                }
                if (this.q == 2) {
                    i21 = i17;
                } else {
                    i21 = i20;
                }
                if (i21 == 0) {
                }
                if (z7) {
                    i22 = this.B;
                    f2 = this.C;
                    if (i22 == 1) {
                        kx3 kx3VarL115 = p900Var2.l();
                        kx3VarL115.d.g(ukk0Var6, -1.0f);
                        kx3VarL115.d.g(ukk0Var5, 1.0f);
                        kx3VarL115.d.g(ukk0Var4, f2);
                        kx3VarL115.d.g(ukk0Var3, -f2);
                        p900Var2.c(kx3VarL115);
                    } else {
                        kx3 kx3VarL116 = p900Var2.l();
                        kx3VarL116.d.g(ukk0Var4, -1.0f);
                        kx3VarL116.d.g(ukk0Var3, 1.0f);
                        kx3VarL116.d.g(ukk0Var6, f2);
                        kx3VarL116.d.g(ukk0Var5, -f2);
                        p900Var2.c(kx3VarL116);
                    }
                }
                if (w2eVar2.h()) {
                    k4e k4eVar15 = w2eVar2.f.d;
                    float radians7 = (float) Math.toRadians(this.E + 90.0f);
                    int iE7 = w2eVar2.e();
                    ukk0 ukk0VarK111118 = p900Var2.k(k(2));
                    ukk0 ukk0VarK111119 = p900Var2.k(k(3));
                    ukk0 ukk0VarK1111110 = p900Var2.k(k(4));
                    ukk0 ukk0VarK1111111 = p900Var2.k(k(5));
                    ukk0 ukk0VarK1111112 = p900Var2.k(k4eVar15.k(2));
                    ukk0 ukk0VarK1111113 = p900Var2.k(k4eVar15.k(3));
                    ukk0 ukk0VarK1111114 = p900Var2.k(k4eVar15.k(4));
                    ukk0 ukk0VarK1111115 = p900Var2.k(k4eVar15.k(5));
                    kx3 kx3VarL117 = p900Var2.l();
                    double d13 = radians7;
                    double dSin7 = Math.sin(d13);
                    double d14 = iE7;
                    kx3VarL117.d.g(ukk0VarK1111113, 0.5f);
                    kx3VarL117.d.g(ukk0VarK1111115, 0.5f);
                    kx3VarL117.d.g(ukk0VarK111119, -0.5f);
                    kx3VarL117.d.g(ukk0VarK1111111, -0.5f);
                    kx3VarL117.b = -((float) (dSin7 * d14));
                    p900Var2.c(kx3VarL117);
                    kx3 kx3VarL118 = p900Var2.l();
                    float fCos7 = (float) (Math.cos(d13) * d14);
                    kx3VarL118.d.g(ukk0VarK1111112, 0.5f);
                    kx3VarL118.d.g(ukk0VarK1111114, 0.5f);
                    kx3VarL118.d.g(ukk0VarK111118, -0.5f);
                    kx3VarL118.d.g(ukk0VarK1111110, -0.5f);
                    kx3VarL118.b = -fCos7;
                    p900Var2.c(kx3VarL118);
                }
                this.l = false;
                this.m = false;
                i6 = i6;
                z7 = true;
                i15 = i23;
                int[] iArr8 = this.u;
                iArr8[0] = i14;
                iArr8[1] = i15;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (this.U[0] == j4eVar5) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                w2eVar2 = this.Q;
                z11 = !w2eVar2.h();
                boolean z1112 = zArr4[0];
                boolean z1113 = zArr4[1];
                if (this.p != 2) {
                    ukk0Var3 = ukk0VarK;
                    ukk0Var4 = ukk0VarK2;
                    i16 = i14;
                    r20 = r12;
                    j4eVar4 = j4eVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                } else {
                    ukk0Var3 = ukk0VarK;
                    ukk0Var4 = ukk0VarK2;
                    i16 = i14;
                    r20 = r12;
                    j4eVar4 = j4eVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                }
                if (z) {
                    ukk0Var5 = r33;
                    ukk0Var6 = ukk0Var;
                    ukk0Var7 = ukk0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                } else {
                    ukk0Var5 = r33;
                    ukk0Var6 = ukk0Var;
                    ukk0Var7 = ukk0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                }
                if (this.q == 2) {
                    i21 = i17;
                } else {
                    i21 = i20;
                }
                if (i21 == 0) {
                }
                if (z7) {
                    i22 = this.B;
                    f2 = this.C;
                    if (i22 == 1) {
                        kx3 kx3VarL119 = p900Var2.l();
                        kx3VarL119.d.g(ukk0Var6, -1.0f);
                        kx3VarL119.d.g(ukk0Var5, 1.0f);
                        kx3VarL119.d.g(ukk0Var4, f2);
                        kx3VarL119.d.g(ukk0Var3, -f2);
                        p900Var2.c(kx3VarL119);
                    } else {
                        kx3 kx3VarL1110 = p900Var2.l();
                        kx3VarL1110.d.g(ukk0Var4, -1.0f);
                        kx3VarL1110.d.g(ukk0Var3, 1.0f);
                        kx3VarL1110.d.g(ukk0Var6, f2);
                        kx3VarL1110.d.g(ukk0Var5, -f2);
                        p900Var2.c(kx3VarL1110);
                    }
                }
                if (w2eVar2.h()) {
                    k4e k4eVar16 = w2eVar2.f.d;
                    float radians8 = (float) Math.toRadians(this.E + 90.0f);
                    int iE8 = w2eVar2.e();
                    ukk0 ukk0VarK1111116 = p900Var2.k(k(2));
                    ukk0 ukk0VarK1111117 = p900Var2.k(k(3));
                    ukk0 ukk0VarK1111118 = p900Var2.k(k(4));
                    ukk0 ukk0VarK1111119 = p900Var2.k(k(5));
                    ukk0 ukk0VarK11111110 = p900Var2.k(k4eVar16.k(2));
                    ukk0 ukk0VarK11111111 = p900Var2.k(k4eVar16.k(3));
                    ukk0 ukk0VarK11111112 = p900Var2.k(k4eVar16.k(4));
                    ukk0 ukk0VarK11111113 = p900Var2.k(k4eVar16.k(5));
                    kx3 kx3VarL1111 = p900Var2.l();
                    double d15 = radians8;
                    double dSin8 = Math.sin(d15);
                    double d16 = iE8;
                    kx3VarL1111.d.g(ukk0VarK11111111, 0.5f);
                    kx3VarL1111.d.g(ukk0VarK11111113, 0.5f);
                    kx3VarL1111.d.g(ukk0VarK1111117, -0.5f);
                    kx3VarL1111.d.g(ukk0VarK1111119, -0.5f);
                    kx3VarL1111.b = -((float) (dSin8 * d16));
                    p900Var2.c(kx3VarL1111);
                    kx3 kx3VarL1112 = p900Var2.l();
                    float fCos8 = (float) (Math.cos(d15) * d16);
                    kx3VarL1112.d.g(ukk0VarK11111110, 0.5f);
                    kx3VarL1112.d.g(ukk0VarK11111112, 0.5f);
                    kx3VarL1112.d.g(ukk0VarK1111116, -0.5f);
                    kx3VarL1112.d.g(ukk0VarK1111118, -0.5f);
                    kx3VarL1112.b = -fCos8;
                    p900Var2.c(kx3VarL1112);
                }
                this.l = false;
                this.m = false;
            }
            z7 = false;
            int[] iArr9 = this.u;
            iArr9[0] = i14;
            iArr9[1] = i15;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (this.U[0] == j4eVar5) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i8 = 0;
            }
            w2eVar2 = this.Q;
            z11 = !w2eVar2.h();
            boolean z1114 = zArr4[0];
            boolean z1115 = zArr4[1];
            if (this.p != 2) {
                ukk0Var3 = ukk0VarK;
                ukk0Var4 = ukk0VarK2;
                i16 = i14;
                r20 = r12;
                j4eVar4 = j4eVar5;
                z12 = z4;
                r3 = i6;
                z13 = z11;
                r110 = r19;
            } else {
                ukk0Var3 = ukk0VarK;
                ukk0Var4 = ukk0VarK2;
                i16 = i14;
                r20 = r12;
                j4eVar4 = j4eVar5;
                z12 = z4;
                r3 = i6;
                z13 = z11;
                r110 = r19;
            }
            if (z) {
                ukk0Var5 = r33;
                ukk0Var6 = ukk0Var;
                ukk0Var7 = ukk0Var2;
                i17 = 0;
                i18 = 8;
                i19 = 1;
                i20 = 1;
            } else {
                ukk0Var5 = r33;
                ukk0Var6 = ukk0Var;
                ukk0Var7 = ukk0Var2;
                i17 = 0;
                i18 = 8;
                i19 = 1;
                i20 = 1;
            }
            if (this.q == 2) {
                i21 = i17;
            } else {
                i21 = i20;
            }
            if (i21 == 0) {
            }
            if (z7) {
                i22 = this.B;
                f2 = this.C;
                if (i22 == 1) {
                    kx3 kx3VarL1113 = p900Var2.l();
                    kx3VarL1113.d.g(ukk0Var6, -1.0f);
                    kx3VarL1113.d.g(ukk0Var5, 1.0f);
                    kx3VarL1113.d.g(ukk0Var4, f2);
                    kx3VarL1113.d.g(ukk0Var3, -f2);
                    p900Var2.c(kx3VarL1113);
                } else {
                    kx3 kx3VarL1114 = p900Var2.l();
                    kx3VarL1114.d.g(ukk0Var4, -1.0f);
                    kx3VarL1114.d.g(ukk0Var3, 1.0f);
                    kx3VarL1114.d.g(ukk0Var6, f2);
                    kx3VarL1114.d.g(ukk0Var5, -f2);
                    p900Var2.c(kx3VarL1114);
                }
            }
            if (w2eVar2.h()) {
                k4e k4eVar17 = w2eVar2.f.d;
                float radians9 = (float) Math.toRadians(this.E + 90.0f);
                int iE9 = w2eVar2.e();
                ukk0 ukk0VarK11111114 = p900Var2.k(k(2));
                ukk0 ukk0VarK11111115 = p900Var2.k(k(3));
                ukk0 ukk0VarK11111116 = p900Var2.k(k(4));
                ukk0 ukk0VarK11111117 = p900Var2.k(k(5));
                ukk0 ukk0VarK11111118 = p900Var2.k(k4eVar17.k(2));
                ukk0 ukk0VarK11111119 = p900Var2.k(k4eVar17.k(3));
                ukk0 ukk0VarK111111110 = p900Var2.k(k4eVar17.k(4));
                ukk0 ukk0VarK111111111 = p900Var2.k(k4eVar17.k(5));
                kx3 kx3VarL1115 = p900Var2.l();
                double d17 = radians9;
                double dSin9 = Math.sin(d17);
                double d18 = iE9;
                kx3VarL1115.d.g(ukk0VarK11111119, 0.5f);
                kx3VarL1115.d.g(ukk0VarK111111111, 0.5f);
                kx3VarL1115.d.g(ukk0VarK11111115, -0.5f);
                kx3VarL1115.d.g(ukk0VarK11111117, -0.5f);
                kx3VarL1115.b = -((float) (dSin9 * d18));
                p900Var2.c(kx3VarL1115);
                kx3 kx3VarL1116 = p900Var2.l();
                float fCos9 = (float) (Math.cos(d17) * d18);
                kx3VarL1116.d.g(ukk0VarK11111118, 0.5f);
                kx3VarL1116.d.g(ukk0VarK111111110, 0.5f);
                kx3VarL1116.d.g(ukk0VarK11111114, -0.5f);
                kx3VarL1116.d.g(ukk0VarK11111116, -0.5f);
                kx3VarL1116.b = -fCos9;
                p900Var2.c(kx3VarL1116);
            }
            this.l = false;
            this.m = false;
        }
        ukk0Var = ukk0VarK4;
        ukk0Var2 = ukk0VarK5;
        i14 = i12;
        i15 = i13;
        z7 = false;
        int[] iArr10 = this.u;
        iArr10[0] = i14;
        iArr10[1] = i15;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (z7) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (this.U[0] == j4eVar5) {
            z10 = false;
        } else {
            z10 = false;
        }
        if (z10) {
            i8 = 0;
        }
        w2eVar2 = this.Q;
        z11 = !w2eVar2.h();
        boolean z1116 = zArr4[0];
        boolean z1117 = zArr4[1];
        if (this.p != 2) {
            ukk0Var3 = ukk0VarK;
            ukk0Var4 = ukk0VarK2;
            i16 = i14;
            r20 = r12;
            j4eVar4 = j4eVar5;
            z12 = z4;
            r3 = i6;
            z13 = z11;
            r110 = r19;
        } else {
            ukk0Var3 = ukk0VarK;
            ukk0Var4 = ukk0VarK2;
            i16 = i14;
            r20 = r12;
            j4eVar4 = j4eVar5;
            z12 = z4;
            r3 = i6;
            z13 = z11;
            r110 = r19;
        }
        if (z) {
            ukk0Var5 = r33;
            ukk0Var6 = ukk0Var;
            ukk0Var7 = ukk0Var2;
            i17 = 0;
            i18 = 8;
            i19 = 1;
            i20 = 1;
        } else {
            ukk0Var5 = r33;
            ukk0Var6 = ukk0Var;
            ukk0Var7 = ukk0Var2;
            i17 = 0;
            i18 = 8;
            i19 = 1;
            i20 = 1;
        }
        if (this.q == 2) {
            i21 = i17;
        } else {
            i21 = i20;
        }
        if (i21 == 0) {
        }
        if (z7) {
            i22 = this.B;
            f2 = this.C;
            if (i22 == 1) {
                kx3 kx3VarL1117 = p900Var2.l();
                kx3VarL1117.d.g(ukk0Var6, -1.0f);
                kx3VarL1117.d.g(ukk0Var5, 1.0f);
                kx3VarL1117.d.g(ukk0Var4, f2);
                kx3VarL1117.d.g(ukk0Var3, -f2);
                p900Var2.c(kx3VarL1117);
            } else {
                kx3 kx3VarL1118 = p900Var2.l();
                kx3VarL1118.d.g(ukk0Var4, -1.0f);
                kx3VarL1118.d.g(ukk0Var3, 1.0f);
                kx3VarL1118.d.g(ukk0Var6, f2);
                kx3VarL1118.d.g(ukk0Var5, -f2);
                p900Var2.c(kx3VarL1118);
            }
        }
        if (w2eVar2.h()) {
            k4e k4eVar18 = w2eVar2.f.d;
            float radians10 = (float) Math.toRadians(this.E + 90.0f);
            int iE10 = w2eVar2.e();
            ukk0 ukk0VarK111111112 = p900Var2.k(k(2));
            ukk0 ukk0VarK111111113 = p900Var2.k(k(3));
            ukk0 ukk0VarK111111114 = p900Var2.k(k(4));
            ukk0 ukk0VarK111111115 = p900Var2.k(k(5));
            ukk0 ukk0VarK111111116 = p900Var2.k(k4eVar18.k(2));
            ukk0 ukk0VarK111111117 = p900Var2.k(k4eVar18.k(3));
            ukk0 ukk0VarK111111118 = p900Var2.k(k4eVar18.k(4));
            ukk0 ukk0VarK111111119 = p900Var2.k(k4eVar18.k(5));
            kx3 kx3VarL1119 = p900Var2.l();
            double d19 = radians10;
            double dSin10 = Math.sin(d19);
            double d110 = iE10;
            kx3VarL1119.d.g(ukk0VarK111111117, 0.5f);
            kx3VarL1119.d.g(ukk0VarK111111119, 0.5f);
            kx3VarL1119.d.g(ukk0VarK111111113, -0.5f);
            kx3VarL1119.d.g(ukk0VarK111111115, -0.5f);
            kx3VarL1119.b = -((float) (dSin10 * d110));
            p900Var2.c(kx3VarL1119);
            kx3 kx3VarL11110 = p900Var2.l();
            float fCos10 = (float) (Math.cos(d19) * d110);
            kx3VarL11110.d.g(ukk0VarK111111116, 0.5f);
            kx3VarL11110.d.g(ukk0VarK111111118, 0.5f);
            kx3VarL11110.d.g(ukk0VarK111111112, -0.5f);
            kx3VarL11110.d.g(ukk0VarK111111114, -0.5f);
            kx3VarL11110.b = -fCos10;
            p900Var2.c(kx3VarL11110);
        }
        this.l = false;
        this.m = false;
    }

    public boolean d() {
        return this.i0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:231:0x0401  */
    /* JADX WARN: Code duplicated, block: B:240:0x041e  */
    /* JADX WARN: Code duplicated, block: B:257:0x0451  */
    /* JADX WARN: Code duplicated, block: B:259:0x0457  */
    /* JADX WARN: Code duplicated, block: B:270:0x046c  */
    /* JADX WARN: Code duplicated, block: B:275:0x0476  */
    /* JADX WARN: Code duplicated, block: B:277:0x047a  */
    /* JADX WARN: Code duplicated, block: B:278:0x047c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0484  */
    /* JADX WARN: Code duplicated, block: B:287:0x0492 A[PHI: r0
  0x0492: PHI (r0v15 int) = (r0v14 int), (r0v19 int), (r0v19 int), (r0v19 int) binds: [B:280:0x0482, B:282:0x0488, B:283:0x048a, B:285:0x048e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:294:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:337:0x0522  */
    public final void e(p900 p900Var, boolean z, boolean z2, boolean z3, boolean z4, ukk0 ukk0Var, ukk0 ukk0Var2, j4e j4eVar, boolean z5, w2e w2eVar, w2e w2eVar2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        boolean z14;
        int i9;
        int i10;
        boolean z15;
        ukk0 ukk0VarK;
        ukk0 ukk0VarK2;
        w2e w2eVar3;
        ukk0 ukk0Var3;
        int i11;
        int i12;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        k4e k4eVar;
        boolean z20;
        int iMin2;
        boolean z21;
        int i13;
        int iE;
        int i14;
        int i15;
        HashSet hashSet;
        boolean z22;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z23;
        boolean z24;
        int i21;
        p900Var = p900Var;
        int i22 = i7;
        int i23 = i8;
        ukk0 ukk0VarK3 = p900Var.k(w2eVar);
        ukk0 ukk0VarK4 = p900Var.k(w2eVar2);
        ukk0 ukk0VarK5 = p900Var.k(w2eVar.f);
        ukk0 ukk0VarK6 = p900Var.k(w2eVar2.f);
        boolean zH = w2eVar.h();
        boolean zH2 = w2eVar2.h();
        boolean zH3 = this.Q.h();
        int i24 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i24++;
        }
        int i25 = i24;
        int i26 = z6 ? 3 : i5;
        int iOrdinal = j4eVar.ordinal();
        boolean z25 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i26 == 4) ? false : true;
        int i27 = this.h;
        if (i27 == -1 || !z) {
            i27 = i2;
            z12 = z25;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i28 = this.i;
        if (i28 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i27 = i28;
            z13 = false;
        }
        boolean z26 = z13;
        if (this.i0 == 8) {
            z14 = false;
            iMin = 0;
        } else {
            iMin = i27;
            z14 = z26;
        }
        if (z11) {
            if (!zH && !zH2 && !zH3) {
                p900Var.d(ukk0VarK3, i);
            } else if (zH && !zH2) {
                i9 = 8;
                p900Var.e(ukk0VarK3, ukk0VarK5, w2eVar.e(), 8);
            }
            i9 = 8;
        } else {
            i9 = 8;
        }
        if (z14 != 0) {
            if (i25 == 2 || z6 || !(i26 == 1 || i26 == 0)) {
                if (i22 == -2) {
                    i22 = iMin;
                }
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (iMin > 0 && i26 != 1) {
                    iMin = 0;
                }
                if (i22 > 0) {
                    p900Var.f(ukk0VarK4, ukk0VarK3, i22, 8);
                    iMin = Math.max(iMin, i22);
                }
                if (i23 > 0) {
                    if (!z2 || i26 != 1) {
                        p900Var.g(ukk0VarK4, ukk0VarK3, i23, 8);
                    }
                    iMin = Math.min(iMin, i23);
                }
                if (i26 == 1) {
                    if (z2) {
                        p900Var.e(ukk0VarK4, ukk0VarK3, iMin, 8);
                    } else if (z8) {
                        p900Var.e(ukk0VarK4, ukk0VarK3, iMin, 5);
                        p900Var.g(ukk0VarK4, ukk0VarK3, iMin, 8);
                    } else {
                        p900Var.e(ukk0VarK4, ukk0VarK3, iMin, 5);
                        p900Var.g(ukk0VarK4, ukk0VarK3, iMin, 8);
                    }
                } else if (i26 == 2) {
                    int i29 = w2eVar.e;
                    if (i29 == 3 || i29 == 5) {
                        ukk0VarK = p900Var.k(this.V.k(3));
                        ukk0VarK2 = p900Var.k(this.V.k(5));
                    } else {
                        ukk0VarK = p900Var.k(this.V.k(2));
                        ukk0VarK2 = p900Var.k(this.V.k(4));
                    }
                    kx3 kx3VarL = p900Var.l();
                    int i30 = i22;
                    kx3VarL.d.g(ukk0VarK4, -1.0f);
                    kx3VarL.d.g(ukk0VarK3, 1.0f);
                    kx3VarL.d.g(ukk0VarK2, f2);
                    kx3VarL.d.g(ukk0VarK, -f2);
                    p900Var.c(kx3VarL);
                    if (z2) {
                        z14 = false;
                    }
                    z15 = z4;
                    i10 = i30;
                } else {
                    i10 = i22;
                    z15 = true;
                }
            } else {
                int iMax = Math.max(i22, iMin);
                if (i23 > 0) {
                    iMax = Math.min(i23, iMax);
                }
                p900Var.e(ukk0VarK4, ukk0VarK3, iMax, 8);
                z15 = z4;
                i10 = i22;
                z14 = false;
            }
            if (z11 || z8) {
                boolean z27 = z15;
                if (i25 >= 2 && z2 && z27) {
                    p900Var.f(ukk0VarK3, ukk0Var, 0, 8);
                    w2e w2eVar4 = this.N;
                    boolean z28 = z || w2eVar4.f == null;
                    if (!z && (w2eVar3 = w2eVar4.f) != null) {
                        k4e k4eVar2 = w2eVar3.d;
                        if (k4eVar2.Y != 0.0f) {
                            j4e[] j4eVarArr = k4eVar2.U;
                            j4e j4eVar2 = j4eVarArr[0];
                            j4e j4eVar3 = j4e.c;
                            if (j4eVar2 == j4eVar3 && j4eVarArr[1] == j4eVar3) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                        } else {
                            z28 = false;
                        }
                    }
                    if (z28) {
                        p900Var.f(ukk0Var2, ukk0VarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    w2eVar2 = w2eVar2;
                    ukk0VarK4 = ukk0VarK4;
                    z15 = z15;
                    ukk0Var3 = ukk0VarK6;
                    z20 = z2;
                    i21 = (z2 && (w2eVar.f.d instanceof zu5)) ? 8 : 5;
                } else if (zH || !zH2) {
                    ukk0Var3 = ukk0VarK6;
                    if (zH && zH2) {
                        k4e k4eVar3 = w2eVar.f.d;
                        k4e k4eVar4 = w2eVar2.f.d;
                        z15 = z15;
                        k4e k4eVar5 = this.V;
                        int i31 = 6;
                        if (z14) {
                            if (i26 == 0) {
                                if (i23 != 0 || i10 != 0) {
                                    i19 = 5;
                                    i20 = 5;
                                    z23 = true;
                                    z24 = false;
                                    z17 = true;
                                } else if (ukk0VarK5.f && ukk0Var3.f) {
                                    p900Var.e(ukk0VarK3, ukk0VarK5, w2eVar.e(), 8);
                                    p900Var.e(ukk0VarK4, ukk0Var3, -w2eVar2.e(), 8);
                                    return;
                                } else {
                                    i19 = 8;
                                    i20 = 8;
                                    z23 = false;
                                    z24 = true;
                                    z17 = false;
                                }
                                if ((k4eVar3 instanceof zu5) || (k4eVar4 instanceof zu5)) {
                                    p900Var = p900Var;
                                    i26 = i26;
                                    ukk0VarK3 = ukk0VarK3;
                                    ukk0VarK4 = ukk0VarK4;
                                    z18 = z24;
                                    ukk0Var2 = ukk0Var2;
                                    i11 = i19;
                                    ukk0VarK5 = ukk0VarK5;
                                    i31 = 6;
                                    z16 = z23;
                                    i12 = 4;
                                } else {
                                    p900Var = p900Var;
                                    ukk0VarK3 = ukk0VarK3;
                                    ukk0VarK4 = ukk0VarK4;
                                    z18 = z24;
                                    i11 = i19;
                                    ukk0VarK5 = ukk0VarK5;
                                    i31 = 6;
                                    z16 = z23;
                                    i12 = i20;
                                    i26 = i26;
                                    ukk0Var2 = ukk0Var2;
                                }
                            } else {
                                if (i26 == 2) {
                                    if ((k4eVar3 instanceof zu5) || (k4eVar4 instanceof zu5)) {
                                        i11 = 5;
                                    } else {
                                        p900Var = p900Var;
                                        i26 = i26;
                                        ukk0VarK3 = ukk0VarK3;
                                        ukk0VarK4 = ukk0VarK4;
                                        ukk0VarK5 = ukk0VarK5;
                                        i31 = 6;
                                        i11 = 5;
                                        i12 = 5;
                                    }
                                    z16 = true;
                                    z17 = true;
                                    z18 = false;
                                    ukk0Var2 = ukk0Var2;
                                } else if (i26 == 1) {
                                    i11 = 8;
                                } else if (i26 == 3) {
                                    i26 = i26;
                                    if (this.B != -1) {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i17 = 5;
                                                i18 = 4;
                                            } else {
                                                i17 = 8;
                                                i18 = 5;
                                            }
                                            i12 = i18;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        } else {
                                            if (i23 > 0) {
                                                p900Var = p900Var;
                                                ukk0Var2 = ukk0Var2;
                                                ukk0VarK3 = ukk0VarK3;
                                                ukk0VarK4 = ukk0VarK4;
                                                ukk0VarK5 = ukk0VarK5;
                                                i31 = 6;
                                                i11 = 5;
                                            } else if (i23 != 0 || i10 != 0) {
                                                p900Var = p900Var;
                                                ukk0Var2 = ukk0Var2;
                                                ukk0VarK3 = ukk0VarK3;
                                                ukk0VarK4 = ukk0VarK4;
                                                ukk0VarK5 = ukk0VarK5;
                                                i31 = 6;
                                                i11 = 5;
                                                i12 = 4;
                                            } else if (z9) {
                                                i17 = (k4eVar3 == k4eVar5 || k4eVar4 == k4eVar5) ? 5 : 4;
                                                i12 = 4;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                            } else {
                                                p900Var = p900Var;
                                                ukk0Var2 = ukk0Var2;
                                                ukk0VarK3 = ukk0VarK3;
                                                ukk0VarK4 = ukk0VarK4;
                                                ukk0VarK5 = ukk0VarK5;
                                                i31 = 6;
                                                i11 = 5;
                                                i12 = 8;
                                            }
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        }
                                        i11 = i17;
                                        p900Var = p900Var;
                                    } else if (z9) {
                                        p900Var = p900Var;
                                        ukk0Var2 = ukk0Var2;
                                        ukk0VarK3 = ukk0VarK3;
                                        ukk0VarK4 = ukk0VarK4;
                                        ukk0VarK5 = ukk0VarK5;
                                        i11 = 8;
                                        i31 = z2 ? 5 : 4;
                                    } else {
                                        p900Var = p900Var;
                                        ukk0Var2 = ukk0Var2;
                                        ukk0VarK3 = ukk0VarK3;
                                        ukk0VarK4 = ukk0VarK4;
                                        ukk0VarK5 = ukk0VarK5;
                                        i11 = 8;
                                        i31 = 8;
                                    }
                                    i12 = 5;
                                    z16 = true;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    i11 = 5;
                                    i12 = 4;
                                    z16 = false;
                                    z17 = false;
                                }
                                i12 = 4;
                                z16 = true;
                                z17 = true;
                                z18 = false;
                                ukk0Var2 = ukk0Var2;
                            }
                            if (z17 || ukk0VarK5 != ukk0Var3 || k4eVar3 == k4eVar5) {
                                z19 = true;
                            } else {
                                z17 = false;
                                z19 = false;
                            }
                            if (z16) {
                                if (z14 && !z7 && !z9 && ukk0VarK5 == ukk0Var && ukk0Var3 == ukk0Var2) {
                                    i31 = 8;
                                    z20 = false;
                                    i16 = 8;
                                    z22 = false;
                                } else {
                                    z20 = z2;
                                    z22 = z19;
                                    i16 = i11;
                                }
                                ukk0 ukk0Var4 = ukk0VarK5;
                                k4eVar = k4eVar4;
                                p900Var.b(ukk0VarK3, ukk0Var4, w2eVar.e(), f, ukk0Var3, ukk0VarK4, w2eVar2.e(), i31);
                                ukk0VarK5 = ukk0Var4;
                                i11 = i16;
                                z19 = z22;
                            } else {
                                k4eVar = k4eVar4;
                                z20 = z2;
                            }
                            if (this.i0 != 8 && ((hashSet = w2eVar2.f38443a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z17) {
                                if (z20 && ukk0VarK5 != ukk0Var3 && !z14 && ((k4eVar3 instanceof zu5) || (k4eVar instanceof zu5))) {
                                    i11 = 6;
                                }
                                p900Var.f(ukk0VarK3, ukk0VarK5, w2eVar.e(), i11);
                                p900Var.g(ukk0VarK4, ukk0Var3, -w2eVar2.e(), i11);
                            }
                            if (z20 || !z10 || (k4eVar3 instanceof zu5) || (k4eVar instanceof zu5) || k4eVar == k4eVar5) {
                                iMin2 = i12;
                                z21 = z19;
                            } else {
                                iMin2 = 6;
                                i11 = 6;
                                z21 = true;
                            }
                            if (z21) {
                                if (z18 && (!z9 || z3)) {
                                    if (k4eVar3 != k4eVar5 && k4eVar != k4eVar5) {
                                        i31 = iMin2;
                                    }
                                    if ((k4eVar3 instanceof qiv) || (k4eVar instanceof qiv)) {
                                        i31 = 5;
                                    }
                                    if ((k4eVar3 instanceof zu5) || (k4eVar instanceof zu5)) {
                                        i31 = 5;
                                    }
                                    if (z9) {
                                        i15 = 5;
                                    } else {
                                        i15 = i31;
                                    }
                                    iMin2 = Math.max(i15, iMin2);
                                }
                                if (z20) {
                                    iMin2 = Math.min(i11, iMin2);
                                    if (z6 || z9 || !(k4eVar3 == k4eVar5 || k4eVar == k4eVar5)) {
                                        i14 = iMin2;
                                    } else {
                                        i14 = 4;
                                    }
                                } else {
                                    i14 = iMin2;
                                }
                                p900Var.e(ukk0VarK3, ukk0VarK5, w2eVar.e(), i14);
                                p900Var.e(ukk0VarK4, ukk0Var3, -w2eVar2.e(), i14);
                            }
                            if (z20) {
                                if (ukk0Var == ukk0VarK5) {
                                    iE = w2eVar.e();
                                } else {
                                    iE = 0;
                                }
                                if (ukk0VarK5 != ukk0Var) {
                                    p900Var.f(ukk0VarK3, ukk0Var, iE, 5);
                                }
                            }
                            if (z20 || !z14 || i3 != 0 || i10 != 0) {
                                i13 = 5;
                            } else if (z14 && i26 == 3) {
                                p900Var.f(ukk0VarK4, ukk0VarK3, 0, 8);
                                i13 = 5;
                            } else {
                                i13 = 5;
                                p900Var.f(ukk0VarK4, ukk0VarK3, 0, 5);
                            }
                        } else {
                            if (ukk0VarK5.f && ukk0Var3.f) {
                                p900Var.b(ukk0VarK3, ukk0VarK5, w2eVar.e(), f, ukk0Var3, ukk0VarK4, w2eVar2.e(), 8);
                                if (z2 && z15) {
                                    int iE2 = w2eVar2.f != null ? w2eVar2.e() : 0;
                                    if (ukk0Var3 != ukk0Var2) {
                                        p900Var.f(ukk0Var2, ukk0VarK4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i11 = 5;
                            i12 = 4;
                            z16 = true;
                            z17 = true;
                        }
                        z18 = false;
                        if (z17) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z16) {
                            if (z14) {
                                z20 = z2;
                                z22 = z19;
                                i16 = i11;
                            } else {
                                z20 = z2;
                                z22 = z19;
                                i16 = i11;
                            }
                            ukk0 ukk0Var5 = ukk0VarK5;
                            k4eVar = k4eVar4;
                            p900Var.b(ukk0VarK3, ukk0Var5, w2eVar.e(), f, ukk0Var3, ukk0VarK4, w2eVar2.e(), i31);
                            ukk0VarK5 = ukk0Var5;
                            i11 = i16;
                            z19 = z22;
                        } else {
                            k4eVar = k4eVar4;
                            z20 = z2;
                        }
                        if (this.i0 != 8) {
                        }
                        if (z17) {
                            if (z20) {
                                i11 = 6;
                            }
                            p900Var.f(ukk0VarK3, ukk0VarK5, w2eVar.e(), i11);
                            p900Var.g(ukk0VarK4, ukk0Var3, -w2eVar2.e(), i11);
                        }
                        if (z20) {
                            iMin2 = i12;
                            z21 = z19;
                        } else {
                            iMin2 = i12;
                            z21 = z19;
                        }
                        if (z21) {
                            if (z18) {
                                if (k4eVar3 != k4eVar5) {
                                    i31 = iMin2;
                                }
                                if (k4eVar3 instanceof qiv) {
                                    i31 = 5;
                                } else {
                                    i31 = 5;
                                }
                                if (k4eVar3 instanceof zu5) {
                                    i31 = 5;
                                } else {
                                    i31 = 5;
                                }
                                if (z9) {
                                    i15 = 5;
                                } else {
                                    i15 = i31;
                                }
                                iMin2 = Math.max(i15, iMin2);
                            }
                            if (z20) {
                                iMin2 = Math.min(i11, iMin2);
                                if (z6) {
                                    i14 = iMin2;
                                } else {
                                    i14 = iMin2;
                                }
                            } else {
                                i14 = iMin2;
                            }
                            p900Var.e(ukk0VarK3, ukk0VarK5, w2eVar.e(), i14);
                            p900Var.e(ukk0VarK4, ukk0Var3, -w2eVar2.e(), i14);
                        }
                        if (z20) {
                            if (ukk0Var == ukk0VarK5) {
                                iE = w2eVar.e();
                            } else {
                                iE = 0;
                            }
                            if (ukk0VarK5 != ukk0Var) {
                                p900Var.f(ukk0VarK3, ukk0Var, iE, 5);
                            }
                        }
                        if (z20) {
                            i13 = 5;
                        } else {
                            i13 = 5;
                        }
                    }
                    i21 = i13;
                } else {
                    ukk0Var3 = ukk0VarK6;
                    p900Var.e(ukk0VarK4, ukk0Var3, -w2eVar2.e(), 8);
                    if (z2) {
                        p900Var.f(ukk0VarK3, ukk0Var, 0, 5);
                        w2eVar2 = w2eVar2;
                        i13 = 5;
                        ukk0VarK4 = ukk0VarK4;
                        z15 = z15;
                    }
                    z20 = z2;
                    i21 = i13;
                }
                if (z20 || !z15) {
                    return;
                }
                int iE3 = w2eVar2.f != null ? w2eVar2.e() : 0;
                if (ukk0Var3 != ukk0Var2) {
                    p900Var.f(ukk0Var2, ukk0VarK4, iE3, i21);
                    return;
                }
                return;
            }
            ukk0Var3 = ukk0VarK6;
            i13 = 5;
            z20 = z2;
            i21 = i13;
            if (z20) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            p900Var.e(ukk0VarK4, ukk0VarK3, 0, 3);
            if (i3 > 0) {
                p900Var.f(ukk0VarK4, ukk0VarK3, i3, i9);
            }
            if (i4 < Integer.MAX_VALUE) {
                p900Var.g(ukk0VarK4, ukk0VarK3, i4, i9);
            }
        } else {
            p900Var.e(ukk0VarK4, ukk0VarK3, iMin, i9);
        }
        z15 = z4;
        i10 = i22;
        if (z11) {
        }
        boolean z29 = z15;
        if (i25 >= 2) {
        }
    }

    public final void f(int i, k4e k4eVar, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    f(2, k4eVar, i2, 0);
                    f(4, k4eVar, i2, 0);
                    k(7).a(k4eVar.k(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        f(3, k4eVar, i2, 0);
                        f(5, k4eVar, i2, 0);
                        k(7).a(k4eVar.k(i2), 0);
                        return;
                    }
                    return;
                }
            }
            w2e w2eVarK = k(2);
            w2e w2eVarK2 = k(4);
            w2e w2eVarK3 = k(3);
            w2e w2eVarK4 = k(5);
            boolean z2 = true;
            if ((w2eVarK == null || !w2eVarK.h()) && (w2eVarK2 == null || !w2eVarK2.h())) {
                f(2, k4eVar, 2, 0);
                f(4, k4eVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((w2eVarK3 == null || !w2eVarK3.h()) && (w2eVarK4 == null || !w2eVarK4.h())) {
                f(3, k4eVar, 3, 0);
                f(5, k4eVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                k(7).a(k4eVar.k(7), 0);
                return;
            } else if (z) {
                k(8).a(k4eVar.k(8), 0);
                return;
            } else {
                if (z2) {
                    k(9).a(k4eVar.k(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            w2e w2eVarK5 = k(2);
            w2e w2eVarK6 = k4eVar.k(i2);
            w2e w2eVarK7 = k(4);
            w2eVarK5.a(w2eVarK6, 0);
            w2eVarK7.a(w2eVarK6, 0);
            k(8).a(w2eVarK6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            w2e w2eVarK8 = k4eVar.k(i2);
            k(3).a(w2eVarK8, 0);
            k(5).a(w2eVarK8, 0);
            k(9).a(w2eVarK8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            k(2).a(k4eVar.k(2), 0);
            k(4).a(k4eVar.k(4), 0);
            k(8).a(k4eVar.k(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            k(3).a(k4eVar.k(3), 0);
            k(5).a(k4eVar.k(5), 0);
            k(9).a(k4eVar.k(i2), 0);
            return;
        }
        w2e w2eVarK9 = k(i);
        w2e w2eVarK10 = k4eVar.k(i2);
        if (w2eVarK9.i(w2eVarK10)) {
            if (i == 6) {
                w2e w2eVarK11 = k(3);
                w2e w2eVarK12 = k(5);
                if (w2eVarK11 != null) {
                    w2eVarK11.j();
                }
                if (w2eVarK12 != null) {
                    w2eVarK12.j();
                }
            } else if (i == 3 || i == 5) {
                w2e w2eVarK13 = k(6);
                if (w2eVarK13 != null) {
                    w2eVarK13.j();
                }
                w2e w2eVarK14 = k(7);
                if (w2eVarK14.f != w2eVarK10) {
                    w2eVarK14.j();
                }
                w2e w2eVarF = k(i).f();
                w2e w2eVarK15 = k(9);
                if (w2eVarK15.h()) {
                    w2eVarF.j();
                    w2eVarK15.j();
                }
            } else if (i == 2 || i == 4) {
                w2e w2eVarK16 = k(7);
                if (w2eVarK16.f != w2eVarK10) {
                    w2eVarK16.j();
                }
                w2e w2eVarF2 = k(i).f();
                w2e w2eVarK17 = k(8);
                if (w2eVarK17.h()) {
                    w2eVarF2.j();
                    w2eVarK17.j();
                }
            }
            w2eVarK9.a(w2eVarK10, i3);
        }
    }

    public final void g(w2e w2eVar, w2e w2eVar2, int i) {
        if (w2eVar.d == this) {
            f(w2eVar.e, w2eVar2.d, w2eVar2.e, i);
        }
    }

    public void h(k4e k4eVar, HashMap map) {
        this.p = k4eVar.p;
        this.q = k4eVar.q;
        this.s = k4eVar.s;
        this.t = k4eVar.t;
        int[] iArr = k4eVar.u;
        int i = iArr[0];
        int[] iArr2 = this.u;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.v = k4eVar.v;
        this.w = k4eVar.w;
        this.y = k4eVar.y;
        this.z = k4eVar.z;
        this.A = k4eVar.A;
        this.B = k4eVar.B;
        this.C = k4eVar.C;
        int[] iArr3 = k4eVar.D;
        this.D = Arrays.copyOf(iArr3, iArr3.length);
        this.E = k4eVar.E;
        this.F = k4eVar.F;
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.U = (j4e[]) Arrays.copyOf(this.U, 2);
        this.V = this.V == null ? null : (k4e) map.get(k4eVar.V);
        this.W = k4eVar.W;
        this.X = k4eVar.X;
        this.Y = k4eVar.Y;
        this.Z = k4eVar.Z;
        this.a0 = k4eVar.a0;
        this.b0 = k4eVar.b0;
        this.c0 = k4eVar.c0;
        this.d0 = k4eVar.d0;
        this.e0 = k4eVar.e0;
        this.f0 = k4eVar.f0;
        this.g0 = k4eVar.g0;
        this.h0 = k4eVar.h0;
        this.i0 = k4eVar.i0;
        this.j0 = k4eVar.j0;
        this.k0 = k4eVar.k0;
        this.l0 = k4eVar.l0;
        this.m0 = k4eVar.m0;
        float[] fArr = k4eVar.n0;
        float f = fArr[0];
        float[] fArr2 = this.n0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        k4e[] k4eVarArr = k4eVar.o0;
        k4e k4eVar2 = k4eVarArr[0];
        k4e[] k4eVarArr2 = this.o0;
        k4eVarArr2[0] = k4eVar2;
        k4eVarArr2[1] = k4eVarArr[1];
        k4e[] k4eVarArr3 = k4eVar.p0;
        k4e k4eVar3 = k4eVarArr3[0];
        k4e[] k4eVarArr4 = this.p0;
        k4eVarArr4[0] = k4eVar3;
        k4eVarArr4[1] = k4eVarArr3[1];
        k4e k4eVar4 = k4eVar.q0;
        this.q0 = k4eVar4 == null ? null : (k4e) map.get(k4eVar4);
        k4e k4eVar5 = k4eVar.r0;
        this.r0 = k4eVar5 != null ? (k4e) map.get(k4eVar5) : null;
    }

    public final void i(p900 p900Var) {
        p900Var.k(this.J);
        p900Var.k(this.K);
        p900Var.k(this.L);
        p900Var.k(this.M);
        if (this.c0 > 0) {
            p900Var.k(this.N);
        }
    }

    public final void j() {
        if (this.d == null) {
            cmw cmwVar = new cmw(this);
            cmwVar.h.e = 4;
            cmwVar.i.e = 5;
            cmwVar.f = 0;
            this.d = cmwVar;
        }
        if (this.e == null) {
            ocu0 ocu0Var = new ocu0(this);
            i7k i7kVar = new i7k(ocu0Var);
            ocu0Var.k = i7kVar;
            ocu0Var.l = null;
            ocu0Var.h.e = 6;
            ocu0Var.i.e = 7;
            i7kVar.e = 8;
            ocu0Var.f = 1;
            this.e = ocu0Var;
        }
    }

    public w2e k(int i) {
        switch (hne.E(i)) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                c99.l(vqd.B(i));
                return null;
        }
    }

    public final j4e l(int i) {
        if (i == 0) {
            return this.U[0];
        }
        if (i == 1) {
            return this.U[1];
        }
        return null;
    }

    public final int m() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final k4e n(int i) {
        w2e w2eVar;
        w2e w2eVar2;
        if (i != 0) {
            if (i == 1 && (w2eVar2 = (w2eVar = this.M).f) != null && w2eVar2.f == w2eVar) {
                return w2eVar2.d;
            }
            return null;
        }
        w2e w2eVar3 = this.L;
        w2e w2eVar4 = w2eVar3.f;
        if (w2eVar4 == null || w2eVar4.f != w2eVar3) {
            return null;
        }
        return w2eVar4.d;
    }

    public final k4e o(int i) {
        w2e w2eVar;
        w2e w2eVar2;
        if (i != 0) {
            if (i == 1 && (w2eVar2 = (w2eVar = this.K).f) != null && w2eVar2.f == w2eVar) {
                return w2eVar2.d;
            }
            return null;
        }
        w2e w2eVar3 = this.J;
        w2e w2eVar4 = w2eVar3.f;
        if (w2eVar4 == null || w2eVar4.f != w2eVar3) {
            return null;
        }
        return w2eVar4.d;
    }

    public void p(StringBuilder sb) {
        sb.append("  " + this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append(Separators.RETURN);
        sb.append("    actualHeight:" + this.X);
        sb.append(Separators.RETURN);
        sb.append("    actualLeft:" + this.a0);
        sb.append(Separators.RETURN);
        sb.append("    actualTop:" + this.b0);
        sb.append(Separators.RETURN);
        r(sb, "left", this.J);
        r(sb, "top", this.K);
        r(sb, "right", this.L);
        r(sb, "bottom", this.M);
        r(sb, "baseline", this.N);
        r(sb, "centerX", this.O);
        r(sb, "centerY", this.P);
        int i = this.W;
        int i2 = this.d0;
        int i3 = this.D[0];
        int i4 = this.v;
        int i5 = this.s;
        float f = this.x;
        j4e j4eVar = this.U[0];
        float[] fArr = this.n0;
        float f2 = fArr[0];
        q(sb, "    width", i, i2, i3, i4, i5, f, j4eVar);
        int i6 = this.X;
        int i7 = this.e0;
        int i8 = this.D[1];
        int i9 = this.y;
        int i10 = this.t;
        float f3 = this.A;
        j4e j4eVar2 = this.U[1];
        float f4 = fArr[1];
        q(sb, "    height", i6, i7, i8, i9, i10, f3, j4eVar2);
        float f5 = this.Y;
        int i11 = this.Z;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(Separators.COMMA);
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        J(sb, "    horizontalBias", this.f0, 0.5f);
        J(sb, "    verticalBias", this.g0, 0.5f);
        I(this.l0, 0, "    horizontalChainStyle", sb);
        I(this.m0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int s() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int t() {
        k4e k4eVar = this.V;
        return (k4eVar == null || !(k4eVar instanceof l4e)) ? this.a0 : ((l4e) k4eVar).B0 + this.a0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.k0 != null ? axq.n(new StringBuilder("id: "), this.k0, Separators.SP) : "");
        sb.append(Separators.LPAREN);
        sb.append(this.a0);
        sb.append(", ");
        sb.append(this.b0);
        sb.append(") - (");
        sb.append(this.W);
        sb.append(" x ");
        return rz4.j(this.X, Separators.RPAREN, sb);
    }

    public final int u() {
        k4e k4eVar = this.V;
        return (k4eVar == null || !(k4eVar instanceof l4e)) ? this.b0 : ((l4e) k4eVar).C0 + this.b0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean v(int i) {
        if (i == 0) {
            if ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean w(int i, int i2) {
        w2e w2eVar;
        w2e w2eVar2;
        w2e w2eVar3;
        w2e w2eVar4;
        if (i == 0) {
            w2e w2eVar5 = this.J;
            w2e w2eVar6 = w2eVar5.f;
            if (w2eVar6 == null || !w2eVar6.c || (w2eVar4 = (w2eVar3 = this.L).f) == null || !w2eVar4.c) {
                return false;
            }
            return (w2eVar4.d() - w2eVar3.e()) - (w2eVar5.e() + w2eVar5.f.d()) >= i2;
        }
        w2e w2eVar7 = this.K;
        w2e w2eVar8 = w2eVar7.f;
        if (w2eVar8 == null || !w2eVar8.c || (w2eVar2 = (w2eVar = this.M).f) == null || !w2eVar2.c) {
            return false;
        }
        return (w2eVar2.d() - w2eVar.e()) - (w2eVar7.e() + w2eVar7.f.d()) >= i2;
    }

    public final void x(int i, int i2, int i3, int i4, k4e k4eVar) {
        k(i).b(k4eVar.k(i2), i3, i4, true);
    }

    public final boolean y(int i) {
        w2e w2eVar;
        w2e w2eVar2;
        int i2 = i * 2;
        w2e[] w2eVarArr = this.R;
        w2e w2eVar3 = w2eVarArr[i2];
        w2e w2eVar4 = w2eVar3.f;
        return (w2eVar4 == null || w2eVar4.f == w2eVar3 || (w2eVar2 = (w2eVar = w2eVarArr[i2 + 1]).f) == null || w2eVar2.f != w2eVar) ? false : true;
    }

    public final boolean z() {
        w2e w2eVar = this.J;
        w2e w2eVar2 = w2eVar.f;
        if (w2eVar2 != null && w2eVar2.f == w2eVar) {
            return true;
        }
        w2e w2eVar3 = this.L;
        w2e w2eVar4 = w2eVar3.f;
        return w2eVar4 != null && w2eVar4.f == w2eVar3;
    }

    public k4e(int i, int i2) {
        this.f17665a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new vdv0(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        w2e w2eVar = new w2e(this, 2);
        this.J = w2eVar;
        w2e w2eVar2 = new w2e(this, 3);
        this.K = w2eVar2;
        w2e w2eVar3 = new w2e(this, 4);
        this.L = w2eVar3;
        w2e w2eVar4 = new w2e(this, 5);
        this.M = w2eVar4;
        w2e w2eVar5 = new w2e(this, 6);
        this.N = w2eVar5;
        this.O = new w2e(this, 8);
        this.P = new w2e(this, 9);
        w2e w2eVar6 = new w2e(this, 7);
        this.Q = w2eVar6;
        this.R = new w2e[]{w2eVar, w2eVar3, w2eVar2, w2eVar4, w2eVar5, w2eVar6};
        this.S = new ArrayList();
        this.T = new boolean[2];
        j4e j4eVar = j4e.f15879a;
        this.U = new j4e[]{j4eVar, j4eVar};
        this.V = null;
        this.Y = 0.0f;
        this.Z = -1;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new float[]{-1.0f, -1.0f};
        this.o0 = new k4e[]{null, null};
        this.p0 = new k4e[]{null, null};
        this.q0 = null;
        this.r0 = null;
        this.s0 = -1;
        this.t0 = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.W = i;
        this.X = i2;
        a();
    }
}
