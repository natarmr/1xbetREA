package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mfp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21704a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ mfp(Function1 function1, byte b) {
        this.f21704a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21704a;
        pjp pjpVar = pjp.f27101a;
        l2t l2tVar = l2t.f19329a;
        eim eimVar = eim.f7867a;
        gim gimVar = gim.f11355a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(i2t.f14068a);
                break;
            case 1:
                function1.invoke(l2tVar);
                break;
            case 2:
                function1.invoke(l2tVar);
                break;
            case 3:
                function1.invoke(l2tVar);
                break;
            case 4:
                function1.invoke(kgp.f18249a);
                break;
            case 5:
                function1.invoke(mgp.f21753a);
                break;
            case 6:
                function1.invoke(ahp.f884a);
                break;
            case 7:
                function1.invoke(gimVar);
                break;
            case 8:
                function1.invoke(eimVar);
                break;
            case 9:
                function1.invoke(eimVar);
                break;
            case 10:
                function1.invoke(gimVar);
                break;
            case 11:
                function1.invoke(eimVar);
                break;
            case 12:
                function1.invoke(gimVar);
                break;
            case 13:
                function1.invoke(eimVar);
                break;
            case 14:
                function1.invoke(gimVar);
                break;
            case 15:
                function1.invoke(njp.f23647a);
                break;
            case 16:
                function1.invoke(pjpVar);
                break;
            case 17:
                function1.invoke(pjpVar);
                break;
            case 18:
                function1.invoke(ojp.f25369a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(itp.f15365a);
                break;
            case 20:
                function1.invoke(jtp.f17110a);
                break;
            case 21:
                function1.invoke(hvp.f13736a);
                break;
            case 22:
                function1.invoke(cvp.f5041a);
                break;
            case 23:
                function1.invoke(gvp.f11986a);
                break;
            case 24:
                function1.invoke(h4q.f12446a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(g4q.f10680a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(a4q.f236a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(b4q.f1971a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(c9q.f3973a);
                break;
            default:
                function1.invoke(u8q.f35242a);
                break;
        }
        return Unit.f46060a;
    }
}
