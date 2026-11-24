package a;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dwj implements cm30, psn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6801a;

    public dwj(Context context, byte b) {
        switch (b) {
            case 1:
                this.f6801a = context.getApplicationContext();
                break;
            case 2:
                new ConcurrentHashMap();
                aem0.C(context != null, "Context cannot be null", new Object[0]);
                this.f6801a = context.getApplicationContext();
                break;
            default:
                this.f6801a = context;
                break;
        }
    }

    @Override // a.psn
    public void a(rcb rcbVar) {
        pqd pqdVar = new pqd("EmojiCompatInitializer", (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), pqdVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new b1(this, rcbVar, threadPoolExecutor, (byte) 16));
    }

    @Override // a.cm30
    public dm30 c(pzu pzuVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.f6801a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new m6m0((byte) 9).c(pzuVar);
        }
        int iH = mg40.h(((androidx.media3.common.b) pzuVar.c).p);
        f1t0.a0("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(vtt0.D(iH)));
        cgx0 cgx0Var = new cgx0(new q04(iH, (byte) 0), new q04(iH, (byte) 1));
        cgx0Var.b = true;
        return cgx0Var.c(pzuVar);
    }
}
