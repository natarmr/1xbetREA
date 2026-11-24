package okhttp3.tls.internal.der;

import a.brm0;
import a.qg9;
import a.rw2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/AnyValue;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AnyValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46249a;
    public final long b;
    public final boolean c;
    public final long d;
    public final qg9 e;

    public AnyValue(int i, long j, boolean z, long j2, qg9 qg9Var) {
        qg9Var.getClass();
        this.f46249a = i;
        this.b = j;
        this.c = z;
        this.d = j2;
        this.e = qg9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnyValue)) {
            return false;
        }
        AnyValue anyValue = (AnyValue) obj;
        return this.f46249a == anyValue.f46249a && this.b == anyValue.b && this.c == anyValue.c && this.d == anyValue.d && Intrinsics.d(this.e, anyValue.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rw2.b(brm0.e(rw2.b(Integer.hashCode(this.f46249a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "AnyValue(tagClass=" + this.f46249a + ", tag=" + this.b + ", constructed=" + this.c + ", length=" + this.d + ", bytes=" + this.e + ')';
    }
}
