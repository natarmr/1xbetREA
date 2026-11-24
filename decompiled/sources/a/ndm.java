package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.timer.DsTimer;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ndm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23341a;

    public /* synthetic */ ndm(byte b) {
        this.f23341a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23341a) {
            case 0:
                return Unit.f46060a;
            case 1:
                return Unit.f46060a;
            case 2:
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            case 4:
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                return Unit.f46060a;
            case 7:
                return Unit.f46060a;
            case 8:
                return Unit.f46060a;
            case 9:
                return Unit.f46060a;
            case 10:
                return Unit.f46060a;
            case 11:
                return Unit.f46060a;
            case 12:
                return Unit.f46060a;
            case 13:
                return Unit.f46060a;
            case 14:
                int i = DsLottieEmpty.t;
                kin0 kin0VarE = qem0.e();
                rwj rwjVar = tvk.f34603a;
                return d5c.a(kotlin.coroutines.e.c(kin0VarE, ys10.f43147a.x()));
            case 15:
                int i2 = DsMenuCell.g1;
                return Unit.f46060a;
            case 16:
                int i3 = DsMenuCell.g1;
                return Unit.f46060a;
            case 17:
                int i4 = DsNavigationBar.l;
                return Unit.f46060a;
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return androidx.compose.runtime.e.a(0.0f);
            case 21:
                return androidx.compose.runtime.e.a(0.0f);
            case 22:
                return "";
            case 23:
                return androidx.compose.runtime.e.e(Boolean.TRUE);
            case 24:
                return androidx.compose.runtime.e.e(Boolean.TRUE);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return androidx.compose.runtime.e.e(Boolean.TRUE);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return androidx.compose.runtime.e.e(Boolean.TRUE);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i5 = DsTimer.A;
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return Unit.f46060a;
        }
    }
}
