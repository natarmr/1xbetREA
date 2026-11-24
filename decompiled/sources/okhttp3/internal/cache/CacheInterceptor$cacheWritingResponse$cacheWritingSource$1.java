package okhttp3.internal.cache;

import a.emk0;
import a.f99;
import a.fmq0;
import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/internal/cache/CacheInterceptor$cacheWritingResponse$cacheWritingSource$1", "La/emk0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements emk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46125a;

    @Override // a.emk0
    public final long Y(f99 f99Var, long j) {
        f99Var.getClass();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.f46125a) {
            throw null;
        }
        TimeZone timeZone = _UtilJvmKt.f46122a;
        TimeUnit.MILLISECONDS.getClass();
        try {
            zG = _UtilJvmKt.g(this, 100);
        } catch (IOException unused) {
            zG = false;
        }
        if (zG) {
            throw null;
        }
        this.f46125a = true;
        throw null;
    }

    @Override // a.emk0
    public final fmq0 h() {
        throw null;
    }
}
