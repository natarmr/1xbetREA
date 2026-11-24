package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class rr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30957a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ rr0(Function1 function1, byte b) {
        this.f30957a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30957a;
        ui2 ui2Var = ui2.f35709a;
        mh2 mh2Var = mh2.f21769a;
        au8 au8Var = au8.f1465a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(wp0.f39522a);
                break;
            case 1:
                function1.invoke(zp0.f44738a);
                break;
            case 2:
                function1.invoke(bs1.f3105a);
                break;
            case 3:
                function1.invoke(ls1.f20557a);
                break;
            case 4:
                function1.invoke(ps1.f27492a);
                break;
            case 5:
                function1.invoke(ms1.f22298a);
                break;
            case 6:
                function1.invoke(yx1.f43400a);
                break;
            case 7:
                function1.invoke(q22.f27980a);
                break;
            case 8:
                function1.invoke(mh2Var);
                break;
            case 9:
                function1.invoke(ui2Var);
                break;
            case 10:
                function1.invoke(ui2Var);
                break;
            case 11:
                function1.invoke(mh2Var);
                break;
            case 12:
                function1.invoke(pm2.f27212a);
                break;
            case 13:
                function1.invoke(au8Var);
                break;
            case 14:
                function1.invoke(au8Var);
                break;
            case 15:
                function1.invoke(hu8.f13667a);
                break;
            case 16:
                function1.invoke(lu8.f20661a);
                break;
            case 17:
                function1.invoke(zt8.f44944a);
                break;
            case 18:
                function1.invoke(qu8.f29335a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(ku8.f18900a);
                break;
            case 20:
                function1.invoke(mu8.f22402a);
                break;
            case 21:
                function1.invoke(dq9.f6503a);
                break;
            case 22:
                function1.invoke(new yok("HEADER_ACTIVE_TEAMS"));
                break;
            case 23:
                function1.invoke(new yok("HEADER_CHAMPIONSHIPS"));
                break;
            case 24:
                function1.invoke(fpk.f9932a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(apk.f1256a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(new yok("HEADER_CHAMPIONSHIPS"));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new yok("HEADER_ACTIVE_TEAMS"));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new yok("HEADER_CHAMPIONSHIPS"));
                break;
            default:
                function1.invoke(new yok("HEADER_ACTIVE_TEAMS"));
                break;
        }
        return Unit.f46060a;
    }
}
