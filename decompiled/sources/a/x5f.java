package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.crystal.presentation.views.CrystalStatusView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb.Cs2GameLogBombTimerView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x5f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40313a;

    public /* synthetic */ x5f(byte b) {
        this.f40313a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40313a) {
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
                return new zw3(ysm0.f43175a, (byte) 0);
            case 12:
                return new zw3(ogf.f25216a, (byte) 0);
            case 13:
                return new zw3(ogf.f25216a, (byte) 0);
            case 14:
                return new zw3(hgf.f13016a, (byte) 0);
            case 15:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 16:
                return new zw3(cif.f4410a, (byte) 0);
            case 17:
                return new inv(mrv.j0(ysm0.f43175a), mrv.j0(new zw3(okx.f25427a, (byte) 0)), (byte) 1);
            case 18:
                return new zw3(ehf.f7805a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i = CrystalStatusView.e;
                return new fif(3, null);
            case 20:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 21:
                return new zw3(qkg.f28882a, (byte) 0);
            case 22:
                return new zw3(tjf.f34045a, (byte) 0);
            case 23:
                return new zw3(yif.f42686a, (byte) 0);
            case 24:
                return new zw3(ljf.f20147a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(ijf.f14870a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(pjf.f27088a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i2 = Cs2GameLogBombTimerView.f;
                rwj rwjVar = tvk.f34603a;
                return d5c.a(ys10.f43147a.x());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new dms();
            default:
                int i3 = rnf.e0;
                return ius.f15411a;
        }
    }
}
