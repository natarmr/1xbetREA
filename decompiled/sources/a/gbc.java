package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gbc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11010a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gbc(boolean z, long j) {
        this.f11010a = (byte) 1;
        this.b = j;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11010a;
        long background = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                yai0.f(abi0Var, z);
                cbi0.a(abi0Var, background);
                return Unit.f46060a;
            case 1:
                lno lnoVar = (lno) obj;
                lnoVar.getClass();
                return new lno(xp20.k(lnoVar.f20356a, new Pair(Long.valueOf(background), Boolean.valueOf(z))), true);
            case 2:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                zcl zclVar = qmk.f28987a;
                final float density = pi9Var.getDensity() * 1.0f;
                float density2 = pi9Var.getDensity() * 24.0f;
                float density3 = pi9Var.getDensity() * 5.0f;
                final float density4 = density2 - ((pi9Var.getDensity() * 4.0f) * 2.0f);
                final float fIntBitsToFloat = z ? Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) : 0.0f;
                final float density5 = (pi9Var.getDensity() * 4.0f) + (pi9Var.getDensity() * 4.0f) + (pi9Var.getDensity() * 18.0f);
                final float f = density5 + density3 + density2;
                float density6 = pi9Var.getDensity() * 360.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(density6)) << 32) | (((long) Float.floatToRawIntBits(density6)) & 4294967295L);
                final byte b2 = 0;
                final long j = this.b;
                return pi9Var.b(new Function1() { // from class: a.etq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b3 = b2;
                        float f2 = f;
                        float f3 = density4;
                        float f4 = density;
                        float f5 = density5;
                        float f6 = fIntBitsToFloat;
                        switch (b3) {
                            case 0:
                                g7z g7zVar = (g7z) obj2;
                                g7zVar.getClass();
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                long j2 = j;
                                long j3 = jFloatToRawIntBits;
                                fhl.o0(g7zVar, j2, jFloatToRawIntBits2, jFloatToRawIntBits3, j3, null, 240);
                                fhl.o0(g7zVar, j2, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), j3, null, 240);
                                g7zVar.a();
                                break;
                            case 1:
                                g7z g7zVar2 = (g7z) obj2;
                                g7zVar2.getClass();
                                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                long j4 = j;
                                long j5 = jFloatToRawIntBits;
                                fhl.o0(g7zVar2, j4, jFloatToRawIntBits4, jFloatToRawIntBits5, j5, null, 240);
                                fhl.o0(g7zVar2, j4, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), j5, null, 240);
                                g7zVar2.a();
                                break;
                            case 2:
                                g7z g7zVar3 = (g7z) obj2;
                                g7zVar3.getClass();
                                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                long j6 = j;
                                long j7 = jFloatToRawIntBits;
                                fhl.o0(g7zVar3, j6, jFloatToRawIntBits6, jFloatToRawIntBits7, j7, null, 240);
                                fhl.o0(g7zVar3, j6, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), j7, null, 240);
                                g7zVar3.a();
                                break;
                            default:
                                g7z g7zVar4 = (g7z) obj2;
                                g7zVar4.getClass();
                                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
                                long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                long j8 = j;
                                long j9 = jFloatToRawIntBits;
                                fhl.o0(g7zVar4, j8, jFloatToRawIntBits8, jFloatToRawIntBits9, j9, null, 240);
                                fhl.o0(g7zVar4, j8, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), j9, null, 240);
                                g7zVar4.a();
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 3:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                zcl zclVar2 = qmk.f28987a;
                final float density7 = pi9Var2.getDensity() * 1.0f;
                float density8 = pi9Var2.getDensity() * 32.0f;
                float density9 = pi9Var2.getDensity() * 17.0f;
                float density10 = pi9Var2.getDensity() * 4.0f;
                final float f2 = density8 - (2.0f * density10);
                final float fIntBitsToFloat2 = z ? Float.intBitsToFloat((int) (pi9Var2.f27033a.d() >> 32)) : 0.0f;
                final float density11 = (pi9Var2.getDensity() * 8.0f) + (pi9Var2.getDensity() * 22.0f) + density10;
                final float f3 = density11 + density9 + density8;
                float density12 = pi9Var2.getDensity() * 360.0f;
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(density12)) << 32) | (((long) Float.floatToRawIntBits(density12)) & 4294967295L);
                final byte b3 = 1;
                final long j2 = this.b;
                return pi9Var2.b(new Function1() { // from class: a.etq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = b3;
                        float f4 = f3;
                        float f5 = f2;
                        float f6 = density7;
                        float f7 = density11;
                        float f8 = fIntBitsToFloat2;
                        switch (b4) {
                            case 0:
                                g7z g7zVar = (g7z) obj2;
                                g7zVar.getClass();
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                                long j3 = j2;
                                long j4 = jFloatToRawIntBits2;
                                fhl.o0(g7zVar, j3, jFloatToRawIntBits3, jFloatToRawIntBits4, j4, null, 240);
                                fhl.o0(g7zVar, j3, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), j4, null, 240);
                                g7zVar.a();
                                break;
                            case 1:
                                g7z g7zVar2 = (g7z) obj2;
                                g7zVar2.getClass();
                                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                                long j5 = j2;
                                long j6 = jFloatToRawIntBits2;
                                fhl.o0(g7zVar2, j5, jFloatToRawIntBits5, jFloatToRawIntBits6, j6, null, 240);
                                fhl.o0(g7zVar2, j5, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), j6, null, 240);
                                g7zVar2.a();
                                break;
                            case 2:
                                g7z g7zVar3 = (g7z) obj2;
                                g7zVar3.getClass();
                                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                                long j7 = j2;
                                long j8 = jFloatToRawIntBits2;
                                fhl.o0(g7zVar3, j7, jFloatToRawIntBits7, jFloatToRawIntBits8, j8, null, 240);
                                fhl.o0(g7zVar3, j7, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), j8, null, 240);
                                g7zVar3.a();
                                break;
                            default:
                                g7z g7zVar4 = (g7z) obj2;
                                g7zVar4.getClass();
                                long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
                                long jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                                long j9 = j2;
                                long j10 = jFloatToRawIntBits2;
                                fhl.o0(g7zVar4, j9, jFloatToRawIntBits9, jFloatToRawIntBits10, j10, null, 240);
                                fhl.o0(g7zVar4, j9, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), j10, null, 240);
                                g7zVar4.a();
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            case 4:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                if (!z) {
                    pz40 pz40Var = s6t0.f31722a;
                    background = s6t0.b().f33626a.getBackground();
                }
                long j3 = background;
                zcl zclVar3 = qmk.f28987a;
                float fW0 = fhlVar.w0(16.0f);
                fhl.o0(fhlVar, j3, 0L, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 5:
                pi9 pi9Var3 = (pi9) obj;
                pi9Var3.getClass();
                zcl zclVar4 = qmk.f28987a;
                final float density13 = pi9Var3.getDensity() * 1.0f;
                float density14 = pi9Var3.getDensity() * 32.0f;
                float density15 = pi9Var3.getDensity() * 17.0f;
                float density16 = pi9Var3.getDensity() * 4.0f;
                final float f4 = density14 - (2.0f * density16);
                final float fIntBitsToFloat3 = z ? Float.intBitsToFloat((int) (pi9Var3.f27033a.d() >> 32)) : 0.0f;
                final float density17 = (pi9Var3.getDensity() * 8.0f) + (pi9Var3.getDensity() * 22.0f) + density16;
                final float f5 = density17 + density15 + density14;
                float density18 = pi9Var3.getDensity() * 360.0f;
                final long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(density18)) << 32) | (((long) Float.floatToRawIntBits(density18)) & 4294967295L);
                final byte b4 = 2;
                final long j4 = this.b;
                return pi9Var3.b(new Function1() { // from class: a.etq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b4;
                        float f6 = f5;
                        float f7 = f4;
                        float f8 = density13;
                        float f9 = density17;
                        float f10 = fIntBitsToFloat3;
                        switch (b5) {
                            case 0:
                                g7z g7zVar = (g7z) obj2;
                                g7zVar.getClass();
                                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                                long j5 = j4;
                                long j6 = jFloatToRawIntBits3;
                                fhl.o0(g7zVar, j5, jFloatToRawIntBits4, jFloatToRawIntBits5, j6, null, 240);
                                fhl.o0(g7zVar, j5, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), j6, null, 240);
                                g7zVar.a();
                                break;
                            case 1:
                                g7z g7zVar2 = (g7z) obj2;
                                g7zVar2.getClass();
                                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                                long j7 = j4;
                                long j8 = jFloatToRawIntBits3;
                                fhl.o0(g7zVar2, j7, jFloatToRawIntBits6, jFloatToRawIntBits7, j8, null, 240);
                                fhl.o0(g7zVar2, j7, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), j8, null, 240);
                                g7zVar2.a();
                                break;
                            case 2:
                                g7z g7zVar3 = (g7z) obj2;
                                g7zVar3.getClass();
                                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                                long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                                long j9 = j4;
                                long j10 = jFloatToRawIntBits3;
                                fhl.o0(g7zVar3, j9, jFloatToRawIntBits8, jFloatToRawIntBits9, j10, null, 240);
                                fhl.o0(g7zVar3, j9, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), j10, null, 240);
                                g7zVar3.a();
                                break;
                            default:
                                g7z g7zVar4 = (g7z) obj2;
                                g7zVar4.getClass();
                                long jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
                                long jFloatToRawIntBits11 = (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                                long j11 = j4;
                                long j12 = jFloatToRawIntBits3;
                                fhl.o0(g7zVar4, j11, jFloatToRawIntBits10, jFloatToRawIntBits11, j12, null, 240);
                                fhl.o0(g7zVar4, j11, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), j12, null, 240);
                                g7zVar4.a();
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            default:
                pi9 pi9Var4 = (pi9) obj;
                pi9Var4.getClass();
                zcl zclVar5 = qmk.f28987a;
                final float density19 = pi9Var4.getDensity() * 1.0f;
                float density20 = pi9Var4.getDensity() * 24.0f;
                float density21 = pi9Var4.getDensity() * 5.0f;
                final float density22 = density20 - ((pi9Var4.getDensity() * 4.0f) * 2.0f);
                final float fIntBitsToFloat4 = z ? Float.intBitsToFloat((int) (pi9Var4.f27033a.d() >> 32)) : 0.0f;
                final float density23 = (pi9Var4.getDensity() * 4.0f) + (pi9Var4.getDensity() * 4.0f) + (pi9Var4.getDensity() * 18.0f);
                final float f6 = density23 + density21 + density20;
                float density24 = pi9Var4.getDensity() * 360.0f;
                final long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(density24)) << 32) | (((long) Float.floatToRawIntBits(density24)) & 4294967295L);
                final byte b5 = 3;
                final long j5 = this.b;
                return pi9Var4.b(new Function1() { // from class: a.etq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b6 = b5;
                        float f7 = f6;
                        float f8 = density22;
                        float f9 = density19;
                        float f10 = density23;
                        float f11 = fIntBitsToFloat4;
                        switch (b6) {
                            case 0:
                                g7z g7zVar = (g7z) obj2;
                                g7zVar.getClass();
                                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L);
                                long j6 = j5;
                                long j7 = jFloatToRawIntBits4;
                                fhl.o0(g7zVar, j6, jFloatToRawIntBits5, jFloatToRawIntBits6, j7, null, 240);
                                fhl.o0(g7zVar, j6, (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), j7, null, 240);
                                g7zVar.a();
                                break;
                            case 1:
                                g7z g7zVar2 = (g7z) obj2;
                                g7zVar2.getClass();
                                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L);
                                long j8 = j5;
                                long j9 = jFloatToRawIntBits4;
                                fhl.o0(g7zVar2, j8, jFloatToRawIntBits7, jFloatToRawIntBits8, j9, null, 240);
                                fhl.o0(g7zVar2, j8, (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), j9, null, 240);
                                g7zVar2.a();
                                break;
                            case 2:
                                g7z g7zVar3 = (g7z) obj2;
                                g7zVar3.getClass();
                                long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                                long jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L);
                                long j10 = j5;
                                long j11 = jFloatToRawIntBits4;
                                fhl.o0(g7zVar3, j10, jFloatToRawIntBits9, jFloatToRawIntBits10, j11, null, 240);
                                fhl.o0(g7zVar3, j10, (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), j11, null, 240);
                                g7zVar3.a();
                                break;
                            default:
                                g7z g7zVar4 = (g7z) obj2;
                                g7zVar4.getClass();
                                long jFloatToRawIntBits11 = (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
                                long jFloatToRawIntBits12 = (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L);
                                long j12 = j5;
                                long j13 = jFloatToRawIntBits4;
                                fhl.o0(g7zVar4, j12, jFloatToRawIntBits11, jFloatToRawIntBits12, j13, null, 240);
                                fhl.o0(g7zVar4, j12, (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), j13, null, 240);
                                g7zVar4.a();
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
        }
    }

    public /* synthetic */ gbc(boolean z, long j, byte b) {
        this.f11010a = b;
        this.c = z;
        this.b = j;
    }
}
