package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fj1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9615a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fj1(v360 v360Var, tnp0 tnp0Var, String str, long j, String str2) {
        this.f9615a = (byte) 4;
        this.c = v360Var;
        this.d = tnp0Var;
        this.e = str;
        this.b = j;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0402  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        uzb0 uzb0Var;
        fhl fhlVar;
        float f;
        fhl fhlVar2;
        float f2;
        byte b = this.f9615a;
        float f3 = 0.0f;
        char c = ' ';
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                bzt bztVar = (bzt) obj3;
                wyu wyuVar = (wyu) obj2;
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                hl1 hl1Var = ((pru) obj5).a().b;
                th1 th1Var = hl1Var.v;
                xun xunVar = xun.f41520a;
                String str = ((hgh0) obj4).f13018a;
                int iHashCode = str.hashCode();
                if (iHashCode != 216790902) {
                    if (iHashCode != 1347269356) {
                        if (iHashCode == 1392464108 && str.equals("alphabeticallyAsc")) {
                            uzb0Var = uzb0.b;
                        } else {
                            uzb0Var = uzb0.f36529a;
                        }
                    } else if (str.equals("byPopularity")) {
                        uzb0Var = uzb0.f36529a;
                    } else {
                        uzb0Var = uzb0.f36529a;
                    }
                } else if (str.equals("alphabeticallyDesc")) {
                    uzb0Var = uzb0.c;
                } else {
                    uzb0Var = uzb0.f36529a;
                }
                return new bj1(rhe.f30486a, th1Var, xunVar, xunVar, (uzb0) a8k0.H(vzg0Var, "SAVED_STATE_LAST_SORT_TYPE", uzb0Var), hl1Var.f13233a.k, ((CharSequence) a8k0.H(vzg0Var, "SEARCH_QUERY_KEY", "")).length() > 0, (String) a8k0.H(vzg0Var, "SEARCH_QUERY_KEY", ""), (String) a8k0.H(vzg0Var, "FILTER_QUERY_KEY", ""), this.b, bztVar.f3488a.a().r, !h97.A(wyuVar, uaq0.f35345a));
            case 1:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.w(1.0f);
                uag0Var.b(((Number) ((Function0) obj5).invoke()).floatValue());
                uag0Var.v(((Number) ((Function0) obj4).invoke()).floatValue());
                uag0Var.H(uag0Var.t.getDensity() * ((ycl) ((Function0) obj3).invoke()).f42389a);
                uag0Var.I(uag0Var.t.getDensity() * ((ycl) ((Function0) obj2).invoke()).f42389a);
                uag0Var.G(this.b);
                return Unit.f46060a;
            case 2:
                e6x e6xVar = (e6x) obj5;
                l7m0 l7m0Var = (l7m0) obj4;
                long j = this.b;
                l7m0 l7m0Var2 = (l7m0) obj3;
                l7m0 l7m0Var3 = (l7m0) obj2;
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                float fW0 = fhlVar3.w0(8.0f);
                ((fvt0) fhlVar3.A0().b).u(0.0f, fW0, 0.0f, fW0);
                try {
                    Iterator it = ((Iterable) l7m0Var.getValue()).iterator();
                    while (it.hasNext()) {
                        ovx ovxVar = (ovx) it.next();
                        long j2 = e6xVar.b;
                        Iterator it2 = it;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fhlVar3.w0(ovxVar.f25946a))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fhlVar3.w0(ovxVar.b))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar3.d() & 4294967295L)))) & 4294967295L);
                        l0q l0qVar = l0q.f19214a;
                        long j3 = j;
                        fhlVar = fhlVar3;
                        try {
                            fhl.o0(fhlVar, j2, jFloatToRawIntBits, jFloatToRawIntBits2, j3, l0qVar, 224);
                            try {
                                long j4 = e6xVar.f7308a;
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fhlVar.w0(((ycl) l7m0Var2.getValue()).f42389a))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                                float fW1 = fhlVar.w0(((ycl) l7m0Var3.getValue()).f42389a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                                fhlVar = fhlVar;
                                fhl.o0(fhlVar, j4, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), j3, l0qVar, 224);
                                it = it2;
                                fhlVar3 = fhlVar;
                                j = j3;
                            } catch (Throwable th) {
                                th = th;
                                fhlVar = fhlVar;
                                float f4 = -fW0;
                                ((fvt0) fhlVar.A0().b).u(-0.0f, f4, -0.0f, f4);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    float f5 = -fW0;
                    ((fvt0) fhlVar3.A0().b).u(-0.0f, f5, -0.0f, f5);
                    return Unit.f46060a;
                } catch (Throwable th3) {
                    th = th3;
                    fhlVar = fhlVar3;
                }
                break;
            case 3:
                f6x f6xVar = (f6x) obj5;
                l7m0 l7m0Var4 = (l7m0) obj4;
                long j5 = this.b;
                l7m0 l7m0Var5 = (l7m0) obj3;
                l7m0 l7m0Var6 = (l7m0) obj2;
                fhl fhlVar4 = (fhl) obj;
                fhlVar4.getClass();
                float fW2 = fhlVar4.w0(8.0f);
                ((fvt0) fhlVar4.A0().b).u(0.0f, fW2, 0.0f, fW2);
                try {
                    for (qvx qvxVar : (Iterable) l7m0Var4.getValue()) {
                        try {
                            long j6 = f6xVar.b;
                            float f6 = f3;
                            f2 = fW2;
                            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fhlVar4.w0(qvxVar.f29410a))) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                            try {
                                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fhlVar4.w0(qvxVar.b))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar4.d() & 4294967295L)))) & 4294967295L);
                                l0q l0qVar2 = l0q.f19214a;
                                long j7 = j5;
                                fhlVar2 = fhlVar4;
                                try {
                                    fhl.o0(fhlVar2, j6, jFloatToRawIntBits4, jFloatToRawIntBits5, j7, l0qVar2, 224);
                                    try {
                                        long j8 = f6xVar.f9033a;
                                        long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(fhlVar2.w0(((ycl) l7m0Var5.getValue()).f42389a))) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
                                        float fW3 = fhlVar2.w0(((ycl) l7m0Var6.getValue()).f42389a);
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L));
                                        fhlVar2 = fhlVar2;
                                        fhl.o0(fhlVar2, j8, jFloatToRawIntBits6, (((long) Float.floatToRawIntBits(fW3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), j7, l0qVar2, 224);
                                        fW2 = f2;
                                        f3 = f6;
                                        fhlVar4 = fhlVar2;
                                        j5 = j7;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fhlVar2 = fhlVar2;
                                        f = f2;
                                        float f7 = -f;
                                        ((fvt0) fhlVar2.A0().b).u(-0.0f, f7, -0.0f, f7);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                fhlVar2 = fhlVar4;
                                f = f2;
                                float f8 = -f;
                                ((fvt0) fhlVar2.A0().b).u(-0.0f, f8, -0.0f, f8);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            f2 = fW2;
                        }
                        break;
                    }
                    float f9 = -fW2;
                    ((fvt0) fhlVar4.A0().b).u(-0.0f, f9, -0.0f, f9);
                    return Unit.f46060a;
                } catch (Throwable th8) {
                    th = th8;
                    f = fW2;
                    fhlVar2 = fhlVar4;
                }
                break;
            case 4:
                tnp0 tnp0Var = (tnp0) obj4;
                String str2 = (String) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(((v360) obj5).U.a(tnp0Var.a(), tnp0Var, (String) obj3, tnp0Var.c(), this.b, str2));
                return Unit.f46060a;
            default:
                pz40 pz40Var = (pz40) obj5;
                a4x a4xVar = (a4x) obj3;
                a4x a4xVar2 = (a4x) obj2;
                long j9 = this.b;
                fhl fhlVar5 = (fhl) obj;
                fhlVar5.getClass();
                pz40Var.setValue(new ne60((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar5.d() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar5.d() >> 32)) / 2.0f)) << 32)));
                int i = 0;
                for (Object obj6 : (a4x) obj4) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    float fFloatValue = ((Number) ((l7m0) a4xVar.get(i)).getValue()).floatValue() * (Float.intBitsToFloat((int) (fhlVar5.d() >> c)) / 2.0f);
                    float fFloatValue2 = ((Number) ((l7m0) obj6).getValue()).floatValue();
                    long jE0 = fhlVar5.E0();
                    nr nrVarA0 = fhlVar5.A0();
                    char c2 = c;
                    a4x a4xVar3 = a4xVar2;
                    long jP = nrVarA0.p();
                    nrVarA0.i().l();
                    try {
                        ((fvt0) nrVarA0.b).z(fFloatValue2, fFloatValue2, jE0);
                        long j10 = j9;
                        fhl.E(fhlVar5, j10, fFloatValue, ((ne60) pz40Var.getValue()).f23370a, ((Number) ((l7m0) a4xVar3.get(i)).getValue()).floatValue(), new vtm0(fhlVar5.w0(1.0f), 0.0f, 0, 0, null, 30), 96);
                        defpackage.c.g(nrVarA0, jP);
                        a4xVar2 = a4xVar3;
                        i = i2;
                        j9 = j10;
                        c = c2;
                    } catch (Throwable th9) {
                        defpackage.c.g(nrVarA0, jP);
                        throw th9;
                    }
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ fj1(byte b, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f9615a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = j;
    }

    public /* synthetic */ fj1(Object obj, l7m0 l7m0Var, long j, l7m0 l7m0Var2, l7m0 l7m0Var3, byte b) {
        this.f9615a = b;
        this.c = obj;
        this.d = l7m0Var;
        this.b = j;
        this.e = l7m0Var2;
        this.f = l7m0Var3;
    }
}
