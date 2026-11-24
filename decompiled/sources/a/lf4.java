package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lf4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19935a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ lf4(byte b, long j, long j2) {
        this.f19935a = b;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19935a) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.u(fhlVar, this.b, this.c, fhlVar.d(), 0.0f, null, null, 0, 120);
                return Unit.f46060a;
            case 1:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar2, s6t0.b().f33626a.getBackground(), this.b, this.c, 0.0f, null, null, 0, 120);
                return Unit.f46060a;
            case 2:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.u(fhlVar3, s6t0.b().f33626a.getBackground(), this.b, this.c, 0.0f, null, null, 0, 120);
                return Unit.f46060a;
            case 3:
                fhl fhlVar4 = (fhl) obj;
                fhlVar4.getClass();
                fhl.o0(fhlVar4, this.b, 0L, 0L, this.c, null, 246);
                return Unit.f46060a;
            case 4:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                final w03 w03VarA = z03.a();
                w03.b(w03VarA, r8x.u(k9x.r(0L, pi9Var.f27033a.d()), xvw.F(pi9Var, 20.0f), xvw.F(pi9Var, 20.0f), xvw.F(pi9Var, 0.0f), xvw.F(pi9Var, 0.0f)));
                zcl zclVar = qmk.f28987a;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(pi9Var.getDensity() * 36.0f)) << 32) | (((long) Float.floatToRawIntBits(pi9Var.getDensity() * 4.0f)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) / 2.0f) - (pi9Var.getDensity() * 18.0f))) << 32) | (((long) Float.floatToRawIntBits(pi9Var.getDensity() * 8.0f)) & 4294967295L);
                final long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(360.0f)) << 32) | (((long) Float.floatToRawIntBits(360.0f)) & 4294967295L);
                final byte b = 1;
                final long j = this.b;
                final long j2 = this.c;
                return pi9Var.a(new Function1() { // from class: a.om40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (b) {
                            case 0:
                                fhl fhlVar5 = (fhl) obj2;
                                fhlVar5.getClass();
                                fhl.C0(fhlVar5, w03VarA, j, 0.0f, null, 60);
                                fhl.o0(fhlVar5, j2, jFloatToRawIntBits2, jFloatToRawIntBits, jFloatToRawIntBits3, null, 240);
                                break;
                            default:
                                fhl fhlVar6 = (fhl) obj2;
                                fhlVar6.getClass();
                                fhl.C0(fhlVar6, w03VarA, j, 0.0f, null, 60);
                                fhl.o0(fhlVar6, j2, jFloatToRawIntBits2, jFloatToRawIntBits, jFloatToRawIntBits3, null, 240);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 5:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                final w03 w03VarA2 = z03.a();
                w03.b(w03VarA2, r8x.u(k9x.r(0L, pi9Var2.f27033a.d()), xww.D(pi9Var2, 20.0f), xww.D(pi9Var2, 20.0f), xww.D(pi9Var2, 0.0f), xww.D(pi9Var2, 0.0f)));
                zcl zclVar2 = qmk.f28987a;
                final long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(pi9Var2.getDensity() * 36.0f)) << 32) | (((long) Float.floatToRawIntBits(pi9Var2.getDensity() * 4.0f)) & 4294967295L);
                final long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (pi9Var2.f27033a.d() >> 32)) / 2.0f) - (pi9Var2.getDensity() * 18.0f))) << 32) | (((long) Float.floatToRawIntBits(pi9Var2.getDensity() * 8.0f)) & 4294967295L);
                final long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(360.0f)) << 32) | (((long) Float.floatToRawIntBits(360.0f)) & 4294967295L);
                final byte b2 = 0;
                final long j3 = this.b;
                final long j4 = this.c;
                return pi9Var2.a(new Function1() { // from class: a.om40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (b2) {
                            case 0:
                                fhl fhlVar5 = (fhl) obj2;
                                fhlVar5.getClass();
                                fhl.C0(fhlVar5, w03VarA2, j3, 0.0f, null, 60);
                                fhl.o0(fhlVar5, j4, jFloatToRawIntBits5, jFloatToRawIntBits4, jFloatToRawIntBits6, null, 240);
                                break;
                            default:
                                fhl fhlVar6 = (fhl) obj2;
                                fhlVar6.getClass();
                                fhl.C0(fhlVar6, w03VarA2, j3, 0.0f, null, 60);
                                fhl.o0(fhlVar6, j4, jFloatToRawIntBits5, jFloatToRawIntBits4, jFloatToRawIntBits6, null, 240);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 6:
                fhl fhlVar5 = (fhl) obj;
                fhlVar5.getClass();
                fhl.o0(fhlVar5, this.b, 0L, 0L, this.c, null, 246);
                return Unit.f46060a;
            case 7:
                fhl fhlVar6 = (fhl) obj;
                fhlVar6.getClass();
                fhl.o0(fhlVar6, this.b, 0L, 0L, this.c, null, 246);
                return Unit.f46060a;
            case 8:
                n1g n1gVar = (n1g) obj;
                n1gVar.b(String.valueOf(this.b));
                n1gVar.c = this.c;
                n1gVar.e = new mr2();
                n1gVar.d = j1g.REAL;
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_REGULAR;
                return Unit.f46060a;
            case 9:
                fhl fhlVar7 = (fhl) obj;
                fhlVar7.getClass();
                zcl zclVar3 = qmk.f28987a;
                float fW0 = fhlVar7.w0(8.0f);
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                fhl.o0(fhlVar7, this.b, 0L, fhlVar7.d(), jFloatToRawIntBits7, null, 242);
                float fW1 = fhlVar7.w0(1.0f);
                float f = fW1 / 2.0f;
                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar7.d() >> 32)) - fW1;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar7.d() & 4294967295L)) - fW1;
                long jFloatToRawIntBits9 = Float.floatToRawIntBits(fIntBitsToFloat);
                long jFloatToRawIntBits10 = Float.floatToRawIntBits(fIntBitsToFloat2);
                fhl.o0(fhlVar7, this.c, jFloatToRawIntBits8, (jFloatToRawIntBits9 << 32) | (jFloatToRawIntBits10 & 4294967295L), jFloatToRawIntBits7, new vtm0(fW1, 0.0f, 0, 0, null, 30), 224);
                return Unit.f46060a;
            default:
                fhl fhlVar8 = (fhl) obj;
                fhlVar8.getClass();
                zcl zclVar4 = qmk.f28987a;
                float fW2 = fhlVar8.w0(14.0f);
                long jFloatToRawIntBits11 = (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L);
                fhl.o0(fhlVar8, this.b, 0L, fhlVar8.d(), jFloatToRawIntBits11, null, 242);
                float fW3 = fhlVar8.w0(1.0f);
                float f2 = fW3 / 2.0f;
                long jFloatToRawIntBits12 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fhlVar8.d() >> 32)) - fW3;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fhlVar8.d() & 4294967295L)) - fW3;
                long jFloatToRawIntBits13 = Float.floatToRawIntBits(fIntBitsToFloat3);
                long jFloatToRawIntBits14 = Float.floatToRawIntBits(fIntBitsToFloat4);
                fhl.o0(fhlVar8, this.c, jFloatToRawIntBits12, (jFloatToRawIntBits13 << 32) | (jFloatToRawIntBits14 & 4294967295L), jFloatToRawIntBits11, new vtm0(fW3, 0.0f, 0, 0, null, 30), 224);
                return Unit.f46060a;
        }
    }
}
