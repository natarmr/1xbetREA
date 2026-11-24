package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fzr implements hzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10422a;
    public final String b;

    public fzr(long j, String str) {
        str.getClass();
        this.f10422a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzr)) {
            return false;
        }
        fzr fzrVar = (fzr) obj;
        return this.f10422a == fzrVar.f10422a && Intrinsics.d(this.b, fzrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f10422a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f10422a, "TeamSecond(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
