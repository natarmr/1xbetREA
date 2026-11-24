package a;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class eyf implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f8626a = new AtomicLong();
    public final String b;
    public final byte c;
    public final StrictMode.ThreadPolicy d;

    /* JADX WARN: Multi-variable type inference failed */
    public eyf(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.c = i;
        this.d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = e.newThread(new a4e(this, runnable, (byte) 15));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.b + " Thread #" + this.f8626a.getAndIncrement());
        return threadNewThread;
    }
}
