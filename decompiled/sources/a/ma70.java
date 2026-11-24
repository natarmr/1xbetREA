package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ma70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21445a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ma70(Function1 function1, byte b) {
        this.f21445a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21445a;
        ir80 ir80Var = ir80.f15244a;
        tb80 tb80Var = tb80.f33651a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(c770.f3849a);
                break;
            case 1:
                function1.invoke(x770.f40402a);
                break;
            case 2:
                function1.invoke(hc70.f12807a);
                break;
            case 3:
                function1.invoke(fc70.f9297a);
                break;
            case 4:
                function1.invoke(gc70.f11046a);
                break;
            case 5:
                function1.invoke(yr70.f43108a);
                break;
            case 6:
                function1.invoke(kq70.f18707a);
                break;
            case 7:
                function1.invoke(lq70.f20473a);
                break;
            case 8:
                function1.invoke(iq70.f15196a);
                break;
            case 9:
                function1.invoke(v900.f37010a);
                break;
            case 10:
                function1.invoke(h780.f12564a);
                break;
            case 11:
                function1.invoke(m780.f21307a);
                break;
            case 12:
                function1.invoke(ya80.f42282a);
                break;
            case 13:
                function1.invoke(tb80Var);
                break;
            case 14:
                function1.invoke(pb80.f26693a);
                break;
            case 15:
                function1.invoke(yb80.f42330a);
                break;
            case 16:
                function1.invoke(tb80Var);
                break;
            case 17:
                function1.invoke(tb80Var);
                break;
            case 18:
                function1.invoke(tb80Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(vgr0.f37396a);
                break;
            case 20:
                function1.invoke(yq80.f43064a);
                break;
            case 21:
                function1.invoke(kr80.f18752a);
                break;
            case 22:
                function1.invoke(zq80.f44796a);
                break;
            case 23:
                function1.invoke(dr80.f6546a);
                break;
            case 24:
                function1.invoke(gr80.f11767a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(ir80Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(ir80Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(hr80.f13519a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(yt80.f43206a);
                break;
            default:
                function1.invoke(rt80.f31066a);
                break;
        }
        return Unit.f46060a;
    }
}
