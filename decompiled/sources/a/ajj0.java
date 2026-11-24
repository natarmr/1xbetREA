package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ajj0 implements bjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f979a;
    public final String b;
    public final boolean c;
    public final Long d;

    public ajj0(long j, Long l, String str, boolean z) {
        str.getClass();
        this.f979a = j;
        this.b = str;
        this.c = z;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajj0)) {
            return false;
        }
        ajj0 ajj0Var = (ajj0) obj;
        return this.f979a == ajj0Var.f979a && Intrinsics.d(this.b, ajj0Var.b) && this.c == ajj0Var.c && Intrinsics.d(this.d, ajj0Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(Long.hashCode(this.f979a) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f979a, "Timer(time=", ", description=", this.b);
        sbO.append(", timerVisible=");
        sbO.append(this.c);
        sbO.append(", stageTime=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
