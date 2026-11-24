package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.rules.impl.util.ContactsWebView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yld implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42833a;

    public /* synthetic */ yld(byte b) {
        this.f42833a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f42833a) {
            case 0:
                bmd.b("LocalGraphicsContext");
                throw null;
            case 1:
                bmd.b("LocalFontFamilyResolver");
                throw null;
            case 2:
                bmd.b("LocalDensity");
                throw null;
            case 3:
                bmd.b("LocalFocusManager");
                throw null;
            case 4:
                bmd.b("LocalFontLoader");
                throw null;
            case 5:
                bmd.b("LocalHapticFeedback");
                throw null;
            case 6:
                bmd.b("LocalInputManager");
                throw null;
            case 7:
                bmd.b("LocalLayoutDirection");
                throw null;
            case 8:
                bmd.b("LocalProvidableLocaleList");
                throw null;
            case 9:
            case 10:
                return null;
            case 11:
                bmd.b("LocalTextToolbar");
                throw null;
            case 12:
                bmd.b("LocalUriHandler");
                throw null;
            case 13:
                ykd.b("Unexpected call to default provider");
                throw new rsy();
            case 14:
                return new zw3(qcy.f28507a, (byte) 0);
            case 15:
                return Unit.f46060a;
            case 16:
                return new Integer[]{Integer.valueOf(Response.BAD_REQUEST), Integer.valueOf(Response.UNAUTHORIZED), Integer.valueOf(Response.NOT_FOUND), Integer.valueOf(Response.REQUEST_TIMEOUT), 409, Integer.valueOf(Response.GONE), 429};
            case 17:
                int i = ContactsWebView.m;
                return Unit.f46060a;
            case 18:
                return Long.valueOf(System.currentTimeMillis());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 21:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 22:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 23:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 24:
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(jv6.f17193a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return Unit.f46060a;
        }
    }
}
