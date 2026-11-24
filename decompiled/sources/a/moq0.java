package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class moq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22147a;
    public final /* synthetic */ Object b;

    public /* synthetic */ moq0(Object obj, byte b) {
        this.f22147a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22147a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((mfo0) obj).invoke();
            case 1:
                return (dpq0) obj;
            case 2:
                return (riu0) ((moq0) obj).invoke();
            case 3:
                return (sqq0) obj;
            case 4:
                return (riu0) ((moq0) obj).invoke();
            case 5:
                return new q0h0((p0h0) ((tsq0) obj).invoke());
            case 6:
                return (xsq0) obj;
            case 7:
                return (riu0) ((moq0) obj).invoke();
            case 8:
                return (riu0) ((cym0) obj).invoke();
            case 9:
                return (riu0) ((cym0) obj).invoke();
            case 10:
                return (phr0) obj;
            case 11:
                return (riu0) ((moq0) obj).invoke();
            case 12:
                return (pir0) obj;
            case 13:
                return (riu0) ((moq0) obj).invoke();
            case 14:
                return (amr0) obj;
            case 15:
                return (riu0) ((moq0) obj).invoke();
            case 16:
                return (k1s0) obj;
            case 17:
                return (riu0) ((moq0) obj).invoke();
            case 18:
                return (u2s0) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((moq0) obj).invoke();
            case 20:
                return (u3s0) obj;
            case 21:
                return (riu0) ((moq0) obj).invoke();
            case 22:
                return (z8s0) obj;
            case 23:
                return (riu0) ((moq0) obj).invoke();
            case 24:
                return (zes0) obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((moq0) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (nps0) obj;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (riu0) ((moq0) obj).invoke();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (pps0) obj;
            default:
                return (riu0) ((moq0) obj).invoke();
        }
    }
}
