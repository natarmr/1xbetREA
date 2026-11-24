package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class be00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2426a;
    public final /* synthetic */ Object b;

    public /* synthetic */ be00(Object obj, byte b) {
        this.f2426a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2426a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new q0h0((p0h0) ((xd00) obj).invoke());
            case 1:
                return (ce00) obj;
            case 2:
                return (riu0) ((be00) obj).invoke();
            case 3:
                return (yl00) obj;
            case 4:
                return (riu0) ((be00) obj).invoke();
            case 5:
                return new q0h0((p0h0) ((zs00) obj).invoke());
            case 6:
                return (ct00) obj;
            case 7:
                return (riu0) ((be00) obj).invoke();
            case 8:
                return (k210) obj;
            case 9:
                return (riu0) ((be00) obj).invoke();
            case 10:
                return (r810) obj;
            case 11:
                return (riu0) ((be00) obj).invoke();
            case 12:
                return (g910) obj;
            case 13:
                return (riu0) ((be00) obj).invoke();
            case 14:
                return (hj10) obj;
            case 15:
                return (riu0) ((be00) obj).invoke();
            case 16:
                return (lj10) obj;
            case 17:
                return (riu0) ((be00) obj).invoke();
            case 18:
                return (al10) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((be00) obj).invoke();
            case 20:
                return (fm10) obj;
            case 21:
                return (riu0) ((be00) obj).invoke();
            case 22:
                return (zp10) obj;
            case 23:
                return (riu0) ((be00) obj).invoke();
            case 24:
                return (yr10) obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((be00) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new q0h0((p0h0) ((cv10) obj).invoke());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (hv10) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((be00) obj).invoke();
            default:
                return (qv10) obj;
        }
    }
}
