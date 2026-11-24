package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteWheel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28275a;

    public /* synthetic */ q8(byte b) {
        this.f28275a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28275a) {
            case 0:
                return Unit.f46060a;
            case 1:
                return Unit.f46060a;
            case 2:
                return Unit.f46060a;
            case 3:
                return new zw3(aa3.f504a, (byte) 0);
            case 4:
                return new zw3(s710.f31729a, (byte) 0);
            case 5:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 6:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 7:
                return ntb.F("org.xplatform.uikit.components.dialog.utils.ActionDialogButtonResultType", gi.values(), new String[]{"FIRST", "SECOND", "THIRD", "CHECK_BOX"}, new Annotation[][]{null, null, null, null});
            case 8:
                return new ln(null, "", true, false);
            case 9:
                f1e0.f8761a.getClass();
                return Integer.valueOf(f1e0.b.f(2147418112) + 65536);
            case 10:
                return Unit.f46060a;
            case 11:
                return new zw3(s710.f31729a, (byte) 0);
            case 12:
                return Unit.f46060a;
            case 13:
                return Unit.f46060a;
            case 14:
                return Unit.f46060a;
            case 15:
                return Unit.f46060a;
            case 16:
                return new kt("", "", "", false, false, false);
            case 17:
                return new lw(false, xuf.p, false, false, "", "", false);
            case 18:
                return new zw3(kd6.f18091a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new uua0(sre0.f32672a.b(kuw.class), new Annotation[0]);
            case 20:
                return new zw3(gdy.f11125a, (byte) 0);
            case 21:
                return new zw3(w70.f38647a, (byte) 0);
            case 22:
                return new zw3(okx.f25427a, (byte) 0);
            case 23:
                return new zw3(okx.f25427a, (byte) 0);
            case 24:
                int i = AfricanRouletteWheel.f;
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new pb0(null);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new LinkedHashMap();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(dw80.f6785a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(rc0.f30215a, (byte) 0);
            default:
                return new zw3(mrv.j0(wh0.f39141a), (byte) 0);
        }
    }
}
