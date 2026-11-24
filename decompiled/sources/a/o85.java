package a;

import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o85 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24816a;

    public /* synthetic */ o85(byte b) {
        this.f24816a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24816a) {
            case 0:
                return new zw3(tuo0.f34561a, (byte) 0);
            case 1:
                return new zw3(p85.f26538a, (byte) 0);
            case 2:
                return new zw3(zc5.f44150a, (byte) 0);
            case 3:
                n0o0 n0o0Var = BackportedFixQuirk.f45332a;
                return new bf5();
            case 4:
                return new zw3(moa.f22125a, (byte) 0);
            case 5:
                return new zw3(moa.f22125a, (byte) 0);
            case 6:
                return new ei5(sb50.b);
            case 7:
                gfk0 gfk0Var = ii5.O1;
                return new dm80();
            case 8:
                return new zw3(okx.f25427a, (byte) 0);
            case 9:
                return new zw3(okx.f25427a, (byte) 0);
            case 10:
                return new zw3(okx.f25427a, (byte) 0);
            case 11:
                return new zw3(okx.f25427a, (byte) 0);
            case 12:
                return new zw3(cfo0.f4273a, (byte) 0);
            case 13:
                return new zw3(okx.f25427a, (byte) 0);
            case 14:
                return new zw3(okx.f25427a, (byte) 0);
            case 15:
                iiy[] iiyVarArr = nw5.d2;
                dyb.u0();
                return Unit.f46060a;
            case 16:
                iiy[] iiyVarArr2 = qw5.a2;
                dyb.u0();
                return Unit.f46060a;
            case 17:
                return Unit.f46060a;
            case 18:
                return new zw3(y180.f41842a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return null;
            case 20:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 21:
                return Unit.f46060a;
            case 22:
                return null;
            case 23:
                return iun.f15405a;
            case 24:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(bg6.f2539a, (byte) 0);
            default:
                return new zw3(hg6.f13003a, (byte) 0);
        }
    }
}
