package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pk9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27125a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ pk9(Function0 function0, byte b) {
        this.f27125a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27125a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function0.invoke();
                return Unit.f46060a;
            case 1:
                function0.invoke();
                return Unit.f46060a;
            case 2:
                function0.invoke();
                return Unit.f46060a;
            case 3:
                function0.invoke();
                return Unit.f46060a;
            case 4:
                function0.invoke();
                return Unit.f46060a;
            case 5:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 6:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 7:
                if (function0 != null) {
                    function0.invoke();
                }
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
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
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
                float fC = l1e0.c((0.65f - ((Number) function0.invoke()).floatValue()) / 0.65f, 0.0f, 1.0f);
                return Boolean.valueOf(fC * fC > 0.001f);
            case 17:
                return Float.valueOf(1.0f - l1e0.c(((Number) function0.invoke()).floatValue() / 0.33333334f, 0.0f, 1.0f));
            case 18:
                fxb.D(ivb0.b, new pk9(function0, (byte) 19)).a();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function0.invoke();
                return Unit.f46060a;
            case 20:
                function0.invoke();
                return Unit.f46060a;
            case 21:
                function0.invoke();
                return Unit.f46060a;
            case 22:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 23:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 24:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            default:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
        }
    }
}
