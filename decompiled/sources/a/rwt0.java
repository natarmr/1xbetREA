package a;

import android.content.Context;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rwt0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rwt0 f31232a = new rwt0(3, nvt0.class, "handleConfirm", "handleConfirm(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Unit unit;
        nvt0 nvt0Var = (nvt0) obj;
        String str = (String) obj2;
        bvt0 bvt0Var = (bvt0) obj3;
        nvt0Var.getClass();
        str.getClass();
        bvt0Var.getClass();
        VKConfirmationActivity.f46051a = false;
        Context context = nvt0Var.f24203a;
        context.getClass();
        wvt0.a(new qaq0(context, str, (byte) 14));
        fwt0.a();
        bvt0Var.b = Boolean.valueOf(VKConfirmationActivity.f46051a);
        CountDownLatch countDownLatch = (CountDownLatch) ((AtomicReference) bvt0Var.f3293a.f14992a).getAndSet(null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
            unit = Unit.f46060a;
        } else {
            unit = null;
        }
        if (unit != null) {
            VKConfirmationActivity.f46051a = false;
            return Unit.f46060a;
        }
        hny.u("Latch is null!");
        return null;
    }
}
