package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hcr implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12838a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ hcr(Function1 function1, byte b) {
        this.f12838a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12838a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(j520.f15913a);
                break;
            case 1:
                function1.invoke(i320.f14077a);
                break;
            case 2:
                function1.invoke(h320.f12365a);
                break;
            case 3:
                function1.invoke(uqk0.f36123a);
                break;
            case 4:
                function1.invoke(djr.c);
                break;
            case 5:
                function1.invoke(djr.b);
                break;
            case 6:
                function1.invoke(ojr.f25373a);
                break;
            case 7:
                function1.invoke(new ot30(jam0.b));
                break;
            case 8:
                function1.invoke(new rt30(jam0.b));
                break;
            case 9:
                function1.invoke(new pt30(jam0.b));
                break;
            case 10:
                function1.invoke(xas.f40572a);
                break;
            case 11:
                function1.invoke(abs.f594a);
                break;
            case 12:
                function1.invoke(hhs.f13080a);
                break;
            case 13:
                function1.invoke(fhs.f9557a);
                break;
            case 14:
                function1.invoke(mhs.f21810a);
                break;
            case 15:
                function1.invoke(lhs.f20072a);
                break;
            case 16:
                function1.invoke(tf50.f33851a);
                break;
            case 17:
                function1.invoke(tf50.b);
                break;
            case 18:
                function1.invoke(tf50.c);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(xms.f41144a);
                break;
            case 20:
                function1.invoke(qlr.f28948a);
                break;
            case 21:
                function1.invoke(plr.f27199a);
                break;
            case 22:
                function1.invoke(wlr.f39370a);
                break;
            case 23:
                function1.invoke(vlr.f37641a);
                break;
            case 24:
                function1.invoke(xlr.f41088a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(tss.f34475a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(kus.f18927a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(jgt.f16496a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(ngt.f23501a);
                break;
            default:
                function1.invoke(lgt.f20023a);
                break;
        }
        return Unit.f46060a;
    }
}
