package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class pp4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27358a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pp4(Object obj, byte b) {
        this.f27358a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27358a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new q0h0((p0h0) ((mp4) obj).invoke());
            case 1:
                return (qp4) obj;
            case 2:
                return (riu0) ((pp4) obj).invoke();
            case 3:
                return new q0h0((p0h0) ((up4) obj).invoke());
            case 4:
                return (vp4) obj;
            case 5:
                return (riu0) ((pp4) obj).invoke();
            case 6:
                return (cr4) obj;
            case 7:
                return (riu0) ((pp4) obj).invoke();
            case 8:
                return new q0h0((p0h0) ((sr4) obj).invoke());
            case 9:
                return (ur4) obj;
            case 10:
                return (riu0) ((pp4) obj).invoke();
            case 11:
                return new q0h0((p0h0) ((lw4) obj).invoke());
            case 12:
                return (rw4) obj;
            case 13:
                return (riu0) ((pp4) obj).invoke();
            case 14:
                return (riu0) ((pw4) obj).invoke();
            case 15:
                return (n75) obj;
            case 16:
                return (riu0) ((pp4) obj).invoke();
            case 17:
                return (ej5) obj;
            case 18:
                return (riu0) ((pp4) obj).invoke();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (bl5) obj;
            case 20:
                return (riu0) ((pp4) obj).invoke();
            case 21:
                return (fl5) obj;
            case 22:
                return (riu0) ((pp4) obj).invoke();
            case 23:
                return (il5) obj;
            case 24:
                return (riu0) ((pp4) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (ol5) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((pp4) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (tu5) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((pp4) obj).invoke();
            default:
                return (q46) obj;
        }
    }
}
