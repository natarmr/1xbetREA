package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o1u0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24500a;

    public /* synthetic */ o1u0(byte b) {
        this.f24500a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24500a) {
            case 0:
                return new zw3(cyt0.f5195a, (byte) 0);
            case 1:
                int i = f2u0.e0;
                return ius.f15411a;
            case 2:
                return new dms();
            case 3:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 4:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 5:
                return new zw3(okx.f25427a, (byte) 0);
            case 6:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 7:
                return Unit.f46060a;
            case 8:
                return new wgv();
            case 9:
                return new a290();
            case 10:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 11:
                return new zw3(jo2.f16837a, (byte) 0);
            case 12:
                return new zw3(okx.f25427a, (byte) 0);
            case 13:
                return new zw3(okx.f25427a, (byte) 0);
            case 14:
                return ntb.F("org.xplatform.betting.core.zip.model.zip.game.VictoryFormulaResponseEnum", eeu0.values(), new String[]{null, "SumSum", "SumMult", "MultSum", "MultMult"}, new Annotation[][]{null, null, null, null, null});
            case 15:
                svs0 svs0Var = nmu0.O1;
                return new bdz();
            case 16:
                return new kou0(null, "", false, true);
            case 17:
                int i2 = dqu0.D;
                return bid.f2654a;
            case 18:
                return new fru0(null, "", false, true);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(jqu0.f16973a, (byte) 0);
            case 20:
                return new dmg0(0.0f);
            case 21:
                return new zw3(dtu0.f6672a, (byte) 0);
            case 22:
                return new zw3(xsu0.f41435a, (byte) 0);
            case 23:
                svs0 svs0Var2 = pwu0.q2;
                return Unit.f46060a;
            case 24:
                svs0 svs0Var3 = pwu0.q2;
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return swu0.f32942a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(lkv0.f20220a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(lij.f20109a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new z7v0(null, true);
            default:
                return new e9v0(true, false, iun.f15405a, 0);
        }
    }
}
