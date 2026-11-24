package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.tile_matching.presentation.views.TileMatchingGameFieldView;
import org.xplatform.ui_core.viewcomponents.views.TimerView;
import org.xplatform.uikit.components.search_field.TextInputEditText;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ozp0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26111a;

    public /* synthetic */ ozp0(byte b) {
        this.f26111a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26111a) {
            case 0:
                return new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            case 1:
                return new zw3(sgv0.f32181a, (byte) 0);
            case 2:
                return new zw3(sgv0.f32181a, (byte) 0);
            case 3:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 4:
                return new p0q0(true, false, false, false, rgv0.g);
            case 5:
                return new zw3(m3q0.f21130a, (byte) 0);
            case 6:
                return new zw3(q2q0.f28014a, (byte) 0);
            case 7:
            case 8:
                return null;
            case 9:
                int i = TextInputEditText.n;
                return Unit.f46060a;
            case 10:
                int i2 = TextInputEditText.n;
                return Unit.f46060a;
            case 11:
                int i3 = TextInputEditText.n;
                return Unit.f46060a;
            case 12:
                return m1t0.f21026a;
            case 13:
                return new ikx(0L);
            case 14:
                return new ikx(0L);
            case 15:
                return yxj.f43425a;
            case 16:
                long j = y3d.g;
                return new ThemeColors(j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, null);
            case 17:
                return Unit.f46060a;
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return Unit.f46060a;
            case 21:
                int i4 = TileMatchingGameFieldView.h;
                return Unit.f46060a;
            case 22:
                return new zw3(mrv.j0(c95.f3945a), (byte) 0);
            case 23:
                return new zw3(mrv.j0(d95.f5683a), (byte) 0);
            case 24:
                return new zw3(mrv.j0(e95.f7404a), (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(mrv.j0(f95.f9138a), (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(mrv.j0(g95.f10895a), (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(mrv.j0(h95.f12661a), (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                int i5 = TimerView.x;
                return Unit.f46060a;
        }
    }
}
