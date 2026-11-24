package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class cvs0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5045a;
    public final Object b;

    public /* synthetic */ cvs0(Object obj, byte b) {
        this.f5045a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5045a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new q0h0((p0h0) ((xus0) obj).invoke());
            case 1:
                return (dvs0) obj;
            case 2:
                return (riu0) ((cvs0) obj).invoke();
            case 3:
                return (hvs0) obj;
            case 4:
                return (riu0) ((cvs0) obj).invoke();
            case 5:
                return f2o.c(c2o.y, ((hcp0) obj).toString());
            case 6:
                return (czt0) obj;
            case 7:
                return (riu0) ((cvs0) obj).invoke();
            case 8:
                return (List) ((j3u0) obj).m.getValue();
            case 9:
                return (y6u0) obj;
            case 10:
                return (riu0) ((cvs0) obj).invoke();
            case 11:
                return (w7u0) obj;
            case 12:
                return (riu0) ((cvs0) obj).invoke();
            case 13:
                return (a9u0) obj;
            case 14:
                return (riu0) ((cvs0) obj).invoke();
            case 15:
                return (mau0) obj;
            case 16:
                return (riu0) ((cvs0) obj).invoke();
            case 17:
                return (riu0) ((avs0) obj).invoke();
            case 18:
                return (csu0) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((cvs0) obj).invoke();
            case 20:
                return (riu0) ((avs0) obj).invoke();
            case 21:
                return (w1v0) obj;
            case 22:
                return (riu0) ((cvs0) obj).invoke();
            case 23:
                return (a2v0) obj;
            case 24:
                return (riu0) ((cvs0) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (u3v0) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((cvs0) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (l6v0) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((cvs0) obj).invoke();
            default:
                return (riu0) ((avs0) obj).invoke();
        }
    }
}
