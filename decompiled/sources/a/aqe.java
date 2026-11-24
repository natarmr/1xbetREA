package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class aqe implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1292a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aqe(Object obj, byte b) {
        this.f1292a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1292a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (bqe) obj;
            case 1:
                return (riu0) ((aqe) obj).invoke();
            case 2:
                return (riu0) ((ype) obj).invoke();
            case 3:
                return (axe) obj;
            case 4:
                return (riu0) ((aqe) obj).invoke();
            case 5:
                return new q0h0((p0h0) ((jwd) obj).invoke());
            case 6:
                return (rye) obj;
            case 7:
                return (riu0) ((aqe) obj).invoke();
            case 8:
                return (xye) obj;
            case 9:
                return (riu0) ((aqe) obj).invoke();
            case 10:
                return new q0h0((p0h0) ((yye) obj).invoke());
            case 11:
                return (gze) obj;
            case 12:
                return (riu0) ((aqe) obj).invoke();
            case 13:
                return new q0h0((p0h0) ((kaf) obj).invoke());
            case 14:
                return (oaf) obj;
            case 15:
                return (riu0) ((aqe) obj).invoke();
            case 16:
                return (yef) obj;
            case 17:
                return (riu0) ((aqe) obj).invoke();
            case 18:
                return (cff) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((aqe) obj).invoke();
            case 20:
                return (o0g) obj;
            case 21:
                return (riu0) ((aqe) obj).invoke();
            case 22:
                return (v4g) obj;
            case 23:
                return (riu0) ((aqe) obj).invoke();
            case 24:
                return (n5g) obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((aqe) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (l6g) obj;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (riu0) ((aqe) obj).invoke();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (f7g) obj;
            default:
                return (riu0) ((aqe) obj).invoke();
        }
    }
}
