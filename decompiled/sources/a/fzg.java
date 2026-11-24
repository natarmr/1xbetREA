package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class fzg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10406a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ fzg(Function1 function1, byte b) {
        this.f10406a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10406a;
        String str = "";
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new mxq0(bemVar));
                break;
            case 1:
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                function1.invoke(ebc.n0(bemVar2));
                break;
            case 2:
                bem bemVar3 = (bem) obj;
                bemVar3.getClass();
                function1.invoke(ebc.n0(bemVar3));
                break;
            case 3:
                y8m y8mVar = (y8m) obj;
                y8mVar.getClass();
                function1.invoke(new cpk(Long.parseLong(y8mVar.b), y8mVar.d));
                break;
            case 4:
                function1.invoke(new tok(((Number) obj).longValue()));
                break;
            case 5:
                function1.invoke(new dpk(((Number) obj).longValue()));
                break;
            case 6:
                function1.invoke(new rok(((Number) obj).longValue()));
                break;
            case 7:
                function1.invoke(new qok(((Number) obj).longValue()));
                break;
            case 8:
                function1.invoke(new sok(((Number) obj).longValue()));
                break;
            case 9:
                y8m y8mVar2 = (y8m) obj;
                y8mVar2.getClass();
                function1.invoke(new cpk(Long.parseLong(y8mVar2.b), y8mVar2.d));
                break;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.equals("LIVE_GAMES")) {
                    str = "HEADER_LIVE_GAMES";
                } else if (str2.equals("LINE_GAMES")) {
                    str = "HEADER_LINE_GAMES";
                }
                function1.invoke(new yok(str));
                break;
            case 11:
                m8m m8mVar = (m8m) obj;
                m8mVar.getClass();
                function1.invoke(new zok(m8mVar));
                break;
            case 12:
                long jLongValue = ((Number) obj).longValue();
                if (jLongValue == 0) {
                    str = "MATCH_RESULT_CHIP";
                } else if (jLongValue == 1) {
                    str = "LEADERBOARD_CHIP";
                } else if (jLongValue == 2) {
                    str = "TRANSFER_CHIP";
                } else if (jLongValue == 3) {
                    str = "CALENDAR_CHIP";
                } else if (jLongValue == 4) {
                    str = "META_HEROES_CHIP";
                }
                function1.invoke(new yok(str));
                break;
            case 13:
                sip sipVar = (sip) obj;
                sipVar.getClass();
                function1.invoke(new bpk(sipVar));
                break;
            case 14:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new yok(str3));
                break;
            case 15:
                function1.invoke(new bon(((Number) obj).longValue()));
                break;
            case 16:
                wgl0 wgl0Var = (wgl0) obj;
                wgl0Var.getClass();
                function1.invoke(new aon(wgl0Var));
                break;
            case 17:
                function1.invoke(new eon(((Number) obj).longValue()));
                break;
            case 18:
                fdv0 fdv0Var = (fdv0) obj;
                fdv0Var.getClass();
                function1.invoke(new thw(fdv0Var));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                y8m y8mVar3 = (y8m) obj;
                y8mVar3.getClass();
                function1.invoke(new nhw(y8mVar3.d));
                break;
            case 20:
                sip sipVar2 = (sip) obj;
                sipVar2.getClass();
                function1.invoke(new lgw(sipVar2));
                break;
            case 21:
                rdv0 rdv0Var = (rdv0) obj;
                rdv0Var.getClass();
                function1.invoke(new uhw(rdv0Var.f30307a, rdv0Var.b, rdv0Var.c));
                break;
            case 22:
                e8m e8mVar = (e8m) obj;
                e8mVar.getClass();
                function1.invoke(new zgw(e8mVar.f7380a));
                break;
            case 23:
                function1.invoke(new sgw(((Number) obj).intValue()));
                break;
            case 24:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                function1.invoke(new ga0(st0Var.f32750a));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                function1.invoke(new ia0(st0Var2));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new t6s(str4));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new k6s(((Number) obj).intValue()));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new p6s(str5));
                break;
            default:
                faj fajVar = (faj) obj;
                fajVar.getClass();
                function1.invoke(new s6s(fajVar));
                break;
        }
        return Unit.f46060a;
    }
}
