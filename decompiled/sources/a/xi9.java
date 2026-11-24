package a;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xi9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40933a;
    public final /* synthetic */ File b;

    public /* synthetic */ xi9(File file, byte b) {
        this.f40933a = b;
        this.b = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40933a;
        File file = this.b;
        switch (b) {
            case 0:
                ggy ggyVar = yzp.f43526a;
                String str = y190.b;
                DiskLruCache diskLruCache = new DiskLruCache(ggyVar, rl70.c(file), 1, 2, 10485760L, TaskRunner.INSTANCE);
                diskLruCache.evictAll();
                return diskLruCache;
            default:
                synchronized (szp.e) {
                    szp.d.remove(file.getAbsolutePath());
                }
                return Unit.f46060a;
        }
    }
}
