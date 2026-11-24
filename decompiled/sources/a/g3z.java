package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g3z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10637a;
    public final String b;

    public g3z(long j, String str) {
        this.f10637a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3z)) {
            return false;
        }
        g3z g3zVar = (g3z) obj;
        return this.f10637a == g3zVar.f10637a && Intrinsics.d(this.b, g3zVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f10637a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f10637a, "LaunchEntityModel(id=", ", type=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
