package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nme implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23767a;
    public final /* synthetic */ long b;

    public /* synthetic */ nme(byte b, long j) {
        this.f23767a = b;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23767a;
        int i = 0;
        long j = this.b;
        switch (b) {
            case 0:
                ((abi0) obj).b(h5i0.f12481a, new g5i0(blv.f2811a, this.b, f5i0.b, true));
                return Unit.f46060a;
            case 1:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.a(abi0Var, j);
                return Unit.f46060a;
            case 2:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.b(String.valueOf(j));
                n1gVar.e = new lq2();
                n1gVar.f = l1g.BET_EVENT;
                return Unit.f46060a;
            case 3:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(16.0f);
                fhl.o0(fhlVar, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 4:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                zcl zclVar2 = qmk.f28987a;
                float fW1 = fhlVar2.w0(16.0f);
                fhl.o0(fhlVar2, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fW1)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 5:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                zcl zclVar3 = qmk.f28987a;
                float fW2 = fhlVar3.w0(16.0f);
                fhl.o0(fhlVar3, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 6:
                fhl fhlVar4 = (fhl) obj;
                fhlVar4.getClass();
                zcl zclVar4 = qmk.f28987a;
                float fW3 = fhlVar4.w0(10.0f);
                fhl.o0(fhlVar4, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW3)) << 32) | (((long) Float.floatToRawIntBits(fW3)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 7:
                fhl fhlVar5 = (fhl) obj;
                fhlVar5.getClass();
                zcl zclVar5 = qmk.f28987a;
                float fW4 = fhlVar5.w0(10.0f);
                fhl.o0(fhlVar5, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW4)) << 32) | (((long) Float.floatToRawIntBits(fW4)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 8:
                fhl fhlVar6 = (fhl) obj;
                fhlVar6.getClass();
                zcl zclVar6 = qmk.f28987a;
                float fW5 = fhlVar6.w0(10.0f);
                fhl.o0(fhlVar6, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW5)) << 32) | (((long) Float.floatToRawIntBits(fW5)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 9:
                fhl fhlVar7 = (fhl) obj;
                fhlVar7.getClass();
                zcl zclVar7 = qmk.f28987a;
                float fW6 = fhlVar7.w0(1.0f);
                fhl.E(fhlVar7, this.b, (h7k0.d(fhlVar7.d()) - fW6) / 2.0f, fhlVar7.E0(), 0.0f, new vtm0(fW6, 0.0f, 0, 0, null, 30), 104);
                return Unit.f46060a;
            case 10:
                fhl fhlVar8 = (fhl) obj;
                fhlVar8.getClass();
                zcl zclVar8 = qmk.f28987a;
                float fW7 = fhlVar8.w0(4.0f);
                float fW8 = fhlVar8.w0(4.0f);
                float fW9 = fhlVar8.w0(2.0f);
                float fW10 = fhlVar8.w0(1.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar8.d() & 4294967295L)) / 2.0f;
                x03 x03VarK = qjj.K(0.0f, new float[]{fW7, fW8});
                w03 w03VarA = z03.a();
                w03VarA.f(fW9 + fW8, fIntBitsToFloat);
                w03VarA.e((Float.intBitsToFloat((int) (fhlVar8.d() >> 32)) - fW9) - fW8, fIntBitsToFloat);
                vtm0 vtm0Var = new vtm0(fW10, 0.0f, 1, 0, x03VarK, 10);
                long j2 = this.b;
                fhl.C0(fhlVar8, w03VarA, j2, 0.0f, vtm0Var, 52);
                w03 w03VarA2 = z03.a();
                w03VarA2.f(0.0f, fIntBitsToFloat);
                w03VarA2.e(fW9, fIntBitsToFloat);
                fhl.C0(fhlVar8, w03VarA2, j2, 0.0f, new vtm0(fW10, 0.0f, 1, 0, null, 26), 52);
                w03 w03VarA3 = z03.a();
                w03VarA3.f(Float.intBitsToFloat((int) (fhlVar8.d() >> 32)) - fW9, fIntBitsToFloat);
                w03VarA3.e(Float.intBitsToFloat((int) (fhlVar8.d() >> 32)), fIntBitsToFloat);
                fhl.C0(fhlVar8, w03VarA3, j2, 0.0f, new vtm0(fW10, 0.0f, 1, 0, null, 26), 52);
                return Unit.f46060a;
            case 11:
                long j3 = ((daq0) obj).f5764a;
                idm0.n(j3, j);
                return Boolean.valueOf(Float.compare(daq0.c(j3), daq0.c(j)) >= 0);
            case 12:
                fhl fhlVar9 = (fhl) obj;
                fhlVar9.getClass();
                zcl zclVar9 = qmk.f28987a;
                float fW11 = fhlVar9.w0(12.0f);
                fhl.o0(fhlVar9, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW11)) << 32) | (((long) Float.floatToRawIntBits(fW11)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 13:
                fhl fhlVar10 = (fhl) obj;
                fhlVar10.getClass();
                w03 w03VarA4 = z03.a();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar10.d() & 4294967295L)) / 2.0f;
                int iCeil = (int) Math.ceil(Float.intBitsToFloat((int) (fhlVar10.d() >> 32)) / 10.0f);
                while (i < iCeil) {
                    float f = i * 10.0f;
                    w03VarA4.f(f, fIntBitsToFloat2);
                    float f2 = f + 5.0f;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fhlVar10.d() >> 32));
                    if (f2 > fIntBitsToFloat3) {
                        f2 = fIntBitsToFloat3;
                    }
                    w03VarA4.e(f2, fIntBitsToFloat2);
                    i++;
                }
                fhl.C0(fhlVar10, w03VarA4, this.b, 0.0f, new vtm0(Float.intBitsToFloat((int) (fhlVar10.d() & 4294967295L)), 0.0f, 0, 0, null, 26), 52);
                return Unit.f46060a;
            case 14:
                fhl fhlVar11 = (fhl) obj;
                fhlVar11.getClass();
                w03 w03VarA5 = z03.a();
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fhlVar11.d() >> 32)) / 2.0f;
                int iCeil2 = (int) Math.ceil(Float.intBitsToFloat((int) (fhlVar11.d() & 4294967295L)) / 20.0f);
                while (i < iCeil2) {
                    float f3 = i * 20.0f;
                    w03VarA5.f(fIntBitsToFloat4, f3);
                    float f4 = f3 + 8.0f;
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (fhlVar11.d() & 4294967295L));
                    if (f4 > fIntBitsToFloat5) {
                        f4 = fIntBitsToFloat5;
                    }
                    w03VarA5.e(fIntBitsToFloat4, f4);
                    i++;
                }
                fhl.C0(fhlVar11, w03VarA5, this.b, 0.0f, new vtm0(Float.intBitsToFloat((int) (fhlVar11.d() >> 32)), 0.0f, 1, 0, null, 26), 52);
                return Unit.f46060a;
            case 15:
                fhl fhlVar12 = (fhl) obj;
                fhlVar12.getClass();
                w03 w03VarA6 = z03.a();
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (fhlVar12.d() >> 32)) / 2.0f;
                int iCeil3 = (int) Math.ceil(Float.intBitsToFloat((int) (fhlVar12.d() & 4294967295L)) / 20.0f);
                while (i < iCeil3) {
                    float f5 = i * 20.0f;
                    w03VarA6.f(fIntBitsToFloat6, f5);
                    float f6 = f5 + 8.0f;
                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (fhlVar12.d() & 4294967295L));
                    if (f6 > fIntBitsToFloat7) {
                        f6 = fIntBitsToFloat7;
                    }
                    w03VarA6.e(fIntBitsToFloat6, f6);
                    i++;
                }
                fhl.C0(fhlVar12, w03VarA6, this.b, 0.0f, new vtm0(Float.intBitsToFloat((int) (fhlVar12.d() >> 32)), 0.0f, 1, 0, null, 26), 52);
                return Unit.f46060a;
            case 16:
                fhl fhlVar13 = (fhl) obj;
                fhlVar13.getClass();
                zcl zclVar10 = qmk.f28987a;
                float fW12 = fhlVar13.w0(16.0f);
                fhl.o0(fhlVar13, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW12)) << 32) | (((long) Float.floatToRawIntBits(fW12)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 17:
                fhl fhlVar14 = (fhl) obj;
                fhlVar14.getClass();
                zcl zclVar11 = qmk.f28987a;
                float fW13 = fhlVar14.w0(10.0f);
                fhl.o0(fhlVar14, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW13)) << 32) | (((long) Float.floatToRawIntBits(fW13)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 18:
                fhl fhlVar15 = (fhl) obj;
                fhlVar15.getClass();
                zcl zclVar12 = qmk.f28987a;
                float fW14 = fhlVar15.w0(360.0f);
                fhl.o0(fhlVar15, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW14)) << 32) | (((long) Float.floatToRawIntBits(fW14)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fhl fhlVar16 = (fhl) obj;
                fhlVar16.getClass();
                fhl.E(fhlVar16, this.b, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            case 20:
                fhl fhlVar17 = (fhl) obj;
                fhlVar17.getClass();
                fhl.E(fhlVar17, this.b, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            case 21:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                cbi0.f(abi0Var2, j);
                return Unit.f46060a;
            case 22:
                abi0 abi0Var3 = (abi0) obj;
                abi0Var3.getClass();
                cbi0.a(abi0Var3, j);
                return Unit.f46060a;
            case 23:
                fhl fhlVar18 = (fhl) obj;
                fhlVar18.getClass();
                long jD = fhlVar18.d();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fhlVar18.w0(8.0f))) << 32) | (((long) Float.floatToRawIntBits(fhlVar18.w0(8.0f))) & 4294967295L);
                zcl zclVar13 = qmk.f28987a;
                fhl.o0(fhlVar18, this.b, 0L, jD, jFloatToRawIntBits, new vtm0(fhlVar18.w0(1.0f), 0.0f, 0, 0, null, 30), 224);
                return Unit.f46060a;
            case 24:
                fhl fhlVar19 = (fhl) obj;
                fhlVar19.getClass();
                zcl zclVar14 = qmk.f28987a;
                float fW15 = fhlVar19.w0(16.0f);
                fhl.o0(fhlVar19, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW15)) << 32) | (((long) Float.floatToRawIntBits(fW15)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Long.valueOf(j);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fhl fhlVar20 = (fhl) obj;
                fhlVar20.getClass();
                zcl zclVar15 = qmk.f28987a;
                float fW16 = fhlVar20.w0(10.0f);
                fhl.o0(fhlVar20, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW16)) << 32) | (((long) Float.floatToRawIntBits(fW16)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fhl fhlVar21 = (fhl) obj;
                fhlVar21.getClass();
                zcl zclVar16 = qmk.f28987a;
                float fW17 = fhlVar21.w0(16.0f);
                fhl.o0(fhlVar21, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW17)) << 32) | (((long) Float.floatToRawIntBits(fW17)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fhl fhlVar22 = (fhl) obj;
                fhlVar22.getClass();
                zcl zclVar17 = qmk.f28987a;
                float fW18 = fhlVar22.w0(16.0f);
                fhl.o0(fhlVar22, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW18)) << 32) | (((long) Float.floatToRawIntBits(fW18)) & 4294967295L), null, 246);
                return Unit.f46060a;
            default:
                fhl fhlVar23 = (fhl) obj;
                fhlVar23.getClass();
                zcl zclVar18 = qmk.f28987a;
                float fW19 = fhlVar23.w0(16.0f);
                fhl.o0(fhlVar23, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW19)) << 32) | (((long) Float.floatToRawIntBits(fW19)) & 4294967295L), null, 246);
                return Unit.f46060a;
        }
    }
}
