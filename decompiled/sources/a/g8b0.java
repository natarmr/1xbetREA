package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class g8b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10857a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g8b0(Object obj, byte b) {
        this.f10857a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10857a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (h8b0) obj;
            case 1:
                return (riu0) ((g8b0) obj).invoke();
            case 2:
                mi70 mi70Var = ccb0.X1;
                ((ccb0) obj).I0().x(kxa0.f19045a);
                return Unit.f46060a;
            case 3:
                return (crb0) obj;
            case 4:
                return (riu0) ((g8b0) obj).invoke();
            case 5:
                return (riu0) ((c0c0) obj).invoke();
            case 6:
                return (riu0) ((c0c0) obj).invoke();
            case 7:
                return (h6c0) obj;
            case 8:
                return (riu0) ((g8b0) obj).invoke();
            case 9:
                return (m8c0) obj;
            case 10:
                return (riu0) ((g8b0) obj).invoke();
            case 11:
                return (r8c0) obj;
            case 12:
                return (riu0) ((g8b0) obj).invoke();
            case 13:
                return (idc0) obj;
            case 14:
                return (riu0) ((g8b0) obj).invoke();
            case 15:
                return (yfc0) obj;
            case 16:
                return (riu0) ((g8b0) obj).invoke();
            case 17:
                return (vic0) obj;
            case 18:
                return (riu0) ((g8b0) obj).invoke();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (ikc0) obj;
            case 20:
                return (riu0) ((g8b0) obj).invoke();
            case 21:
                return (ukc0) obj;
            case 22:
                return (riu0) ((g8b0) obj).invoke();
            case 23:
                return (jmc0) obj;
            case 24:
                return (riu0) ((g8b0) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (hnc0) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((g8b0) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (znc0) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((g8b0) obj).invoke();
            default:
                return (g1d0) obj;
        }
    }
}
