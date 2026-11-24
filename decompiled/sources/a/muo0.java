package a;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class muo0 {
    public static final muo0 c = new muo0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f22422a;
    public final bnk b;

    public muo0() {
        q4w0 q4w0Var = q4w0.b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(q4w0.c, q4w0.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f22422a = threadPoolExecutor;
        this.b = q4w0.b.f28122a;
    }
}
