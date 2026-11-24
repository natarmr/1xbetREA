package okhttp3;

import a.qg9;
import a.t99;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/RequestBody;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f46110a = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "Lokhttp3/RequestBody;", "EMPTY", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static RequestBody$Companion$toRequestBody$3 a(String str, MediaType mediaType) {
            str.getClass();
            Pair pairA = Internal.a(mediaType);
            Charset charset = (Charset) pairA.f46059a;
            MediaType mediaType2 = (MediaType) pairA.b;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            int length = bytes.length;
            _UtilCommonKt.a(bytes.length, 0L, length);
            return new RequestBody$Companion$toRequestBody$3(mediaType2, length, bytes);
        }
    }

    static {
        qg9.d.getClass();
    }

    public long a() {
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public abstract MediaType getB();

    public boolean c() {
        return this instanceof RequestBody$Companion$toRequestBody$2;
    }

    public abstract void d(t99 t99Var);
}
