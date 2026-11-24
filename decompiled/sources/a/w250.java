package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w250 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38434a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ w250(Function1 function1, byte b) {
        this.f38434a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38434a;
        xqk0 xqk0Var = xqk0.f41325a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new b150(t150.f33153a));
                break;
            case 1:
                function1.invoke(new l150(t150.f33153a));
                break;
            case 2:
                function1.invoke(new t350(t150.f33153a));
                break;
            case 3:
                function1.invoke(x350.f40200a);
                break;
            case 4:
                function1.invoke(l350.f19343a);
                break;
            case 5:
                function1.invoke(k350.f17603a);
                break;
            case 6:
                function1.invoke(u350.f34981a);
                break;
            case 7:
                function1.invoke(p350.f26284a);
                break;
            case 8:
                function1.invoke(new j350(t150.f33153a));
                break;
            case 9:
                function1.invoke(e150.f7022a);
                break;
            case 10:
                function1.invoke(xqk0Var);
                break;
            case 11:
                function1.invoke(xqk0Var);
                break;
            case 12:
                function1.invoke(xn50.f41157a);
                break;
            case 13:
                function1.invoke(fo50.f9865a);
                break;
            case 14:
                function1.invoke(co50.f4684a);
                break;
            case 15:
                function1.invoke(wt50.f39723a);
                break;
            case 16:
                function1.invoke(zt50.f44939a);
                break;
            case 17:
                function1.invoke(yp50.f43016a);
                break;
            case 18:
                function1.invoke(bq50.f3012a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(xq50.f41300a);
                break;
            case 20:
                function1.invoke(tq50.f34366a);
                break;
            case 21:
                function1.invoke(ds50.f6596a);
                break;
            case 22:
                function1.invoke(ms50.f22302a);
                break;
            case 23:
                function1.invoke(is50.f15288a);
                break;
            case 24:
                function1.invoke(fu50.b);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(fu50.f10145a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(fu50.c);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(gv50.f11961a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(hv50.f13711a);
                break;
            default:
                function1.invoke(jv50.f17192a);
                break;
        }
        return Unit.f46060a;
    }
}
