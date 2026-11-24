package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zbk extends c8m0 implements l7m0 {
    public final Function0 b;
    public final igk0 c;
    public ybk d = new ybk(xfk0.h().g());

    public zbk(Function0 function0, igk0 igk0Var) {
        this.b = function0;
        this.c = igk0Var;
    }

    @Override // a.b8m0
    public final e8m0 g() {
        return this.d;
    }

    @Override // a.l7m0
    public final Object getValue() {
        Function1 function1E = xfk0.h().e();
        if (function1E != null) {
            function1E.invoke(this);
        }
        rfk0 rfk0VarH = xfk0.h();
        return l((ybk) xfk0.g(this.d, rfk0VarH), rfk0VarH, true, this.b).f;
    }

    @Override // a.b8m0
    public final void h(e8m0 e8m0Var) {
        this.d = (ybk) e8m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    public final ybk l(ybk ybkVar, rfk0 rfk0Var, boolean z, Function0 function0) {
        ybk ybkVar2;
        igk0 igk0Var;
        int i;
        if (ybkVar.c(this, rfk0Var)) {
            if (z) {
                xz40 xz40VarA = jgk0.a();
                Object[] objArr = xz40VarA.f41739a;
                int i2 = xz40VarA.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((eet) objArr[i3]).b();
                }
                try {
                    ry40 ry40Var = ybkVar.e;
                    nvu nvuVar = jgk0.f16485a;
                    nkx nkxVar = (nkx) nvuVar.w();
                    if (nkxVar == null) {
                        nkxVar = new nkx();
                        nvuVar.P(nkxVar);
                    }
                    int i4 = nkxVar.f23702a;
                    Object[] objArr2 = ry40Var.b;
                    int[] iArr = ry40Var.c;
                    long[] jArr = ry40Var.f31295a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        b8m0 b8m0Var = (b8m0) objArr2[i9];
                                        i = i6;
                                        nkxVar.f23702a = i4 + iArr[i9];
                                        Function1 function1E = rfk0Var.e();
                                        if (function1E != null) {
                                            function1E.invoke(b8m0Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    nkxVar.f23702a = i4;
                } finally {
                    Object[] objArr3 = xz40VarA.f41739a;
                    int i10 = xz40VarA.c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((eet) objArr3[i11]).a();
                    }
                }
            }
            return ybkVar;
        }
        ry40 ry40Var2 = new ry40();
        nvu nvuVar2 = jgk0.f16485a;
        nkx nkxVar2 = (nkx) nvuVar2.w();
        if (nkxVar2 == null) {
            nkxVar2 = new nkx();
            nvuVar2.P(nkxVar2);
        }
        int i12 = nkxVar2.f23702a;
        xz40 xz40VarA2 = jgk0.a();
        Object[] objArr4 = xz40VarA2.f41739a;
        int i13 = xz40VarA2.c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((eet) objArr4[i14]).b();
        }
        try {
            nkxVar2.f23702a = i12 + 1;
            Object objX = vdx.X(new ec3((Object) this, (Object) nkxVar2, (Object) ry40Var2, i12, (byte) 4), function0);
            nkxVar2.f23702a = i12;
            Object[] objArr5 = xz40VarA2.f41739a;
            int i15 = xz40VarA2.c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((eet) objArr5[i16]).a();
            }
            Object obj = xfk0.c;
            synchronized (obj) {
                try {
                    rfk0 rfk0VarH = xfk0.h();
                    Object obj2 = ybkVar.f;
                    if (obj2 == ybk.h || (igk0Var = this.c) == null || !igk0Var.g(objX, obj2)) {
                        ybk ybkVar3 = this.d;
                        synchronized (obj) {
                            e8m0 e8m0VarK = xfk0.k(ybkVar3, this);
                            e8m0VarK.a(ybkVar3);
                            e8m0VarK.f7381a = rfk0VarH.g();
                            ybkVar2 = (ybk) e8m0VarK;
                            ybkVar2.e = ry40Var2;
                            ybkVar2.g = ybkVar2.d(this, rfk0VarH);
                            ybkVar2.f = objX;
                        }
                        return ybkVar2;
                    }
                    ybkVar.e = ry40Var2;
                    ybkVar.g = ybkVar.d(this, rfk0VarH);
                    ybkVar2 = ybkVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            nkx nkxVar3 = (nkx) jgk0.f16485a.w();
            if (nkxVar3 == null || nkxVar3.f23702a != 0) {
                return ybkVar2;
            }
            xfk0.h().m();
            synchronized (obj) {
                rfk0 rfk0VarH2 = xfk0.h();
                ybkVar2.c = rfk0VarH2.g();
                ybkVar2.d = rfk0VarH2.h();
                return ybkVar2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = xz40VarA2.f41739a;
            int i17 = xz40VarA2.c;
            for (int i18 = 0; i18 < i17; i18++) {
                ((eet) objArr6[i18]).a();
            }
            throw th2;
        }
    }

    public final ybk m() {
        rfk0 rfk0VarH = xfk0.h();
        return l((ybk) xfk0.g(this.d, rfk0VarH), rfk0VarH, false, this.b);
    }

    public final String toString() {
        ybk ybkVar = (ybk) xfk0.f(this.d);
        return "DerivedState(value=" + (ybkVar.c(this, xfk0.h()) ? String.valueOf(ybkVar.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
