package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v3y implements w3y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36753a;
    public final long b;
    public final String c;
    public final double d;
    public final String e;
    public final String f;

    public v3y(String str, long j, String str2, double d, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.f36753a = str;
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
        if (!(obj instanceof v3y)) {
            return false;
        }
        v3y v3yVar = (v3y) obj;
        return this.f36753a.equals(v3yVar.f36753a) && this.b == v3yVar.b && this.c.equals(v3yVar.c) && Double.compare(this.d, v3yVar.d) == 0 && Intrinsics.d(this.e, v3yVar.e) && Intrinsics.d(this.f, v3yVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(brm0.d(this.d, ua80.b(rw2.b(this.f36753a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "ShowSuccessLiteNoTabBetDialog(oldMessage=", this.f36753a, ", balanceId=");
        hne.B(sbO, ", ticket=", this.c, ", betSum=");
        hne.w(sbO, this.d, ", betType=", this.e);
        return rw2.o(sbO, ", currency=", this.f, Separators.RPAREN);
    }
}
