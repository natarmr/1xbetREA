package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class z7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43893a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ p6t0 c;

    public z7(p6t0 p6t0Var, Function1 function1) {
        this.f43893a = (byte) 10;
        this.c = p6t0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        byte b = this.f43893a;
        p6t0 p6t0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new iu30(((pqv) p6t0Var).n()));
                break;
            case 1:
                function1.invoke(new iu30(((pqv) p6t0Var).n()));
                break;
            case 2:
                vnp0 vnp0Var = (vnp0) p6t0Var;
                function1.invoke(new uh2(vnp0Var.c, vnp0Var.f37730a));
                break;
            case 3:
                o8s0 o8s0Var = (o8s0) p6t0Var;
                function1.invoke(new cj2(o8s0Var.c, o8s0Var.f24847a));
                break;
            case 4:
                o8s0 o8s0Var2 = (o8s0) p6t0Var;
                function1.invoke(new cj2(o8s0Var2.c, o8s0Var2.f24847a));
                break;
            case 5:
                qbs0 qbs0Var = ((sbs0) p6t0Var).f31951a;
                qbs0Var.getClass();
                function1.invoke(new nk2(qbs0Var));
                break;
            case 6:
                qbs0 qbs0Var2 = ((sbs0) p6t0Var).f31951a;
                qbs0Var2.getClass();
                function1.invoke(new mk2(qbs0Var2));
                break;
            case 7:
                qbs0 qbs0Var3 = ((sbs0) p6t0Var).f31951a;
                qbs0Var3.getClass();
                function1.invoke(new tk2(qbs0Var3));
                break;
            case 8:
                vnp0 vnp0Var2 = (vnp0) p6t0Var;
                function1.invoke(new uh2(vnp0Var2.c, vnp0Var2.f37730a));
                break;
            case 9:
                function1.invoke(new yok(((nuj) p6t0Var).f24150a));
                break;
            case 10:
                String str2 = ((urk) p6t0Var).f36167a;
                if (str2.equals("LIVE_GAMES")) {
                    str = "HEADER_LIVE_GAMES";
                } else {
                    str = str2.equals("LINE_GAMES") ? "HEADER_LINE_GAMES" : "";
                }
                function1.invoke(new yok(str));
                break;
            case 11:
                function1.invoke(new ypo(((tmo) p6t0Var).f34203a));
                break;
            case 12:
                function1.invoke(new zpo(((fja) p6t0Var).b));
                break;
            case 13:
                function1.invoke(new wpo(((hia) p6t0Var).f13104a));
                break;
            case 14:
                function1.invoke(new aqo(((hia) p6t0Var).f13104a));
                break;
            case 15:
                function1.invoke(new dy50(((a460) p6t0Var).b));
                break;
            case 16:
                function1.invoke(new db80(((rc80) p6t0Var).b));
                break;
            case 17:
                function1.invoke(new iu30(((pqv) p6t0Var).n()));
                break;
            case 18:
                function1.invoke(new woc0((ssc0) p6t0Var));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new bzh0(((ua5) p6t0Var).f35314a));
                break;
            case 20:
                function1.invoke(new agl0(((gpp) p6t0Var).f11693a));
                break;
            case 21:
                function1.invoke(new ufl0(((gpp) p6t0Var).f11693a));
                break;
            case 22:
                function1.invoke(new agl0(((gpp) p6t0Var).f11693a));
                break;
            case 23:
                function1.invoke(new ufl0(((gpp) p6t0Var).f11693a));
                break;
            case 24:
                function1.invoke(new agl0(((gpp) p6t0Var).f11693a));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(new ufl0(((gpp) p6t0Var).f11693a));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(new agl0(((gpp) p6t0Var).f11693a));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new ufl0(((gpp) p6t0Var).f11693a));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new iu30(((pqv) p6t0Var).n()));
                break;
            default:
                function1.invoke(new iu30(((pqv) p6t0Var).n()));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ z7(Function1 function1, p6t0 p6t0Var, byte b) {
        this.f43893a = b;
        this.b = function1;
        this.c = p6t0Var;
    }
}
