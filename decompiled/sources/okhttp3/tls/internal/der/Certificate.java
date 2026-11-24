package okhttp3.tls.internal.der;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/Certificate;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Certificate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TbsCertificate f46254a;
    public final AlgorithmIdentifier b;
    public final BitString c;

    public Certificate(TbsCertificate tbsCertificate, AlgorithmIdentifier algorithmIdentifier, BitString bitString) {
        this.f46254a = tbsCertificate;
        this.b = algorithmIdentifier;
        this.c = bitString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        Certificate certificate = (Certificate) obj;
        return this.f46254a.equals(certificate.f46254a) && this.b.equals(certificate.b) && this.c.equals(certificate.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f46254a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Certificate(tbsCertificate=" + this.f46254a + ", signatureAlgorithm=" + this.b + ", signatureValue=" + this.c + ')';
    }
}
