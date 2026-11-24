package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class czr implements hzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5236a;
    public final long b;
    public final boolean c;
    public final int d;

    public czr(int i, long j, String str, boolean z) {
        str.getClass();
        this.f5236a = str;
        this.b = j;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czr)) {
            return false;
        }
        czr czrVar = (czr) obj;
        return Intrinsics.d(this.f5236a, czrVar.f5236a) && znq0.e(this.b, czrVar.b) && this.c == czrVar.c && this.d == czrVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e(rw2.b(this.f5236a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Description(subTitle=", this.f5236a, ", startTime=", znq0.h(this.b), ", timerVisible=");
        sbN.append(this.c);
        sbN.append(", maxLines=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
