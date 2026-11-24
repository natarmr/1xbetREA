package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z9q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44031a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ z9q(Function1 function1, byte b) {
        this.f44031a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44031a;
        u8q u8qVar = u8q.f35242a;
        o420 o420Var = o420.f24612a;
        v8q v8qVar = v8q.f36999a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(a9q.f490a);
                break;
            case 1:
                function1.invoke(v8qVar);
                break;
            case 2:
                function1.invoke(z8q.f43980a);
                break;
            case 3:
                function1.invoke(u8qVar);
                break;
            case 4:
                function1.invoke(v8qVar);
                break;
            case 5:
                function1.invoke(u8qVar);
                break;
            case 6:
                function1.invoke(v8qVar);
                break;
            case 7:
                function1.invoke(new ot30(jam0.f16197a));
                break;
            case 8:
                function1.invoke(new rt30(jam0.f16197a));
                break;
            case 9:
                function1.invoke(new pt30(jam0.f16197a));
                break;
            case 10:
                function1.invoke(ztq.f44973a);
                break;
            case 11:
                function1.invoke(auq.f1490a);
                break;
            case 12:
                function1.invoke(z9r.f44033a);
                break;
            case 13:
                function1.invoke(aar.f542a);
                break;
            case 14:
                function1.invoke(z420.f43748a);
                break;
            case 15:
                function1.invoke(o420Var);
                break;
            case 16:
                function1.invoke(j520.f15913a);
                break;
            case 17:
                function1.invoke(b520.f1980a);
                break;
            case 18:
                function1.invoke(o320.f24561a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(o420Var);
                break;
            case 20:
                function1.invoke(j420.f15864a);
                break;
            case 21:
                function1.invoke(c520.f3751a);
                break;
            case 22:
                function1.invoke(w320.f38479a);
                break;
            case 23:
                function1.invoke(x320.f40195a);
                break;
            case 24:
                function1.invoke(s320.f31535a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(r320.f29766a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(t320.f33245a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(r420.f29815a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(q420.f28077a);
                break;
            default:
                function1.invoke(s420.f31584a);
                break;
        }
        return Unit.f46060a;
    }
}
