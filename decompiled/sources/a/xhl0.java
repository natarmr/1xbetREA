package a;

import android.os.Handler;
import android.os.SystemClock;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xhl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40898a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ xhl0(Function0 function0, byte b) {
        this.f40898a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40898a;
        byte b2 = 20;
        byte b3 = 23;
        byte b4 = 29;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 1:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 2:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 3:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 4:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 5:
                Boolean bool = (Boolean) function0.invoke();
                bool.booleanValue();
                return bool;
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
                Boolean bool2 = (Boolean) function0.invoke();
                bool2.booleanValue();
                return bool2;
            case 10:
                function0.invoke();
                return Unit.f46060a;
            case 11:
                function0.invoke();
                return Unit.f46060a;
            case 12:
                return (Handler) function0.invoke();
            case 13:
                function0.invoke();
                return Unit.f46060a;
            case 14:
                function0.invoke();
                return Unit.f46060a;
            case 15:
                function0.invoke();
                return Unit.f46060a;
            case 16:
                function0.invoke();
                return Unit.f46060a;
            case 17:
                function0.invoke();
                return Unit.f46060a;
            case 18:
                dyb.Q(new xhl0(function0, b2));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                dyb.Q(new xhl0(function0, b2));
                return Unit.f46060a;
            case 20:
                function0.invoke();
                dyb.u0();
                return Boolean.TRUE;
            case 21:
                dyb.Q(new xhl0(function0, b3));
                return Unit.f46060a;
            case 22:
                dyb.Q(new xhl0(function0, b3));
                return Unit.f46060a;
            case 23:
                function0.invoke();
                dyb.u0();
                return Boolean.TRUE;
            case 24:
                ymx ymxVar = ymx.INTERVAL_100;
                if (SystemClock.uptimeMillis() - ivb0.c > 400) {
                    function0.invoke();
                    dyb.u0();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                dyb.Q(new xhl0(function0, (byte) 26));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function0.invoke();
                dyb.u0();
                return Boolean.TRUE;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                dyb.Q(new xhl0(function0, b4));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                dyb.Q(new xhl0(function0, b4));
                return Unit.f46060a;
            default:
                function0.invoke();
                dyb.u0();
                return Boolean.TRUE;
        }
    }
}
