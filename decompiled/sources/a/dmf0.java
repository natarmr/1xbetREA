package a;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public final class dmf0 extends RequestBody {
    public final RequestBody b;
    public final MediaType c;

    public dmf0(RequestBody requestBody, MediaType mediaType) {
        this.b = requestBody;
        this.c = mediaType;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return this.b.a();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: b */
    public final MediaType getB() {
        return this.c;
    }

    @Override // okhttp3.RequestBody
    public final void d(t99 t99Var) {
        this.b.d(t99Var);
    }
}
