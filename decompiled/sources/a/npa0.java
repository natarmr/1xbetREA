package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class npa0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23903a;

    public /* synthetic */ npa0(byte b) {
        this.f23903a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23903a;
        bid bidVar = bid.f2654a;
        switch (b) {
            case 0:
                return new zw3(moa.f22125a, (byte) 0);
            case 1:
                return new zw3(moa.f22125a, (byte) 0);
            case 2:
                return new zw3(moa.f22125a, (byte) 0);
            case 3:
                return new zw3(moa.f22125a, (byte) 0);
            case 4:
                return new zw3(moa.f22125a, (byte) 0);
            case 5:
                int i = ata0.S;
                return bidVar;
            case 6:
                xi70 xi70Var = eta0.P1;
                return new zcz();
            case 7:
                return new zw3(vwa0.f38141a, (byte) 0);
            case 8:
                int i2 = f1b0.w0;
                return qq5.f29150a;
            case 9:
                int i3 = j6b0.F;
                return bidVar;
            case 10:
                return new zw3(ocb0.f25020a, (byte) 0);
            case 11:
                return new zw3(ycb0.f42377a, (byte) 0);
            case 12:
                return new zw3(ocb0.f25020a, (byte) 0);
            case 13:
                throw new byw("LocalFragmentManager не предоставлен");
            case 14:
                return new zw3(vhb0.f37422a, (byte) 0);
            case 15:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 16:
                iun iunVar = iun.f15405a;
                return new e5l0("", iunVar, iunVar, null, cmb0.b, y1p.MAIN, new ls2());
            case 17:
                int i4 = pmb0.D0;
                return zjv.f44499a;
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(mqb0.f22217a, (byte) 0);
            case 20:
                return Unit.f46060a;
            case 21:
                return Unit.f46060a;
            case 22:
                return new p1c0(true, new LinkedHashMap(), false, false);
            case 23:
                return Unit.f46060a;
            case 24:
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(hw80.f13759a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(iw80.f15477a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return androidx.compose.runtime.e.e("");
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
        }
    }
}
