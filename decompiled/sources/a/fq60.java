package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.core.presentation.balance.OnexGamesBalanceView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fq60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9958a;

    public /* synthetic */ fq60(byte b) {
        this.f9958a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9958a;
        vm60 vm60Var = vm60.f37664a;
        switch (b) {
            case 0:
                return new zw3(mrv.j0(iq60.f15194a), (byte) 0);
            case 1:
                return new zw3(mrv.j0(kq60.f18706a), (byte) 0);
            case 2:
                return new zw3(nuo.f24156a, (byte) 0);
            case 3:
                int i = bs60.h0;
                return vm60Var;
            case 4:
                return new zw3(s710.f31729a, (byte) 2);
            case 5:
                return new zw3(okx.f25427a, (byte) 0);
            case 6:
                return new zw3(s710.f31729a, (byte) 2);
            case 7:
                return Unit.f46060a;
            case 8:
                return new zw3(g8p.f10876a, (byte) 0);
            case 9:
                int i2 = dy60.S;
                return vm60Var;
            case 10:
                return new zw3(uz60.f36523a, (byte) 0);
            case 11:
                return new zw3(xz60.f41741a, (byte) 0);
            case 12:
                return new zw3(qz60.f29567a, (byte) 0);
            case 13:
                return new zw3(okx.f25427a, (byte) 0);
            case 14:
                return new zw3(mrv.j0(g070.f10445a), (byte) 0);
            case 15:
                return new zw3(mrv.j0(c070.f3510a), (byte) 0);
            case 16:
                return new zw3(mrv.j0(j070.f15669a), (byte) 0);
            case 17:
                return new zw3(okx.f25427a, (byte) 0);
            case 18:
                return new zw3(nbv.f23260a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(d8b.f5639a, (byte) 0);
            case 20:
                return new c270("", "", d270.UNKNOWN, false, true, m170.f20993a, new k170(false, null, null), iun.f15405a);
            case 21:
                return new n470();
            case 22:
                return new q970("", "", false);
            case 23:
                return new qc70(false);
            case 24:
                int i3 = OnexGamesBalanceView.A;
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i4 = OnexGamesBalanceView.A;
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(mrv.j0(rr70.f30968a), (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new us70("", 0, false);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return Unit.f46060a;
        }
    }
}
