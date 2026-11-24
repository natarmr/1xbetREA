package okhttp3.tls.internal.der;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/Validity;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Validity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46265a;
    public final long b;

    public Validity(long j, long j2) {
        this.f46265a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Validity)) {
            return false;
        }
        Validity validity = (Validity) obj;
        return this.f46265a == validity.f46265a && this.b == validity.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f46265a) * 31);
    }

    public final String toString() {
        return "Validity(notBefore=" + this.f46265a + ", notAfter=" + this.b + ')';
    }
}
