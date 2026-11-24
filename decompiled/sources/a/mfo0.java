package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class mfo0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21703a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mfo0(Object obj, byte b) {
        this.f21703a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21703a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((cym0) obj).invoke();
            case 1:
                return new q0h0((p0h0) ((qfo0) obj).invoke());
            case 2:
                return (ufo0) obj;
            case 3:
                return (riu0) ((mfo0) obj).invoke();
            case 4:
                return new q0h0((p0h0) ((gho0) obj).invoke());
            case 5:
                return (jho0) obj;
            case 6:
                return (riu0) ((mfo0) obj).invoke();
            case 7:
                return (t5p0) obj;
            case 8:
                return (riu0) ((mfo0) obj).invoke();
            case 9:
                return (xip0) obj;
            case 10:
                return (riu0) ((mfo0) obj).invoke();
            case 11:
                return (zqp0) obj;
            case 12:
                return (riu0) ((mfo0) obj).invoke();
            case 13:
                return (p1q0) obj;
            case 14:
                return (riu0) ((mfo0) obj).invoke();
            case 15:
                return (gbq0) obj;
            case 16:
                return (riu0) ((mfo0) obj).invoke();
            case 17:
                return (xbq0) obj;
            case 18:
                return (riu0) ((mfo0) obj).invoke();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (geq0) obj;
            case 20:
                return (riu0) ((mfo0) obj).invoke();
            case 21:
                return (qeq0) obj;
            case 22:
                return (riu0) ((mfo0) obj).invoke();
            case 23:
                return (weq0) obj;
            case 24:
                return (riu0) ((mfo0) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (ilq0) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((mfo0) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (nmq0) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((mfo0) obj).invoke();
            default:
                return (noq0) obj;
        }
    }
}
