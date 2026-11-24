package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class wz80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40012a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz80(Object obj, byte b) {
        this.f40012a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40012a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (xz80) obj;
            case 1:
                return (riu0) ((wz80) obj).invoke();
            case 2:
                return (riu0) ((z090) obj).invoke();
            case 3:
                return (riu0) ((z090) obj).invoke();
            case 4:
                return (w590) obj;
            case 5:
                return (riu0) ((wz80) obj).invoke();
            case 6:
                return (o890) obj;
            case 7:
                return (riu0) ((wz80) obj).invoke();
            case 8:
                return (aj90) obj;
            case 9:
                return (riu0) ((wz80) obj).invoke();
            case 10:
                return (zo90) obj;
            case 11:
                return (riu0) ((wz80) obj).invoke();
            case 12:
                return (et90) obj;
            case 13:
                return (riu0) ((wz80) obj).invoke();
            case 14:
                xk80 xk80Var = (xk80) obj;
                return new Pair(Integer.valueOf(xk80Var.k()), Float.valueOf(xk80Var.l()));
            case 15:
                return (tha0) obj;
            case 16:
                return (riu0) ((wz80) obj).invoke();
            case 17:
                return (kia0) obj;
            case 18:
                return (riu0) ((wz80) obj).invoke();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (uia0) obj;
            case 20:
                return (riu0) ((wz80) obj).invoke();
            case 21:
                return (lja0) obj;
            case 22:
                return (riu0) ((wz80) obj).invoke();
            case 23:
                return (d4b0) obj;
            case 24:
                return (riu0) ((wz80) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((u4b0) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((u4b0) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (riu0) ((r6b0) obj).invoke();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (z6b0) obj;
            default:
                return (riu0) ((wz80) obj).invoke();
        }
    }
}
