package okhttp3.internal.ws;

import a.f99;
import a.uzj;
import a.yae0;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageDeflater implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46224a;
    public final f99 b;
    public final Deflater c;
    public final uzj d;

    public MessageDeflater(boolean z) {
        this.f46224a = z;
        f99 f99Var = new f99();
        this.b = f99Var;
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        this.d = new uzj(new yae0(f99Var), deflater, (byte) 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.d.close();
    }
}
