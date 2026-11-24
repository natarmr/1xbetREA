package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class qoj0 extends e5 implements mz40, p5a, afr {
    public final int e;
    public final int f;
    public final i99 g;
    public Object[] h;
    public long i;
    public long j;
    public int k;
    public int l;

    public qoj0(int i, int i2, i99 i99Var) {
        this.e = i;
        this.f = i2;
        this.g = i99Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void o(qoj0 qoj0Var, kmq kmqVar, yje yjeVar) throws Throwable {
        poj0 poj0Var;
        qoj0 qoj0Var2;
        Throwable th;
        soj0 soj0Var;
        kmq kmqVar2;
        bby bbyVar;
        if (yjeVar instanceof poj0) {
            poj0Var = (poj0) yjeVar;
            int i = poj0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                poj0Var.o = i - Integer.MIN_VALUE;
            } else {
                poj0Var = new poj0(qoj0Var, yjeVar);
            }
        } else {
            poj0Var = new poj0(qoj0Var, yjeVar);
        }
        Object obj = poj0Var.m;
        wne wneVar = wne.f39444a;
        int i2 = poj0Var.o;
        if (i2 != 0) {
            if (i2 == 1) {
                soj0Var = poj0Var.k;
                kmq kmqVar3 = poj0Var.j;
                qoj0 qoj0Var3 = poj0Var.i;
                try {
                    z1x.P(obj);
                    kmqVar2 = kmqVar3;
                    qoj0Var = qoj0Var3;
                    try {
                        bbyVar = (bby) poj0Var.getContext().get(gqw0.o1);
                    } catch (Throwable th2) {
                        qoj0Var2 = qoj0Var;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    qoj0Var2 = qoj0Var3;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                bby bbyVar2 = poj0Var.l;
                soj0Var = poj0Var.k;
                kmq kmqVar4 = poj0Var.j;
                qoj0Var2 = poj0Var.i;
                try {
                    z1x.P(obj);
                    kmqVar2 = kmqVar4;
                    bbyVar = bbyVar2;
                    qoj0Var = qoj0Var2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            qoj0Var2.k(soj0Var);
            throw th;
        }
        z1x.P(obj);
        soj0 soj0Var2 = (soj0) qoj0Var.f();
        try {
            if (kmqVar instanceof q6n0) {
                poj0Var.i = qoj0Var;
                poj0Var.j = kmqVar;
                poj0Var.k = soj0Var2;
                poj0Var.o = 1;
                if (((q6n0) kmqVar).b(poj0Var) == wneVar) {
                    return;
                }
            }
            kmqVar2 = kmqVar;
            soj0Var = soj0Var2;
            bbyVar = (bby) poj0Var.getContext().get(gqw0.o1);
        } catch (Throwable th5) {
            qoj0Var2 = qoj0Var;
            th = th5;
            soj0Var = soj0Var2;
        }
        while (true) {
            Object objW = qoj0Var.w(soj0Var);
            if (objW == roj0.f30841a) {
                poj0Var.i = qoj0Var;
                poj0Var.j = kmqVar2;
                poj0Var.k = soj0Var;
                poj0Var.l = bbyVar;
                poj0Var.o = 2;
                if (qoj0Var.m(soj0Var, poj0Var) == wneVar) {
                    return;
                }
            } else {
                if (bbyVar != null && !bbyVar.isActive()) {
                    throw bbyVar.getCancellationException();
                }
                poj0Var.i = qoj0Var;
                poj0Var.j = kmqVar2;
                poj0Var.k = soj0Var;
                poj0Var.l = bbyVar;
                poj0Var.o = 3;
                if (kmqVar2.a(objW, poj0Var) == wneVar) {
                    return;
                }
            }
        }
    }

    @Override // a.mz40, a.kmq
    public final Object a(Object obj, yje yjeVar) {
        qoj0 qoj0Var;
        Throwable th;
        yje[] yjeVarArrR;
        ooj0 ooj0Var;
        if (g(obj)) {
            return Unit.f46060a;
        }
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        yje[] yjeVarArrR2 = xf0.f40767a;
        synchronized (this) {
            try {
                if (u(obj)) {
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        n5aVar.resumeWith(Unit.f46060a);
                        yjeVarArrR = r(yjeVarArrR2);
                        ooj0Var = null;
                        qoj0Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        qoj0Var = this;
                        throw th;
                    }
                } else {
                    try {
                        qoj0Var = this;
                        try {
                            ooj0 ooj0Var2 = new ooj0(qoj0Var, s() + ((long) (this.k + this.l)), obj, n5aVar);
                            qoj0Var.q(ooj0Var2);
                            qoj0Var.l++;
                            if (qoj0Var.f == 0) {
                                yjeVarArrR2 = qoj0Var.r(yjeVarArrR2);
                            }
                            yjeVarArrR = yjeVarArrR2;
                            ooj0Var = ooj0Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        qoj0Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (ooj0Var != null) {
                    n5aVar.u(new b5a(ooj0Var, (byte) 2));
                }
                for (yje yjeVar2 : yjeVarArrR) {
                    if (yjeVar2 != null) {
                        e0g0 e0g0Var2 = j0g0.b;
                        yjeVar2.resumeWith(Unit.f46060a);
                    }
                }
                Object objP = n5aVar.p();
                wne wneVar = wne.f39444a;
                if (objP != wneVar) {
                    objP = Unit.f46060a;
                }
                return objP == wneVar ? objP : Unit.f46060a;
            } catch (Throwable th5) {
                th = th5;
                qoj0Var = this;
            }
        }
    }

    @Override // a.afr
    public final gmq b(CoroutineContext coroutineContext, int i, i99 i99Var) {
        return roj0.c(this, coroutineContext, i, i99Var);
    }

    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) throws Throwable {
        o(this, kmqVar, yjeVar);
        return wne.f39444a;
    }

    @Override // a.noj0
    public final List d() {
        synchronized (this) {
            int iS = (int) ((s() + ((long) this.k)) - this.i);
            if (iS == 0) {
                return iun.f15405a;
            }
            ArrayList arrayList = new ArrayList(iS);
            Object[] objArr = this.h;
            objArr.getClass();
            for (int i = 0; i < iS; i++) {
                arrayList.add(objArr[((int) (this.i + ((long) i))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // a.mz40
    public final boolean g(Object obj) {
        int i;
        boolean z;
        yje[] yjeVarArrR = xf0.f40767a;
        synchronized (this) {
            if (u(obj)) {
                yjeVarArrR = r(yjeVarArrR);
                z = true;
            } else {
                z = false;
            }
        }
        for (yje yjeVar : yjeVarArrR) {
            if (yjeVar != null) {
                e0g0 e0g0Var = j0g0.b;
                yjeVar.resumeWith(Unit.f46060a);
            }
        }
        return z;
    }

    @Override // a.e5
    public final f5 h() {
        soj0 soj0Var = new soj0();
        soj0Var.f32545a = -1L;
        return soj0Var;
    }

    @Override // a.mz40
    public final void i() {
        qoj0 qoj0Var;
        synchronized (this) {
            try {
                qoj0Var = this;
                try {
                    qoj0Var.x(s() + ((long) this.k), this.j, s() + ((long) this.k), s() + ((long) this.k) + ((long) this.l));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                qoj0Var = this;
            }
        }
    }

    @Override // a.e5
    public final f5[] j() {
        return new soj0[2];
    }

    public final Object m(soj0 soj0Var, poj0 poj0Var) {
        n5a n5aVar = new n5a(1, pnx.b(poj0Var));
        n5aVar.r();
        synchronized (this) {
            try {
                if (v(soj0Var) < 0) {
                    soj0Var.b = n5aVar;
                } else {
                    e0g0 e0g0Var = j0g0.b;
                    n5aVar.resumeWith(Unit.f46060a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objP = n5aVar.p();
        return objP == wne.f39444a ? objP : Unit.f46060a;
    }

    public final void n() {
        if (this.f != 0 || this.l > 1) {
            Object[] objArr = this.h;
            objArr.getClass();
            while (this.l > 0) {
                long jS = s();
                int i = this.k;
                int i2 = this.l;
                if (objArr[((int) ((jS + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != roj0.f30841a) {
                    return;
                }
                this.l = i2 - 1;
                roj0.d(objArr, s() + ((long) (this.k + this.l)), null);
            }
        }
    }

    public final void p() {
        f5[] f5VarArr;
        Object[] objArr = this.h;
        objArr.getClass();
        roj0.d(objArr, s(), null);
        this.k--;
        long jS = s() + 1;
        if (this.i < jS) {
            this.i = jS;
        }
        if (this.j < jS) {
            if (this.b != 0 && (f5VarArr = this.f7207a) != null) {
                for (f5 f5Var : f5VarArr) {
                    if (f5Var != null) {
                        soj0 soj0Var = (soj0) f5Var;
                        long j = soj0Var.f32545a;
                        if (0 <= j && j < jS) {
                            soj0Var.f32545a = jS;
                        }
                    }
                }
            }
            this.j = jS;
        }
    }

    public final void q(Object obj) {
        int i = this.k + this.l;
        Object[] objArrT = this.h;
        if (objArrT == null) {
            objArrT = t(null, 0, 2);
        } else if (i >= objArrT.length) {
            objArrT = t(objArrT, i, objArrT.length * 2);
        }
        roj0.d(objArrT, s() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.yje[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final yje[] r(yje[] yjeVarArr) {
        f5[] f5VarArr;
        soj0 soj0Var;
        n5a n5aVar;
        int length = yjeVarArr.length;
        if (this.b != 0 && (f5VarArr = this.f7207a) != null) {
            int length2 = f5VarArr.length;
            int i = 0;
            yjeVarArr = yjeVarArr;
            while (i < length2) {
                f5 f5Var = f5VarArr[i];
                if (f5Var != null && (n5aVar = (soj0Var = (soj0) f5Var).b) != null && v(soj0Var) >= 0) {
                    int length3 = yjeVarArr.length;
                    yjeVarArr = yjeVarArr;
                    if (length >= length3) {
                        yjeVarArr = Arrays.copyOf((Object[]) yjeVarArr, Math.max(2, yjeVarArr.length * 2));
                    }
                    ((yje[]) yjeVarArr)[length] = n5aVar;
                    soj0Var.b = null;
                    length++;
                }
                i++;
                yjeVarArr = yjeVarArr;
            }
        }
        return (yje[]) yjeVarArr;
    }

    public final long s() {
        return Math.min(this.j, this.i);
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            jf4.n("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.h = objArr2;
        if (objArr != null) {
            long jS = s();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jS;
                roj0.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    public final boolean u(Object obj) {
        int i;
        long jS;
        long j;
        int i2 = this.b;
        int i3 = this.e;
        if (i2 != 0) {
            int i4 = this.k;
            int i5 = this.f;
            if (i4 < i5 || this.j > this.i) {
                q(obj);
                i = this.k + 1;
                this.k = i;
                if (i > i5) {
                    p();
                }
                jS = s() + ((long) this.k);
                j = this.i;
                if (((int) (jS - j)) > i3) {
                    x(1 + j, this.j, s() + ((long) this.k), s() + ((long) this.k) + ((long) this.l));
                }
            } else {
                int iOrdinal = this.g.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    q(obj);
                    i = this.k + 1;
                    this.k = i;
                    if (i > i5) {
                        p();
                    }
                    jS = s() + ((long) this.k);
                    j = this.i;
                    if (((int) (jS - j)) > i3) {
                        x(1 + j, this.j, s() + ((long) this.k), s() + ((long) this.k) + ((long) this.l));
                    }
                } else if (iOrdinal != 2) {
                    t9f.b();
                    return false;
                }
            }
        } else if (i3 != 0) {
            q(obj);
            int i6 = this.k + 1;
            this.k = i6;
            if (i6 > i3) {
                p();
            }
            this.j = s() + ((long) this.k);
            return true;
        }
        return true;
    }

    public final long v(soj0 soj0Var) {
        long j = soj0Var.f32545a;
        if (j >= s() + ((long) this.k) && (this.f > 0 || j > s() || this.l == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object w(soj0 soj0Var) {
        Object obj;
        yje[] yjeVarArrY = xf0.f40767a;
        synchronized (this) {
            try {
                long jV = v(soj0Var);
                if (jV < 0) {
                    obj = roj0.f30841a;
                } else {
                    long j = soj0Var.f32545a;
                    Object[] objArr = this.h;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jV) & (objArr.length - 1)];
                    if (obj2 instanceof ooj0) {
                        obj2 = ((ooj0) obj2).c;
                    }
                    soj0Var.f32545a = jV + 1;
                    Object obj3 = obj2;
                    yjeVarArrY = y(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (yje yjeVar : yjeVarArrY) {
            if (yjeVar != null) {
                e0g0 e0g0Var = j0g0.b;
                yjeVar.resumeWith(Unit.f46060a);
            }
        }
        return obj;
    }

    public final void x(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jS = s(); jS < jMin; jS++) {
            Object[] objArr = this.h;
            objArr.getClass();
            roj0.d(objArr, jS, null);
        }
        this.i = j;
        this.j = j2;
        this.k = (int) (j3 - jMin);
        this.l = (int) (j4 - j3);
    }

    public final yje[] y(long j) {
        int i;
        long j2;
        yje[] yjeVarArr;
        yje[] yjeVarArr2;
        f5[] f5VarArr;
        yje[] yjeVarArr3 = xf0.f40767a;
        if (j <= this.j) {
            long jS = s();
            long j3 = ((long) this.k) + jS;
            int i2 = this.f;
            if (i2 == 0 && this.l > 0) {
                j3++;
            }
            int i3 = 0;
            if (this.b != 0 && (f5VarArr = this.f7207a) != null) {
                for (f5 f5Var : f5VarArr) {
                    if (f5Var != null) {
                        long j4 = ((soj0) f5Var).f32545a;
                        if (0 <= j4 && j4 < j3) {
                            j3 = j4;
                        }
                    }
                }
            }
            if (j3 > this.j) {
                long jS2 = s() + ((long) this.k);
                int i4 = this.b;
                int iMin = this.l;
                if (i4 > 0) {
                    iMin = Math.min(iMin, i2 - ((int) (jS2 - j3)));
                }
                long j5 = ((long) this.l) + jS2;
                pfw pfwVar = roj0.f30841a;
                if (iMin > 0) {
                    yje[] yjeVarArr4 = new yje[iMin];
                    j2 = 1;
                    Object[] objArr = this.h;
                    objArr.getClass();
                    long j6 = jS2;
                    while (true) {
                        if (jS2 >= j5) {
                            yjeVarArr2 = yjeVarArr4;
                            i = i2;
                            break;
                        }
                        yjeVarArr2 = yjeVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jS2)];
                        if (obj != pfwVar) {
                            obj.getClass();
                            ooj0 ooj0Var = (ooj0) obj;
                            int i5 = i3 + 1;
                            i = i2;
                            yjeVarArr2[i3] = ooj0Var.d;
                            roj0.d(objArr, jS2, pfwVar);
                            roj0.d(objArr, j6, ooj0Var.c);
                            j6++;
                            if (i5 >= iMin) {
                                break;
                            }
                            i3 = i5;
                        } else {
                            i = i2;
                        }
                        jS2++;
                        yjeVarArr4 = yjeVarArr2;
                        i2 = i;
                    }
                    jS2 = j6;
                    yjeVarArr = yjeVarArr2;
                } else {
                    i = i2;
                    j2 = 1;
                    yjeVarArr = yjeVarArr3;
                }
                long jMax = Math.max(this.i, Math.max(jS, jS2 - ((long) this.e)));
                if (i == 0 && jMax < j5) {
                    Object[] objArr2 = this.h;
                    objArr2.getClass();
                    if (Intrinsics.d(objArr2[((int) jMax) & (objArr2.length - 1)], pfwVar)) {
                        jS2 += j2;
                        jMax += j2;
                    }
                }
                long j7 = jS2;
                x(jMax, this.b == 0 ? j7 : j3, j7, j5);
                n();
                return yjeVarArr.length == 0 ? yjeVarArr : r(yjeVarArr);
            }
        }
        return yjeVarArr3;
    }
}
