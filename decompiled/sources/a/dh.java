package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6068a;
    public final boolean b;
    public final int c;
    public final long d;

    public dh(boolean z, boolean z2, int i, long j) {
        this.f6068a = z;
        this.b = z2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj;
        if (this.f6068a != dhVar.f6068a || this.b != dhVar.b || this.c != dhVar.c) {
            return false;
        }
        long j = dhVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, brm0.e(Boolean.hashCode(this.f6068a) * 31, 31, this.b), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + iA;
    }

    public final String toString() {
        return rw2.k(this.c, ", iconTint=", y3d.i(this.d), Separators.RPAREN, f140.q("AchievementIconSlotUiModel(showTopLine=", ", showBottomLine=", ", iconRes=", this.f6068a, this.b));
    }
}
