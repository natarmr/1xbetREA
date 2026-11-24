package a;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.scratch_card.presentation.views.ScratchCardProtectLayerView;
import org.xplatform.scratch_card.presentation.views.ScratchCardView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yxg0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43420a;

    public /* synthetic */ yxg0(byte b) {
        this.f43420a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f43420a) {
            case 0:
                return new zw3(fn7.f9819a, (byte) 0);
            case 1:
                return new czg0(new LinkedHashMap());
            case 2:
                return null;
            case 3:
                return new wme0(sre0.f32672a.b(Bundle.class), k0h0.f17467a);
            case 4:
                return new zw3(k0h0.f17467a, (byte) 0);
            case 5:
                return new zw3(mrv.j0(cgo.f4322a), (byte) 0);
            case 6:
                return new zw3(mrv.j0(n1h0.f22750a), (byte) 0);
            case 7:
                return new HashSet();
            case 8:
                return new zw3(j4h0.f15884a, (byte) 0);
            case 9:
                return new zw3(jf90.f16413a, (byte) 0);
            case 10:
                return new inv(ysm0.f43175a, mrv.j0(new zw3(s4h0.f31605a, (byte) 0)), (byte) 1);
            case 11:
                return new inv(ysm0.f43175a, new zw3(xmo0.f41138a, (byte) 0), (byte) 1);
            case 12:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, ysm0Var, (byte) 1);
            case 13:
                ysm0 ysm0Var2 = ysm0.f43175a;
                return new inv(ysm0Var2, ysm0Var2, (byte) 1);
            case 14:
                ysm0 ysm0Var3 = ysm0.f43175a;
                return new inv(ysm0Var3, ysm0Var3, (byte) 1);
            case 15:
                return new zw3(we90.f39009a, (byte) 0);
            case 16:
                return new zw3(xe90.f40734a, (byte) 0);
            case 17:
                return new inv(ysm0.f43175a, new zw3(xmo0.f41138a, (byte) 0), (byte) 1);
            case 18:
                return new inv(ysm0.f43175a, new zw3(xmo0.f41138a, (byte) 0), (byte) 1);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i = ScratchCardProtectLayerView.m;
                return Unit.f46060a;
            case 20:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 21:
                return new zw3(okx.f25427a, (byte) 0);
            case 22:
                int i2 = ScratchCardView.d;
                return Unit.f46060a;
            case 23:
                return new rah0(0);
            case 24:
                return Float.valueOf(0.0f);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(mdh0.f21596a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(mdh0.f21596a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(adh0.f679a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(adh0.f679a, (byte) 0);
            default:
                return new zw3(adh0.f679a, (byte) 0);
        }
    }
}
