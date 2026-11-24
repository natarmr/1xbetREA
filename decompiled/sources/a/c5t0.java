package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c5t0 implements d5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3790a;
    public final long b;

    public c5t0(String str, long j) {
        this.f3790a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5t0)) {
            return false;
        }
        c5t0 c5t0Var = (c5t0) obj;
        return this.f3790a.equals(c5t0Var.f3790a) && this.b == c5t0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f3790a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "OnTabClick(blockKey=", this.f3790a, ", tabId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
