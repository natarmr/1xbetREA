package okhttp3.tls.internal.der;

import a.e9d0;
import a.f99;
import a.jf4;
import a.owq;
import a.zae0;
import java.net.ProtocolException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/tls/internal/der/DerReader;", "", "Companion", "CountingSource", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DerReader {
    public static final DerHeader h = new DerHeader(0, 0, -1, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountingSource f46259a;
    public final zae0 b;
    public long c;
    public final ArrayList d;
    public final ArrayList e;
    public boolean f;
    public DerHeader g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/tls/internal/der/DerReader$Companion;", "", "Lokhttp3/tls/internal/der/DerHeader;", "END_OF_DATA", "Lokhttp3/tls/internal/der/DerHeader;", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/DerReader$CountingSource;", "La/owq;", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CountingSource extends owq {
        public long b;

        @Override // a.owq, a.emk0
        public final long Y(f99 f99Var, long j) {
            f99Var.getClass();
            long jY = this.f25976a.Y(f99Var, j);
            if (jY == -1) {
                return -1L;
            }
            this.b += jY;
            return jY;
        }
    }

    public DerReader(f99 f99Var) {
        CountingSource countingSource = new CountingSource(f99Var);
        this.f46259a = countingSource;
        this.b = new zae0(countingSource);
        this.c = -1L;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final long a() {
        return this.f46259a.b - this.b.b.b;
    }

    public final long b() {
        long j = this.c;
        if (j == -1) {
            return -1L;
        }
        return j - a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final DerHeader c() throws ProtocolException {
        long j;
        DerHeader derHeader;
        long j2;
        DerHeader derHeader2 = this.g;
        long j3 = 0;
        if (derHeader2 != null) {
            j = 0;
            derHeader = null;
        } else {
            if (derHeader2 != null) {
                jf4.o("Failed requirement.");
                return null;
            }
            long jA = a();
            long j4 = this.c;
            DerHeader derHeader3 = h;
            if (jA == j4) {
                j = 0;
                derHeader2 = derHeader3;
                derHeader = null;
            } else {
                zae0 zae0Var = this.b;
                if (j4 == -1 && zae0Var.v0()) {
                    j = 0;
                    derHeader2 = derHeader3;
                    derHeader = null;
                } else {
                    byte b = zae0Var.readByte();
                    int i = b & 192;
                    int i2 = 1;
                    boolean z = (b & 32) == 32;
                    int i3 = b & 31;
                    long jE = i3 == 31 ? e() : i3;
                    byte b2 = zae0Var.readByte();
                    if ((b2 & 255) == 128) {
                        e9d0.j("indefinite length not permitted for DER");
                        return null;
                    }
                    if ((b2 & 128) == 128) {
                        int i4 = b2 & 127;
                        if (i4 > 8) {
                            e9d0.j("length encoded with more than 8 bytes is not supported");
                            return null;
                        }
                        long j5 = zae0Var.readByte();
                        j2 = j5 & 255;
                        if (j2 == 0 || (i4 == 1 && (j5 & 128) == 0)) {
                            e9d0.j("invalid encoding for length");
                            return null;
                        }
                        while (i2 < i4) {
                            j2 = (j2 << 8) + ((long) (zae0Var.readByte() & 255));
                            i2++;
                            j3 = j3;
                        }
                        j = j3;
                        derHeader = null;
                        if (j2 < j) {
                            e9d0.j("length > Long.MAX_VALUE");
                            return null;
                        }
                    } else {
                        j = 0;
                        derHeader = null;
                        j2 = b2 & 127;
                    }
                    derHeader2 = new DerHeader(i, jE, j2, z);
                }
            }
            this.g = derHeader2;
        }
        return (derHeader2.f46258a == 0 && derHeader2.b == j) ? derHeader : derHeader2;
    }

    public final String d() throws ProtocolException {
        if (b() != -1 && !this.f) {
            return this.b.n(b());
        }
        e9d0.j("constructed strings not supported for DER");
        return null;
    }

    public final long e() {
        long j = 0;
        while (true) {
            long j2 = this.b.readByte();
            long j3 = 255 & j2;
            if ((j2 & 128) != 128) {
                return j + j3;
            }
            j = (j + (j2 & 127)) << 7;
        }
    }

    public final String toString() {
        return CollectionsKt.b0(this.e, " / ", null, null, null, 62);
    }
}
