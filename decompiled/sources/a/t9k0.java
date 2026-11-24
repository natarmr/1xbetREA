package a;

import android.gov.nist.core.Separators;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t9k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9k0 f33568a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public ey40 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final skx p;
    public final skx q;
    public final skx r;
    public ey40 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public MutableIntList x;

    public t9k0(q9k0 q9k0Var) {
        this.f33568a = q9k0Var;
        int[] iArr = q9k0Var.f28352a;
        this.b = iArr;
        Object[] objArr = q9k0Var.c;
        this.c = objArr;
        this.d = q9k0Var.i;
        this.e = q9k0Var.j;
        this.f = q9k0Var.k;
        int i = q9k0Var.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = q9k0Var.d;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new skx();
        this.q = new skx();
        this.r = new skx();
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void y(t9k0 t9k0Var) {
        int i = t9k0Var.v;
        int iQ = t9k0Var.q(i);
        int[] iArr = t9k0Var.b;
        int i2 = (iQ * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        t9k0Var.V(t9k0Var.F(iArr, i));
    }

    public final void A(int i) {
        bet betVar;
        int i2;
        bet betVar2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iN = n() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iB = s9k0.b(arrayList, i6, iN); iB < this.d.size() && (i3 = (betVar2 = (bet) this.d.get(iB)).f2467a) < 0 && (i4 = i3 + iN) < i; iB++) {
                        betVar2.f2467a = i4;
                    }
                } else {
                    for (int iB2 = s9k0.b(arrayList, i, iN); iB2 < this.d.size() && (i2 = (betVar = (bet) this.d.get(iB2)).f2467a) >= 0; iB2++) {
                        betVar.f2467a = -(iN - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    qx3.d(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    qx3.d(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iN2 = n();
            if (i6 >= iN2) {
                ykd.a("Check failed");
            }
            while (i6 < iN2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iO = i11 > -2 ? i11 : (o() + i11) - (-2);
                if (iO >= i) {
                    iO = -((o() - iO) - (-2));
                }
                if (iO != i11) {
                    this.b[i10] = iO;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void B(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, o());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iQ = q(iMin);
                int iQ2 = q(i5);
                int i7 = this.g;
                while (iQ < iQ2) {
                    int i8 = (iQ * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        ykd.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iQ++;
                    if (iQ == i7) {
                        iQ += this.h;
                    }
                }
            } else {
                int iQ3 = q(i5);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i10 = (iQ3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        ykd.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iQ3++;
                    if (iQ3 == this.g) {
                        iQ3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final List C(bet betVar, t9k0 t9k0Var) {
        if (t9k0Var.n <= 0) {
            ykd.a("Check failed");
        }
        if (this.n != 0) {
            ykd.a("Check failed");
        }
        if (!betVar.a()) {
            ykd.a("Check failed");
        }
        int iC = c(betVar) + 1;
        int i = this.t;
        if (i > iC || iC >= this.u) {
            ykd.a("Check failed");
        }
        int iF = F(this.b, iC);
        int iT = t(iC);
        int iE = x(iC) ? 1 : E(iC);
        List listL0 = l8x.l0(this, iC, t9k0Var, false, false, true);
        V(iF);
        boolean z = iE > 0;
        while (iF >= i) {
            int iQ = q(iF);
            int[] iArr = this.b;
            int i2 = iQ * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - iT;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    s9k0.f(iQ, (i4 & 67108863) - iE, iArr);
                }
            }
            iF = F(this.b, iF);
        }
        if (z) {
            if (this.o < iE) {
                ykd.a("Check failed");
            }
            this.o -= iE;
        }
        return listL0;
    }

    public final Object D(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iArr, iQ))];
        }
        return null;
    }

    public final int E(int i) {
        return this.b[(q(i) * 5) + 1] & 67108863;
    }

    public final int F(int[] iArr, int i) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (o() + i2) - (-2);
    }

    public final Object G(Object obj) {
        if (this.n > 0) {
            w(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            ykd.a("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void H() {
        int i;
        MutableIntList mutableIntList = this.x;
        if (mutableIntList != null) {
            while (mutableIntList.b != 0) {
                int iK0 = n6x.k0(mutableIntList);
                int iQ = q(iK0);
                int iT = iK0 + 1;
                int iT2 = t(iK0) + iK0;
                while (true) {
                    if (iT >= iT2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(iT) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iT += t(iT);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iQ * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iF = F(iArr, iK0);
                    if (iF >= 0) {
                        n6x.i(mutableIntList, iF);
                    }
                }
            }
        }
    }

    public final boolean I() {
        if (this.n != 0) {
            ykd.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iF = f(this.b, q(i));
        int iM = M();
        P(this.v);
        MutableIntList mutableIntList = this.x;
        if (mutableIntList != null) {
            while (true) {
                int i3 = mutableIntList.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    v4i0.o("IntList is empty.");
                    return false;
                }
                if (mutableIntList.f45342a[0] < i) {
                    break;
                }
                n6x.k0(mutableIntList);
            }
        }
        boolean zJ = J(i, this.t - i);
        K(iF, this.i - iF, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iM;
        return zJ;
    }

    public final boolean J(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iB = s9k0.b(this.d, i3, n() - this.h);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    bet betVar = (bet) this.d.get(iB);
                    int iC = c(betVar);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        betVar.f2467a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                V(i8);
            }
        }
        return z;
    }

    public final void K(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            B(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object L(int i, int i2, Object obj) {
        int iO = O(this.b, q(i));
        int iF = f(this.b, q(i + 1));
        int i3 = iO + i2;
        if (i3 < iO || i3 >= iF) {
            ykd.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iG = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    public final int M() {
        int iQ = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(iArr, q(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void N() {
        int i = this.u;
        this.t = i;
        this.i = f(this.b, q(i));
    }

    public final int O(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int iD = s9k0.d(iArr, i);
        return iD < 0 ? (this.c.length - this.l) + iD + 1 : iD;
    }

    public final het P(int i) {
        bet betVarS;
        HashMap map = this.e;
        if (map == null || (betVarS = S(i)) == null) {
            return null;
        }
        return (het) map.get(betVarS);
    }

    public final void Q() {
        if (this.n != 0) {
            ykd.a("Key must be supplied when inserting");
        }
        cl5 cl5Var = ukd.f35823a;
        R(0, cl5Var, false, cl5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(int i, Object obj, boolean z, Object obj2) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        cl5 cl5Var = ukd.f35823a;
        if (objArr == true) {
            int i4 = this.t;
            int iF = f(this.b, q(i4));
            v(1);
            this.i = iF;
            this.j = iF;
            int iQ = q(i4);
            int i5 = obj != cl5Var ? 1 : 0;
            int i6 = (z || obj2 == cl5Var) ? 0 : 1;
            int iH = h(iF, this.k, this.l, this.c.length);
            if (iH >= 0 && this.m < i4) {
                iH = -(((this.c.length - this.l) - iH) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = iQ * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iH;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                w(i9, i4);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                P(i3);
            }
        } else {
            this.p.c(i3);
            this.q.c((n() - this.h) - this.u);
            int i11 = this.t;
            int iQ2 = q(i11);
            if (!Intrinsics.d(obj2, cl5Var)) {
                if (z) {
                    W(this.t, obj2);
                } else {
                    U(obj2);
                }
            }
            this.i = O(this.b, iQ2);
            this.j = f(this.b, q(this.t + 1));
            int[] iArr2 = this.b;
            int i12 = iQ2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final bet S(int i) {
        ArrayList arrayList;
        int iC;
        if (i < 0 || i >= o() || (iC = s9k0.c((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (bet) arrayList.get(iC);
    }

    public final void T(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            G(obj);
            return;
        }
        ey40 ey40Var = this.s;
        if (ey40Var == null) {
            ey40Var = new ey40();
        }
        this.s = ey40Var;
        int i = this.v;
        Object objB = ey40Var.b(i);
        if (objB == null) {
            objB = new vy40();
            ey40Var.j(i, objB);
        }
        ((vy40) objB).a(obj);
    }

    public final void U(Object obj) {
        int iQ = q(this.t);
        int i = (iQ * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            ykd.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iArr, iQ))] = obj;
    }

    public final void V(int i) {
        if (i >= 0) {
            MutableIntList mutableIntList = this.x;
            if (mutableIntList == null) {
                mutableIntList = new MutableIntList();
                this.x = mutableIntList;
            }
            n6x.i(mutableIntList, i);
        }
    }

    public final void W(int i, Object obj) {
        int iQ = q(i);
        int[] iArr = this.b;
        if (iQ >= iArr.length || (iArr[(iQ * 5) + 1] & 1073741824) == 0) {
            ykd.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(this.b, iQ))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            ykd.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            dsb0.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        int i3 = this.v;
        if (i2 < i3 || i2 > this.u) {
            ykd.a("Cannot seek outside the current group (" + i3 + "-" + this.u + Separators.RPAREN);
        }
        this.t = i2;
        int iF = f(this.b, q(i2));
        this.i = iF;
        this.j = iF;
    }

    public final bet b(int i) {
        ArrayList arrayList = this.d;
        int iC = s9k0.c(arrayList, i, o());
        if (iC >= 0) {
            return (bet) arrayList.get(iC);
        }
        if (i > this.g) {
            i = -(o() - i);
        }
        bet betVar = new bet(i);
        arrayList.add(-(iC + 1), betVar);
        return betVar;
    }

    public final int c(bet betVar) {
        int i = betVar.f2467a;
        return i < 0 ? o() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            A(o());
            B(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            H();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        ey40 ey40Var = this.f;
        q9k0 q9k0Var = this.f33568a;
        if (!q9k0Var.g) {
            dsb0.a("Unexpected writer close()");
        }
        q9k0Var.g = false;
        q9k0Var.f28352a = iArr;
        q9k0Var.b = i2;
        q9k0Var.c = objArr;
        q9k0Var.d = i3;
        q9k0Var.i = arrayList;
        q9k0Var.j = map;
        q9k0Var.k = ey40Var;
    }

    public final int f(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        vy40 vy40Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iQ = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iQ * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        skx skxVar = this.r;
        if (z) {
            ey40 ey40Var = this.s;
            if (ey40Var != null && (vy40Var = (vy40) ey40Var.b(i3)) != null) {
                Object[] objArr = vy40Var.f38232a;
                int i8 = vy40Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    G(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            s9k0.f(iQ, i4, iArr);
            int iB = skxVar.b();
            if (z2) {
                i4 = 1;
            }
            this.o = iB + i4;
            int iF = F(this.b, i3);
            this.v = iF;
            int iO = iF < 0 ? o() : q(iF + 1);
            int iF2 = iO >= 0 ? f(this.b, iO) : 0;
            this.i = iF2;
            this.j = iF2;
            return;
        }
        if (i != i2) {
            ykd.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        s9k0.f(iQ, i4, iArr2);
        int iB2 = this.p.b();
        this.u = (n() - this.h) - this.q.b();
        this.v = iB2;
        int iF3 = F(this.b, i3);
        int iB3 = skxVar.b();
        this.o = iB3;
        if (iF3 == iB2) {
            this.o = iB3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iF3 != 0 && iF3 != iB2 && (i14 != 0 || i13 != 0)) {
                int iQ2 = q(iF3);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iQ2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    s9k0.f(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iF3 = F(iArr5, iF3);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            dsb0.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                ykd.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.b();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            ykd.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                ykd.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            Q();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    public final void m(int i, Function2 function2) {
        int i2;
        int i3;
        int i4;
        int iF = F(this.b, i);
        int iO = o();
        int iT = t(i) + i;
        int i5 = i;
        fy40 fy40Var = null;
        MutableIntList mutableIntList = null;
        while (i5 < iT) {
            int iF2 = f(this.b, q(i5));
            int i6 = i5 + 1;
            int iF3 = f(this.b, q(i6));
            while (iF2 < iF3) {
                Object obj = this.c[g(iF2)];
                if (obj instanceof jet) {
                    jet jetVar = (jet) obj;
                    if (!(jetVar instanceof jet)) {
                        jetVar = null;
                    }
                    if (jetVar == null) {
                        ykd.b("Inconsistent composition");
                        csj.b();
                        return;
                    }
                    int i7 = jetVar.b;
                    if (i7 >= 0) {
                        int iT2 = t(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < iT2 && i9 < i7) {
                            int iQ = q(i8);
                            int i10 = iF;
                            int[] iArr = this.b;
                            int i11 = iQ * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < iT2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            iF = i10;
                        }
                        i4 = iF;
                        if (fy40Var == null) {
                            int[] iArr2 = pkx.f27156a;
                            fy40Var = new fy40();
                        }
                        if (mutableIntList == null) {
                            mutableIntList = new MutableIntList();
                        }
                        fy40Var.a(i8);
                        mutableIntList.a(i8);
                        mutableIntList.a(iF2);
                    } else {
                        i4 = iF;
                        function2.invoke(Integer.valueOf(iF2), obj);
                    }
                } else {
                    i4 = iF;
                    function2.invoke(Integer.valueOf(iF2), obj);
                }
                iF2++;
                iF = i4;
            }
            int i12 = iF;
            iF = i6 < iO ? F(this.b, i6) : -1;
            if (iF != i5) {
                int iF4 = i12;
                while (true) {
                    if (mutableIntList == null || fy40Var == null || !fy40Var.g(i5)) {
                        i2 = iO;
                    } else {
                        int i13 = mutableIntList.b;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = iO;
                            int iC = mutableIntList.c(i17);
                            if (iC == i5) {
                                int iC2 = mutableIntList.c(i17 + 1);
                                function2.invoke(Integer.valueOf(iC2), this.c[g(iC2)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                mutableIntList.f(i16, iC);
                                i16 += 2;
                                mutableIntList.f(i19, mutableIntList.c(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            function2 = function2;
                            iO = i18;
                        }
                        i2 = iO;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i3 = mutableIntList.b) || i13 < 0 || i13 > i3) {
                                v4i0.m("Index must be between 0 and size");
                                return;
                            }
                            if (i13 < i16) {
                                jf4.o("The end index must be < start index");
                                return;
                            } else if (i13 != i16) {
                                if (i13 < i3) {
                                    int[] iArr3 = mutableIntList.f45342a;
                                    qx3.d(i16, i13, i3, iArr3, iArr3);
                                }
                                mutableIntList.b -= i13 - i16;
                            }
                        }
                    }
                    if (i5 == i || iF4 == iF) {
                        break;
                    }
                    i5 = iF4;
                    iO = i2;
                    iF4 = F(this.b, iF4);
                    function2 = function2;
                }
            } else {
                i2 = iO;
            }
            i5 = i6;
            iO = i2;
        }
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = (iQ * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return ukd.f35823a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iArr, iQ)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int r(int i) {
        return this.b[q(i) * 5];
    }

    public final Object s(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int t(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final String toString() {
        int i = this.t;
        int i2 = this.u;
        int iO = o();
        int i3 = this.g;
        int i4 = this.h + i3;
        StringBuilder sbT = dw9.t("SlotWriter(current = ", i, " end=", " size = ", i2);
        axq.r(iO, i3, " gap=", "-", sbT);
        return rz4.j(i4, Separators.RPAREN, sbT);
    }

    public final boolean u(int i, int i2) {
        int iN;
        int iT;
        if (i2 == this.v) {
            iN = this.u;
        } else {
            skx skxVar = this.p;
            if (i2 > skxVar.a(0)) {
                iT = t(i2);
            } else {
                int[] iArr = skxVar.f32372a;
                int iMin = Math.min(iArr.length, skxVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iT = t(i2);
                } else {
                    iN = (n() - this.h) - this.q.f32372a[i3];
                }
            }
            iN = iT + i2;
        }
        return i > i2 && i < iN;
    }

    public final void v(int i) {
        if (i > 0) {
            int i2 = this.t;
            A(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                qx3.d(0, 0, i3 * 5, iArr, iArr2);
                qx3.d((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int iH = h(i5 > 0 ? f(iArr, q(i2 + i)) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = iH;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void w(int i, int i2) {
        if (i > 0) {
            B(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean x(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(q9k0 q9k0Var, int i) {
        if (this.n <= 0) {
            ykd.a("Check failed");
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0 && this.t == 0 && this.f33568a.b == 0) {
            int[] iArr = q9k0Var.f28352a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = q9k0Var.b;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr3 = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                ey40 ey40Var = this.f;
                Object[] objArr4 = q9k0Var.c;
                int i4 = q9k0Var.d;
                HashMap map2 = q9k0Var.j;
                ey40 ey40Var2 = q9k0Var.k;
                this.b = iArr;
                this.c = objArr4;
                this.d = q9k0Var.i;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr4.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = ey40Var2;
                q9k0Var.f28352a = iArr2;
                q9k0Var.b = objArr2 == true ? 1 : 0;
                q9k0Var.c = objArr3;
                q9k0Var.d = objArr == true ? 1 : 0;
                q9k0Var.i = arrayList;
                q9k0Var.j = map;
                q9k0Var.k = ey40Var;
                return;
            }
        }
        t9k0 t9k0VarH = q9k0Var.h();
        try {
            l8x.l0(t9k0VarH, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            t9k0VarH.e(z);
        }
    }
}
