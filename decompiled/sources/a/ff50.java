package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ff50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f9435a = q7m0.a(hf50.f12957a);
    public final p7m0 b;
    public final xae0 c;
    public final xw3 d;
    public final xw3 e;
    public af50 f;
    public int g;
    public ef50 h;
    public final xy40 i;
    public final xy40 j;
    public final xy40 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    public ff50() {
        p7m0 p7m0VarA = q7m0.a(new cf50());
        this.b = p7m0VarA;
        this.c = vtb.N(p7m0VarA);
        this.d = new xw3();
        this.e = new xw3();
        this.i = ha80.a();
        this.j = ha80.a();
        this.k = ha80.a();
    }

    public final void a(ye50 ye50Var, ef50 ef50Var, int i) {
        xy40 xy40Var;
        boolean z;
        boolean z2;
        ye50Var.getClass();
        if (i != 0) {
            xy40Var = i != 1 ? this.i : this.j;
        } else {
            xy40Var = this.k;
        }
        xy40Var.g(ef50Var);
        ye50 ye50Var2 = ef50Var.f7705a;
        if (ye50Var2 != null) {
            itt0.m("Input '", ef50Var, "' is already added to dispatcher ", ye50Var2, Separators.DOT);
            return;
        }
        ef50Var.f7705a = ye50Var;
        ((cf50) this.c.f40549a.getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.r : this.l;
        } else {
            z = this.o;
        }
        if (i != 0) {
            z2 = i != 1 ? this.s : this.m;
        } else {
            z2 = this.p;
        }
        ef50Var.c(z);
        ef50Var.b(z2);
    }

    public final void b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        xw3 xw3Var = this.d;
        if (!xw3Var.isEmpty()) {
            Iterator it = xw3Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((af50) it.next()).a()) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (!xw3Var.isEmpty()) {
            Iterator it2 = xw3Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                } else if (((af50) it2.next()).b()) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        boolean z5 = z || z2;
        xw3 xw3Var2 = this.e;
        if (!xw3Var2.isEmpty()) {
            Iterator it3 = xw3Var2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else if (((af50) it3.next()).a()) {
                    z3 = true;
                    break;
                }
            }
        } else {
            z3 = false;
            break;
        }
        if (!xw3Var2.isEmpty()) {
            Iterator it4 = xw3Var2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z4 = false;
                    break;
                } else if (((af50) it4.next()).b()) {
                    z4 = true;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        boolean z6 = z3 || z4;
        boolean z7 = z || z3;
        boolean z8 = z2 || z4;
        boolean z9 = z7 || z8;
        boolean z10 = this.o != z5;
        boolean z11 = this.p != z;
        boolean z12 = this.q != z2;
        boolean z13 = this.l != z6;
        boolean z14 = this.m != z3;
        boolean z15 = this.n != z4;
        boolean z16 = z14;
        boolean z17 = this.r != z9;
        boolean z18 = this.s != z7;
        boolean z19 = this.t != z8;
        if (z10 || z11 || z12) {
            xy40 xy40Var = this.k;
            Object[] objArr = xy40Var.b;
            long[] jArr = xy40Var.c;
            int i = xy40Var.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = i;
                i = (int) ((jArr[i] >> 31) & 2147483647L);
                ef50 ef50Var = (ef50) objArr[i2];
                if (z10) {
                    ef50Var.c(z5);
                }
                if (z11) {
                    ef50Var.b(z);
                }
                if (z12) {
                    ef50Var.getClass();
                }
            }
        }
        if (z13 || z16 || z15) {
            xy40 xy40Var2 = this.j;
            Object[] objArr2 = xy40Var2.b;
            long[] jArr2 = xy40Var2.c;
            int i3 = xy40Var2.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ef50 ef50Var2 = (ef50) objArr2[i3];
                if (z13) {
                    ef50Var2.c(z6);
                }
                if (z16) {
                    ef50Var2.b(z3);
                }
                if (z15 != 0) {
                    ef50Var2.getClass();
                }
                i3 = i4;
            }
        }
        if (z17 || z18 || z19) {
            xy40 xy40Var3 = this.i;
            Object[] objArr3 = xy40Var3.b;
            long[] jArr3 = xy40Var3.c;
            int i5 = xy40Var3.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ef50 ef50Var3 = (ef50) objArr3[i5];
                if (z17) {
                    ef50Var3.c(z9);
                }
                if (z18) {
                    ef50Var3.b(z7);
                }
                if (z19) {
                    ef50Var3.getClass();
                }
                i5 = i6;
            }
        }
        this.o = z5;
        this.p = z;
        this.q = z2;
        this.l = z6;
        this.m = z3;
        this.n = z4;
        this.r = z9;
        this.s = z7;
        this.t = z8;
        af50 af50VarC = this.f;
        if (af50VarC == null) {
            af50VarC = c(0);
        }
        d(af50VarC);
    }

    public final af50 c(int i) {
        Object next;
        Object next2;
        af50 af50Var;
        Object next3;
        xw3 xw3Var = this.e;
        xw3 xw3Var2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = xw3Var2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((af50) next).a());
            af50 af50Var2 = (af50) next;
            if (af50Var2 != null) {
                return af50Var2;
            }
            for (Object obj2 : xw3Var) {
                if (((af50) obj2).a()) {
                    obj = obj2;
                    break;
                }
            }
            return (af50) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = xw3Var2.iterator();
            do {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
            } while (!((af50) next3).b());
            af50 af50Var3 = (af50) next3;
            if (af50Var3 != null) {
                return af50Var3;
            }
            for (Object obj3 : xw3Var) {
                if (((af50) obj3).b()) {
                    obj = obj3;
                    break;
                }
            }
            return (af50) obj;
        }
        Iterator it3 = xw3Var2.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            af50Var = (af50) next2;
            if (af50Var.a()) {
                break;
            }
        } while (!af50Var.b());
        af50 af50Var4 = (af50) next2;
        if (af50Var4 != null) {
            return af50Var4;
        }
        for (Object obj4 : xw3Var) {
            af50 af50Var5 = (af50) obj4;
            if (af50Var5.a() || af50Var5.b()) {
                obj = obj4;
                break;
            }
        }
        return (af50) obj;
    }

    public final void d(af50 af50Var) {
        cf50 cf50Var;
        af50 af50VarC = this.f;
        if (af50VarC == null) {
            af50VarC = c(0);
        }
        if (Intrinsics.d(af50VarC, af50Var)) {
            if (af50VarC == null) {
                cf50Var = new cf50();
            } else {
                ArrayList arrayList = new ArrayList();
                for (af50 af50Var2 : this.d) {
                    if (af50Var2.a() && !af50Var2.b.isEmpty()) {
                        arrayList.addAll(af50Var2.b);
                    }
                }
                for (af50 af50Var3 : this.e) {
                    if (af50Var3.a() && !af50Var3.b.isEmpty()) {
                        arrayList.addAll(af50Var3.b);
                    }
                }
                df50 df50Var = af50VarC.f762a;
                List list = af50VarC.c;
                df50Var.getClass();
                list.getClass();
                cf50Var = new cf50(df50Var, arrayList, list, arrayList.size());
            }
            p7m0 p7m0Var = this.b;
            if (Intrinsics.d((cf50) p7m0Var.getValue(), cf50Var)) {
                return;
            }
            p7m0Var.o(null, cf50Var);
            xy40 xy40Var = this.k;
            Object[] objArr = xy40Var.b;
            long[] jArr = xy40Var.c;
            int i = xy40Var.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) (2147483647L & (jArr[i] >> 31));
                ((ef50) objArr[i]).getClass();
                i = i2;
            }
            xy40 xy40Var2 = this.j;
            Object[] objArr2 = xy40Var2.b;
            long[] jArr2 = xy40Var2.c;
            int i3 = xy40Var2.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((ef50) objArr2[i3]).getClass();
                i3 = i4;
            }
            xy40 xy40Var3 = this.i;
            Object[] objArr3 = xy40Var3.b;
            long[] jArr3 = xy40Var3.c;
            int i5 = xy40Var3.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((ef50) objArr3[i5]).getClass();
                i5 = i6;
            }
        }
    }
}
