package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wjb0 implements xjb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39254a;
    public final String b;

    public wjb0(long j, String str) {
        this.f39254a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjb0)) {
            return false;
        }
        wjb0 wjb0Var = (wjb0) obj;
        return this.f39254a == wjb0Var.f39254a && this.b.equals(wjb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f39254a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f39254a, "Sport(sportId=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
