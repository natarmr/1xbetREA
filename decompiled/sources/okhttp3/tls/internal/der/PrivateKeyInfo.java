package okhttp3.tls.internal.der;

import a.qg9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/PrivateKeyInfo;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PrivateKeyInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46262a;
    public final AlgorithmIdentifier b;
    public final qg9 c;

    public PrivateKeyInfo(long j, AlgorithmIdentifier algorithmIdentifier, qg9 qg9Var) {
        this.f46262a = j;
        this.b = algorithmIdentifier;
        this.c = qg9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivateKeyInfo)) {
            return false;
        }
        PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) obj;
        return this.f46262a == privateKeyInfo.f46262a && this.b.equals(privateKeyInfo.b) && this.c.equals(privateKeyInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f46262a) * 31)) * 31);
    }

    public final String toString() {
        return "PrivateKeyInfo(version=" + this.f46262a + ", algorithmIdentifier=" + this.b + ", privateKey=" + this.c + ')';
    }
}
