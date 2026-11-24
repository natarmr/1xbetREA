package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w4y implements x4y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38562a;
    public final long b;
    public final String c;
    public final double d;
    public final String e;
    public final String f;

    public w4y(String str, long j, String str2, double d, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.f38562a = str;
        this.b = j;
        this.c = str2;
        this.d = d;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4y)) {
            return false;
        }
        w4y w4yVar = (w4y) obj;
        return this.f38562a.equals(w4yVar.f38562a) && this.b == w4yVar.b && this.c.equals(w4yVar.c) && Double.compare(this.d, w4yVar.d) == 0 && Intrinsics.d(this.e, w4yVar.e) && Intrinsics.d(this.f, w4yVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(brm0.d(this.d, ua80.b(rw2.b(this.f38562a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "ShowSuccessBetDialog(oldMessage=", this.f38562a, ", balanceId=");
        hne.B(sbO, ", ticket=", this.c, ", betSum=");
        hne.w(sbO, this.d, ", betType=", this.e);
        return rw2.o(sbO, ", currency=", this.f, Separators.RPAREN);
    }
}
