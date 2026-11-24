package a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.vk.api.sdk.ui.VKWebViewAuthActivity;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class swt0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final swt0 f32941a = new swt0(3, nvt0.class, "handleValidation", "handleValidation(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        boolean z;
        Unit unit;
        Unit unit2;
        Unit unit3;
        nvt0 nvt0Var = (nvt0) obj;
        String str = (String) obj2;
        bvt0 bvt0Var = (bvt0) obj3;
        nvt0Var.getClass();
        str.getClass();
        bvt0Var.getClass();
        VKWebViewAuthActivity.d = null;
        Context context = nvt0Var.f24203a;
        context.getClass();
        Intent intentPutExtra = new Intent(context, (Class<?>) VKWebViewAuthActivity.class).putExtra("vk_validation_url", str);
        intentPutExtra.getClass();
        Context baseContext = context;
        while (true) {
            z = baseContext instanceof Activity;
            if (z || !(baseContext instanceof ContextWrapper)) {
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            baseContext.getClass();
        }
        if ((z ? (Activity) baseContext : null) == null) {
            intentPutExtra.addFlags(268435456);
        }
        context.startActivity(intentPutExtra);
        fwt0.a();
        dvt0 dvt0Var = VKWebViewAuthActivity.d;
        if (dvt0Var != null) {
            bvt0Var.b = dvt0Var;
            CountDownLatch countDownLatch = (CountDownLatch) ((AtomicReference) bvt0Var.f3293a.f14992a).getAndSet(null);
            if (countDownLatch != null) {
                countDownLatch.countDown();
                unit3 = Unit.f46060a;
            } else {
                unit3 = null;
            }
            if (unit3 == null) {
                hny.u("Latch is null!");
                return null;
            }
            unit = Unit.f46060a;
        } else {
            unit = null;
        }
        if (unit == null) {
            CountDownLatch countDownLatch2 = (CountDownLatch) ((AtomicReference) bvt0Var.f3293a.f14992a).getAndSet(null);
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
                unit2 = Unit.f46060a;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                hny.u("Latch is null!");
                return null;
            }
        }
        VKWebViewAuthActivity.d = null;
        return Unit.f46060a;
    }
}
