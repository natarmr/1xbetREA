package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dcr implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5859a;

    public /* synthetic */ dcr(byte b) {
        this.f5859a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        woa woaVar;
        woa woaVar2;
        Integer numValueOf = null;
        switch (this.f5859a) {
            case 0:
                zvh0 zvh0Var = (zvh0) obj;
                zvh0Var.getClass();
                return ydx.a0(zvh0Var);
            case 1:
                vsr0 vsr0Var = (vsr0) obj;
                vsr0Var.getClass();
                return Integer.valueOf(vsr0Var.f37966a ? 1 : 0);
            case 2:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new kgh(cpVar, (byte) 19));
                return Unit.f46060a;
            case 3:
                ((vzg0) obj).getClass();
                return new ekr(iun.f15405a, false);
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 5:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(300, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(300, 0, null, 6), 2));
            case 6:
                nqr nqrVar = (nqr) obj;
                if (nqrVar != null) {
                    return sre0.f32672a.b(nqrVar.getClass());
                }
                return null;
            case 7:
                a2n a2nVar = (a2n) obj;
                a2nVar.getClass();
                if (a2nVar instanceof q56) {
                    return Long.valueOf(((q56) a2nVar).a());
                }
                if (a2nVar instanceof w56) {
                    return Long.valueOf(((w56) a2nVar).a());
                }
                if (a2nVar instanceof v1o0) {
                    return Long.valueOf(((v1o0) a2nVar).a());
                }
                return a2nVar instanceof b2o0 ? Long.valueOf(((b2o0) a2nVar).a()) : axq.g();
            case 8:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 9:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 10:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 11:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 12:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 13:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case 14:
                obj.getClass();
                return (Set) obj;
            case 15:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 16:
                g7z g7zVar = (g7z) obj;
                nek nekVar = i7s.a2;
                g7zVar.getClass();
                g7zVar.a();
                pz40 pz40Var = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                fhl.r(g7zVar, yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(s6t0.b().b.getWebGamesBackground())), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 17:
                ((Boolean) obj).getClass();
                nek nekVar2 = i7s.a2;
                return Unit.f46060a;
            case 18:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                for (int i = 0; i < 10; i++) {
                    hcz.e(hczVar, null, null, new ugd(-1411160525, true, new cl2(i, (byte) 4)), 3);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 20:
                gna gnaVar = (gna) obj;
                ena enaVar = gnaVar instanceof ena ? (ena) gnaVar : null;
                if (enaVar == null || (woaVar = enaVar.n) == null) {
                    return null;
                }
                switch (woaVar.h.ordinal()) {
                    case 0:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_fog);
                        break;
                    case 1:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_haze);
                        break;
                    case 2:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_partly_cloudy);
                        break;
                    case 3:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_partly_cloud_rain);
                        break;
                    case 4:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_partly_cloud_rain_storm);
                        break;
                    case 5:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_partly_cloud_snow);
                        break;
                    case 6:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_cloud);
                        break;
                    case 7:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_rain);
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_rain_storm);
                        break;
                    case 9:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_snow);
                        break;
                    case 10:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_maily_cloudy);
                        break;
                    case 11:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_maily_cloudy_rain);
                        break;
                    case 12:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_maily_cloudy_rain_storm);
                        break;
                    case 13:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_snowing);
                        break;
                    case 14:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_sun);
                        break;
                    case 15:
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                Integer num = numValueOf;
                String str = woaVar.d;
                boolean z = str.length() > 0;
                String str2 = woaVar.e;
                boolean z2 = str2.length() > 0;
                String str3 = woaVar.f;
                boolean z3 = str3.length() > 0;
                String str4 = woaVar.g;
                return new l1v0(num, str, z, str2, z2, str3, z3, str4, str4.length() > 0);
            case 21:
                bg30 bg30Var = (bg30) obj;
                opm opmVar = opm.f25648a;
                if (bg30Var == null) {
                    return new lpm(opmVar, new gpm());
                }
                d3h0 d3h0Var = bg30Var.b;
                if (d3h0Var == null) {
                    d3h0Var = bg30Var.f2536a;
                }
                return new kpm(opmVar, new gpm(), d5c.O(d3h0Var.a(), d3h0Var.b(), d3h0Var.j(), d3h0Var.i(), new gpm()));
            case 22:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new eis(sjdVar);
            case 23:
                ((bem) obj).getClass();
                return Unit.f46060a;
            case 24:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(300, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(300, 0, null, 6), 2));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((tf50) obj).getClass();
                return sre0.f32672a.b(tf50.class);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((c53) obj).getClass();
                return new lie(kzn.d(ro4.m0(300, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(300, 0, null, 6), 2), ay3.F(new t4s((byte) 20), 1), 4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Boolean) obj).getClass();
                nek nekVar3 = cjs.a2;
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bg30 bg30Var2 = (bg30) obj;
                qpm qpmVar = qpm.f29126a;
                if (bg30Var2 == null) {
                    return new lpm(qpmVar, new hpm(0L, 3));
                }
                d3h0 d3h0Var2 = bg30Var2.b;
                if (d3h0Var2 == null) {
                    d3h0Var2 = bg30Var2.f2536a;
                }
                pz40 pz40Var2 = s6t0.f31722a;
                return new kpm(qpmVar, new hpm(s6t0.b().f33626a.getBackgroundContent(), 1), d5c.O(d3h0Var2.a(), d3h0Var2.b(), d3h0Var2.j(), d3h0Var2.i(), new hpm(0L, 3)));
            default:
                gna gnaVar2 = (gna) obj;
                ena enaVar2 = gnaVar2 instanceof ena ? (ena) gnaVar2 : null;
                if (enaVar2 == null || (woaVar2 = enaVar2.n) == null) {
                    return null;
                }
                switch (woaVar2.h.ordinal()) {
                    case 0:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_fog);
                        break;
                    case 1:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_haze);
                        break;
                    case 2:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_partly_cloudy);
                        break;
                    case 3:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_partly_cloud_rain);
                        break;
                    case 4:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_partly_cloud_rain_storm);
                        break;
                    case 5:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_partly_cloud_snow);
                        break;
                    case 6:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_cloud);
                        break;
                    case 7:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_rain);
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_rain_storm);
                        break;
                    case 9:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_snow);
                        break;
                    case 10:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_maily_cloudy);
                        break;
                    case 11:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_maily_cloudy_rain);
                        break;
                    case 12:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_maily_cloudy_rain_storm);
                        break;
                    case 13:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_snowing);
                        break;
                    case 14:
                        numValueOf = Integer.valueOf(R.drawable.ic_weather_sun);
                        break;
                    case 15:
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                Integer num2 = numValueOf;
                String str5 = woaVar2.d;
                boolean z4 = str5.length() > 0;
                String str6 = woaVar2.e;
                boolean z5 = str6.length() > 0;
                String str7 = woaVar2.f;
                boolean z6 = str7.length() > 0;
                String str8 = woaVar2.g;
                return new m1v0(num2, str5, z4, str6, z5, str7, z6, str8, str8.length() > 0);
        }
    }
}
