package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a7d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f362a;

    public /* synthetic */ a7d(byte b) {
        this.f362a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f362a) {
            case 0:
                return new zw3(ne8.f23372a, (byte) 0);
            case 1:
                return new zw3(okx.f25427a, (byte) 0);
            case 2:
                return new zw3(okx.f25427a, (byte) 0);
            case 3:
                return new zw3(okx.f25427a, (byte) 0);
            case 4:
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 7:
                return new zw3(q680.f28189a, (byte) 0);
            case 8:
                return new zw3(whp0.f39176a, (byte) 0);
            case 9:
                return new cfd(0L, iun.f15405a, true, false, false);
            case 10:
                return new sed(iun.f15405a, true, false);
            case 11:
                ysm0 ysm0Var = ysm0.f43175a;
                return new inv(ysm0Var, ysm0Var, (byte) 1);
            case 12:
                return Unit.f46060a;
            case 13:
                ls2 ls2Var = new ls2();
                iun iunVar = iun.f15405a;
                m0k0 m0k0Var = new m0k0(-1L, "", -1L, "", "", "", -1L, "", "", "", 0, "", -1, -1, "", "", 0, 0, "", "", "", "", -1L, false, -1L, -1L, false, -1L, -1L, "", false, false, false);
                m97.Companion.getClass();
                return new tjd("", ls2Var, iunVar, m0k0Var, k97.a());
            case 14:
                return Unit.f46060a;
            case 15:
                return Unit.f46060a;
            case 16:
                return Unit.f46060a;
            case 17:
                return Unit.f46060a;
            case 18:
                return new e7z(2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
                return null;
            case 22:
                bmd.b("LocalViewConfiguration");
                throw null;
            case 23:
                bmd.b("LocalWindowInfo");
                throw null;
            case 24:
                return new amd();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                bmd.b("LocalAutofillTree");
                throw null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bmd.b("LocalAutofillManager");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bmd.b("LocalClipboardManager");
                throw null;
            default:
                bmd.b("LocalClipboard");
                throw null;
        }
    }
}
