package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n460 extends x460 {
    public final lm40 c;
    public final v610 d;
    public final u710 e;
    public s460 f;
    public woa0 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public n460(lm40 lm40Var) {
        this.c = lm40Var;
        v610 v610Var = new v610();
        v610Var.c = new long[2];
        this.d = v610Var;
        this.e = new u710(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // a.x460
    public final boolean a(u710 u710Var, j6z j6zVar, cgx0 cgx0Var, boolean z) {
        v610 v610Var;
        u710 u710Var2;
        Object obj;
        boolean z2;
        boolean z3;
        woa0 woa0Var;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        boolean zA = super.a(u710Var, j6zVar, cgx0Var, z);
        ?? V = this.c;
        boolean z6 = true;
        if (V.n) {
            ?? xz40Var = 0;
            while (V != 0) {
                if (V instanceof gpa0) {
                    this.f = vcc.X((gpa0) V, 16);
                } else if ((V.c & 16) != 0 && (V instanceof f3k)) {
                    lm40 lm40Var = ((f3k) V).p;
                    int i3 = 0;
                    V = V;
                    xz40Var = xz40Var;
                    while (lm40Var != null) {
                        if ((lm40Var.c & 16) != 0) {
                            i3++;
                            xz40Var = xz40Var;
                            if (i3 == 1) {
                                V = lm40Var;
                            } else {
                                if (xz40Var == 0) {
                                    xz40Var = new xz40(new lm40[16]);
                                }
                                if (V != 0) {
                                    xz40Var.b(V);
                                    V = 0;
                                }
                                xz40Var.b(lm40Var);
                            }
                        }
                        lm40Var = lm40Var.f;
                        V = V;
                        xz40Var = xz40Var;
                    }
                    if (i3 == 1) {
                    }
                }
                V = vcc.V(xz40Var);
            }
            if (this.f != null) {
                int iH = u710Var.h();
                int i4 = 0;
                while (true) {
                    v610Var = this.d;
                    u710Var2 = this.e;
                    if (i4 >= iH) {
                        break;
                    }
                    long jE = u710Var.e(i4);
                    dpa0 dpa0Var = (dpa0) u710Var.i(i4);
                    if (v610Var.c(jE)) {
                        boolean z7 = z6;
                        long j = dpa0Var.g;
                        long j2 = dpa0Var.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            ArrayList arrayList = new ArrayList(dpa0Var.b().size());
                            List listB = dpa0Var.b();
                            int size = listB.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List list = listB;
                                ayv ayvVar = (ayv) listB.get(i5);
                                u710 u710Var3 = u710Var2;
                                long j3 = jE;
                                long j4 = ayvVar.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = ayvVar.f1688a;
                                    s460 s460Var = this.f;
                                    s460Var.getClass();
                                    arrayList.add(new ayv(j5, s460Var.F(j6zVar, j4), ayvVar.c, ayvVar.d, ayvVar.e));
                                }
                                i5++;
                                size = size;
                                listB = list;
                                u710Var2 = u710Var3;
                                jE = j3;
                                dpa0Var = dpa0Var;
                            }
                            u710 u710Var4 = u710Var2;
                            long j6 = jE;
                            s460 s460Var2 = this.f;
                            s460Var2.getClass();
                            long jF = s460Var2.F(j6zVar, j);
                            s460 s460Var3 = this.f;
                            s460Var3.getClass();
                            dpa0 dpa0Var2 = new dpa0(dpa0Var.f6456a, dpa0Var.b, s460Var3.F(j6zVar, j2), dpa0Var.d, dpa0Var.e, dpa0Var.f, jF, dpa0Var.h, dpa0Var.i, arrayList, dpa0Var.j, dpa0Var.k, dpa0Var.l, dpa0Var.n);
                            dpa0 dpa0Var3 = dpa0Var.q;
                            if (dpa0Var3 == null) {
                                dpa0Var3 = dpa0Var;
                            }
                            dpa0Var2.q = dpa0Var3;
                            dpa0 dpa0Var4 = dpa0Var.q;
                            if (dpa0Var4 != null) {
                                dpa0Var = dpa0Var4;
                            }
                            dpa0Var2.q = dpa0Var;
                            u710Var4.f(dpa0Var2, j6);
                        } else {
                            z5 = z7;
                        }
                    } else {
                        z5 = z6;
                    }
                    i4++;
                    z6 = z5;
                    iH = iH;
                    zA = zA;
                }
                boolean z8 = zA;
                boolean z9 = z6;
                if (u710Var2.d()) {
                    v610Var.b = 0;
                    this.f40250a.g();
                    return z9;
                }
                int i6 = v610Var.b;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    if (u710Var.c(v610Var.c[i6]) < 0 && i6 < (i2 = v610Var.b)) {
                        int i7 = i2 - 1;
                        int i8 = i6;
                        while (i8 < i7) {
                            long[] jArr = v610Var.c;
                            int i9 = i8 + 1;
                            jArr[i8] = jArr[i9];
                            i8 = i9;
                        }
                        v610Var.b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(u710Var2.h());
                int iH2 = u710Var2.h();
                for (int i10 = 0; i10 < iH2; i10++) {
                    arrayList2.add(u710Var2.i(i10));
                }
                woa0 woa0Var2 = new woa0(arrayList2, cgx0Var);
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i11);
                    if (cgx0Var.d(((dpa0) obj).f6456a)) {
                        break;
                    }
                    i11++;
                }
                dpa0 dpa0Var5 = (dpa0) obj;
                if (dpa0Var5 != null) {
                    boolean z10 = dpa0Var5.d;
                    if (z) {
                        z2 = false;
                        z4 = this.i;
                        if (!z4 && (z10 || dpa0Var5.h)) {
                            s460 s460Var4 = this.f;
                            s460Var4.getClass();
                            long j7 = s460Var4.c;
                            long j8 = dpa0Var5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i12 = (int) (j7 >> 32);
                            z4 = !((fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat > ((float) i12) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false));
                            this.i = z4;
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                        z4 = false;
                    }
                    boolean z11 = this.h;
                    if (z4 == z11 || !((i = woa0Var2.f) == 3 || i == 4 || i == 5)) {
                        int i13 = woa0Var2.f;
                        if (i13 == 4 && z11 && !this.j) {
                            woa0Var2.f = 3;
                        } else if (i13 == 5 && z4 && z10) {
                            woa0Var2.f = 3;
                        }
                    } else {
                        woa0Var2.f = z4 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z8 && woa0Var2.f == 3 && (woa0Var = this.g) != null) {
                    ?? r1 = woa0Var.f39485a;
                    int size3 = r1.size();
                    ?? r5 = woa0Var2.f39485a;
                    if (size3 != r5.size()) {
                        z3 = z9;
                        break;
                    }
                    int size4 = r5.size();
                    ?? r6 = z2;
                    while (true) {
                        if (r6 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!ne60.c(((dpa0) r1.get(r6)).c, ((dpa0) r5.get(r6)).c)) {
                            z3 = z9;
                            break;
                        }
                        r6++;
                    }
                } else {
                    z3 = z9;
                    break;
                }
                this.g = woa0Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // a.x460
    public final void b(cgx0 cgx0Var) {
        super.b(cgx0Var);
        woa0 woa0Var = this.g;
        if (woa0Var == null) {
            return;
        }
        this.h = this.i;
        List list = woa0Var.f39485a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dpa0 dpa0Var = (dpa0) list.get(i);
            boolean z = dpa0Var.d;
            long j = dpa0Var.f6456a;
            boolean zD = cgx0Var.d(j);
            boolean z2 = this.i;
            if ((!z && !zD) || (!z && !z2)) {
                this.d.e(j);
            }
        }
        this.i = false;
        this.j = woa0Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        xz40 xz40Var = this.f40250a;
        Object[] objArr = xz40Var.f41739a;
        int i = xz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((n460) objArr[i2]).c();
        }
        ?? V = this.c;
        ?? xz40Var2 = 0;
        while (V != 0) {
            if (V instanceof gpa0) {
                ((gpa0) V).n0();
            } else if ((V.c & 16) != 0 && (V instanceof f3k)) {
                lm40 lm40Var = ((f3k) V).p;
                int i3 = 0;
                xz40Var2 = xz40Var2;
                V = V;
                while (lm40Var != null) {
                    if ((lm40Var.c & 16) != 0) {
                        i3++;
                        xz40Var2 = xz40Var2;
                        if (i3 == 1) {
                            V = lm40Var;
                        } else {
                            if (xz40Var2 == 0) {
                                xz40Var2 = new xz40(new lm40[16]);
                            }
                            if (V != 0) {
                                xz40Var2.b(V);
                                V = 0;
                            }
                            xz40Var2.b(lm40Var);
                        }
                    }
                    lm40Var = lm40Var.f;
                    xz40Var2 = xz40Var2;
                    V = V;
                }
                if (i3 == 1) {
                }
            }
            V = vcc.V(xz40Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(cgx0 cgx0Var) {
        e7z e7zVar;
        u710 u710Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (!u710Var.d()) {
            lm40 lm40Var = this.c;
            if (lm40Var.n) {
                s460 s460Var = lm40Var.h;
                if ((s460Var == null || (e7zVar = s460Var.u) == null) ? false : e7zVar.J()) {
                    woa0 woa0Var = this.g;
                    woa0Var.getClass();
                    s460 s460Var2 = this.f;
                    s460Var2.getClass();
                    long j = s460Var2.c;
                    ?? V = lm40Var;
                    ?? xz40Var = 0;
                    while (V != 0) {
                        if (V instanceof gpa0) {
                            ((gpa0) V).h(woa0Var, xoa0.c, j);
                        } else if ((V.c & 16) != 0 && (V instanceof f3k)) {
                            lm40 lm40Var2 = ((f3k) V).p;
                            int i = 0;
                            V = V;
                            xz40Var = xz40Var;
                            while (lm40Var2 != null) {
                                if ((lm40Var2.c & 16) != 0) {
                                    i++;
                                    xz40Var = xz40Var;
                                    if (i == 1) {
                                        V = lm40Var2;
                                    } else {
                                        if (xz40Var == 0) {
                                            xz40Var = new xz40(new lm40[16]);
                                        }
                                        if (V != 0) {
                                            xz40Var.b(V);
                                            V = 0;
                                        }
                                        xz40Var.b(lm40Var2);
                                    }
                                }
                                lm40Var2 = lm40Var2.f;
                                V = V;
                                xz40Var = xz40Var;
                            }
                            if (i == 1) {
                            }
                        }
                        V = vcc.V(xz40Var);
                    }
                    if (lm40Var.n) {
                        xz40 xz40Var2 = this.f40250a;
                        Object[] objArr = xz40Var2.f41739a;
                        int i2 = xz40Var2.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((n460) objArr[i3]).d(cgx0Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(cgx0Var);
        u710Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r6v10, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(cgx0 cgx0Var, boolean z) {
        e7z e7zVar;
        if (!this.e.d()) {
            ?? V = this.c;
            if (V.n) {
                s460 s460Var = V.h;
                if ((s460Var == null || (e7zVar = s460Var.u) == null) ? false : e7zVar.J()) {
                    woa0 woa0Var = this.g;
                    woa0Var.getClass();
                    s460 s460Var2 = this.f;
                    s460Var2.getClass();
                    long j = s460Var2.c;
                    ?? V2 = V;
                    ?? xz40Var = 0;
                    while (V2 != 0) {
                        if (V2 instanceof gpa0) {
                            ((gpa0) V2).h(woa0Var, xoa0.f41207a, j);
                        } else if ((V2.c & 16) != 0 && (V2 instanceof f3k)) {
                            lm40 lm40Var = ((f3k) V2).p;
                            int i = 0;
                            V2 = V2;
                            xz40Var = xz40Var;
                            while (lm40Var != null) {
                                if ((lm40Var.c & 16) != 0) {
                                    i++;
                                    xz40Var = xz40Var;
                                    if (i == 1) {
                                        V2 = lm40Var;
                                    } else {
                                        if (xz40Var == 0) {
                                            xz40Var = new xz40(new lm40[16]);
                                        }
                                        if (V2 != 0) {
                                            xz40Var.b(V2);
                                            V2 = 0;
                                        }
                                        xz40Var.b(lm40Var);
                                    }
                                }
                                lm40Var = lm40Var.f;
                                V2 = V2;
                                xz40Var = xz40Var;
                            }
                            if (i == 1) {
                            }
                        }
                        V2 = vcc.V(xz40Var);
                    }
                    if (V.n) {
                        xz40 xz40Var2 = this.f40250a;
                        Object[] objArr = xz40Var2.f41739a;
                        int i2 = xz40Var2.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            n460 n460Var = (n460) objArr[i3];
                            this.f.getClass();
                            n460Var.e(cgx0Var, z);
                        }
                    }
                    if (V.n) {
                        ?? xz40Var3 = 0;
                        while (V != 0) {
                            if (V instanceof gpa0) {
                                ((gpa0) V).h(woa0Var, xoa0.b, j);
                            } else if ((V.c & 16) != 0 && (V instanceof f3k)) {
                                lm40 lm40Var2 = ((f3k) V).p;
                                int i4 = 0;
                                V = V;
                                xz40Var3 = xz40Var3;
                                while (lm40Var2 != null) {
                                    if ((lm40Var2.c & 16) != 0) {
                                        i4++;
                                        xz40Var3 = xz40Var3;
                                        if (i4 == 1) {
                                            V = lm40Var2;
                                        } else {
                                            if (xz40Var3 == 0) {
                                                xz40Var3 = new xz40(new lm40[16]);
                                            }
                                            if (V != 0) {
                                                xz40Var3.b(V);
                                                V = 0;
                                            }
                                            xz40Var3.b(lm40Var2);
                                        }
                                    }
                                    lm40Var2 = lm40Var2.f;
                                    V = V;
                                    xz40Var3 = xz40Var3;
                                }
                                if (i4 == 1) {
                                }
                            }
                            V = vcc.V(xz40Var3);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j, vy40 vy40Var) {
        v610 v610Var = this.d;
        if (v610Var.c(j) && !vy40Var.e(this)) {
            v610Var.e(j);
            this.e.g(j);
        }
        xz40 xz40Var = this.f40250a;
        Object[] objArr = xz40Var.f41739a;
        int i = xz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((n460) objArr[i2]).f(j, vy40Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.f40250a + ", pointerIds=" + this.d + Separators.RPAREN;
    }
}
