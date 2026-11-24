package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class wl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39332a;
    public final /* synthetic */ a4x b;

    public wl0(a4x a4xVar) {
        this.f39332a = (byte) 14;
        tfc tfcVar = tfc.b;
        this.b = a4xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39332a;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                return sre0.f32672a.b(((am0) a4xVar.get(((Number) obj).intValue())).getClass());
            case 1:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 2:
                return sre0.f32672a.b(((pu1) a4xVar.get(((Number) obj).intValue())).getClass());
            case 3:
                return sre0.f32672a.b(((nw1) a4xVar.get(((Number) obj).intValue())).getClass());
            case 4:
                return sre0.f32672a.b(((lu1) a4xVar.get(((Number) obj).intValue())).getClass());
            case 5:
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 6:
                return sre0.f32672a.b(((p6t0) a4xVar.get(((Number) obj).intValue())).getClass());
            case 7:
                return sre0.f32672a.b(((p6t0) a4xVar.get(((Number) obj).intValue())).getClass());
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
                return sre0.f32672a.b(((cja) a4xVar.get(((Number) obj).intValue())).getClass());
            case 13:
                return sre0.f32672a.b(((y2b) a4xVar.get(((Number) obj).intValue())).getClass());
            case 14:
                return tfc.b.get(a4xVar.get(((Number) obj).intValue()));
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
                a4xVar.get(((Number) obj).intValue());
                return null;
            case 24:
                a4xVar.get(((Number) obj).intValue());
                return null;
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
                a4xVar.get(((Number) obj).intValue());
                return null;
            default:
                a4xVar.get(((Number) obj).intValue());
                return null;
        }
    }

    public /* synthetic */ wl0(a4x a4xVar, byte b) {
        this.f39332a = b;
        this.b = a4xVar;
    }
}
