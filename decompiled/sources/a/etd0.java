package a;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;
import org.xplatform.ui_core.viewcomponents.views.RadialProgressView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class etd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8371a;

    public /* synthetic */ etd0(byte b) {
        this.f8371a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8371a) {
            case 0:
                return new zw3(vrd0.f37895a, (byte) 0);
            case 1:
                return new zw3(qsd0.f29253a, (byte) 0);
            case 2:
                int i = RadialProgressView.m;
                return new DecelerateInterpolator();
            case 3:
                int i2 = RadialProgressView.m;
                return new AccelerateInterpolator();
            case 4:
                return new zw3(lvd0.f20710a, (byte) 0);
            case 5:
                okx okxVar = okx.f25427a;
                return new inv(okxVar, okxVar, (byte) 1);
            case 6:
                okx okxVar2 = okx.f25427a;
                return new inv(okxVar2, okxVar2, (byte) 1);
            case 7:
                return new zw3(xud0.f41505a, (byte) 0);
            case 8:
                return new zw3(uxd0.f36436a, (byte) 0);
            case 9:
                return new zw3(jyd0.f17354a, (byte) 0);
            case 10:
                return new zw3(byd0.f3412a, (byte) 0);
            case 11:
                return new zw3(xyd0.f41703a, (byte) 0);
            case 12:
                return new zw3(bzd0.f3462a, (byte) 0);
            case 13:
                return new zw3(vzd0.f38293a, (byte) 0);
            case 14:
                return new zw3(nzd0.f24368a, (byte) 0);
            case 15:
                return new zw3(a0e0.f23a, (byte) 0);
            case 16:
                return new zw3(rzd0.f31355a, (byte) 0);
            case 17:
                return new zw3(jzd0.f17407a, (byte) 0);
            case 18:
                return new zw3(l0e0.f19197a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i3 = d1e0.e0;
                return ius.f15411a;
            case 20:
                return new dms();
            case 21:
                return new zw3(iiv.f14847a, (byte) 0);
            case 22:
                return new zw3(b2e0.f1848a, (byte) 0);
            case 23:
                return new n4e0(null, true, false, false);
            case 24:
                return new zw3(g6e0.f10760a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new v5e0(iun.f15405a, true, false);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(whp0.f39176a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(o9a0.f24870a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(d9e0.f5697a, (byte) 0);
            default:
                return new zw3(l9e0.f19648a, (byte) 0);
        }
    }
}
