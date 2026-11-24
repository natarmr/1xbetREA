package okhttp3.internal;

import a.emk0;
import a.f99;
import a.fmq0;
import a.u99;
import a.zae0;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/UnreadableResponseBody;", "Lokhttp3/ResponseBody;", "La/emk0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnreadableResponseBody extends ResponseBody implements emk0 {
    public final MediaType b;
    public final long c;

    public UnreadableResponseBody(MediaType mediaType, long j) {
        this.b = mediaType;
        this.c = j;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: V0 */
    public final u99 getD() {
        return new zae0(this);
    }

    @Override // a.emk0
    public final long Y(f99 f99Var, long j) {
        f99Var.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getC() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: e, reason: from getter */
    public final MediaType getB() {
        return this.b;
    }

    @Override // a.emk0
    public final fmq0 h() {
        return fmq0.d;
    }
}
