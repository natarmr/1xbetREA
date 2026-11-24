package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bac0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2251a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ bac0(Function1 function1, byte b) {
        this.f2251a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2251a;
        hpc0 hpc0Var = hpc0.f13435a;
        iqc0 iqc0Var = iqc0.f15205a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(w8c0.f38716a);
                break;
            case 1:
                function1.invoke(a9c0.f469a);
                break;
            case 2:
                function1.invoke(d9c0.f5693a);
                break;
            case 3:
                function1.invoke(u8c0.f35226a);
                break;
            case 4:
                fxb.D(ivb0.b, new wta0(function1, (byte) 28)).a();
                break;
            case 5:
                function1.invoke(rdc0.f30284a);
                break;
            case 6:
                function1.invoke(odc0.f25069a);
                break;
            case 7:
                function1.invoke(qdc0.f28529a);
                break;
            case 8:
                function1.invoke(fqc0.f9969a);
                break;
            case 9:
                function1.invoke(new gqc0(false));
                break;
            case 10:
                function1.invoke(new gqc0(true));
                break;
            case 11:
                function1.invoke(pgc0.f26948a);
                break;
            case 12:
                function1.invoke(ylc0.f42832a);
                break;
            case 13:
                function1.invoke(wlc0.f39348a);
                break;
            case 14:
                function1.invoke(vlc0.f37615a);
                break;
            case 15:
                function1.invoke(fpc0.f9922a);
                break;
            case 16:
                function1.invoke(hpc0Var);
                break;
            case 17:
                function1.invoke(hpc0Var);
                break;
            case 18:
                function1.invoke(jqc0.f16944a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(iqc0Var);
                break;
            case 20:
                function1.invoke(iqc0Var);
                break;
            case 21:
                function1.invoke(zoc0.f44713a);
                break;
            case 22:
                function1.invoke(yoc0.f42978a);
                break;
            case 23:
                function1.invoke(hwc0.f13764a);
                break;
            case 24:
                function1.invoke(kwc0.f18995a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(tvc0.f34592a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(wvc0.f39831a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(mrd0.f22266a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(ord0.f25730a);
                break;
            default:
                function1.invoke(hud0.f13675a);
                break;
        }
        return Unit.f46060a;
    }
}
