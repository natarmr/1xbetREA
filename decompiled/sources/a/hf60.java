package a;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class hf60 extends ResponseBody {
    public final ResponseBody b;
    public final zae0 c;
    public IOException d;

    public hf60(ResponseBody responseBody) {
        this.b = responseBody;
        this.c = new zae0(new u68(this, responseBody.getD()));
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: V0 */
    public final u99 getD() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: d */
    public final long getC() {
        return this.b.getC();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: e */
    public final MediaType getB() {
        return this.b.getB();
    }
}
