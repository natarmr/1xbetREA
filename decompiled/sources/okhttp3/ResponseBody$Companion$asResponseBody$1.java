package okhttp3;

import a.u99;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/ResponseBody$Companion$asResponseBody$1", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    public final /* synthetic */ MediaType b;
    public final /* synthetic */ long c;
    public final /* synthetic */ u99 d;

    public ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j, u99 u99Var) {
        this.b = mediaType;
        this.c = j;
        this.d = u99Var;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: V0, reason: from getter */
    public final u99 getD() {
        return this.d;
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
}
