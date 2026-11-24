package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l1p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19266a;
    public final long b;
    public final Set c;

    public l1p(Set set, long j, long j2) {
        set.getClass();
        this.f19266a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1p)) {
            return false;
        }
        l1p l1pVar = (l1p) obj;
        return this.f19266a == l1pVar.f19266a && this.b == l1pVar.b && Intrinsics.d(this.c, l1pVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f19266a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f19266a, "FatmanLogInfo(eventNumber=", ", timestamp=");
        sbQ.append(this.b);
        sbQ.append(", logs=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
