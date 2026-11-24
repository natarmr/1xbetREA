package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37309a;
    public final String b;
    public final int c;

    public vf(int i, String str, String str2) {
        this.f37309a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf)) {
            return false;
        }
        vf vfVar = (vf) obj;
        return this.f37309a.equals(vfVar.f37309a) && this.b.equals(vfVar.b) && this.c == vfVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f37309a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("AccountRegionModel(url=", this.f37309a, ", region=", this.b, ", environmentId="));
    }
}
