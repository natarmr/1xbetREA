package okhttp3.brotli;

import kotlin.Metadata;
import okhttp3.CompressionInterceptor;
import okhttp3.Gzip;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/brotli/BrotliInterceptor;", "Lokhttp3/CompressionInterceptor;", "okhttp-brotli"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BrotliInterceptor extends CompressionInterceptor {
    public static final BrotliInterceptor c = new BrotliInterceptor(Brotli.f46117a, Gzip.f46096a);
}
