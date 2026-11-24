package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ouh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25876a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ouh(Function1 function1, byte b) {
        this.f25876a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25876a;
        t7k t7kVar = t7k.f33471a;
        iuh iuhVar = iuh.f15395a;
        xok xokVar = xok.f41224a;
        epk epkVar = epk.f8191a;
        pok pokVar = pok.f27333a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(iuhVar);
                break;
            case 1:
                function1.invoke(iuhVar);
                break;
            case 2:
                function1.invoke(guh.f11928a);
                break;
            case 3:
                function1.invoke(iuhVar);
                break;
            case 4:
                function1.invoke(rvh.f31167a);
                break;
            case 5:
                function1.invoke(tvh.f34598a);
                break;
            case 6:
                function1.invoke(exh.f8576a);
                break;
            case 7:
                function1.invoke(hxh.f13814a);
                break;
            case 8:
                function1.invoke(e5j.f7236a);
                break;
            case 9:
                fxb.D(ivb0.b, new ouh(function1, (byte) 10)).a();
                break;
            case 10:
                function1.invoke(q3j.f28055a);
                break;
            case 11:
                fxb.D(ivb0.b, new ouh(function1, (byte) 13)).a();
                break;
            case 12:
                function1.invoke(x3j.f40221a);
                break;
            case 13:
                function1.invoke(y3j.f41955a);
                break;
            case 14:
                function1.invoke(new khw("ITEM_VIRTUAL_BANNER"));
                break;
            case 15:
                function1.invoke(ogw.f25238a);
                break;
            case 16:
                function1.invoke(abj0.f583a);
                break;
            case 17:
                function1.invoke(t7kVar);
                break;
            case 18:
                function1.invoke(t7kVar);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(epkVar);
                break;
            case 20:
                function1.invoke(epkVar);
                break;
            case 21:
                function1.invoke(epkVar);
                break;
            case 22:
                function1.invoke(epkVar);
                break;
            case 23:
                function1.invoke(xokVar);
                break;
            case 24:
                function1.invoke(pokVar);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(pokVar);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(xokVar);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(pokVar);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(xokVar);
                break;
            default:
                function1.invoke(pokVar);
                break;
        }
        return Unit.f46060a;
    }
}
