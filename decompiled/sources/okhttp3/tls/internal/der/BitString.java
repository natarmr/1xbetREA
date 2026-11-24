package okhttp3.tls.internal.der;

import a.brm0;
import a.qg9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/BitString;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BitString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg9 f46253a;
    public final int b;

    public BitString(int i, qg9 qg9Var) {
        qg9Var.getClass();
        this.f46253a = qg9Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitString)) {
            return false;
        }
        BitString bitString = (BitString) obj;
        return Intrinsics.d(this.f46253a, bitString.f46253a) && this.b == bitString.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f46253a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitString(byteString=");
        sb.append(this.f46253a);
        sb.append(", unusedBitsCount=");
        return brm0.n(sb, this.b, ')');
    }
}
