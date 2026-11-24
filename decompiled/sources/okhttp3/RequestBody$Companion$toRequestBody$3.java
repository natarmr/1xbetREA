package okhttp3;

import a.t99;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/RequestBody$Companion$toRequestBody$3", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestBody$Companion$toRequestBody$3 extends RequestBody {
    public final /* synthetic */ MediaType b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte[] d;

    public RequestBody$Companion$toRequestBody$3(MediaType mediaType, int i, byte[] bArr) {
        this.b = mediaType;
        this.c = i;
        this.d = bArr;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return this.c;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: b, reason: from getter */
    public final MediaType getB() {
        return this.b;
    }

    @Override // okhttp3.RequestBody
    public final void d(t99 t99Var) {
        t99Var.B(this.d, this.c);
    }
}
