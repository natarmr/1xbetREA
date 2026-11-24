package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class fyk0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10361a;
    public final Object b;

    public /* synthetic */ fyk0(Object obj, byte b) {
        this.f10361a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10361a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((l9i0) obj).invoke();
            case 1:
                return (gbl0) obj;
            case 2:
                return (riu0) ((fyk0) obj).invoke();
            case 3:
                return (ddl0) obj;
            case 4:
                return (riu0) ((fyk0) obj).invoke();
            case 5:
                return (riu0) ((lph0) obj).invoke();
            case 6:
                return (riu0) ((lph0) obj).invoke();
            case 7:
                return d9x.U((hzs0) ((q4m0) obj).b);
            case 8:
                return (nam0) obj;
            case 9:
                return (riu0) ((fyk0) obj).invoke();
            case 10:
                return (hqm0) obj;
            case 11:
                return (riu0) ((fyk0) obj).invoke();
            case 12:
                return (hvm0) obj;
            case 13:
                return (riu0) ((fyk0) obj).invoke();
            case 14:
                return (eym0) obj;
            case 15:
                return (riu0) ((fyk0) obj).invoke();
            case 16:
                return new xzs0(((xzs0) obj).f41769a);
            case 17:
                bfn0 bfn0Var = (bfn0) obj;
                return bfn0Var.i(uvw.t(bfn0Var.b, null, 3));
            case 18:
                return (whn0) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((fyk0) obj).invoke();
            case 20:
                return new q0h0((p0h0) ((fjn0) obj).invoke());
            case 21:
                return (jjn0) obj;
            case 22:
                return (riu0) ((fyk0) obj).invoke();
            case 23:
                return (npn0) obj;
            case 24:
                return (riu0) ((fyk0) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (ypn0) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((fyk0) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new q0h0((p0h0) ((xtn0) obj).invoke());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (bun0) obj;
            default:
                return (riu0) ((fyk0) obj).invoke();
        }
    }
}
