package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class obo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24991a;
    public final String b;
    public final int c;
    public final int d;

    public obo(String str, int i, int i2, long j) {
        str.getClass();
        this.f24991a = j;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obo)) {
            return false;
        }
        obo oboVar = (obo) obj;
        return this.f24991a == oboVar.f24991a && Intrinsics.d(this.b, oboVar.b) && this.c == oboVar.c && this.d == oboVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, ua80.b(Long.hashCode(this.f24991a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f24991a, "EventDbModel(id=", ", name=", this.b);
        rw2.s(this.c, this.d, ", typeParam=", ", specialType=", sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
