package a;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.limits_africa.api.domain.LimitGroupEnum;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pcy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26782a;

    public /* synthetic */ pcy(byte b) {
        this.f26782a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26782a) {
            case 0:
                return gdy.b;
            case 1:
                return acy.b;
            case 2:
                return new zw3(xiy.f40969a, (byte) 0);
            case 3:
                return new zw3(whp0.f39176a, (byte) 0);
            case 4:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 5:
                return new zw3(gjy.f11421a, (byte) 0);
            case 6:
                return new zw3(moa.f22125a, (byte) 0);
            case 7:
                return new zw3(moa.f22125a, (byte) 0);
            case 8:
                return Boolean.valueOf(Build.BRAND.equals(Payload.SOURCE_GOOGLE));
            case 9:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 10:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 11:
                wuy[] wuyVarArrValues = wuy.values();
                wuyVarArrValues.getClass();
                return new g0o("org.xplatform.feature.online_call.api.domain.language_selector_block_status.model.LanguageSelectorClickStatus", (Enum[]) wuyVarArrValues);
            case 12:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 13:
                return new zw3(whp0.f39176a, (byte) 0);
            case 14:
                return k6z.f17794a;
            case 15:
                return new rzy(iun.f15405a, true, false, false);
            case 16:
                return 2;
            case 17:
                return b3z.f1931a;
            case 18:
                return new e7z(3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new d9z(0, 0);
            case 20:
                return new pdz(iun.f15405a);
            case 21:
                return new mez(new int[]{0}, new int[]{0});
            case 22:
                return new uoz(new oiq0(LimitGroupEnum.c, miq0.f21857a, 0L, "", 0L, false, false, false, qrz.d, iun.f15405a, false), null);
            case 23:
                return Unit.f46060a;
            case 24:
                return new opz(new piq0(org.xplatform.limits_ee.api.domain.LimitGroupEnum.b, kiq0.f18349a, 0L, "", 0L, false, false, false, mrz.d, iun.f15405a, false), null, false);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new jqz(new qiq0(LimitKenyaGroupEnum.c, liq0.f20118a, 0L, "", 0L, false, false, false, nrz.d, iun.f15405a, false), null, false);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return new erz(iun.f15405a, null, true, false);
        }
    }
}
