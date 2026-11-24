package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class ubn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35389a;
    public final /* synthetic */ a4x b;

    public /* synthetic */ ubn(a4x a4xVar, byte b) {
        this.f35389a = b;
        this.b = a4xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35389a;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 1:
                return sre0.f32672a.b(((p6t0) a4xVar.get(((Number) obj).intValue())).getClass()).J();
            case 2:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 3:
                return sre0.f32672a.b(((zgp) a4xVar.get(((Number) obj).intValue())).getClass());
            case 4:
                return sre0.f32672a.b(((haj) a4xVar.get(((Number) obj).intValue())).getClass());
            case 5:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 6:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 7:
                return sre0.f32672a.b(((jax) a4xVar.get(((Number) obj).intValue())).getClass());
            case 8:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 9:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 10:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 11:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 12:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 13:
                return sre0.f32672a.b(((in40) a4xVar.get(((Number) obj).intValue())).getClass());
            case 14:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 15:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 16:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 17:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 18:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 20:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 21:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 22:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 23:
                return sre0.f32672a.b(((y0f0) a4xVar.get(((Number) obj).intValue())).getClass());
            case 24:
                return sre0.f32672a.b(((x0f0) a4xVar.get(((Number) obj).intValue())).getClass());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return sre0.f32672a.b(((p6t0) a4xVar.get(((Number) obj).intValue())).getClass());
            default:
                a4xVar.get(((Number) obj).intValue());
                return null;
        }
    }
}
