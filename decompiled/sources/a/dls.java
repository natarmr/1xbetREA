package a;

import android.graphics.Path;
import android.graphics.RectF;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dls implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6299a;
    public final /* synthetic */ long b;

    public /* synthetic */ dls(byte b, long j) {
        this.f6299a = b;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6299a;
        long j = this.b;
        switch (b) {
            case 0:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.f(abi0Var, j);
                return Unit.f46060a;
            case 1:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.E(fhlVar, this.b, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            case 2:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                fhl.E(fhlVar2, this.b, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            case 3:
                ((az40) obj).c(mtv.b, Long.valueOf(j));
                return null;
            case 4:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                fhl.u(fhlVar3, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 5:
                fhl fhlVar4 = (fhl) obj;
                fhlVar4.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar4.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar4.d() & 4294967295L));
                w03 w03VarA = z03.a();
                w03VarA.f(0.0f, 0.0f);
                float f = -fIntBitsToFloat;
                RectF rectF = w03VarA.b;
                if (rectF == null) {
                    rectF = new RectF();
                    w03VarA.b = rectF;
                }
                rectF.set(f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
                Path path = w03VarA.f38329a;
                RectF rectF2 = w03VarA.b;
                rectF2.getClass();
                path.arcTo(rectF2, -90.0f, 180.0f, false);
                w03VarA.c();
                fhl.C0(fhlVar4, w03VarA, this.b, 0.0f, l0q.f19214a, 52);
                return Unit.f46060a;
            case 6:
                fhl fhlVar5 = (fhl) obj;
                fhlVar5.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar5.w0(4.0f);
                float fW1 = fhlVar5.w0(4.0f);
                float fW2 = fhlVar5.w0(2.0f);
                float fW3 = fhlVar5.w0(1.0f);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fhlVar5.d() & 4294967295L)) / 2.0f;
                x03 x03VarK = qjj.K(0.0f, new float[]{fW0, fW1});
                w03 w03VarA2 = z03.a();
                w03VarA2.f(fW2 + fW1, fIntBitsToFloat3);
                w03VarA2.e((Float.intBitsToFloat((int) (fhlVar5.d() >> 32)) - fW2) - fW1, fIntBitsToFloat3);
                vtm0 vtm0Var = new vtm0(fW3, 0.0f, 1, 0, x03VarK, 10);
                long j2 = this.b;
                fhl.C0(fhlVar5, w03VarA2, j2, 0.0f, vtm0Var, 52);
                w03 w03VarA3 = z03.a();
                w03VarA3.f(0.0f, fIntBitsToFloat3);
                w03VarA3.e(fW2, fIntBitsToFloat3);
                fhl.C0(fhlVar5, w03VarA3, j2, 0.0f, new vtm0(fW3, 0.0f, 1, 0, null, 26), 52);
                w03 w03VarA4 = z03.a();
                w03VarA4.f(Float.intBitsToFloat((int) (fhlVar5.d() >> 32)) - fW2, fIntBitsToFloat3);
                w03VarA4.e(Float.intBitsToFloat((int) (fhlVar5.d() >> 32)), fIntBitsToFloat3);
                fhl.C0(fhlVar5, w03VarA4, j2, 0.0f, new vtm0(fW3, 0.0f, 1, 0, null, 26), 52);
                return Unit.f46060a;
            case 7:
                fhl fhlVar6 = (fhl) obj;
                fhlVar6.getClass();
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fhlVar6.d() >> 32));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (fhlVar6.d() & 4294967295L));
                w03 w03VarA5 = z03.a();
                w03VarA5.f(fIntBitsToFloat4, fIntBitsToFloat5);
                float f2 = fIntBitsToFloat4 * 2.0f;
                RectF rectF3 = w03VarA5.b;
                if (rectF3 == null) {
                    rectF3 = new RectF();
                    w03VarA5.b = rectF3;
                }
                rectF3.set(0.0f, 0.0f, f2, fIntBitsToFloat5);
                Path path2 = w03VarA5.f38329a;
                RectF rectF4 = w03VarA5.b;
                rectF4.getClass();
                path2.arcTo(rectF4, 90.0f, 180.0f, false);
                w03VarA5.c();
                fhl.C0(fhlVar6, w03VarA5, this.b, 0.0f, l0q.f19214a, 52);
                return Unit.f46060a;
            case 8:
                fhl fhlVar7 = (fhl) obj;
                fhlVar7.getClass();
                zcl zclVar2 = qmk.f28987a;
                z1x.E(fhlVar7, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12).a(fhlVar7.d(), fhlVar7.getLayoutDirection(), fhlVar7), j);
                return Unit.f46060a;
            case 9:
                fhl fhlVar8 = (fhl) obj;
                fhlVar8.getClass();
                zcl zclVar3 = qmk.f28987a;
                float fW4 = fhlVar8.w0(10.0f);
                fhl.o0(fhlVar8, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW4)) << 32) | (((long) Float.floatToRawIntBits(fW4)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 10:
                fhl fhlVar9 = (fhl) obj;
                fhlVar9.getClass();
                zcl zclVar4 = qmk.f28987a;
                float fW5 = fhlVar9.w0(12.0f);
                fhl.o0(fhlVar9, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW5)) << 32) | (((long) Float.floatToRawIntBits(fW5)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 11:
                fhl fhlVar10 = (fhl) obj;
                fhlVar10.getClass();
                zcl zclVar5 = qmk.f28987a;
                float fW6 = fhlVar10.w0(360.0f);
                fhl.o0(fhlVar10, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW6)) << 32) | (((long) Float.floatToRawIntBits(fW6)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 12:
                fhl fhlVar11 = (fhl) obj;
                fhlVar11.getClass();
                zcl zclVar6 = qmk.f28987a;
                float fW7 = fhlVar11.w0(8.0f);
                fhl.o0(fhlVar11, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW7)) << 32) | (((long) Float.floatToRawIntBits(fW7)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 13:
                fhl fhlVar12 = (fhl) obj;
                fhlVar12.getClass();
                zcl zclVar7 = qmk.f28987a;
                z1x.E(fhlVar12, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12).a(fhlVar12.d(), fhlVar12.getLayoutDirection(), fhlVar12), j);
                return Unit.f46060a;
            case 14:
                fhl fhlVar13 = (fhl) obj;
                fhlVar13.getClass();
                zcl zclVar8 = qmk.f28987a;
                z1x.E(fhlVar13, vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3).a(fhlVar13.d(), fhlVar13.getLayoutDirection(), fhlVar13), j);
                return Unit.f46060a;
            case 15:
                fhl fhlVar14 = (fhl) obj;
                fhlVar14.getClass();
                fhl.o0(fhlVar14, this.b, 0L, 0L, 0L, null, 254);
                return Unit.f46060a;
            case 16:
                fhl fhlVar15 = (fhl) obj;
                fhlVar15.getClass();
                zcl zclVar9 = qmk.f28987a;
                float fW8 = fhlVar15.w0(360.0f);
                fhl.o0(fhlVar15, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW8)) << 32) | (((long) Float.floatToRawIntBits(fW8)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 17:
                fhl fhlVar16 = (fhl) obj;
                fhlVar16.getClass();
                zcl zclVar10 = qmk.f28987a;
                float fW9 = fhlVar16.w0(360.0f);
                fhl.o0(fhlVar16, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW9)) << 32) | (((long) Float.floatToRawIntBits(fW9)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 18:
                fhl fhlVar17 = (fhl) obj;
                fhlVar17.getClass();
                zcl zclVar11 = qmk.f28987a;
                float fW10 = fhlVar17.w0(360.0f);
                fhl.o0(fhlVar17, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW10)) << 32) | (((long) Float.floatToRawIntBits(fW10)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fhl fhlVar18 = (fhl) obj;
                fhlVar18.getClass();
                zcl zclVar12 = qmk.f28987a;
                float fW11 = fhlVar18.w0(12.0f);
                fhl.o0(fhlVar18, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW11)) << 32) | (((long) Float.floatToRawIntBits(fW11)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 20:
                fhl fhlVar19 = (fhl) obj;
                fhlVar19.getClass();
                zcl zclVar13 = qmk.f28987a;
                float fW12 = fhlVar19.w0(8.0f);
                fhl.o0(fhlVar19, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW12)) << 32) | (((long) Float.floatToRawIntBits(fW12)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 21:
                fhl fhlVar20 = (fhl) obj;
                fhlVar20.getClass();
                zcl zclVar14 = qmk.f28987a;
                float fW13 = fhlVar20.w0(8.0f);
                fhl.o0(fhlVar20, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW13)) << 32) | (((long) Float.floatToRawIntBits(fW13)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 22:
                fhl fhlVar21 = (fhl) obj;
                fhlVar21.getClass();
                zcl zclVar15 = qmk.f28987a;
                float fW14 = fhlVar21.w0(8.0f);
                fhl.o0(fhlVar21, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW14)) << 32) | (((long) Float.floatToRawIntBits(fW14)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 23:
                fhl fhlVar22 = (fhl) obj;
                fhlVar22.getClass();
                zcl zclVar16 = qmk.f28987a;
                float fW15 = fhlVar22.w0(20.0f);
                fhl.o0(fhlVar22, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW15)) << 32) | (((long) Float.floatToRawIntBits(fW15)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 24:
                fhl fhlVar23 = (fhl) obj;
                fhlVar23.getClass();
                zcl zclVar17 = qmk.f28987a;
                float fW16 = fhlVar23.w0(4.0f);
                fhl.o0(fhlVar23, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW16)) << 32) | (((long) Float.floatToRawIntBits(fW16)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fhl fhlVar24 = (fhl) obj;
                fhlVar24.getClass();
                zcl zclVar18 = qmk.f28987a;
                float fW17 = fhlVar24.w0(10.0f);
                fhl.o0(fhlVar24, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW17)) << 32) | (((long) Float.floatToRawIntBits(fW17)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fhl fhlVar25 = (fhl) obj;
                fhlVar25.getClass();
                fhl.u(fhlVar25, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fhl fhlVar26 = (fhl) obj;
                fhlVar26.getClass();
                zcl zclVar19 = qmk.f28987a;
                float fW18 = fhlVar26.w0(16.0f);
                fhl.o0(fhlVar26, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW18)) << 32) | (((long) Float.floatToRawIntBits(fW18)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                float density = pi9Var.getDensity() * 20.0f;
                return pi9Var.a(new lf4((byte) 6, this.b, (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L)));
            default:
                fhl fhlVar27 = (fhl) obj;
                fhlVar27.getClass();
                zcl zclVar20 = qmk.f28987a;
                float fW19 = fhlVar27.w0(10.0f);
                fhl.o0(fhlVar27, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW19)) << 32) | (((long) Float.floatToRawIntBits(fW19)) & 4294967295L), null, 246);
                return Unit.f46060a;
        }
    }
}
