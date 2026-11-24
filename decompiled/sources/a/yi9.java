package a;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: loaded from: classes.dex */
public final class yi9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f42676a = new ConcurrentHashMap();
    public final n0o0 b;

    public yi9(File file) {
        this.b = maz.b(new xi9(file, (byte) 0));
        Runtime.getRuntime().addShutdownHook(new Thread(new w1(this, (byte) 18)));
    }

    public final DiskLruCache a() {
        return (DiskLruCache) this.b.getValue();
    }
}
