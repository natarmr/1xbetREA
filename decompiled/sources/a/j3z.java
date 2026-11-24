package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class j3z {
    public static final i3z Companion = new i3z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15859a;
    public final String b;

    public /* synthetic */ j3z(String str, int i, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, h3z.f12409a.getDescriptor());
            throw null;
        }
        this.f15859a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3z)) {
            return false;
        }
        j3z j3zVar = (j3z) obj;
        return this.f15859a == j3zVar.f15859a && Intrinsics.d(this.b, j3zVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f15859a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f15859a, "LaunchEntityRequest(id=", ", type=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public j3z(long j, String str) {
        this.f15859a = j;
        this.b = str;
    }
}
