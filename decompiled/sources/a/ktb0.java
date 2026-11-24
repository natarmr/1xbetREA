package a;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ktb0 implements sbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18856a;
    public final nvu b;
    public final Function1 c;
    public p4e d;
    public a5n0 e;
    public z4n0 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public akq l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ o24 r;

    public ktb0(o24 o24Var, int i, nvu nvuVar, Function1 function1) {
        this.r = o24Var;
        this.f18856a = i;
        this.b = nvuVar;
        this.c = function1;
        qlq0.f28947a.getClass();
        rq40.f30914a.getClass();
        this.p = rq40.b();
    }

    @Override // a.sbz
    public final void a() {
        this.m = true;
    }

    public final void b() {
        z4n0 z4n0Var = this.f;
        if (z4n0Var != null) {
            z4n0Var.cancel();
        }
        this.f = null;
        a5n0 a5n0Var = this.e;
        if (a5n0Var != null) {
            a5n0Var.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(kfn0 kfn0Var) {
        boolean zD;
        if (!this.r.f24513a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(kfn0Var);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(kfn0Var);
        }
        ahy.k0(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // a.sbz
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01e6  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    public final boolean d(kfn0 kfn0Var) {
        ?? r12;
        List list;
        int i = this.f18856a;
        long j = i;
        ahy.k0(j, "compose:lazy:prefetch:execute:item");
        hbz hbzVar = (hbz) ((gbz) this.r.b).b.invoke();
        if (!this.h) {
            int iB = hbzVar.b();
            if (i >= 0 && i < iB) {
                Object objD = hbzVar.d(i);
                Object obj = this.j;
                if (obj != null && !objD.equals(obj)) {
                    b();
                    return false;
                }
                Object objA = hbzVar.a(i);
                nvu nvuVar = this.b;
                aa5 aa5Var = (aa5) nvuVar.d;
                if (nvuVar.c != objA || aa5Var == null) {
                    hz40 hz40Var = (hz40) nvuVar.b;
                    Object objG = hz40Var.g(objA);
                    Object obj2 = objG;
                    if (objG == null) {
                        aa5 aa5Var2 = new aa5();
                        aa5Var2.e = -1;
                        hz40Var.n(objA, aa5Var2);
                        obj2 = aa5Var2;
                    }
                    aa5Var = (aa5) obj2;
                    nvuVar.c = objA;
                    nvuVar.d = aa5Var;
                }
                e();
                long jA = kfn0Var.a();
                this.n = jA;
                qlq0.f28947a.getClass();
                rq40.f30914a.getClass();
                this.p = rq40.b();
                this.o = 0L;
                ahy.k0(jA, "compose:lazy:prefetch:available_time_nanos");
                if (!e()) {
                    if (g(this.n, aa5Var.f508a + aa5Var.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(objD, objA, aa5Var);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f != null) {
                    if (!g(this.n, aa5Var.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        z4n0 z4n0Var = this.f;
                        if (z4n0Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.e = z4n0Var.apply();
                        this.f = null;
                        this.i = true;
                        Trace.endSection();
                        h();
                        aa5Var.c = aa5.a(this.o, aa5Var.c);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.k) {
                    if (this.n <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        a5n0 a5n0Var = this.e;
                        if (a5n0Var == null) {
                            throw w6x.i("Should precompose before resolving nested prefetch states");
                        }
                        mie0 mie0Var = new mie0();
                        a5n0Var.e(new cx2(mie0Var, (byte) 8));
                        List list2 = (List) mie0Var.f21842a;
                        this.l = list2 != null ? new akq(this, list2) : null;
                        this.k = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                akq akqVar = this.l;
                if (akqVar != null) {
                    int i2 = aa5Var.e;
                    boolean z = this.m;
                    List[] listArr = (List[]) akqVar.e;
                    int i3 = akqVar.f1034a;
                    List list3 = akqVar.d;
                    if (i3 < list3.size()) {
                        if (((ktb0) akqVar.f).h) {
                            adx.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((tbz) list3.get(i4)).d = i2;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (akqVar.f1034a < list3.size()) {
                                try {
                                    if (listArr[akqVar.f1034a] == null) {
                                        if (kfn0Var.a() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = akqVar.f1034a;
                                        tbz tbzVar = (tbz) list3.get(i5);
                                        Function1 function1 = tbzVar.f33693a;
                                        if (function1 == null) {
                                            list = iun.f15405a;
                                        } else {
                                            rbz rbzVar = new rbz(tbzVar, tbzVar.d);
                                            function1.invoke(rbzVar);
                                            ArrayList arrayList = rbzVar.b;
                                            tbzVar.f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i5] = list;
                                    }
                                    List list4 = listArr[akqVar.f1034a];
                                    list4.getClass();
                                    while (akqVar.b < list4.size()) {
                                        ktb0 ktb0Var = (ktb0) list4.get(akqVar.b);
                                        if (z) {
                                            ktb0 ktb0Var2 = ktb0Var != null ? ktb0Var : null;
                                            if (ktb0Var2 != null) {
                                                r12 = 1;
                                                ktb0Var2.m = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        akqVar.c = r12;
                                        if (ktb0Var.c(kfn0Var)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        akqVar.b += r12;
                                    }
                                    akqVar.b = 0;
                                    akqVar.f1034a++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                akq akqVar2 = this.l;
                if (akqVar2 != null && akqVar2.c) {
                    h();
                    ahy.k0(j, "compose:lazy:prefetch:execute:item");
                    akq akqVar3 = this.l;
                    if (akqVar3 != null) {
                        akqVar3.c = false;
                    }
                }
                p4e p4eVar = this.d;
                if (!this.g && p4eVar != null) {
                    if (!g(this.n, aa5Var.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j2 = p4eVar.f26347a;
                        if (this.h) {
                            adx.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            adx.a("Request was already measured!");
                        }
                        this.g = true;
                        a5n0 a5n0Var2 = this.e;
                        if (a5n0Var2 == null) {
                            throw w6x.i("performComposition() must be called before performMeasure()");
                        }
                        int iC = a5n0Var2.c();
                        for (int i6 = 0; i6 < iC; i6++) {
                            a5n0Var2.d(i6, j2);
                        }
                        Trace.endSection();
                        h();
                        aa5Var.d = aa5.a(this.o, aa5Var.d);
                        Function1 function2 = this.c;
                        if (function2 != null) {
                            function2.invoke(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                akq akqVar4 = this.l;
                if (this.g && this.k && akqVar4 != null) {
                    List list5 = akqVar4.d;
                    int size2 = list5.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((tbz) list5.get(i7)).e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = aa5Var.e;
                    aa5Var.e = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list5.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((tbz) list5.get(i9)).f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        aa5Var.d = 0L;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        z4n0 z4n0Var;
        return this.i || ((z4n0Var = this.f) != null && z4n0Var.a());
    }

    public final void f(Object obj, Object obj2, aa5 aa5Var) {
        z4n0 eduVar;
        z4n0 z4n0Var = this.f;
        if (z4n0Var == null) {
            o24 o24Var = this.r;
            Function2 function2A = ((gbz) o24Var.b).a(this.f18856a, obj, obj2);
            r7z r7zVarA = ((b5n0) o24Var.c).a();
            if (r7zVarA.f30000a.I()) {
                r7zVarA.l(obj, function2A, true);
                eduVar = new edu((Object) r7zVarA, obj, (byte) 26);
            } else {
                eduVar = new zpu(r7zVarA, obj, (byte) 16);
            }
            z4n0Var = eduVar;
            this.f = z4n0Var;
            this.j = obj;
        }
        this.q = false;
        while (!z4n0Var.a() && !this.q) {
            z4n0Var.b(new uq((Object) this, (Object) aa5Var, (byte) 24));
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            aa5Var.b = aa5.a(j, aa5Var.b);
        } else {
            aa5Var.f508a = aa5.a(j, aa5Var.f508a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        qlq0.f28947a.getClass();
        rq40 rq40Var = rq40.f30914a;
        rq40Var.getClass();
        long jB = rq40.b();
        long j = this.p;
        rq40Var.getClass();
        long jX = xvw.X(jB, j, bfn.NANOSECONDS);
        uen uenVar = wen.b;
        long j2 = jX >> 1;
        if ((1 & ((int) jX)) != 0) {
            if (j2 > 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j2 < -9223372036854L ? Long.MIN_VALUE : j2 * 1000000;
            }
        }
        this.o = j2;
        long j3 = this.n - j2;
        this.n = j3;
        this.p = jB;
        ahy.k0(j3, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        p4e p4eVar = this.d;
        boolean zE = e();
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f18856a);
        sb.append(", constraints = ");
        sb.append(p4eVar);
        sb.append(", isComposed = ");
        ua80.u(", isMeasured = ", ", isCanceled = ", sb, zE, z);
        return rw2.p(sb, z2, " }");
    }
}
