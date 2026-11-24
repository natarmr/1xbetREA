package okhttp3.internal.ws;

import a.e8x;
import a.f99;
import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageInflater implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46226a;
    public final f99 b = new f99();
    public Inflater c;
    public e8x d;

    public MessageInflater(boolean z) {
        this.f46226a = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e8x e8xVar = this.d;
        if (e8xVar != null) {
            e8xVar.close();
        }
        this.d = null;
        this.c = null;
    }
}
