package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yj40 implements ak40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42725a;
    public final String b;

    public yj40(long j, String str) {
        this.f42725a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj40)) {
            return false;
        }
        yj40 yj40Var = (yj40) obj;
        return this.f42725a == yj40Var.f42725a && this.b.equals(yj40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f42725a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f42725a, "InfoClick(champId=", ", champName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
