package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ayr implements eyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1683a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public ayr(long j, String str, boolean z, boolean z2) {
        str.getClass();
        this.f1683a = str;
        this.b = j;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayr)) {
            return false;
        }
        ayr ayrVar = (ayr) obj;
        return Intrinsics.d(this.f1683a, ayrVar.f1683a) && this.b == ayrVar.b && this.c == ayrVar.c && this.d == ayrVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(rw2.b(this.f1683a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "Description(subTitle=", this.f1683a, ", startTime=");
        w6x.A(", timerVisible=", ", realCyberSport=", sbO, this.c, this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
