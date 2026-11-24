package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e0b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6980a;

    public /* synthetic */ e0b(byte b) {
        this.f6980a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6980a) {
            case 0:
                return new zw3(a1s.f87a, (byte) 0);
            case 1:
                return new zw3(a1s.f87a, (byte) 0);
            case 2:
                int i = CashbackView.c;
                return Unit.f46060a;
            case 3:
                gl5 gl5Var = g5b.c2;
                return new bdz();
            case 4:
                int i2 = y7b.K;
                return p030.f26129a;
            case 5:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 6:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 7:
                return new zw3(aas.f544a, (byte) 0);
            case 8:
                return new zw3(xxm0.f41666a, (byte) 0);
            case 9:
                return new zw3(kcb.f18050a, (byte) 0);
            case 10:
                return new zw3(aeb.f719a, (byte) 0);
            case 11:
                return new zw3(gmo0.f11550a, (byte) 0);
            case 12:
                return new zw3(seb.f32070a, (byte) 0);
            case 13:
                return new zw3(new zw3(q6e0.f28195a, (byte) 0), (byte) 0);
            case 14:
                return new zw3(ihv.f14798a, (byte) 0);
            case 15:
                return new zw3(jps.f16917a, (byte) 0);
            case 16:
                return new zw3(wdb.f38965a, (byte) 0);
            case 17:
                return new zw3(yhp0.f42649a, (byte) 0);
            case 18:
                return new zw3(vpq0.f37818a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i3 = plb.I;
                return bid.f2654a;
            case 20:
                int i4 = plb.I;
                return dll0.f6288a;
            case 21:
                yk5 yk5Var = cmb.O1;
                return new bdz();
            case 22:
                return new zw3(qmb.f28974a, (byte) 0);
            case 23:
                return new zw3(umb.f35912a, (byte) 0);
            case 24:
                return new zw3(dnr0.f6384a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(enr0.f8109a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new vrb(false, false, "", "", "", bsb.f3121a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new wme0(sre0.f32672a.b(String.class), ysm0.f43175a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            default:
                return new zw3(ysm0.f43175a, (byte) 0);
        }
    }
}
