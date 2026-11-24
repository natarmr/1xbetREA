package okhttp3;

import a.emk0;
import a.f99;
import a.fmq0;
import a.gl5;
import a.h97;
import a.qg9;
import a.xvw;
import a.z680;
import android.gov.nist.core.Separators;
import java.io.Closeable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "PartSource", "Part", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultipartReader implements Closeable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Part implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "La/emk0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class PartSource implements emk0 {
        @Override // a.emk0
        public final long Y(f99 f99Var, long j) {
            f99Var.getClass();
            if (j >= 0) {
                throw null;
            }
            throw new IllegalArgumentException(h97.h(j, "byteCount < 0: ").toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // a.emk0
        public final fmq0 h() {
            return null;
        }
    }

    static {
        int i = z680.d;
        qg9 qg9Var = qg9.d;
        xvw.S(gl5.i(Separators.NEWLINE), gl5.i("--"), gl5.i(Separators.SP), gl5.i(Separators.HT));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
