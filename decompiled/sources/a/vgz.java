package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vgz implements wgz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37406a;
    public final mdm b;

    public vgz(long j, mdm mdmVar) {
        this.f37406a = j;
        this.b = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgz)) {
            return false;
        }
        vgz vgzVar = (vgz) obj;
        return this.f37406a == vgzVar.f37406a && this.b.equals(vgzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f37406a) * 31);
    }

    public final String toString() {
        return "Error(subSportId=" + this.f37406a + ", errorConfig=" + this.b + Separators.RPAREN;
    }
}
