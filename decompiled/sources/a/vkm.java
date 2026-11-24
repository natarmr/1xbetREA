package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37581a;
    public final boolean b;

    public vkm(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) != 0;
        this.f37581a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkm)) {
            return false;
        }
        vkm vkmVar = (vkm) obj;
        return this.f37581a == vkmVar.f37581a && this.b == vkmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f37581a) * 31);
    }

    public final String toString() {
        return hne.n("DsNavigationBarConfiguration(rightContentFillFreeSpace=", ", animateSeparator=", Separators.RPAREN, this.f37581a, this.b);
    }
}
