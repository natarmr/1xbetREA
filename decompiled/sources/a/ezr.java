package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ezr implements hzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8683a;
    public final String b;

    public ezr(long j, String str) {
        str.getClass();
        this.f8683a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezr)) {
            return false;
        }
        ezr ezrVar = (ezr) obj;
        return this.f8683a == ezrVar.f8683a && Intrinsics.d(this.b, ezrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f8683a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f8683a, "TeamFirst(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
