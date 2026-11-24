package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ueo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35538a;
    public final String b;
    public final int c;
    public final int d;

    public ueo(String str, int i, int i2, long j) {
        str.getClass();
        this.f35538a = j;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueo)) {
            return false;
        }
        ueo ueoVar = (ueo) obj;
        return this.f35538a == ueoVar.f35538a && Intrinsics.d(this.b, ueoVar.b) && this.c == ueoVar.c && this.d == ueoVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, ua80.b(Long.hashCode(this.f35538a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f35538a, "EventModel(id=", ", name=", this.b);
        rw2.s(this.c, this.d, ", typeParam=", ", specialType=", sbO);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
