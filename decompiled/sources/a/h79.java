package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class h79 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12565a;
    public final Object b;

    public /* synthetic */ h79(Object obj, byte b) {
        this.f12565a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12565a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (j79) obj;
            case 1:
                return (riu0) ((h79) obj).invoke();
            case 2:
                return (z79) obj;
            case 3:
                return (riu0) ((h79) obj).invoke();
            case 4:
                tc9 tc9Var = (tc9) obj;
                return tc9Var.f33709a.j(tc9Var.b).I();
            case 5:
                return (br9) obj;
            case 6:
                return (riu0) ((h79) obj).invoke();
            case 7:
                return (qz9) obj;
            case 8:
                return (riu0) ((h79) obj).invoke();
            case 9:
                wsy wsyVarB = ((pzs0) obj).b();
                wsyVarB.getClass();
                return wsyVarB;
            case 10:
                return (aya) obj;
            case 11:
                return (riu0) ((h79) obj).invoke();
            case 12:
                return (hgb) obj;
            case 13:
                return (riu0) ((h79) obj).invoke();
            case 14:
                return (job) obj;
            case 15:
                return (riu0) ((h79) obj).invoke();
            case 16:
                return (xpb) obj;
            case 17:
                return (riu0) ((h79) obj).invoke();
            case 18:
                return new q0h0((p0h0) ((oqb) obj).invoke());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (rqb) obj;
            case 20:
                return (riu0) ((h79) obj).invoke();
            case 21:
                return new q0h0((p0h0) ((o0c) obj).invoke());
            case 22:
                return (r0c) obj;
            case 23:
                return (riu0) ((h79) obj).invoke();
            case 24:
                return new q0h0((p0h0) ((h5c) obj).invoke());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (l5c) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((h79) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (stc) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((h79) obj).invoke();
            default:
                return (tvc) obj;
        }
    }
}
