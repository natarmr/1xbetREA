package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class pv10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27641a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pv10(Object obj, byte b) {
        this.f27641a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27641a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((be00) obj).invoke();
            case 1:
                return new q0h0((p0h0) ((zv10) obj).invoke());
            case 2:
                return (dw10) obj;
            case 3:
                return (riu0) ((pv10) obj).invoke();
            case 4:
                return (c020) obj;
            case 5:
                return (riu0) ((pv10) obj).invoke();
            case 6:
                return new q0h0((p0h0) ((q620) obj).invoke());
            case 7:
                return (riu0) ((x620) obj).invoke();
            case 8:
                return (c720) obj;
            case 9:
                return (riu0) ((x620) obj).invoke();
            case 10:
                return (riu0) ((pv10) obj).invoke();
            case 11:
                return (i820) obj;
            case 12:
                return (riu0) ((pv10) obj).invoke();
            case 13:
                return (b630) obj;
            case 14:
                return (riu0) ((pv10) obj).invoke();
            case 15:
                return (i630) obj;
            case 16:
                return (riu0) ((pv10) obj).invoke();
            case 17:
                return (s730) obj;
            case 18:
                return (riu0) ((pv10) obj).invoke();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (ik30) obj;
            case 20:
                return (riu0) ((pv10) obj).invoke();
            case 21:
                return (sr30) obj;
            case 22:
                return (riu0) ((pv10) obj).invoke();
            case 23:
                return (us30) obj;
            case 24:
                return (riu0) ((pv10) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (ik40) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((pv10) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (o450) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((pv10) obj).invoke();
            default:
                return (fj50) obj;
        }
    }
}
