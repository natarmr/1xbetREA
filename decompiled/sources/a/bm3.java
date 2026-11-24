package a;

import com.appsflyer.AppsFlyerLib;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class bm3 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2820a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bm3(Object obj, byte b) {
        this.f2820a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws IOException {
        bby bbyVar;
        bby bbyVar2;
        byte b = 1;
        switch (this.f2820a) {
            case 0:
                Object objInvoke = ((i8) this.b).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                Object objInvoke2 = ((pa) this.b).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 2:
                Object objInvoke3 = ((i8) this.b).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 3:
                Object objInvoke4 = ((i8) this.b).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 4:
                Object objInvoke5 = ((vp3) this.b).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 5:
                Object objInvoke6 = ((vp3) this.b).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 6:
                Object objInvoke7 = ((wr3) this.b).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 7:
                Object objInvoke8 = ((wr3) this.b).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 8:
                Object objInvoke9 = ((vp3) this.b).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 9:
                Object objInvoke10 = ((vp3) this.b).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 10:
                Object objInvoke11 = ((vp3) this.b).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 11:
                Object objInvoke12 = ((vp3) this.b).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zu3 zu3Var = (zu3) this.b;
                n0o0 n0o0Var = zu3Var.j0;
                int i = zu3.s0;
                yje yjeVar2 = null;
                if (!zBooleanValue && (bbyVar2 = zu3Var.p0) != null) {
                    bbyVar2.cancel(null);
                }
                if (zBooleanValue && ((sff0) n0o0Var.getValue()).b.D && !((sff0) n0o0Var.getValue()).b.f13233a.f8987a && ((bbyVar = zu3Var.p0) == null || !bbyVar.isActive())) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - zu3.r0;
                    bvc bvcVarA = jiu0.a(zu3Var);
                    String simpleName = zu3.class.getSimpleName();
                    dvj dvjVar = zu3Var.g.b;
                    long j = zu3.q0;
                    long jE = jCurrentTimeMillis >= wen.e(j) ? 0L : (wen.e(j) - jCurrentTimeMillis) / 1000;
                    bfn bfnVar = bfn.SECONDS;
                    zu3Var.p0 = sac.d0(bvcVarA, simpleName, wen.l(j, bfnVar), jE, dvjVar, wen.l(j, bfnVar), null, new or3((byte) 5), new qu3(zu3Var, yjeVar2, b), 80);
                }
                return Unit.f46060a;
            case 13:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                rv3 rv3Var = (rv3) this.b;
                AppsFlyerLib appsFlyerLib = rv3Var.s;
                if (appsFlyerLib == null) {
                    return Unit.f46060a;
                }
                if (zBooleanValue2) {
                    appsFlyerLib.setHost("", "appsflyersdk.com");
                    appsFlyerLib.setDisableAdvertisingIdentifiers(false);
                    appsFlyerLib.setCollectAndroidID(true);
                    appsFlyerLib.setAndroidIdData(((rv3) this.b).g.a());
                    ((rv3) this.b).a(appsFlyerLib);
                } else if (rv3Var.p) {
                    appsFlyerLib.setDisableAdvertisingIdentifiers(true);
                    appsFlyerLib.setCollectAndroidID(false);
                    try {
                        appsFlyerLib.stop(true, ((rv3) this.b).f31152a);
                    } finally {
                        ((rv3) this.b).p = false;
                    }
                }
                return Unit.f46060a;
            case 14:
                Object objInvoke13 = ((df2) this.b).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 15:
                Object objInvoke14 = ((z54) this.b).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 16:
                Object objInvoke15 = ((z54) this.b).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 17:
                Object objInvoke16 = ((df2) this.b).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 18:
                Object objInvoke17 = ((df2) this.b).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke18 = ((df2) this.b).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 20:
                Object objInvoke19 = ((df2) this.b).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 21:
                Object objInvoke20 = ((nk4) this.b).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 22:
                Object objInvoke21 = ((ok4) this.b).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case 23:
                Object objInvoke22 = ((nk4) this.b).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case 24:
                Object objInvoke23 = ((ok4) this.b).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke24 = ((df2) this.b).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke25 = ((cm3) this.b).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke26 = ((cm3) this.b).invoke(obj, yjeVar);
                return objInvoke26 == wne.f39444a ? objInvoke26 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke27 = ((df2) this.b).invoke(obj, yjeVar);
                return objInvoke27 == wne.f39444a ? objInvoke27 : Unit.f46060a;
            default:
                ku4 ku4Var = (ku4) this.b;
                qq4 qq4Var = ku4.J;
                ku4Var.A(true);
                return Unit.f46060a;
        }
    }
}
