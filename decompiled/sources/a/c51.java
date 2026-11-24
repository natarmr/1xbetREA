package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c51 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3748a;

    public /* synthetic */ c51(byte b) {
        this.f3748a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3748a;
        ab0 ab0Var = ab0.f555a;
        int i = 0;
        switch (b) {
            case 0:
                return new zw3(hj0.f13139a, (byte) 0);
            case 1:
                return Unit.f46060a;
            case 2:
                return new zw3(mc1.f21529a, (byte) 0);
            case 3:
                return Unit.f46060a;
            case 4:
                String str = mh1.E0;
                return qq5.f29150a;
            case 5:
                String str2 = mh1.E0;
                return ab0Var;
            case 6:
                return new zw3(if0.f14661a, (byte) 0);
            case 7:
                return Unit.f46060a;
            case 8:
                List list = u0d.f34849a;
                return new dl1("", "", new n0x(u0d.q("/static/img/android/casino/tournaments/CRM_tournament.webp")));
            case 9:
                int i2 = dp1.G;
                return ab0Var;
            case 10:
                return new zw3(pp1.f27353a, (byte) 0);
            case 11:
                return new zw3(s710.f31729a, (byte) 0);
            case 12:
                return new zw3(mrv.j0(uq1.f36095a), (byte) 0);
            case 13:
                return Integer.valueOf(bv1.g.b());
            case 14:
                return Integer.valueOf(bv1.g.b());
            case 15:
                return Integer.valueOf(bv1.g.b());
            case 16:
                return Integer.valueOf(bv1.g.b());
            case 17:
                int i3 = uv1.X;
                return ab0Var;
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return Unit.f46060a;
            case 21:
                return Unit.f46060a;
            case 22:
                return Unit.f46060a;
            case 23:
                return Unit.f46060a;
            case 24:
                return new xcz(i, 3, i);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                String str3 = wz1.T;
                return ab0Var;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(s710.f31729a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(zz1.f45231a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(whp0.f39176a, (byte) 0);
            default:
                int i4 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                return dll0.f6288a;
        }
    }

    public /* synthetic */ c51(vv1 vv1Var, byte b) {
        this.f3748a = b;
    }
}
