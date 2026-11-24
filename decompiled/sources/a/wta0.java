package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wta0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39732a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ wta0(Function1 function1, byte b) {
        this.f39732a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39732a;
        c520 c520Var = c520.f3751a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(vqa0.f37847a);
                break;
            case 1:
                function1.invoke(wqa0.f39580a);
                break;
            case 2:
                function1.invoke(o1b0.f24473a);
                break;
            case 3:
                function1.invoke(z1b0.f43609a);
                break;
            case 4:
                function1.invoke(t5b0.f33361a);
                break;
            case 5:
                function1.invoke(u5b0.f35085a);
                break;
            case 6:
                function1.invoke(v5b0.f36820a);
                break;
            case 7:
                function1.invoke(yxa0.f43411a);
                break;
            case 8:
                function1.invoke(dya0.f6884a);
                break;
            case 9:
                function1.invoke(yya0.f43457a);
                break;
            case 10:
                function1.invoke(pya0.f27794a);
                break;
            case 11:
                function1.invoke(nya0.f24322a);
                break;
            case 12:
                function1.invoke(mya0.f22594a);
                break;
            case 13:
                function1.invoke(zya0.f45197a);
                break;
            case 14:
                fxb.D(ivb0.b, new wta0(function1, (byte) 10)).a();
                break;
            case 15:
                fxb.D(ivb0.b, new wta0(function1, (byte) 9)).a();
                break;
            case 16:
                function1.invoke(znb0.f44669a);
                break;
            case 17:
                function1.invoke(dob0.f6407a);
                break;
            case 18:
                function1.invoke(aob0.f1193a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(bob0.f2927a);
                break;
            case 20:
                function1.invoke(new ot30(jam0.d));
                break;
            case 21:
                function1.invoke(uqk0.f36123a);
                break;
            case 22:
                function1.invoke(j520.f15913a);
                break;
            case 23:
                function1.invoke(i320.f14077a);
                break;
            case 24:
                function1.invoke(c520Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(h320.f12365a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(c520Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(m420.f21146a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new i9c0(false));
                function1.invoke(b9c0.f2203a);
                break;
            default:
                function1.invoke(new g9c0(""));
                break;
        }
        return Unit.f46060a;
    }
}
