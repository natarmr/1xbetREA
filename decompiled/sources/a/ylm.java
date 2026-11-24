package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ylm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42850a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ylm(Function1 function1, byte b) {
        this.f42850a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42850a;
        k6n k6nVar = k6n.f17778a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(ulm.f35879a);
                break;
            case 1:
                function1.invoke(vlm.f37631a);
                break;
            case 2:
                function1.invoke(kmm.f18547a);
                break;
            case 3:
                function1.invoke(jmm.f16772a);
                break;
            case 4:
                function1.invoke(k6nVar);
                break;
            case 5:
                function1.invoke(k6nVar);
                break;
            case 6:
                function1.invoke(tkn.f34103a);
                break;
            case 7:
                function1.invoke(mkn.f21951a);
                break;
            case 8:
                function1.invoke(gkn.f11452a);
                break;
            case 9:
                function1.invoke(nkn.f23688a);
                break;
            case 10:
                function1.invoke(lkn.f20208a);
                break;
            case 11:
                function1.invoke(skn.f32359a);
                break;
            case 12:
                function1.invoke(ynn.f42949a);
                break;
            case 13:
                function1.invoke(znn.f44685a);
                break;
            case 14:
                function1.invoke(qh2.f28716a);
                break;
            case 15:
                function1.invoke(yi2.f42665a);
                break;
            case 16:
                function1.invoke(jq9.f16939a);
                break;
            case 17:
                function1.invoke(o3g0.f24584a);
                break;
            case 18:
                function1.invoke(v900.f37010a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(y900.f42222a);
                break;
            case 20:
                function1.invoke(y2o.f41914a);
                break;
            case 21:
                function1.invoke(f3o.f8873a);
                break;
            case 22:
                function1.invoke(v2o.f36695a);
                break;
            case 23:
                function1.invoke(w2o.f38459a);
                break;
            case 24:
                function1.invoke(o4o.f24648a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(n4o.f22908a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(l4o.f19417a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(k4o.f17678a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(m4o.f21181a);
                break;
            default:
                function1.invoke(p4o.f26363a);
                break;
        }
        return Unit.f46060a;
    }
}
