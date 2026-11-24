package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class noy implements ooy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23887a;
    public final String b;
    public final boolean c;
    public final Long d;

    public noy(long j, Long l, String str, boolean z) {
        str.getClass();
        this.f23887a = j;
        this.b = str;
        this.c = z;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noy)) {
            return false;
        }
        noy noyVar = (noy) obj;
        return this.f23887a == noyVar.f23887a && Intrinsics.d(this.b, noyVar.b) && this.c == noyVar.c && Intrinsics.d(this.d, noyVar.d);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(Long.hashCode(this.f23887a) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f23887a, "Timer(time=", ", description=", this.b);
        sbO.append(", timerVisible=");
        sbO.append(this.c);
        sbO.append(", stageTime=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
