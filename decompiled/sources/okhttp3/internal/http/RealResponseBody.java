package okhttp3.internal.http;

import a.u99;
import a.zae0;
import kotlin.Metadata;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealResponseBody extends ResponseBody {
    public final String b;
    public final long c;
    public final zae0 d;

    public RealResponseBody(String str, long j, zae0 zae0Var) {
        this.b = str;
        this.c = j;
        this.d = zae0Var;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: V0 */
    public final u99 getD() {
        return this.d;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getC() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: e */
    public final MediaType getB() {
        String str = this.b;
        if (str != null) {
            Regex regex = MediaType.e;
            try {
                return MediaType.Companion.a(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
