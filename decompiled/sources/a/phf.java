package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class phf implements yhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26993a;
    public final String b;
    public final boolean c;
    public final Long d;

    public phf(long j, Long l, String str, boolean z) {
        str.getClass();
        this.f26993a = j;
        this.b = str;
        this.c = z;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phf)) {
            return false;
        }
        phf phfVar = (phf) obj;
        return this.f26993a == phfVar.f26993a && Intrinsics.d(this.b, phfVar.b) && this.c == phfVar.c && Intrinsics.d(this.d, phfVar.d);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(Long.hashCode(this.f26993a) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26993a, "CountdownTime(time=", ", description=", this.b);
        sbO.append(", timerVisible=");
        sbO.append(this.c);
        sbO.append(", stageTime=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
