package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class p46 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26336a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p46(Object obj, byte b) {
        this.f26336a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26336a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((pp4) obj).invoke();
            case 1:
                return (wd6) obj;
            case 2:
                return (riu0) ((p46) obj).invoke();
            case 3:
                return (fo6) obj;
            case 4:
                return (riu0) ((p46) obj).invoke();
            case 5:
                return (zp6) obj;
            case 6:
                return (riu0) ((p46) obj).invoke();
            case 7:
                return (er6) obj;
            case 8:
                return (riu0) ((p46) obj).invoke();
            case 9:
                return (kt6) obj;
            case 10:
                return (riu0) ((p46) obj).invoke();
            case 11:
                return new q0h0((p0h0) ((lt6) obj).invoke());
            case 12:
                return (st6) obj;
            case 13:
                return (riu0) ((p46) obj).invoke();
            case 14:
                return (hz6) obj;
            case 15:
                return (riu0) ((p46) obj).invoke();
            case 16:
                return (ke7) obj;
            case 17:
                return (riu0) ((p46) obj).invoke();
            case 18:
                return new q0h0((p0h0) ((g28) obj).invoke());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (j28) obj;
            case 20:
                return (riu0) ((p46) obj).invoke();
            case 21:
                return new q0h0((p0h0) ((e38) obj).invoke());
            case 22:
                return (h38) obj;
            case 23:
                return (riu0) ((p46) obj).invoke();
            case 24:
                return (e68) obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((p46) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (jj8) obj;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (riu0) ((p46) obj).invoke();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (r59) obj;
            default:
                return (riu0) ((p46) obj).invoke();
        }
    }
}
