package a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.biometric.internal.ui.FingerprintDialogActivity;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v9q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37046a;

    public /* synthetic */ v9q(byte b) {
        this.f37046a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        byte b = 1;
        switch (this.f37046a) {
            case 0:
                return new t9q(null, iun.f15405a);
            case 1:
                return Unit.f46060a;
            case 2:
                return new zw3(ibq.f14502a, (byte) 0);
            case 3:
                return new zw3(hcq.f12836a, (byte) 0);
            case 4:
                return new zw3(zbq.f44128a, (byte) 0);
            case 5:
                return new zw3(tbq.f33677a, (byte) 0);
            case 6:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 7:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 8:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 9:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 10:
                return new zw3(ddq.f5907a, (byte) 0);
            case 11:
                return new zw3(ddq.f5907a, (byte) 0);
            case 12:
                return new zw3(ddq.f5907a, (byte) 0);
            case 13:
                return new zw3(ddq.f5907a, (byte) 0);
            case 14:
                int i = FingerprintDialogActivity.Z;
                return new dzj(b);
            case 15:
                int i2 = FixedWebView.e;
                return "monochromeWithWhiteIcon";
            case 16:
                return q3d.j(Integer.valueOf(R.raw.lets_encrypt_x1), Integer.valueOf(R.raw.lets_encrypt_x2), Integer.valueOf(R.raw.lets_encrypt_r10), Integer.valueOf(R.raw.lets_encrypt_r11), Integer.valueOf(R.raw.lets_encrypt_e5), Integer.valueOf(R.raw.lets_encrypt_e6), Integer.valueOf(R.raw.harica_dv_tls_rsa));
            case 17:
                return Boolean.FALSE;
            case 18:
                return new zw3(okx.f25427a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(emo0.f8058a, (byte) 0);
            case 20:
                return new zw3(new zw3(xio0.f40955a, (byte) 0), (byte) 0);
            case 21:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 22:
                return w0f0.Companion.serializer();
            case 23:
                return new zw3(qvq.f29397a, (byte) 0);
            case 24:
                return new zw3(arp.f1357a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new d5r(androidx.compose.runtime.e.e(null));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                try {
                    Method method = (Method) w7r.d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new inv(okx.f25427a, new zw3(tbl.f33669a, (byte) 0), (byte) 1);
            default:
                return new zw3(a9r.f492a, (byte) 0);
        }
    }
}
