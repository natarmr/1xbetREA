package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class ej50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7890a;
    public final Object b;

    public /* synthetic */ ej50(Object obj, byte b) {
        this.f7890a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7890a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((pv10) obj).invoke();
            case 1:
                Function0 function0 = ((zl50) obj).b;
                if (function0 != null) {
                    return (List) function0.invoke();
                }
                return null;
            case 2:
                return (wr50) obj;
            case 3:
                return (riu0) ((ej50) obj).invoke();
            case 4:
                return new q0h0((p0h0) ((mj60) obj).invoke());
            case 5:
                return (oj60) obj;
            case 6:
                return (riu0) ((ej50) obj).invoke();
            case 7:
                return (ik60) obj;
            case 8:
                return (riu0) ((ej50) obj).invoke();
            case 9:
                return (wn60) obj;
            case 10:
                return (riu0) ((ej50) obj).invoke();
            case 11:
                return (eo60) obj;
            case 12:
                return (riu0) ((ej50) obj).invoke();
            case 13:
                return (lo60) obj;
            case 14:
                return (riu0) ((ej50) obj).invoke();
            case 15:
                return (riu0) ((es60) obj).invoke();
            case 16:
                return (riu0) ((ut60) obj).invoke();
            case 17:
                return (riu0) ((yt60) obj).invoke();
            case 18:
                return (cu60) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((ej50) obj).invoke();
            case 20:
                return (riu0) ((dx60) obj).invoke();
            case 21:
                return (riu0) ((dz60) obj).invoke();
            case 22:
                return (riu0) ((dz60) obj).invoke();
            case 23:
                return (riu0) ((n170) obj).invoke();
            case 24:
                return (oe70) obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((ej50) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (vf70) obj;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (riu0) ((ej50) obj).invoke();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (dg70) obj;
            default:
                return (riu0) ((ej50) obj).invoke();
        }
    }
}
