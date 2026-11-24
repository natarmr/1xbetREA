package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a9g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f475a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ a9g0(Function1 function1, byte b) {
        this.f475a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f475a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new i5g0(((Integer) obj).intValue()));
                break;
            case 1:
                ((jtl) obj).getClass();
                function1.invoke(nlg0.f23726a);
                break;
            case 2:
                Float f = (Float) obj;
                f.floatValue();
                function1.invoke(f);
                break;
            case 3:
                if (((Integer) obj).intValue() == 1) {
                    function1.invoke(rtg0.f31077a);
                }
                break;
            case 4:
                function1.invoke(new c210(((Long) obj).longValue()));
                break;
            case 5:
                function1.invoke(new e210(((Long) obj).longValue()));
                break;
            case 6:
                function1.invoke(new c210(((Long) obj).longValue()));
                break;
            case 7:
                function1.invoke(new d210(((Long) obj).longValue()));
                break;
            case 8:
                function1.invoke(new b210(((Integer) obj).intValue()));
                break;
            case 9:
                function1.invoke(new a210(((Long) obj).longValue()));
                break;
            case 10:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new w110(str));
                break;
            case 11:
                function1.invoke(new d210(((Long) obj).longValue()));
                break;
            case 12:
                function1.invoke(new b210(((Integer) obj).intValue()));
                break;
            case 13:
                function1.invoke(new mwd0(((Long) obj).longValue()));
                break;
            case 14:
                function1.invoke(new mwd0(((Long) obj).longValue()));
                break;
            case 15:
                function1.invoke(new nwd0(((Long) obj).longValue()));
                break;
            case 16:
                function1.invoke(new lwd0(((Integer) obj).intValue()));
                break;
            case 17:
                function1.invoke(new kwd0(((Long) obj).longValue()));
                break;
            case 18:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new gwd0(str2));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new nwd0(((Long) obj).longValue()));
                break;
            case 20:
                function1.invoke(new lwd0(((Integer) obj).intValue()));
                break;
            case 21:
                function1.invoke(new wyt0(((Long) obj).longValue()));
                break;
            case 22:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new syt0(str3));
                break;
            case 23:
                function1.invoke(new wyt0(((Long) obj).longValue()));
                break;
            case 24:
                function1.invoke(new xyt0(((Long) obj).longValue()));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(new vyt0(((Integer) obj).intValue()));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(new uyt0(((Long) obj).longValue()));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new pyt0(str4));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new xyt0(((Long) obj).longValue()));
                break;
            default:
                function1.invoke(new vyt0(((Integer) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
