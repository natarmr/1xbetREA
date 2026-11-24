package a;

import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mk7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21931a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ mk7(fge0 fge0Var, iz40 iz40Var, iz40 iz40Var2, List list, List list2, iz40 iz40Var3, List list3, iz40 iz40Var4, Set set) {
        this.b = fge0Var;
        this.c = iz40Var;
        this.d = iz40Var2;
        this.e = list;
        this.f = list2;
        this.g = iz40Var3;
        this.h = list3;
        this.i = iz40Var4;
        this.j = set;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01cf A[Catch: all -> 0x01f1, TryCatch #8 {all -> 0x01f1, blocks: (B:111:0x01b6, B:114:0x01c0, B:116:0x01cf, B:118:0x01db, B:120:0x01e1), top: B:244:0x01b6, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01db A[Catch: all -> 0x01f1, TryCatch #8 {all -> 0x01f1, blocks: (B:111:0x01b6, B:114:0x01c0, B:116:0x01cf, B:118:0x01db, B:120:0x01e1), top: B:244:0x01b6, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01e1 A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #8 {all -> 0x01f1, blocks: (B:111:0x01b6, B:114:0x01c0, B:116:0x01cf, B:118:0x01db, B:120:0x01e1), top: B:244:0x01b6, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:130:0x0203 A[LOOP:2: B:114:0x01c0->B:130:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x0234  */
    /* JADX WARN: Code duplicated, block: B:147:0x0235 A[Catch: all -> 0x0252, TRY_LEAVE, TryCatch #10 {, blocks: (B:144:0x022e, B:147:0x0235), top: B:248:0x022e, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:0x0164 A[Catch: all -> 0x0180, TryCatch #1 {all -> 0x0180, blocks: (B:80:0x0144, B:83:0x0156, B:85:0x0164, B:87:0x016e, B:89:0x0174), top: B:232:0x0144, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x016e A[Catch: all -> 0x0180, TryCatch #1 {all -> 0x0180, blocks: (B:80:0x0144, B:83:0x0156, B:85:0x0164, B:87:0x016e, B:89:0x0174), top: B:232:0x0144, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0174 A[Catch: all -> 0x0180, TRY_LEAVE, TryCatch #1 {all -> 0x0180, blocks: (B:80:0x0144, B:83:0x0156, B:85:0x0164, B:87:0x016e, B:89:0x0174), top: B:232:0x0144, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0190 A[LOOP:4: B:83:0x0156->B:98:0x0190, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Collection, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zD;
        Unit unit;
        Object[] objArr;
        long[] jArr;
        char c;
        int length;
        long j;
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        Object[] objArr2;
        long[] jArr2;
        int length2;
        int i5;
        long j3;
        Object[] objArr3;
        long[] jArr3;
        int i6;
        int i7;
        boolean z;
        switch (this.f21931a) {
            case 0:
                l7m0 l7m0Var = (l7m0) this.b;
                l7m0 l7m0Var2 = (l7m0) this.c;
                Function1 function1 = (Function1) this.j;
                l7m0 l7m0Var3 = (l7m0) this.d;
                l7m0 l7m0Var4 = (l7m0) this.e;
                l7m0 l7m0Var5 = (l7m0) this.f;
                l7m0 l7m0Var6 = (l7m0) this.g;
                l7m0 l7m0Var7 = (l7m0) this.h;
                l7m0 l7m0Var8 = (l7m0) this.i;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                List list = (List) ((l7m0) l7m0Var.getValue()).getValue();
                hczVar.f(list.size(), new ci2(new nk7((byte) 1), list, (byte) 28), new ci2(new nk7((byte) 2), list, (byte) 29), new ugd(802480018, true, new rk7(list, l7m0Var2, function1, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, l7m0Var8)));
                return Unit.f46060a;
            default:
                fge0 fge0Var = (fge0) this.b;
                iz40 iz40Var = (iz40) this.c;
                iz40 iz40Var2 = (iz40) this.d;
                List list2 = (List) this.e;
                List list3 = (List) this.f;
                iz40 iz40Var3 = (iz40) this.g;
                ?? r7 = (List) this.h;
                iz40 iz40Var4 = (iz40) this.i;
                Set set = (Set) this.j;
                long jLongValue = ((Long) obj).longValue();
                p7m0 p7m0Var = fge0.z;
                synchronized (fge0Var.c) {
                    zD = fge0Var.D();
                }
                boolean z2 = false;
                if (zD) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        fge0Var.f9488a.b.m(new bx((byte) 13, jLongValue));
                        synchronized (xfk0.c) {
                            iz40 iz40Var5 = xfk0.j.h;
                            z = iz40Var5 != null && iz40Var5.h();
                        }
                        if (z) {
                            xfk0.c();
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    fge0Var.O();
                    synchronized (fge0Var.c) {
                        try {
                            xz40 xz40Var = fge0Var.i;
                            Object[] objArr4 = xz40Var.f41739a;
                            int i8 = xz40Var.c;
                            for (int i9 = 0; i9 < i8; i9++) {
                                list2.add((tld) objArr4[i9]);
                            }
                            fge0Var.i.g();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    iz40Var.b();
                    iz40Var2.b();
                    while (true) {
                        if (list2.isEmpty() && list3.isEmpty()) {
                            rfk0 rfk0VarH = xfk0.h();
                            rfk0 ios0Var = rfk0VarH instanceof nz40 ? new ios0((nz40) rfk0VarH, null, null, true, false) : new jos0(rfk0VarH, null, true, z2);
                            try {
                                rfk0 rfk0VarJ = ios0Var.j();
                                try {
                                    if (r7.isEmpty()) {
                                        if (iz40Var3.h()) {
                                            iz40Var4.j(iz40Var3);
                                            objArr = iz40Var3.b;
                                            jArr = iz40Var3.f15620a;
                                            c = 7;
                                            length = jArr.length - 2;
                                            j = 128;
                                            if (length >= 0) {
                                                i = 0;
                                                while (true) {
                                                    j2 = jArr[i];
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i3 = 8 - ((~(i - length)) >>> 31);
                                                        for (i4 = 0; i4 < i3; i4++) {
                                                            if ((j2 & 255) < 128) {
                                                                ((tld) objArr[(i << 3) + i4]).l();
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (i3 == 8) {
                                                            i2 = i;
                                                            if (i2 != length) {
                                                                i = i2 + 1;
                                                            }
                                                        }
                                                    } else {
                                                        i2 = i;
                                                        if (i2 != length) {
                                                            i = i2 + 1;
                                                        }
                                                    }
                                                }
                                            }
                                            iz40Var3.b();
                                        } else {
                                            c = 7;
                                            j = 128;
                                        }
                                        if (iz40Var4.h()) {
                                            objArr2 = iz40Var4.b;
                                            jArr2 = iz40Var4.f15620a;
                                            length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                i5 = 0;
                                                while (true) {
                                                    j3 = jArr2[i5];
                                                    objArr3 = objArr2;
                                                    jArr3 = jArr2;
                                                    if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i6 = 8 - ((~(i5 - length2)) >>> 31);
                                                        for (i7 = 0; i7 < i6; i7++) {
                                                            if ((j3 & 255) < j) {
                                                                ((tld) objArr3[(i5 << 3) + i7]).m();
                                                            }
                                                            j3 >>= 8;
                                                            break;
                                                        }
                                                        if (i6 == 8) {
                                                        }
                                                    }
                                                    if (i5 != length2) {
                                                        i5++;
                                                        objArr2 = objArr3;
                                                        jArr2 = jArr3;
                                                    }
                                                }
                                            }
                                            iz40Var4.b();
                                        }
                                        rfk0.q(rfk0VarJ);
                                        ios0Var.c();
                                        synchronized (fge0Var.c) {
                                            if (fge0Var.C() == null) {
                                                ykd.a("unexpected to get continuation here");
                                                break;
                                            }
                                            xfk0.h().m();
                                            iz40Var2.b();
                                            iz40Var.b();
                                            fge0Var.q = null;
                                            Trace.endSection();
                                            return Unit.f46060a;
                                        }
                                    }
                                    try {
                                        int size = r7.size();
                                        for (?? r3 = z2; r3 < size; r3++) {
                                            iz40Var4.a((tld) r7.get(r3));
                                        }
                                        int size2 = r7.size();
                                        for (?? r4 = z2; r4 < size2; r4++) {
                                            ((tld) r7.get(r4)).j();
                                        }
                                        r7.clear();
                                        if (iz40Var3.h()) {
                                            try {
                                                iz40Var4.j(iz40Var3);
                                                objArr = iz40Var3.b;
                                                jArr = iz40Var3.f15620a;
                                                c = 7;
                                                length = jArr.length - 2;
                                                j = 128;
                                                if (length >= 0) {
                                                    i = 0;
                                                    while (true) {
                                                        j2 = jArr[i];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            i3 = 8 - ((~(i - length)) >>> 31);
                                                            while (i4 < i3) {
                                                                if ((j2 & 255) < 128) {
                                                                    ((tld) objArr[(i << 3) + i4]).l();
                                                                }
                                                                j2 >>= 8;
                                                            }
                                                            if (i3 == 8) {
                                                                i2 = i;
                                                                if (i2 != length) {
                                                                    i = i2 + 1;
                                                                }
                                                            }
                                                        } else {
                                                            i2 = i;
                                                            if (i2 != length) {
                                                                i = i2 + 1;
                                                            }
                                                        }
                                                    }
                                                }
                                                iz40Var3.b();
                                            } catch (Throwable th3) {
                                                try {
                                                    fge0Var.N(th3, null);
                                                    ege0.l(fge0Var, list2, list3, r7, iz40Var3, iz40Var4, iz40Var, iz40Var2);
                                                    unit = Unit.f46060a;
                                                    iz40Var3.b();
                                                    rfk0.q(rfk0VarJ);
                                                    ios0Var.c();
                                                    Trace.endSection();
                                                    return unit;
                                                } catch (Throwable th4) {
                                                    iz40Var3.b();
                                                    throw th4;
                                                }
                                            }
                                        } else {
                                            c = 7;
                                            j = 128;
                                        }
                                        if (iz40Var4.h()) {
                                            try {
                                                objArr2 = iz40Var4.b;
                                                jArr2 = iz40Var4.f15620a;
                                                length2 = jArr2.length - 2;
                                                if (length2 >= 0) {
                                                    i5 = 0;
                                                    while (true) {
                                                        j3 = jArr2[i5];
                                                        objArr3 = objArr2;
                                                        jArr3 = jArr2;
                                                        if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            i6 = 8 - ((~(i5 - length2)) >>> 31);
                                                            while (i7 < i6) {
                                                                if ((j3 & 255) < j) {
                                                                    ((tld) objArr3[(i5 << 3) + i7]).m();
                                                                }
                                                                j3 >>= 8;
                                                                break;
                                                            }
                                                            if (i6 == 8) {
                                                            }
                                                        }
                                                        if (i5 != length2) {
                                                            i5++;
                                                            objArr2 = objArr3;
                                                            jArr2 = jArr3;
                                                        }
                                                    }
                                                }
                                                iz40Var4.b();
                                            } catch (Throwable th5) {
                                                try {
                                                    fge0Var.N(th5, null);
                                                    ege0.l(fge0Var, list2, list3, r7, iz40Var3, iz40Var4, iz40Var, iz40Var2);
                                                    unit = Unit.f46060a;
                                                    iz40Var4.b();
                                                    rfk0.q(rfk0VarJ);
                                                    ios0Var.c();
                                                    Trace.endSection();
                                                    return unit;
                                                } catch (Throwable th6) {
                                                    iz40Var4.b();
                                                    throw th6;
                                                }
                                            }
                                        }
                                        rfk0.q(rfk0VarJ);
                                        ios0Var.c();
                                        synchronized (fge0Var.c) {
                                            if (fge0Var.C() == null) {
                                                ykd.a("unexpected to get continuation here");
                                                break;
                                            }
                                        }
                                        xfk0.h().m();
                                        iz40Var2.b();
                                        iz40Var.b();
                                        fge0Var.q = null;
                                        Trace.endSection();
                                        return Unit.f46060a;
                                    } catch (Throwable th7) {
                                        try {
                                            fge0Var.N(th7, null);
                                            ege0.l(fge0Var, list2, list3, r7, iz40Var3, iz40Var4, iz40Var, iz40Var2);
                                            unit = Unit.f46060a;
                                            r7.clear();
                                            rfk0.q(rfk0VarJ);
                                            ios0Var.c();
                                            Trace.endSection();
                                            return unit;
                                        } catch (Throwable th8) {
                                            r7.clear();
                                            throw th8;
                                        }
                                    }
                                } catch (Throwable th9) {
                                    rfk0.q(rfk0VarJ);
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                ios0Var.c();
                                throw th10;
                            }
                        }
                        try {
                            int size3 = list2.size();
                            for (int i10 = 0; i10 < size3; i10++) {
                                tld tldVar = (tld) list2.get(i10);
                                tld tldVarM = fge0Var.M(tldVar, iz40Var);
                                if (tldVarM != null) {
                                    r7.add(tldVarM);
                                }
                                iz40Var2.a(tldVar);
                            }
                            list2.clear();
                            if (iz40Var.h() || fge0Var.i.c != 0) {
                                synchronized (fge0Var.c) {
                                    try {
                                        List listH = fge0Var.H();
                                        int size4 = listH.size();
                                        for (int i11 = 0; i11 < size4; i11++) {
                                            tld tldVar2 = (tld) listH.get(i11);
                                            if (!iz40Var2.c(tldVar2) && tldVar2.z(set)) {
                                                list2.add(tldVar2);
                                            }
                                        }
                                        xz40 xz40Var2 = fge0Var.i;
                                        int i12 = xz40Var2.c;
                                        int i13 = 0;
                                        int i14 = 0;
                                        while (true) {
                                            Object[] objArr5 = xz40Var2.f41739a;
                                            if (i13 < i12) {
                                                tld tldVar3 = (tld) objArr5[i13];
                                                if (!iz40Var2.c(tldVar3) && !list2.contains(tldVar3)) {
                                                    list2.add(tldVar3);
                                                    i14++;
                                                } else if (i14 > 0) {
                                                    Object[] objArr6 = xz40Var2.f41739a;
                                                    objArr6[i13 - i14] = objArr6[i13];
                                                }
                                                i13++;
                                            } else {
                                                int i15 = i12 - i14;
                                                Arrays.fill(objArr5, i15, i12, (Object) null);
                                                xz40Var2.c = i15;
                                            }
                                        }
                                    } catch (Throwable th11) {
                                        throw th11;
                                    }
                                }
                            }
                            if (list2.isEmpty()) {
                                try {
                                    ege0.m(list3, fge0Var);
                                    while (!list3.isEmpty()) {
                                        List listL = fge0Var.L(list3, iz40Var);
                                        iz40Var3.getClass();
                                        listL.getClass();
                                        Iterator it = listL.iterator();
                                        while (it.hasNext()) {
                                            iz40Var3.k(it.next());
                                        }
                                        ege0.m(list3, fge0Var);
                                    }
                                } catch (Throwable th12) {
                                    fge0Var.N(th12, null);
                                    ege0.l(fge0Var, list2, list3, r7, iz40Var3, iz40Var4, iz40Var, iz40Var2);
                                    unit = Unit.f46060a;
                                }
                            }
                            z2 = false;
                        } catch (Throwable th13) {
                            try {
                                fge0Var.N(th13, null);
                                ege0.l(fge0Var, list2, list3, r7, iz40Var3, iz40Var4, iz40Var, iz40Var2);
                                unit = Unit.f46060a;
                                list2.clear();
                            } catch (Throwable th14) {
                                list2.clear();
                                throw th14;
                            }
                        }
                        Trace.endSection();
                        return unit;
                    }
                } catch (Throwable th15) {
                    Trace.endSection();
                    throw th15;
                }
        }
    }

    public /* synthetic */ mk7(l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, l7m0 l7m0Var3, l7m0 l7m0Var4, l7m0 l7m0Var5, l7m0 l7m0Var6, l7m0 l7m0Var7, l7m0 l7m0Var8) {
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.j = function1;
        this.d = l7m0Var3;
        this.e = l7m0Var4;
        this.f = l7m0Var5;
        this.g = l7m0Var6;
        this.h = l7m0Var7;
        this.i = l7m0Var8;
    }
}
