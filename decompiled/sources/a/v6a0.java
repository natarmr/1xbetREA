package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class v6a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36867a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ v6a0(Function1 function1, byte b) {
        this.f36867a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36867a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.getClass();
                function1.invoke(new l6a0(new z030(xgl0Var)));
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new xga0(str));
                break;
            case 2:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new sra0(bemVar));
                break;
            case 3:
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                function1.invoke(new sra0(bemVar2));
                break;
            case 4:
                cvl cvlVar = (cvl) obj;
                cvlVar.getClass();
                fxb.D(ivb0.b, new ha30(function1, cvlVar, (byte) 22)).a();
                break;
            case 5:
                fxb.D(ivb0.b, new o2b0((byte) 0, ((Number) obj).longValue(), function1)).a();
                break;
            case 6:
                fxb.D(ivb0.b, new o2b0((byte) 1, ((Number) obj).longValue(), function1)).a();
                break;
            case 7:
                bem bemVar3 = (bem) obj;
                bemVar3.getClass();
                function1.invoke(new r5b0(bemVar3));
                break;
            case 8:
                bem bemVar4 = (bem) obj;
                bemVar4.getClass();
                function1.invoke(new r5b0(bemVar4));
                break;
            case 9:
                aec0 aec0Var = (aec0) obj;
                aec0Var.getClass();
                function1.invoke(new ndc0(aec0Var));
                break;
            case 10:
                yrc0 yrc0Var = (yrc0) obj;
                yrc0Var.getClass();
                function1.invoke(new pdc0(yrc0Var));
                break;
            case 11:
                function1.invoke(new xoc0(((Number) obj).longValue()));
                break;
            case 12:
                hh8 hh8Var = (hh8) obj;
                hh8Var.getClass();
                function1.invoke(new sg8(hh8Var.f13049a));
                break;
            case 13:
                ng8 ng8Var = (ng8) obj;
                ng8Var.getClass();
                function1.invoke(new jg8(ng8Var.f23472a, ng8Var.b));
                break;
            case 14:
                bem bemVar5 = (bem) obj;
                bemVar5.getClass();
                function1.invoke(new vdf0(bemVar5));
                break;
            case 15:
                bem bemVar6 = (bem) obj;
                bemVar6.getClass();
                function1.invoke(new vdf0(bemVar6));
                break;
            case 16:
                bem bemVar7 = (bem) obj;
                bemVar7.getClass();
                function1.invoke(new p3g0(bemVar7));
                break;
            case 17:
                o37 o37Var = (o37) obj;
                o37Var.getClass();
                if (o37Var instanceof e27) {
                    String str2 = ((e27) o37Var).f7071a;
                    str2.getClass();
                    function1.invoke(new ui7(str2));
                } else if (o37Var instanceof f27) {
                    String str3 = ((f27) o37Var).f8798a;
                    str3.getClass();
                    function1.invoke(new yi7(str3));
                } else if (o37Var instanceof h27) {
                    String str4 = ((h27) o37Var).f12318a;
                    str4.getClass();
                    function1.invoke(new zi7(str4));
                } else if (o37Var instanceof g27) {
                    String str5 = ((g27) o37Var).f10549a;
                    str5.getClass();
                    function1.invoke(new hj7(str5));
                } else if (o37Var instanceof r27) {
                    function1.invoke(ri7.f30526a);
                } else if (o37Var instanceof t27) {
                    t27 t27Var = (t27) o37Var;
                    function1.invoke(new vi7(t27Var.f33202a, t27Var.b));
                }
                break;
            case 18:
                bem bemVar8 = (bem) obj;
                bemVar8.getClass();
                function1.invoke(new reh0(bemVar8));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new zyh0(((Number) obj).longValue()));
                break;
            case 20:
                function1.invoke(new azh0(((Number) obj).longValue()));
                break;
            case 21:
                ((lbj0) obj).getClass();
                function1.invoke(abj0.f583a);
                break;
            case 22:
                bem bemVar9 = (bem) obj;
                bemVar9.getClass();
                function1.invoke(new mxq0(bemVar9));
                break;
            case 23:
                bem bemVar10 = (bem) obj;
                bemVar10.getClass();
                function1.invoke(new mxq0(bemVar10));
                break;
            case 24:
                bem bemVar11 = (bem) obj;
                bemVar11.getClass();
                function1.invoke(new mxq0(bemVar11));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                bem bemVar12 = (bem) obj;
                bemVar12.getClass();
                function1.invoke(new mxq0(bemVar12));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                v2n v2nVar = (v2n) obj;
                v2nVar.getClass();
                Long lT0 = StringsKt.t0(v2nVar.f36693a);
                if (lT0 != null) {
                    function1.invoke(new agl0(lT0.longValue()));
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                v2n v2nVar2 = (v2n) obj;
                v2nVar2.getClass();
                Long lT1 = StringsKt.t0(v2nVar2.f36693a);
                if (lT1 != null) {
                    function1.invoke(new agl0(lT1.longValue()));
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                v2n v2nVar3 = (v2n) obj;
                v2nVar3.getClass();
                Long lT2 = StringsKt.t0(v2nVar3.f36693a);
                if (lT2 != null) {
                    function1.invoke(new agl0(lT2.longValue()));
                }
                break;
            default:
                v2n v2nVar4 = (v2n) obj;
                v2nVar4.getClass();
                Long lT3 = StringsKt.t0(v2nVar4.f36693a);
                if (lT3 != null) {
                    function1.invoke(new agl0(lT3.longValue()));
                }
                break;
        }
        return Unit.f46060a;
    }
}
