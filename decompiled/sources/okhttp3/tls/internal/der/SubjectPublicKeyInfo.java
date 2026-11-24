package okhttp3.tls.internal.der;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SubjectPublicKeyInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlgorithmIdentifier f46263a;
    public final BitString b;

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, BitString bitString) {
        this.f46263a = algorithmIdentifier;
        this.b = bitString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubjectPublicKeyInfo)) {
            return false;
        }
        SubjectPublicKeyInfo subjectPublicKeyInfo = (SubjectPublicKeyInfo) obj;
        return this.f46263a.equals(subjectPublicKeyInfo.f46263a) && this.b.equals(subjectPublicKeyInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46263a.hashCode() * 31);
    }

    public final String toString() {
        return "SubjectPublicKeyInfo(algorithm=" + this.f46263a + ", subjectPublicKey=" + this.b + ')';
    }
}
