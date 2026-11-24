package okhttp3;

import a.emk0;
import a.hjv;
import a.u99;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Gzip;", "Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Gzip implements CompressionInterceptor.DecompressionAlgorithm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gzip f46096a = new Gzip();

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public final emk0 a(u99 u99Var) {
        u99Var.getClass();
        return new hjv(u99Var);
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public final String getEncoding() {
        return "gzip";
    }
}
