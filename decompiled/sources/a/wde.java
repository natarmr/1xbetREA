package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38968a;
    public final long b;
    public final xde c;
    public final rkt0 d;

    public wde(int i, long j, xde xdeVar, rkt0 rkt0Var) {
        this.f38968a = i;
        this.b = j;
        this.c = xdeVar;
        this.d = rkt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wde)) {
            return false;
        }
        wde wdeVar = (wde) obj;
        return this.f38968a == wdeVar.f38968a && this.b == wdeVar.b && this.c == wdeVar.c && Intrinsics.d(this.d, wdeVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + rw2.b(Integer.hashCode(this.f38968a) * 31, 31, this.b)) * 31;
        rkt0 rkt0Var = this.d;
        return iHashCode + (rkt0Var == null ? 0 : rkt0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f38968a, this.b, "ContentCaptureEvent(id=", ", timestamp=");
        sbQ.append(", type=");
        sbQ.append(this.c);
        sbQ.append(", structureCompat=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
