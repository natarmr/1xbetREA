package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class l9i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19654a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l9i0(Object obj, byte b) {
        this.f19654a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19654a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((yxf0) obj).invoke();
            case 1:
                return (t9i0) obj;
            case 2:
                return (riu0) ((l9i0) obj).invoke();
            case 3:
                return new q0h0((p0h0) ((obi0) obj).invoke());
            case 4:
                return (rbi0) obj;
            case 5:
                return (riu0) ((l9i0) obj).invoke();
            case 6:
                return (xki0) obj;
            case 7:
                return (riu0) ((l9i0) obj).invoke();
            case 8:
                return (bri0) obj;
            case 9:
                return (riu0) ((l9i0) obj).invoke();
            case 10:
                return (t1j0) obj;
            case 11:
                return (riu0) ((l9i0) obj).invoke();
            case 12:
                return (d4j0) obj;
            case 13:
                return (riu0) ((l9i0) obj).invoke();
            case 14:
                return (cnj0) obj;
            case 15:
                return (riu0) ((l9i0) obj).invoke();
            case 16:
                return new q0h0((p0h0) ((avj0) obj).invoke());
            case 17:
                return new q0h0((p0h0) ((zuj0) obj).invoke());
            case 18:
                return (jvj0) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (kvj0) obj;
            case 20:
                return (riu0) ((l9i0) obj).invoke();
            case 21:
                return (riu0) ((l9i0) obj).invoke();
            case 22:
                return (riu0) ((lph0) obj).invoke();
            case 23:
                return (oyj0) obj;
            case 24:
                return (riu0) ((l9i0) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (tik0) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((l9i0) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (ayk0) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((l9i0) obj).invoke();
            default:
                return (hyk0) obj;
        }
    }
}
