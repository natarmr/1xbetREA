package okhttp3.tls.internal.der;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/BasicConstraints;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BasicConstraints {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46251a;
    public final Long b;

    public BasicConstraints(Long l, boolean z) {
        this.f46251a = z;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicConstraints)) {
            return false;
        }
        BasicConstraints basicConstraints = (BasicConstraints) obj;
        return this.f46251a == basicConstraints.f46251a && Intrinsics.d(this.b, basicConstraints.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f46251a) * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "BasicConstraints(ca=" + this.f46251a + ", maxIntermediateCas=" + this.b + ')';
    }
}
