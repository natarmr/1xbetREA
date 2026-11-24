package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class f1d0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8760a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f1d0(Object obj, byte b) {
        this.f8760a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8760a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((g8b0) obj).invoke();
            case 1:
                return (h6d0) obj;
            case 2:
                return (riu0) ((f1d0) obj).invoke();
            case 3:
                return (sdd0) obj;
            case 4:
                return (riu0) ((f1d0) obj).invoke();
            case 5:
                return (bed0) obj;
            case 6:
                return (riu0) ((f1d0) obj).invoke();
            case 7:
                return (gfd0) obj;
            case 8:
                return (riu0) ((f1d0) obj).invoke();
            case 9:
                return (jgd0) obj;
            case 10:
                return (riu0) ((f1d0) obj).invoke();
            case 11:
                return (xhd0) obj;
            case 12:
                return (riu0) ((f1d0) obj).invoke();
            case 13:
                return (qid0) obj;
            case 14:
                return (riu0) ((f1d0) obj).invoke();
            case 15:
                return (wid0) obj;
            case 16:
                return (riu0) ((f1d0) obj).invoke();
            case 17:
                return (njd0) obj;
            case 18:
                return (riu0) ((f1d0) obj).invoke();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (nld0) obj;
            case 20:
                return (riu0) ((f1d0) obj).invoke();
            case 21:
                return (ymd0) obj;
            case 22:
                return (riu0) ((f1d0) obj).invoke();
            case 23:
                return (snd0) obj;
            case 24:
                return (riu0) ((f1d0) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (rwd0) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((f1d0) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (xbe0) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((f1d0) obj).invoke();
            default:
                return (mce0) obj;
        }
    }
}
