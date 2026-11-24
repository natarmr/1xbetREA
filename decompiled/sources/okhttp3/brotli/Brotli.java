package okhttp3.brotli;

import a.emk0;
import a.r89;
import a.u99;
import a.w9x;
import kotlin.Metadata;
import okhttp3.CompressionInterceptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/brotli/Brotli;", "Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "okhttp-brotli"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Brotli implements CompressionInterceptor.DecompressionAlgorithm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Brotli f46117a = new Brotli();

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public final emk0 a(u99 u99Var) {
        u99Var.getClass();
        return w9x.L(new r89(u99Var.a1()));
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public final String getEncoding() {
        return "br";
    }
}
