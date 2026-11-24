package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class gg70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11241a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gg70(Object obj, byte b) {
        this.f11241a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11241a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (hg70) obj;
            case 1:
                return (riu0) ((gg70) obj).invoke();
            case 2:
                return (mh70) obj;
            case 3:
                return (riu0) ((gg70) obj).invoke();
            case 4:
                return (qh70) obj;
            case 5:
                return (riu0) ((gg70) obj).invoke();
            case 6:
                return (oi70) obj;
            case 7:
                return (riu0) ((gg70) obj).invoke();
            case 8:
                return (aj70) obj;
            case 9:
                return (riu0) ((gg70) obj).invoke();
            case 10:
                return (yj70) obj;
            case 11:
                return (riu0) ((gg70) obj).invoke();
            case 12:
                return (ok70) obj;
            case 13:
                return (riu0) ((gg70) obj).invoke();
            case 14:
                return (al70) obj;
            case 15:
                return (riu0) ((gg70) obj).invoke();
            case 16:
                return (hl70) obj;
            case 17:
                return (riu0) ((gg70) obj).invoke();
            case 18:
                return (ul70) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((gg70) obj).invoke();
            case 20:
                return (om70) obj;
            case 21:
                return (riu0) ((gg70) obj).invoke();
            case 22:
                return (z880) obj;
            case 23:
                return (riu0) ((gg70) obj).invoke();
            case 24:
                return (riu0) ((cz60) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((cz60) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (gn80) obj;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (riu0) ((gg70) obj).invoke();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (as80) obj;
            default:
                return (riu0) ((gg70) obj).invoke();
        }
    }
}
