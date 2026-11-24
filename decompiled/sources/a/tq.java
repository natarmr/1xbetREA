package a;

import android.javax.sip.message.Response;
import android.os.SystemClock;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tq implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34360a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ tq(Function0 function0, byte b) {
        this.f34360a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34360a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 1:
                function0.invoke();
                return Unit.f46060a;
            case 2:
                ymx ymxVar = ymx.INTERVAL_100;
                if (SystemClock.uptimeMillis() - ivb0.c > 1000) {
                    function0.invoke();
                    dyb.u0();
                }
                return Unit.f46060a;
            case 3:
                ymx ymxVar2 = ymx.INTERVAL_100;
                if (SystemClock.uptimeMillis() - ivb0.c > 1000) {
                    function0.invoke();
                    dyb.u0();
                }
                return Unit.f46060a;
            case 4:
                function0.invoke();
                return Unit.f46060a;
            case 5:
                function0.invoke();
                return Unit.f46060a;
            case 6:
                function0.invoke();
                return Unit.f46060a;
            case 7:
                function0.invoke();
                return Unit.f46060a;
            case 8:
                function0.invoke();
                return Unit.f46060a;
            case 9:
                function0.invoke();
                return Unit.f46060a;
            case 10:
                function0.invoke();
                return Unit.f46060a;
            case 11:
                function0.invoke();
                return Unit.f46060a;
            case 12:
                ymx ymxVar3 = ymx.INTERVAL_100;
                if (SystemClock.uptimeMillis() - ivb0.c > Response.BAD_REQUEST) {
                    dyb.u0();
                    function0.invoke();
                }
                return Unit.f46060a;
            case 13:
                function0.invoke();
                return Unit.f46060a;
            case 14:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 15:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 16:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 17:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 18:
                int i = BetInputView.v;
                function0.invoke();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i2 = BetInputView.v;
                function0.invoke();
                return Unit.f46060a;
            case 20:
                function0.invoke();
                return Unit.f46060a;
            case 21:
                return new ycl(((Number) function0.invoke()).floatValue() * l18.e);
            case 22:
                return new ycl(((Number) function0.invoke()).floatValue() * l18.j);
            case 23:
                return new ycl(((Number) function0.invoke()).floatValue() * l18.k);
            case 24:
                return Float.valueOf(((Number) function0.invoke()).floatValue() * (-7.0f));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function0.invoke();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function0.invoke();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function0.invoke();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function0.invoke();
                return Unit.f46060a;
            default:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
        }
    }
}
