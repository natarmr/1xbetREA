package a;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p900 {
    public static boolean q = false;
    public final owb0 d;
    public final nr m;
    public kx3 p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26585a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public ukk0[] n = new ukk0[1000];
    public int o = 0;
    public kx3[] g = new kx3[32];

    public p900() {
        s();
        nr nrVar = new nr((byte) 8);
        nrVar.b = new awa0();
        nrVar.c = new awa0();
        nrVar.d = new ukk0[32];
        this.m = nrVar;
        owb0 owb0Var = new owb0(nrVar);
        owb0Var.f = new ukk0[128];
        owb0Var.g = new ukk0[128];
        owb0Var.h = 0;
        owb0Var.i = new dq00(owb0Var);
        this.d = owb0Var;
        this.p = new kx3(nrVar);
    }

    public static int n(Object obj) {
        ukk0 ukk0Var = ((w2e) obj).i;
        if (ukk0Var != null) {
            return (int) (ukk0Var.e + 0.5f);
        }
        return 0;
    }

    public final ukk0 a(int i) {
        awa0 awa0Var = (awa0) this.m.c;
        int i2 = awa0Var.b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = awa0Var.f1565a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            awa0Var.b = i3;
            obj = obj2;
        }
        ukk0 ukk0Var = (ukk0) obj;
        if (ukk0Var == null) {
            ukk0Var = new ukk0(i);
            ukk0Var.l = i;
        } else {
            ukk0Var.c();
            ukk0Var.l = i;
        }
        int i4 = this.o;
        int i5 = this.f26585a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f26585a = i6;
            this.n = (ukk0[]) Arrays.copyOf(this.n, i6);
        }
        ukk0[] ukk0VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        ukk0VarArr[i7] = ukk0Var;
        return ukk0Var;
    }

    public final void b(ukk0 ukk0Var, ukk0 ukk0Var2, int i, float f, ukk0 ukk0Var3, ukk0 ukk0Var4, int i2, int i3) {
        kx3 kx3VarL = l();
        if (ukk0Var2 == ukk0Var3) {
            kx3VarL.d.g(ukk0Var, 1.0f);
            kx3VarL.d.g(ukk0Var4, 1.0f);
            kx3VarL.d.g(ukk0Var2, -2.0f);
        } else {
            yw3 yw3Var = kx3VarL.d;
            if (f == 0.5f) {
                yw3Var.g(ukk0Var, 1.0f);
                kx3VarL.d.g(ukk0Var2, -1.0f);
                kx3VarL.d.g(ukk0Var3, -1.0f);
                kx3VarL.d.g(ukk0Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    kx3VarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                yw3Var.g(ukk0Var, -1.0f);
                kx3VarL.d.g(ukk0Var2, 1.0f);
                kx3VarL.b = i;
            } else if (f >= 1.0f) {
                yw3Var.g(ukk0Var4, -1.0f);
                kx3VarL.d.g(ukk0Var3, 1.0f);
                kx3VarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                yw3Var.g(ukk0Var, f2 * 1.0f);
                kx3VarL.d.g(ukk0Var2, f2 * (-1.0f));
                kx3VarL.d.g(ukk0Var3, (-1.0f) * f);
                kx3VarL.d.g(ukk0Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    kx3VarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            kx3VarL.a(this, i3);
        }
        c(kx3VarL);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    public final void c(kx3 kx3Var) {
        boolean z;
        boolean z2;
        ukk0 ukk0VarF;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (kx3Var.e) {
            z = false;
        } else {
            ArrayList arrayList = kx3Var.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iD = kx3Var.d.d();
                    for (int i = 0; i < iD; i++) {
                        ukk0 ukk0VarE = kx3Var.d.e(i);
                        if (ukk0VarE.c != -1 || ukk0VarE.f) {
                            arrayList.add(ukk0VarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            ukk0 ukk0Var = (ukk0) arrayList.get(i2);
                            if (ukk0Var.f) {
                                kx3Var.h(this, ukk0Var, true);
                            } else {
                                kx3Var.i(this, this.g[ukk0Var.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (kx3Var.f19033a != null && kx3Var.d.d() == 0) {
                    kx3Var.e = true;
                    this.b = true;
                }
            }
            if (kx3Var.e()) {
                return;
            }
            float f = kx3Var.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                kx3Var.b = f * (-1.0f);
                yw3 yw3Var = kx3Var.d;
                int i3 = yw3Var.h;
                for (int i4 = 0; i3 != -1 && i4 < yw3Var.f43351a; i4++) {
                    float[] fArr = yw3Var.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = yw3Var.f[i3];
                }
            }
            int iD2 = kx3Var.d.d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            ukk0 ukk0Var2 = null;
            ukk0 ukk0Var3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iD2) {
                float f5 = kx3Var.d.f(i5);
                ukk0 ukk0VarE2 = kx3Var.d.e(i5);
                float f6 = f2;
                if (ukk0VarE2.l == 1) {
                    if (ukk0Var2 == null) {
                        if (ukk0VarE2.k <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ukk0Var2 = ukk0VarE2;
                        f3 = f5;
                    } else {
                        if (f3 > f5) {
                            if (ukk0VarE2.k > 1) {
                                z4 = false;
                            }
                            ukk0Var2 = ukk0VarE2;
                            f3 = f5;
                        } else if (z4 || ukk0VarE2.k > 1) {
                        }
                        z4 = true;
                        ukk0Var2 = ukk0VarE2;
                        f3 = f5;
                    }
                } else if (ukk0Var2 == null && f5 < f6) {
                    if (ukk0Var3 == null) {
                        if (ukk0VarE2.k <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        ukk0Var3 = ukk0VarE2;
                        f4 = f5;
                    } else {
                        if (f4 > f5) {
                            if (ukk0VarE2.k > 1) {
                                z5 = false;
                            }
                            ukk0Var3 = ukk0VarE2;
                            f4 = f5;
                        } else if (z5 || ukk0VarE2.k > 1) {
                        }
                        z5 = true;
                        ukk0Var3 = ukk0VarE2;
                        f4 = f5;
                    }
                }
                i5++;
                f2 = f6;
            }
            float f7 = f2;
            if (ukk0Var2 == null) {
                ukk0Var2 = ukk0Var3;
            }
            if (ukk0Var2 == null) {
                z2 = true;
            } else {
                kx3Var.g(ukk0Var2);
                z2 = false;
            }
            if (kx3Var.d.d() == 0) {
                kx3Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                ukk0 ukk0VarA = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                ukk0VarA.b = i6;
                nr nrVar = this.m;
                ((ukk0[]) nrVar.d)[i6] = ukk0VarA;
                kx3Var.f19033a = ukk0VarA;
                int i7 = this.k;
                h(kx3Var);
                if (this.k == i7 + 1) {
                    kx3 kx3Var2 = this.p;
                    kx3Var2.f19033a = null;
                    kx3Var2.d.b();
                    for (int i8 = 0; i8 < kx3Var.d.d(); i8++) {
                        kx3Var2.d.a(kx3Var.d.e(i8), kx3Var.d.f(i8), true);
                    }
                    r(this.p);
                    if (ukk0VarA.c == -1) {
                        if (kx3Var.f19033a == ukk0VarA && (ukk0VarF = kx3Var.f(null, ukk0VarA)) != null) {
                            kx3Var.g(ukk0VarF);
                        }
                        if (!kx3Var.e) {
                            kx3Var.f19033a.e(this, kx3Var);
                        }
                        ((awa0) nrVar.b).b(kx3Var);
                        this.k--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            ukk0 ukk0Var4 = kx3Var.f19033a;
            if (ukk0Var4 == null) {
                return;
            }
            if (ukk0Var4.l != 1 && kx3Var.b < f7) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(kx3Var);
    }

    public final void d(ukk0 ukk0Var, int i) {
        int i2 = ukk0Var.c;
        if (i2 == -1) {
            ukk0Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                ukk0 ukk0Var2 = ((ukk0[]) this.m.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            kx3 kx3VarL = l();
            kx3VarL.f19033a = ukk0Var;
            float f = i;
            ukk0Var.e = f;
            kx3VarL.b = f;
            kx3VarL.e = true;
            c(kx3VarL);
            return;
        }
        kx3 kx3Var = this.g[i2];
        if (kx3Var.e) {
            kx3Var.b = i;
            return;
        }
        if (kx3Var.d.d() == 0) {
            kx3Var.e = true;
            kx3Var.b = i;
            return;
        }
        kx3 kx3VarL2 = l();
        if (i < 0) {
            kx3VarL2.b = i * (-1);
            kx3VarL2.d.g(ukk0Var, 1.0f);
        } else {
            kx3VarL2.b = i;
            kx3VarL2.d.g(ukk0Var, -1.0f);
        }
        c(kx3VarL2);
    }

    public final void e(ukk0 ukk0Var, ukk0 ukk0Var2, int i, int i2) {
        if (i2 == 8 && ukk0Var2.f && ukk0Var.c == -1) {
            ukk0Var.d(this, ukk0Var2.e + i);
            return;
        }
        kx3 kx3VarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            kx3VarL.b = i;
        }
        yw3 yw3Var = kx3VarL.d;
        if (z) {
            yw3Var.g(ukk0Var, 1.0f);
            kx3VarL.d.g(ukk0Var2, -1.0f);
        } else {
            yw3Var.g(ukk0Var, -1.0f);
            kx3VarL.d.g(ukk0Var2, 1.0f);
        }
        if (i2 != 8) {
            kx3VarL.a(this, i2);
        }
        c(kx3VarL);
    }

    public final void f(ukk0 ukk0Var, ukk0 ukk0Var2, int i, int i2) {
        kx3 kx3VarL = l();
        ukk0 ukk0VarM = m();
        ukk0VarM.d = 0;
        kx3VarL.b(ukk0Var, ukk0Var2, ukk0VarM, i);
        if (i2 != 8) {
            kx3VarL.d.g(j(i2), (int) (kx3VarL.d.c(ukk0VarM) * (-1.0f)));
        }
        c(kx3VarL);
    }

    public final void g(ukk0 ukk0Var, ukk0 ukk0Var2, int i, int i2) {
        kx3 kx3VarL = l();
        ukk0 ukk0VarM = m();
        ukk0VarM.d = 0;
        kx3VarL.c(ukk0Var, ukk0Var2, ukk0VarM, i);
        if (i2 != 8) {
            kx3VarL.d.g(j(i2), (int) (kx3VarL.d.c(ukk0VarM) * (-1.0f)));
        }
        c(kx3VarL);
    }

    public final void h(kx3 kx3Var) {
        int i;
        if (kx3Var.e) {
            kx3Var.f19033a.d(this, kx3Var.b);
        } else {
            kx3[] kx3VarArr = this.g;
            int i2 = this.k;
            kx3VarArr[i2] = kx3Var;
            ukk0 ukk0Var = kx3Var.f19033a;
            ukk0Var.c = i2;
            this.k = i2 + 1;
            ukk0Var.e(this, kx3Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                kx3 kx3Var2 = this.g[i3];
                if (kx3Var2 != null && kx3Var2.e) {
                    kx3Var2.f19033a.d(this, kx3Var2.b);
                    ((awa0) this.m.b).b(kx3Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        kx3[] kx3VarArr2 = this.g;
                        int i6 = i4 - 1;
                        kx3 kx3Var3 = kx3VarArr2[i4];
                        kx3VarArr2[i6] = kx3Var3;
                        ukk0 ukk0Var2 = kx3Var3.f19033a;
                        if (ukk0Var2.c == i4) {
                            ukk0Var2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            kx3 kx3Var = this.g[i];
            kx3Var.f19033a.e = kx3Var.b;
        }
    }

    public final ukk0 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        ukk0 ukk0VarA = a(4);
        float[] fArr = ukk0VarA.h;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        ukk0VarA.b = i2;
        ukk0VarA.d = i;
        ((ukk0[]) this.m.d)[i2] = ukk0VarA;
        owb0 owb0Var = this.d;
        owb0Var.i.b = ukk0VarA;
        Arrays.fill(fArr, 0.0f);
        fArr[ukk0VarA.d] = 1.0f;
        owb0Var.j(ukk0VarA);
        return ukk0VarA;
    }

    public final ukk0 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof w2e)) {
            return null;
        }
        w2e w2eVar = (w2e) obj;
        ukk0 ukk0Var = w2eVar.i;
        if (ukk0Var == null) {
            w2eVar.k();
            ukk0Var = w2eVar.i;
        }
        int i = ukk0Var.b;
        nr nrVar = this.m;
        if (i != -1 && i <= this.c && ((ukk0[]) nrVar.d)[i] != null) {
            return ukk0Var;
        }
        if (i != -1) {
            ukk0Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        ukk0Var.b = i2;
        ukk0Var.l = 1;
        ((ukk0[]) nrVar.d)[i2] = ukk0Var;
        return ukk0Var;
    }

    public final kx3 l() {
        Object obj;
        nr nrVar = this.m;
        awa0 awa0Var = (awa0) nrVar.b;
        int i = awa0Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = awa0Var.f1565a;
            obj = objArr[i2];
            objArr[i2] = null;
            awa0Var.b = i2;
        } else {
            obj = null;
        }
        kx3 kx3Var = (kx3) obj;
        if (kx3Var == null) {
            return new kx3(nrVar);
        }
        kx3Var.f19033a = null;
        kx3Var.d.b();
        kx3Var.b = 0.0f;
        kx3Var.e = false;
        return kx3Var;
    }

    public final ukk0 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        ukk0 ukk0VarA = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        ukk0VarA.b = i;
        ((ukk0[]) this.m.d)[i] = ukk0VarA;
        return ukk0VarA;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (kx3[]) Arrays.copyOf(this.g, i);
        nr nrVar = this.m;
        nrVar.d = (ukk0[]) Arrays.copyOf((ukk0[]) nrVar.d, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        owb0 owb0Var = this.d;
        if (owb0Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(owb0Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(owb0Var);
                return;
            }
        }
        i();
    }

    public final void q(owb0 owb0Var) {
        for (int i = 0; i < this.k; i++) {
            kx3 kx3Var = this.g[i];
            int i2 = 1;
            if (kx3Var.f19033a.l != 1) {
                float f = 0.0f;
                if (kx3Var.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            kx3 kx3Var2 = this.g[i6];
                            if (kx3Var2.f19033a.l != i2 && !kx3Var2.e && kx3Var2.b < f) {
                                int iD = kx3Var2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    ukk0 ukk0VarE = kx3Var2.d.e(i8);
                                    float fC = kx3Var2.d.c(ukk0VarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = ukk0VarE.g[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = ukk0VarE.b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            kx3 kx3Var3 = this.g[i4];
                            kx3Var3.f19033a.c = -1;
                            kx3Var3.g(((ukk0[]) this.m.d)[i5]);
                            ukk0 ukk0Var = kx3Var3.f19033a;
                            ukk0Var.c = i4;
                            ukk0Var.e(this, kx3Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(owb0Var);
        i();
    }

    public final void r(kx3 kx3Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            ukk0 ukk0Var = kx3Var.f19033a;
            if (ukk0Var != null) {
                this.i[ukk0Var.b] = true;
            }
            ukk0 ukk0VarD = kx3Var.d(this.i);
            if (ukk0VarD != null) {
                boolean[] zArr = this.i;
                int i4 = ukk0VarD.b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (ukk0VarD != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.k) {
                    kx3 kx3Var2 = this.g[i5];
                    if (kx3Var2.f19033a.l != 1 && !kx3Var2.e) {
                        yw3 yw3Var = kx3Var2.d;
                        int i7 = yw3Var.h;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= yw3Var.f43351a) {
                                z = false;
                                break;
                            } else if (yw3Var.e[i7] == ukk0VarD.b) {
                                z = true;
                                break;
                            } else {
                                i7 = yw3Var.f[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fC = kx3Var2.d.c(ukk0VarD);
                            if (fC < 0.0f) {
                                float f2 = (-kx3Var2.b) / fC;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    kx3 kx3Var3 = this.g[i6];
                    kx3Var3.f19033a.c = -1;
                    kx3Var3.g(ukk0VarD);
                    ukk0 ukk0Var2 = kx3Var3.f19033a;
                    ukk0Var2.c = i6;
                    ukk0Var2.e(this, kx3Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            kx3 kx3Var = this.g[i];
            if (kx3Var != null) {
                ((awa0) this.m.b).b(kx3Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        nr nrVar;
        int i = 0;
        while (true) {
            nrVar = this.m;
            ukk0[] ukk0VarArr = (ukk0[]) nrVar.d;
            if (i >= ukk0VarArr.length) {
                break;
            }
            ukk0 ukk0Var = ukk0VarArr[i];
            if (ukk0Var != null) {
                ukk0Var.c();
            }
            i++;
        }
        awa0 awa0Var = (awa0) nrVar.c;
        ukk0[] ukk0VarArr2 = this.n;
        int length = this.o;
        awa0Var.getClass();
        if (length > ukk0VarArr2.length) {
            length = ukk0VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            ukk0 ukk0Var2 = ukk0VarArr2[i2];
            int i3 = awa0Var.b;
            Object[] objArr = awa0Var.f1565a;
            if (i3 < objArr.length) {
                objArr[i3] = ukk0Var2;
                awa0Var.b = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((ukk0[]) nrVar.d, (Object) null);
        this.c = 0;
        owb0 owb0Var = this.d;
        owb0Var.h = 0;
        owb0Var.b = 0.0f;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            kx3 kx3Var = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new kx3(nrVar);
    }
}
