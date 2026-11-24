package a;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class u9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f35284a = androidx.compose.runtime.e.e(Boolean.FALSE);

    public final void a(AndroidComposeView androidComposeView, wai0 wai0Var, CoroutineContext coroutineContext, Consumer consumer) {
        xz40 xz40Var = new xz40(new v9h0[16]);
        zvw.h0(wai0Var.a(), 0, new zz(1, xz40Var, xz40.class, "add", "add(Ljava/lang/Object;)Z", 8, (byte) 2));
        Arrays.sort(xz40Var.f41739a, 0, xz40Var.c, hdd.a(new w0h0((byte) 17), new w0h0((byte) 18)));
        int i = xz40Var.c;
        v9h0 v9h0Var = (v9h0) (i == 0 ? null : xz40Var.f41739a[i - 1]);
        if (v9h0Var == null) {
            return;
        }
        mkx mkxVar = v9h0Var.c;
        gkd gkdVar = new gkd(v9h0Var.f37034a, mkxVar, d5c.a(coroutineContext), this, androidComposeView);
        s460 s460Var = v9h0Var.d;
        jge0 jge0VarW = k7x.C(s460Var).w(s460Var, true);
        long jB = mkxVar.b();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(androidComposeView, e9x.U(m2x.C(jge0VarW)), new Point((int) (jB >> 32), (int) (jB & 4294967295L)), gkdVar);
        scrollCaptureTarget.setScrollBounds(e9x.U(mkxVar));
        consumer.accept(scrollCaptureTarget);
    }
}
