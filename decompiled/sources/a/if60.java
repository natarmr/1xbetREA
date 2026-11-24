package a;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class if60 extends ResponseBody {
    public final MediaType b;
    public final long c;

    public if60(MediaType mediaType, long j) {
        this.b = mediaType;
        this.c = j;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: V0 */
    public final u99 getD() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: d */
    public final long getC() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: e */
    public final MediaType getB() {
        return this.b;
    }
}
