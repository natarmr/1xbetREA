package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bx implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3352a;
    public final /* synthetic */ long b;

    public /* synthetic */ bx(byte b, long j) {
        this.f3352a = b;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n5a n5aVar;
        Object g0g0Var;
        byte b = this.f3352a;
        byte b2 = 0;
        long j = this.b;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.o0(fhlVar, this.b, 0L, 0L, 0L, null, 254);
                return Unit.f46060a;
            case 1:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar2.w0(10.0f);
                fhl.o0(fhlVar2, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 2:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                fhl.u(fhlVar3, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 3:
                fhl fhlVar4 = (fhl) obj;
                fhlVar4.getClass();
                zcl zclVar2 = qmk.f28987a;
                fhl.o0(fhlVar4, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fhlVar4.w0(6.0f))) << 32) | (((long) Float.floatToRawIntBits(fhlVar4.w0(6.0f))) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 4:
                pi9 pi9Var = (pi9) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) / 2.0f;
                return pi9Var.b(new ny2(fIntBitsToFloat, eeq.Q(pi9Var, fIntBitsToFloat), new m78(j, 5), b2));
            case 5:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                return pi9Var2.a(new lf4((byte) 0, this.b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var2.f27033a.d() & 4294967295L)) / 3.0f)) & 4294967295L)));
            case 6:
                fhl fhlVar5 = (fhl) obj;
                fhlVar5.getClass();
                fhl.E(fhlVar5, this.b, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            case 7:
                fhl fhlVar6 = (fhl) obj;
                fhlVar6.getClass();
                fhl.o0(fhlVar6, this.b, 0L, 0L, 0L, null, 254);
                return Unit.f46060a;
            case 8:
                fhl fhlVar7 = (fhl) obj;
                fhlVar7.getClass();
                fhl.u(fhlVar7, this.b, 0L, fhlVar7.d(), 0.0f, null, null, 0, 122);
                return Unit.f46060a;
            case 9:
                fhl fhlVar8 = (fhl) obj;
                fhlVar8.getClass();
                fhl.u(fhlVar8, this.b, 0L, fhlVar8.d(), 0.0f, null, null, 0, 122);
                return Unit.f46060a;
            case 10:
                fhl fhlVar9 = (fhl) obj;
                fhlVar9.getClass();
                fhl.u(fhlVar9, this.b, 0L, fhlVar9.d(), 0.0f, null, null, 0, 122);
                return Unit.f46060a;
            case 11:
                fhl fhlVar10 = (fhl) obj;
                fhlVar10.getClass();
                fhl.o0(fhlVar10, this.b, 0L, 0L, 0L, null, 254);
                return Unit.f46060a;
            case 12:
                fhl fhlVar11 = (fhl) obj;
                fhlVar11.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.o0(fhlVar11, s6t0.b().f33626a.getBackground(), 0L, 0L, this.b, null, 246);
                return Unit.f46060a;
            case 13:
                n39 n39Var = (n39) obj;
                Function1 function1 = n39Var.b;
                if (function1 != null && (n5aVar = n39Var.f22839a) != null) {
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        g0g0Var = function1.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    n5aVar.resumeWith(g0g0Var);
                    break;
                }
                return Unit.f46060a;
            case 14:
                fhl fhlVar12 = (fhl) obj;
                fhlVar12.getClass();
                zcl zclVar3 = qmk.f28987a;
                float fW1 = fhlVar12.w0(20.0f);
                fhl.o0(fhlVar12, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fW1)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 15:
                fhl fhlVar13 = (fhl) obj;
                fhlVar13.getClass();
                zcl zclVar4 = qmk.f28987a;
                float fW2 = fhlVar13.w0(16.0f);
                fhl.o0(fhlVar13, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 16:
                fhl fhlVar14 = (fhl) obj;
                fhlVar14.getClass();
                fhl.u(fhlVar14, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 17:
                fhl fhlVar15 = (fhl) obj;
                fhlVar15.getClass();
                fhl.u(fhlVar15, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 18:
                fhl fhlVar16 = (fhl) obj;
                fhlVar16.getClass();
                fhl.u(fhlVar16, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fhl fhlVar17 = (fhl) obj;
                fhlVar17.getClass();
                fhl.u(fhlVar17, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 20:
                fhl fhlVar18 = (fhl) obj;
                fhlVar18.getClass();
                zcl zclVar5 = qmk.f28987a;
                float fW3 = fhlVar18.w0(4.0f);
                float fW4 = fhlVar18.w0(4.0f);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar18.d() & 4294967295L));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fhlVar18.d() & 4294967295L)) / 2.0f;
                x03 x03VarK = qjj.K(0.0f, new float[]{fW3, fW4});
                w03 w03VarA = z03.a();
                w03VarA.f(0.0f, fIntBitsToFloat3);
                w03VarA.e(Float.intBitsToFloat((int) (fhlVar18.d() >> 32)), fIntBitsToFloat3);
                fhl.C0(fhlVar18, w03VarA, this.b, 0.0f, new vtm0(fIntBitsToFloat2, 0.0f, 0, 0, x03VarK, 10), 52);
                return Unit.f46060a;
            case 21:
                fhl fhlVar19 = (fhl) obj;
                fhlVar19.getClass();
                long j2 = y3d.f;
                if (!h2t0.a(j, j2)) {
                    long jD = fhlVar19.d();
                    int i = (int) (4294967295L & jD);
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i) / 3.0f;
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) / 10.0f;
                    Canvas canvasB = vw2.b(fhlVar19.A0().i());
                    zcl zclVar6 = qmk.f28987a;
                    float fW5 = fhlVar19.w0(4.0f);
                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jD >> 32)) - fhlVar19.w0(4.0f);
                    float fIntBitsToFloat7 = Float.intBitsToFloat(i) - fIntBitsToFloat5;
                    float fW6 = fhlVar19.w0(0.0f);
                    float fW7 = fhlVar19.w0(0.0f);
                    Paint paint = new Paint();
                    paint.setColor(fbc.U(j2));
                    paint.setShadowLayer(fhlVar19.w0(14.0f), 0.0f, 0.0f, fbc.U(j));
                    canvasB.drawRoundRect(fW5, fIntBitsToFloat4, fIntBitsToFloat6, fIntBitsToFloat7, fW6, fW7, paint);
                }
                return Unit.f46060a;
            case 22:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.a(abi0Var, j);
                return Unit.f46060a;
            case 23:
                fhl fhlVar20 = (fhl) obj;
                fhlVar20.getClass();
                fhl.u(fhlVar20, this.b, 0L, fhlVar20.d(), 0.0f, null, null, 0, 122);
                return Unit.f46060a;
            case 24:
                fhl fhlVar21 = (fhl) obj;
                fhlVar21.getClass();
                fhl.u(fhlVar21, this.b, 0L, fhlVar21.d(), 0.0f, null, null, 0, 122);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fhl fhlVar22 = (fhl) obj;
                fhlVar22.getClass();
                fhl.o0(fhlVar22, this.b, 0L, 0L, 0L, null, 254);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fhl fhlVar23 = (fhl) obj;
                fhlVar23.getClass();
                zcl zclVar7 = qmk.f28987a;
                float fW8 = fhlVar23.w0(16.0f);
                fhl.o0(fhlVar23, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW8)) << 32) | (((long) Float.floatToRawIntBits(fW8)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fhl fhlVar24 = (fhl) obj;
                fhlVar24.getClass();
                long jD2 = fhlVar24.d();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fhlVar24.w0(8.0f))) << 32) | (((long) Float.floatToRawIntBits(fhlVar24.w0(8.0f))) & 4294967295L);
                zcl zclVar8 = qmk.f28987a;
                fhl.o0(fhlVar24, this.b, 0L, jD2, jFloatToRawIntBits, new vtm0(fhlVar24.w0(1.0f), 0.0f, 0, 0, null, 30), 224);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fhl fhlVar25 = (fhl) obj;
                fhlVar25.getClass();
                zcl zclVar9 = qmk.f28987a;
                float fW9 = fhlVar25.w0(360.0f);
                fhl.o0(fhlVar25, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW9)) << 32) | (((long) Float.floatToRawIntBits(fW9)) & 4294967295L), null, 246);
                return Unit.f46060a;
            default:
                fhl fhlVar26 = (fhl) obj;
                fhlVar26.getClass();
                zcl zclVar10 = qmk.f28987a;
                float fW10 = fhlVar26.w0(8.0f);
                fhl.o0(fhlVar26, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fW10)) << 32) | (((long) Float.floatToRawIntBits(fW10)) & 4294967295L), null, 246);
                return Unit.f46060a;
        }
    }
}
