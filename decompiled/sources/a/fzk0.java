package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinWheelView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit_sport.express_card.SportExpressCard;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fzk0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10412a;

    public /* synthetic */ fzk0(byte b) {
        this.f10412a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 3;
        byte b = 0;
        switch (this.f10412a) {
            case 0:
                int i2 = SpinAndWinWheelView.d;
                return Unit.f46060a;
            case 1:
                int i3 = SportExpressCard.r;
                return Unit.f46060a;
            case 2:
                return gqw0.e;
            case 3:
                return new f2q0(3);
            case 4:
                return null;
            case 5:
                lme0 lme0Var = gbl0.c2;
                lnd lndVar = new lnd(knd.f18580a);
                byte b2 = 16;
                gbn gbnVar = new gbn(new shd(b2), new tad(i, (byte) 18), new y2d(b2), qja.Y);
                dp dpVar = lndVar.d;
                dpVar.b(gbnVar);
                byte b3 = 26;
                byte b4 = 23;
                byte b5 = 22;
                dpVar.b(new gbn(new shd(b3), new tad(i, b5), new y2d(b4), fpd.c));
                byte b6 = 20;
                byte b7 = 21;
                dpVar.b(new gbn(new shd(b6), new tad(i, b6), new y2d(b7), qja.f1));
                dpVar.b(new gbn(new shd(b4), new tad(i, b7), new y2d(b5), fpd.b));
                dpVar.b(new gbn(new shd((byte) 29), new tad(i, (byte) 25), new y2d(b3), fpd.f));
                dpVar.b(new gbn(new bqd(b), new tad(i, b3), new y2d((byte) 27), fpd.g));
                byte b8 = 19;
                dpVar.b(new gbn(new shd(b8), new tad(i, b8), new y2d(b8), qja.Z));
                return lndVar;
            case 6:
                return q7m0.a(Boolean.FALSE);
            case 7:
                cge0 cge0Var = ddl0.V1;
                return Unit.f46060a;
            case 8:
                return new zw3(j3n0.f15844a, (byte) 0);
            case 9:
                return new zw3(l3n0.f19366a, (byte) 0);
            case 10:
                return new zw3(sel0.f32080a, (byte) 0);
            case 11:
                return new zw3(tel0.f33826a, (byte) 0);
            case 12:
                int i4 = SportScore.k;
                return "VS";
            case 13:
                int i5 = xpl0.P;
                return bid.f2654a;
            case 14:
                return new zw3(ftl0.f10118a, (byte) 0);
            case 15:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 16:
                return new zw3(qjc.f28830a, (byte) 0);
            case 17:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 18:
                return new zw3(ysm0.f43175a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(whp0.f39176a, (byte) 0);
            case 20:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 21:
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new txl0(true, false, null, lunVar);
            case 22:
                return new zw3(mrv.j0(fxl0.f10316a), (byte) 0);
            case 23:
                return new yyl0(iun.f15405a, true, false);
            case 24:
                return new zw3(v0m0.f36588a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(i0m0.f13954a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(whp0.f39176a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return 2;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(gss.f11845a, (byte) 0);
            default:
                return StaticColors.INSTANCE;
        }
    }
}
