package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mhp0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21807a;

    public /* synthetic */ mhp0(byte b) {
        this.f21807a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f21807a) {
            case 0:
                return new zw3(chp0.f4372a, (byte) 0);
            case 1:
                return new ghp0(null, true, false, false);
            case 2:
                return new zw3(c4n0.f3734a, (byte) 0);
            case 3:
                return new zw3(d4n0.f5464a, (byte) 0);
            case 4:
                return new zw3(e4n0.f7191a, (byte) 0);
            case 5:
                return new zw3(p280.f26239a, (byte) 0);
            case 6:
                return new zw3(b4n0.f1967a, (byte) 0);
            case 7:
                return new zw3(p9a0.f26596a, (byte) 0);
            case 8:
                return new zw3(elp0.f8013a, (byte) 0);
            case 9:
                return new zw3(taa0.f33605a, (byte) 0);
            case 10:
                return new zw3(kz30.f19136a, (byte) 0);
            case 11:
                return new zw3(whp0.f39176a, (byte) 0);
            case 12:
                return new zw3(mlp0.f22004a, (byte) 0);
            case 13:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 14:
                return new zw3(zmp0.f44638a, (byte) 0);
            case 15:
                return new zw3(whp0.f39176a, (byte) 0);
            case 16:
                return new zw3(ewb.f8514a, (byte) 0);
            case 17:
                return new zw3(v5p0.f36836a, (byte) 0);
            case 18:
                s2m0 s2m0Var = jpp0.O1;
                return new bdz();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(uhp0.f35693a, (byte) 0);
            case 20:
                return new xcz(i, 3, i);
            case 21:
                return androidx.compose.runtime.e.b(0);
            case 22:
                return new zw3(ztp0.f44972a, (byte) 0);
            case 23:
                return new zvp0();
            case 24:
                zfn zfnVar = zwp0.f45118a;
                return fmm.f9790a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(yyp0.f43478a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wxp0 wxp0Var = TennisSummaryFilterModel.Companion;
                TennisSurfaceType[] tennisSurfaceTypeArrValues = TennisSurfaceType.values();
                tennisSurfaceTypeArrValues.getClass();
                return new g0o("org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType", (Enum[]) tennisSurfaceTypeArrValues);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                TennisSummaryFilterModel.Companion.getClass();
                TennisSummaryFilterModel tennisSummaryFilterModel = TennisSummaryFilterModel.d;
                return new nyp0(tennisSummaryFilterModel, tennisSummaryFilterModel, tennisSummaryFilterModel);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                TennisSummaryFilterModel.Companion.getClass();
                return new fzp0(true, false, false, null, false, TennisSummaryFilterModel.d);
        }
    }
}
