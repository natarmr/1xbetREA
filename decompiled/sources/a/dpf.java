package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.xplatform.uikit.compose.color.CustomColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dpf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6464a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6464a) {
            case 0:
                return new zw3(tjf.f34045a, (byte) 0);
            case 1:
                return new zw3(csf.f4885a, (byte) 0);
            case 2:
                return new inv(ysm0.f43175a, okx.f25427a, (byte) 1);
            case 3:
                return new zw3(gdy.f11125a, (byte) 0);
            case 4:
                return new zw3(qpf.f29115a, (byte) 0);
            case 5:
                return new zw3(kqf.f18721a, (byte) 0);
            case 6:
                okx okxVar = okx.f25427a;
                return new inv(okxVar, okxVar, (byte) 1);
            case 7:
                okx okxVar2 = okx.f25427a;
                return new inv(okxVar2, okxVar2, (byte) 1);
            case 8:
                return q7m0.a(null);
            case 9:
                iun iunVar = iun.f15405a;
                return new wif(new sjf(0L, "", "", "", iunVar), new sjf(0L, "", "", "", iunVar), iunVar, iunVar, new hjf("", iunVar, 0), new hjf("", iunVar, 0));
            case 10:
                return new zw3(mpf.f22177a, (byte) 0);
            case 11:
                return new zw3(qsf.f29256a, (byte) 0);
            case 12:
                return new zw3(cuf.f4984a, (byte) 0);
            case 13:
                return new inv(ysm0.f43175a, tbl.f33669a, (byte) 1);
            case 14:
                HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
                httpLoggingInterceptor.d = HttpLoggingInterceptor.Level.f46235a;
                OkHttpClient.Builder builderB = new OkHttpClient().b();
                builderB.c.add(httpLoggingInterceptor);
                builderB.a(60L);
                builderB.b(60L);
                builderB.c(60L);
                return new OkHttpClient(builderB);
            case 15:
                return CustomColors.INSTANCE;
            case 16:
                return new zw3(x9h.f40509a, (byte) 0);
            case 17:
                return new upj0(null);
            case 18:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new g3g(ilr.b, false, false, false);
            case 20:
                return new zw3(s3g.f31556a, (byte) 0);
            case 21:
                return new zw3(s3g.f31556a, (byte) 0);
            case 22:
                return new zw3(x3g.f40216a, (byte) 0);
            case 23:
                return new zw3(o3g.f24583a, (byte) 0);
            case 24:
                return new zw3(okx.f25427a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(l4g.f19403a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                qud qudVar = n5g.S1;
                e5g e5gVar = new e5g();
                e5gVar.d.b(new gbn(new jyf((byte) 5), new pue(3, (byte) 8), new vlf((byte) 12), fpd.u));
                return e5gVar;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(vag.f37085a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(iag.f14436a, (byte) 0);
            default:
                return new zw3(ysm0.f43175a, (byte) 0);
        }
    }

    public /* synthetic */ dpf(byte b) {
        this.f6464a = b;
    }
}
