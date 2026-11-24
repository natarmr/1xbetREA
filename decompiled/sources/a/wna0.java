package a;

import android.util.Pair;
import androidx.media3.common.Timeline$Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wna0 extends bmq0 {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final itj0 c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final bmq0[] h;
    public final Object[] i;
    public final HashMap j;

    public wna0(bmq0[] bmq0VarArr, Object[] objArr, itj0 itj0Var) {
        this.c = itj0Var;
        this.b = itj0Var.b.length;
        int length = bmq0VarArr.length;
        this.h = bmq0VarArr;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int length2 = bmq0VarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            bmq0 bmq0Var = bmq0VarArr[i];
            this.h[i2] = bmq0Var;
            this.g[i2] = iO;
            this.f[i2] = iH;
            iO += bmq0Var.o();
            iH += this.h[i2].h();
            this.j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.d = iO;
        this.e = iH;
    }

    @Override // a.bmq0
    public final int a(boolean z) {
        if (this.b != 0) {
            int iQ = 0;
            if (z) {
                int[] iArr = this.c.b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                bmq0[] bmq0VarArr = this.h;
                if (!bmq0VarArr[iQ].p()) {
                    return bmq0VarArr[iQ].a(z) + this.g[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // a.bmq0
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.h[iIntValue].b(obj3)) != -1) {
                return this.f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // a.bmq0
    public final int c(boolean z) {
        int iR;
        int i = this.b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.c.b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                bmq0[] bmq0VarArr = this.h;
                if (!bmq0VarArr[iR].p()) {
                    return bmq0VarArr[iR].c(z) + this.g[iR];
                }
                iR = r(iR, z);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // a.bmq0
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iE = vtt0.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        bmq0[] bmq0VarArr = this.h;
        int iE2 = bmq0VarArr[iE].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE2 != -1) {
            return i3 + iE2;
        }
        int iQ = q(iE, z);
        while (iQ != -1 && bmq0VarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return bmq0VarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // a.bmq0
    public final amq0 f(int i, amq0 amq0Var, boolean z) {
        int[] iArr = this.f;
        int iE = vtt0.e(iArr, i + 1, false, false);
        int i2 = this.g[iE];
        this.h[iE].f(i - iArr[iE], amq0Var, z);
        amq0Var.c += i2;
        if (z) {
            Object obj = this.i[iE];
            Object obj2 = amq0Var.b;
            obj2.getClass();
            amq0Var.b = Pair.create(obj, obj2);
        }
        return amq0Var;
    }

    @Override // a.bmq0
    public final amq0 g(Object obj, amq0 amq0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.g[iIntValue];
        this.h[iIntValue].g(obj3, amq0Var);
        amq0Var.c += i;
        amq0Var.b = obj;
        return amq0Var;
    }

    @Override // a.bmq0
    public final int h() {
        return this.e;
    }

    @Override // a.bmq0
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iE = vtt0.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        bmq0[] bmq0VarArr = this.h;
        int iK = bmq0VarArr[iE].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iK != -1) {
            return i3 + iK;
        }
        int iR = r(iE, z);
        while (iR != -1 && bmq0VarArr[iR].p()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return bmq0VarArr[iR].c(z) + iArr[iR];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // a.bmq0
    public final Object l(int i) {
        int[] iArr = this.f;
        int iE = vtt0.e(iArr, i + 1, false, false);
        return Pair.create(this.i[iE], this.h[iE].l(i - iArr[iE]));
    }

    @Override // a.bmq0
    public final Timeline$Window m(int i, Timeline$Window timeline$Window, long j) {
        int[] iArr = this.g;
        int iE = vtt0.e(iArr, i + 1, false, false);
        int i2 = iArr[iE];
        int i3 = this.f[iE];
        this.h[iE].m(i - i2, timeline$Window, j);
        Object objCreate = this.i[iE];
        Object obj = Timeline$Window.p;
        Object obj2 = timeline$Window.f45385a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        timeline$Window.f45385a = objCreate;
        timeline$Window.m += i3;
        timeline$Window.n += i3;
        return timeline$Window;
    }

    @Override // a.bmq0
    public final int o() {
        return this.d;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.b - 1) {
                return i + 1;
            }
            return -1;
        }
        itj0 itj0Var = this.c;
        int i2 = itj0Var.c[i] + 1;
        int[] iArr = itj0Var.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        itj0 itj0Var = this.c;
        int i2 = itj0Var.c[i] - 1;
        if (i2 >= 0) {
            return itj0Var.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wna0(ArrayList arrayList, itj0 itj0Var) {
        bmq0[] bmq0VarArr = new bmq0[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            bmq0VarArr[i2] = ((co30) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((co30) it2.next()).a();
            i++;
        }
        this(bmq0VarArr, objArr, itj0Var);
    }
}
