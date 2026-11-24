package okhttp3;

import a.nwq;
import a.owq;
import a.u99;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.Closeable;
import java.io.Flushable;
import kotlin.Metadata;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "RealCacheRequest", "Entry", "CacheResponseBody", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Cache implements Closeable, Flushable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CacheResponseBody extends ResponseBody {

        /* JADX INFO: renamed from: okhttp3.Cache$CacheResponseBody$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/Cache$CacheResponseBody$1", "La/owq;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class AnonymousClass1 extends owq {
            @Override // a.owq, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: V0 */
        public final u99 getD() {
            return null;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: d */
        public final long getC() {
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: e */
        public final MediaType getB() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lokhttp3/Cache$Companion;", "", "", "VERSION", TokenNames.I, "ENTRY_METADATA", "ENTRY_BODY", "ENTRY_COUNT", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Cache$Entry;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Entry {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "", "SENT_MILLIS", "Ljava/lang/String;", "RECEIVED_MILLIS", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            Platform platform = Platform.f46208a;
            Platform.f46208a.getClass();
            Platform.f46208a.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RealCacheRequest implements CacheRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f46076a;

        /* JADX INFO: renamed from: okhttp3.Cache$RealCacheRequest$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/Cache$RealCacheRequest$1", "La/nwq;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class AnonymousClass1 extends nwq {
            @Override // a.nwq, a.s5k0, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void abort() {
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() {
        throw null;
    }
}
