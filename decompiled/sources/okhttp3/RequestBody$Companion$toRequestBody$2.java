package okhttp3;

import a.bkb;
import a.t99;
import a.w9x;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/RequestBody$Companion$toRequestBody$2", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: b */
    public final MediaType getB() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final void d(t99 t99Var) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((FileDescriptor) null);
        try {
            t99Var.g().P(w9x.L(fileInputStream));
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(fileInputStream, th);
                throw th2;
            }
        }
    }
}
