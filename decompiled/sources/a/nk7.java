package a;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nk7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23668a;

    public /* synthetic */ nk7(byte b) {
        this.f23668a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 12;
        switch (this.f23668a) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 1:
                jvg0 jvg0Var = (jvg0) obj;
                jvg0Var.getClass();
                return Integer.valueOf(jvg0Var.getItemId());
            case 2:
                jvg0 jvg0Var2 = (jvg0) obj;
                jvg0Var2.getClass();
                return sre0.f32672a.b(jvg0Var2.getClass());
            case 3:
                ry20 ry20Var = (ry20) obj;
                ry20Var.getClass();
                return ry20Var.f31291a;
            case 4:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar2.w0(16.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.o0(fhlVar2, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, jFloatToRawIntBits, null, 246);
                return Unit.f46060a;
            case 5:
                ((c53) obj).getClass();
                return new lie(kzn.d(ro4.m0(250, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(250, 0, null, 6), 2), (u7k0) null, 12);
            case 6:
                ((c53) obj).getClass();
                return new lie(kzn.d(ro4.m0(250, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(250, 0, null, 6), 2), (u7k0) null, 12);
            case 7:
                ((c53) obj).getClass();
                return new lie(kzn.d(ro4.m0(250, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(250, 0, null, 6), 2), (u7k0) null, 12);
            case 8:
                ((c53) obj).getClass();
                return new lie(kzn.d(ro4.m0(250, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(250, 0, null, 6), 2), (u7k0) null, 12);
            case 9:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                g7zVar.a();
                float fW1 = g7zVar.w0(d18.f5299a);
                long j = y3d.f;
                y3d y3dVar = new y3d(j);
                long j2 = y3d.b;
                fhl.r(g7zVar, yk5.g(q3d.j(y3dVar, new y3d(j2)), 0.0f, fW1, 8), 0L, 0L, 0.0f, null, null, 6, 62);
                List listJ = q3d.j(new y3d(j2), new y3d(j));
                a6a a6aVar = g7zVar.f10839a;
                fhl.r(g7zVar, yk5.g(listJ, Float.intBitsToFloat((int) (a6aVar.d() >> 32)) - fW1, Float.intBitsToFloat((int) (a6aVar.d() >> 32)), 8), 0L, 0L, 0.0f, null, null, 6, 62);
                return Unit.f46060a;
            case 10:
                j18 j18Var = (j18) obj;
                j18Var.getClass();
                return j18Var.b;
            case 11:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.y(0.22f);
                uag0Var.G(osm0.e(0.5f, 1.0f));
                return Unit.f46060a;
            case 12:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                fhl.O(fhlVar3, new ttd0(q3d.j(new y3d(y3d.c(0.45f, StaticColors.INSTANCE.m62getBlack0d7_KjU())), new y3d(y3d.f)), fhlVar3.E0(), h7k0.d(fhlVar3.d()) / 2.0f), 0.0f, 0L, null, 126);
                return Unit.f46060a;
            case 13:
                w6k w6kVar = (w6k) obj;
                w6kVar.getClass();
                zcl zclVar2 = qmk.f28987a;
                long j3 = -w6kVar.T(4.0f);
                return new ikx((j3 & 4294967295L) | (j3 << 32));
            case 14:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                zcl zclVar3 = qmk.f28987a;
                float density = pi9Var.getDensity() * 16.0f;
                return pi9Var.a(new bx(b, (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L)));
            case 15:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                pz40 pz40Var3 = s6t0.f31722a;
                long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                zcl zclVar4 = qmk.f28987a;
                float density2 = pi9Var2.getDensity() * 16.0f;
                return pi9Var2.a(new lf4((byte) 3, jM73getBlack400d7_KjU, (((long) Float.floatToRawIntBits(density2)) << 32) | (((long) Float.floatToRawIntBits(density2)) & 4294967295L)));
            case 16:
                ((sl8) obj).getClass();
                return "bonus_item";
            case 17:
                pz40 pz40Var4 = s6t0.f31722a;
                return Boolean.valueOf(s6t0.c());
            case 18:
                if (obj != null) {
                    throw new ClassCastException();
                }
                gl5 gl5Var = lj8.O1;
                throw null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 20:
                kg kgVar = (kg) obj;
                kgVar.getClass();
                int iOrdinal = kgVar.ordinal();
                if (iOrdinal == 0) {
                    return ijl.f14880a;
                }
                if (iOrdinal == 1) {
                    return ijl.b;
                }
                if (iOrdinal == 2) {
                    return ijl.c;
                }
                if (iOrdinal == 3) {
                    return ijl.d;
                }
                if (iOrdinal == 4) {
                    return ijl.e;
                }
                t9f.b();
                return null;
            case 21:
                ((g7z) obj).a();
                return Unit.f46060a;
            case 22:
                a4x a4xVar = (a4x) obj;
                a4xVar.getClass();
                return new a4n(a4xVar, new zgl0(), 12);
            case 23:
                a4x a4xVar2 = (a4x) obj;
                a4xVar2.getClass();
                return new c4n(a4xVar2, new zgl0(), 12);
            case 24:
                a4x a4xVar3 = (a4x) obj;
                a4xVar3.getClass();
                return new b4n(a4xVar3, new zgl0(), 12);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a4x a4xVar4 = (a4x) obj;
                a4xVar4.getClass();
                return new z3n(a4xVar4, new zgl0(), new dil0((y9q0) null, (y9q0) null, new zgl0(), 7), 12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                a4x a4xVar5 = (a4x) obj;
                a4xVar5.getClass();
                return new z3n(a4xVar5, new zgl0(), new dil0((y9q0) null, (y9q0) null, new zgl0(), 7), 12);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fhl fhlVar4 = (fhl) obj;
                fhlVar4.getClass();
                long jC = y3d.c(0.15f, y3d.b);
                zcl zclVar5 = qmk.f28987a;
                float fW2 = fhlVar4.w0(0.0f);
                float fW3 = fhlVar4.w0(16.0f);
                float fW4 = fhlVar4.w0(-6.0f);
                x5a x5aVarI = fhlVar4.A0().i();
                ucs0 ucs0VarD = saj.D();
                Paint paint = (Paint) ucs0VarD.c;
                if (fW3 > 0.0f) {
                    paint.setMaskFilter(new BlurMaskFilter(fW3, BlurMaskFilter.Blur.NORMAL));
                }
                paint.setColor(fbc.U(jC));
                x5aVarI.d(fW2, fW4, Float.intBitsToFloat((int) (fhlVar4.d() >> 32)) - fW2, Float.intBitsToFloat((int) (fhlVar4.d() & 4294967295L)), fhlVar4.w0(16.0f), fhlVar4.w0(16.0f), ucs0VarD);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            default:
                fhl fhlVar5 = (fhl) obj;
                fhlVar5.getClass();
                pz40 pz40Var5 = s6t0.f31722a;
                fhl.u(fhlVar5, StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
        }
    }
}
