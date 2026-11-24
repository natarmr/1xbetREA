package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class q7g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28248a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q7g(Object obj, byte b) {
        this.f28248a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28248a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (s7g) obj;
            case 1:
                return (riu0) ((q7g) obj).invoke();
            case 2:
                return (y7g) obj;
            case 3:
                return (riu0) ((q7g) obj).invoke();
            case 4:
                return (h8g) obj;
            case 5:
                return (riu0) ((q7g) obj).invoke();
            case 6:
                return (b9g) obj;
            case 7:
                return (riu0) ((q7g) obj).invoke();
            case 8:
                return (dcg) obj;
            case 9:
                return (riu0) ((q7g) obj).invoke();
            case 10:
                return (wcg) obj;
            case 11:
                return (riu0) ((q7g) obj).invoke();
            case 12:
                return (vgg) obj;
            case 13:
                return (riu0) ((q7g) obj).invoke();
            case 14:
                return (upg) obj;
            case 15:
                return (riu0) ((q7g) obj).invoke();
            case 16:
                return (riu0) ((x4h) obj).invoke();
            case 17:
                return (riu0) ((x4h) obj).invoke();
            case 18:
                return (dsh) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((q7g) obj).invoke();
            case 20:
                return (ngj) obj;
            case 21:
                return (riu0) ((q7g) obj).invoke();
            case 22:
                return (riu0) ((jgj) obj).invoke();
            case 23:
                return (ysj) obj;
            case 24:
                return (riu0) ((q7g) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                kyq0 kyq0Var = ((m3k0) obj).i;
                return new y3d(fbc.P(ihn.c.a(0.0f > 0.01f ? 1.0f : 0.0f), kyq0Var.f19119a, kyq0Var.b));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (u8k) obj;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (riu0) ((q7g) obj).invoke();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (c9k) obj;
            default:
                return (riu0) ((q7g) obj).invoke();
        }
    }
}
