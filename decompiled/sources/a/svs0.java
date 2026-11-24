package a;

import android.content.Intent;
import android.os.Looper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.authsdk.YandexAuthToken;
import java.security.Provider;
import java.util.List;
import javax.crypto.Mac;
import org.xplatform.security.impl.navigation.TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public final class svs0 implements uw00, eer, kotlin.coroutines.f, lix0, rjw0, xmw0 {
    public static final /* synthetic */ svs0 b = new svs0(24);
    public static final /* synthetic */ svs0 c = new svs0(25);
    public static final /* synthetic */ svs0 d = new svs0(26);
    public static final /* synthetic */ svs0 e = new svs0(27);
    public static final /* synthetic */ svs0 f = new svs0(28);
    public static final /* synthetic */ svs0 g = new svs0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32885a;

    public /* synthetic */ svs0(byte b2) {
        this.f32885a = b2;
    }

    public static mbu0 a(int i) {
        if (i == 0) {
            return mbu0.OPTIONS;
        }
        if (i == 3) {
            return mbu0.EXTERNAL_LINK;
        }
        if (i == 4) {
            return mbu0.NOMAPAY;
        }
        switch (i) {
            case 7:
                return mbu0.BACK_OFFICE;
            case 8:
                return mbu0.SUM_SUB;
            case 9:
                return mbu0.SMART_ID;
            case 10:
                return mbu0.MOBILE_ID;
            default:
                return mbu0.UNKNOWN;
        }
    }

    public static TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1 c(svs0 svs0Var) {
        svs0Var.getClass();
        return new TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1(false);
    }

    public static void d(androidx.fragment.app.e eVar, c2v0 c2v0Var) {
        String simpleName = a2v0.class.getSimpleName();
        if (eVar.J(simpleName) != null) {
            return;
        }
        a2v0 a2v0Var = new a2v0();
        a2v0Var.b2.u(a2v0Var, a2v0.h2[0], c2v0Var);
        sj3.E0(a2v0Var, eVar, simpleName);
    }

    public static final boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // a.rjw0
    public /* synthetic */ String U(String str, String str2) {
        return null;
    }

    @Override // a.eer
    /* JADX INFO: renamed from: apply */
    public Object mo11apply(Object obj) {
        List list = (List) obj;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return ((opv0) list.get(0)).a();
    }

    @Override // a.lix0
    public /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // a.uw00
    public YandexAuthToken k(Intent intent) {
        intent.getClass();
        return (YandexAuthToken) x2x.U(intent, "com.yandex.authsdk.EXTRA_TOKEN", YandexAuthToken.class);
    }

    @Override // a.uw00
    public d2w0 l(Intent intent) {
        intent.getClass();
        return (d2w0) x2x.V(intent);
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f32885a) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new Boolean(((Boolean) khw0.f18310a.get()).booleanValue());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                List list = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_error_events_per_day", 69, 1000L).get()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            default:
                List list4 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.sgtm.upload.retry_max_wait", 52, 21600000L).get();
        }
    }
}
