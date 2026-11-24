package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dbn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5814a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ dbn(Function0 function0, byte b) {
        this.f5814a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5814a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                dyb.Q(new dbn(function0, (byte) 1));
                return Unit.f46060a;
            case 1:
                function0.invoke();
                dyb.u0();
                return Boolean.TRUE;
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
                function0.invoke();
                return Unit.f46060a;
            case 14:
                try {
                    return (List) function0.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return iun.f15405a;
                }
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
                return Float.valueOf(l1e0.c(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
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
                function0.invoke();
                return Unit.f46060a;
            case 23:
                function0.invoke();
                return Unit.f46060a;
            case 24:
                function0.invoke();
                return Unit.f46060a;
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
                function0.invoke();
                return Unit.f46060a;
        }
    }
}
