package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gpp implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11693a;
    public final boolean b;
    public final boolean c;
    public final b8l0 d;

    public gpp(long j, boolean z, boolean z2, b8l0 b8l0Var) {
        this.f11693a = j;
        this.b = z;
        this.c = z2;
        this.d = b8l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpp)) {
            return false;
        }
        gpp gppVar = (gpp) obj;
        return this.f11693a == gppVar.f11693a && this.b == gppVar.b && this.c == gppVar.c && this.d.equals(gppVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return h97.h(this.f11693a, super.getKey());
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(Long.hashCode(this.f11693a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f11693a, "FeedsSportUiModel(sportId=", ", selected=", this.b);
        sbR.append(", selectionEnabled=");
        sbR.append(this.c);
        sbR.append(", feedCellStyle=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
