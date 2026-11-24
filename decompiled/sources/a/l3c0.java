package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l3c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19351a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ l3c0(Function0 function0, byte b) {
        this.f19351a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        byte b = this.f19351a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Number) function0.invoke()).floatValue();
                f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
                return Float.valueOf(f <= 1.0f ? f : 1.0f);
            case 1:
                float fFloatValue2 = ((Number) function0.invoke()).floatValue();
                f = fFloatValue2 >= 0.0f ? fFloatValue2 : 0.0f;
                return Float.valueOf(f <= 1.0f ? f : 1.0f);
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
                function0.invoke();
                return Unit.f46060a;
            case 13:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 14:
                function0.invoke();
                return Unit.f46060a;
            case 15:
                function0.invoke();
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
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function0.invoke();
                return Unit.f46060a;
            case 20:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 21:
                if (function0 != null) {
                    function0.invoke();
                }
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
