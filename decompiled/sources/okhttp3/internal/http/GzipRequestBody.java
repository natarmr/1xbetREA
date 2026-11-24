package okhttp3.internal.http;

import a.bkb;
import a.gjv;
import a.t99;
import a.yae0;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/GzipRequestBody;", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GzipRequestBody extends RequestBody {
    @Override // okhttp3.RequestBody
    public final long a() {
        return -1L;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: b */
    public final MediaType getB() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final boolean c() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final void d(t99 t99Var) {
        yae0 yae0Var = new yae0(new gjv(t99Var));
        try {
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(yae0Var, th);
                throw th2;
            }
        }
    }
}
