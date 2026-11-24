package a;

import android.content.DialogInterface;
import androidx.biometric.internal.ui.FingerprintDialogActivity;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.api.sdk.ui.VKConfirmationActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gx5 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12061a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gx5(Object obj, byte b) {
        this.f12061a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.f12061a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ix5) obj).I0();
                break;
            case 1:
                ((b8a) obj).f2147a.finish();
                break;
            case 2:
                int i = FingerprintDialogActivity.Z;
                p7m0 p7m0Var = ((FingerprintDialogActivity) obj).t().d;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                break;
            case 3:
                VKCaptchaActivity vKCaptchaActivity = (VKCaptchaActivity) obj;
                VKCaptchaActivity.d = null;
                fwt0.b();
                vKCaptchaActivity.setResult(0);
                vKCaptchaActivity.finish();
                break;
            default:
                VKConfirmationActivity.f46051a = false;
                ((VKConfirmationActivity) obj).finish();
                break;
        }
    }
}
