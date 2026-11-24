package a;

import android.content.Context;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qwt0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qwt0 f29451a = new qwt0(3, nvt0.class, "handleCaptcha", "handleCaptcha(Lcom/vk/api/sdk/VKApiValidationHandler$Captcha;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Unit unit;
        Unit unit2;
        nvt0 nvt0Var = (nvt0) obj;
        cvt0 cvt0Var = (cvt0) obj2;
        bvt0 bvt0Var = (bvt0) obj3;
        nvt0Var.getClass();
        cvt0Var.getClass();
        bvt0Var.getClass();
        Context context = nvt0Var.f24203a;
        context.getClass();
        String str = VKCaptchaActivity.d;
        wvt0.a(new qx9(context, cvt0Var.f5047a, cvt0Var.b, cvt0Var.c, (byte) 11));
        fwt0.a();
        String str2 = VKCaptchaActivity.d;
        if (str2 != null) {
            bvt0Var.b = str2;
            CountDownLatch countDownLatch = (CountDownLatch) ((AtomicReference) bvt0Var.f3293a.f14992a).getAndSet(null);
            if (countDownLatch != null) {
                countDownLatch.countDown();
                unit2 = Unit.f46060a;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                hny.u("Latch is null!");
                return null;
            }
        } else {
            CountDownLatch countDownLatch2 = (CountDownLatch) ((AtomicReference) bvt0Var.f3293a.f14992a).getAndSet(null);
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
                unit = Unit.f46060a;
            } else {
                unit = null;
            }
            if (unit == null) {
                hny.u("Latch is null!");
                return null;
            }
        }
        return Unit.f46060a;
    }
}
