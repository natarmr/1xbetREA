package okhttp3;

import a.axq;
import a.bkb;
import a.f99;
import a.gl5;
import a.jf4;
import a.nwq;
import a.qg9;
import a.t99;
import a.yae0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.Regex;
import okhttp3.internal._HeadersCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Part", "Builder", "Companion", "NoCloseSink", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultipartBody extends RequestBody {
    public static final MediaType f;
    public static final MediaType g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final qg9 b;
    public final List c;
    public final MediaType d;
    public long e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qg9 f46103a;
        public MediaType b;
        public final ArrayList c;

        public Builder() {
            String strG = axq.g();
            qg9 qg9Var = qg9.d;
            this.f46103a = gl5.i(strG);
            this.b = MultipartBody.f;
            this.c = new ArrayList();
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "Lokhttp3/MediaType;", "MIXED", "Lokhttp3/MediaType;", "ALTERNATIVE", "DIGEST", "PARALLEL", "FORM", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(String str, StringBuilder sb) {
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt != '\"') {
                    sb.append(cCharAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append('\"');
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartBody$NoCloseSink;", "La/nwq;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoCloseSink extends nwq {
        @Override // a.nwq, a.s5k0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Part {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Headers f46104a;
        public final RequestBody b;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public static Part a(Headers headers, RequestBody requestBody) {
                requestBody.getClass();
                if (headers.b("Content-Type") != null) {
                    jf4.o("Unexpected header: Content-Type");
                    return null;
                }
                if (headers.b("Content-Length") == null) {
                    return new Part(headers, requestBody);
                }
                jf4.o("Unexpected header: Content-Length");
                return null;
            }
        }

        public Part(Headers headers, RequestBody requestBody) {
            this.f46104a = headers;
            this.b = requestBody;
        }
    }

    static {
        Regex regex = MediaType.e;
        f = MediaType.Companion.a("multipart/mixed");
        MediaType.Companion.a("multipart/alternative");
        MediaType.Companion.a("multipart/digest");
        MediaType.Companion.a("multipart/parallel");
        g = MediaType.Companion.a("multipart/form-data");
        h = new byte[]{58, 32};
        i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public MultipartBody(qg9 qg9Var, MediaType mediaType, List list) {
        mediaType.getClass();
        list.getClass();
        this.b = qg9Var;
        this.c = list;
        Regex regex = MediaType.e;
        this.d = MediaType.Companion.a(mediaType + "; boundary=" + qg9Var.x());
        this.e = -1L;
    }

    @Override // okhttp3.RequestBody
    public final long a() throws EOFException {
        long j2 = this.e;
        if (j2 != -1) {
            return j2;
        }
        long jE = e(null, true);
        this.e = jE;
        return jE;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: b, reason: from getter */
    public final MediaType getB() {
        return this.d;
    }

    @Override // okhttp3.RequestBody
    public final boolean c() {
        List list = this.c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.RequestBody
    public final void d(t99 t99Var) throws EOFException {
        e(t99Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(t99 t99Var, boolean z) throws EOFException {
        f99 f99Var;
        t99 f99Var2;
        if (z) {
            f99Var2 = new f99();
            f99Var = f99Var2;
        } else {
            f99Var = 0;
            f99Var2 = t99Var;
        }
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            qg9 qg9Var = this.b;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 >= size) {
                f99Var2.getClass();
                f99Var2.write(bArr);
                f99Var2.N0(qg9Var);
                f99Var2.write(bArr);
                f99Var2.write(bArr2);
                if (!z) {
                    return j2;
                }
                f99Var.getClass();
                long j3 = j2 + f99Var.b;
                f99Var.a();
                return j3;
            }
            Part part = (Part) list.get(i2);
            Headers headers = part.f46104a;
            RequestBody requestBody = part.b;
            f99Var2.getClass();
            f99Var2.write(bArr);
            f99Var2.N0(qg9Var);
            f99Var2.write(bArr2);
            int size2 = headers.size();
            for (int i3 = 0; i3 < size2; i3++) {
                f99Var2.D(_HeadersCommonKt.c(headers, i3)).write(h).D(_HeadersCommonKt.e(headers, i3)).write(bArr2);
            }
            MediaType d = requestBody.getB();
            if (d != null) {
                f99Var2.D("Content-Type: ").D(d.f46102a).write(bArr2);
            }
            long jA = requestBody.a();
            if (jA == -1 && z) {
                f99Var.getClass();
                f99Var.a();
                return -1L;
            }
            f99Var2.write(bArr2);
            if (z) {
                j2 += jA;
            } else {
                yae0 yae0Var = new yae0(new NoCloseSink(f99Var2));
                try {
                    requestBody.d(yae0Var);
                    yae0Var.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(yae0Var, th);
                        throw th2;
                    }
                }
            }
            f99Var2.write(bArr2);
            i2++;
        }
    }
}
