package okhttp3.tls.internal.der;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AlgorithmIdentifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46248a;
    public final Object b;

    public AlgorithmIdentifier(String str, Object obj) {
        this.f46248a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlgorithmIdentifier)) {
            return false;
        }
        AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) obj;
        return this.f46248a.equals(algorithmIdentifier.f46248a) && Intrinsics.d(this.b, algorithmIdentifier.b);
    }

    public final int hashCode() {
        int iHashCode = this.f46248a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "AlgorithmIdentifier(algorithm=" + this.f46248a + ", parameters=" + this.b + ')';
    }
}
