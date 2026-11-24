package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vxs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38217a;
    public final String b;
    public final int c;

    public vxs(int i, String str, String str2) {
        this.f38217a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxs)) {
            return false;
        }
        vxs vxsVar = (vxs) obj;
        return this.f38217a.equals(vxsVar.f38217a) && this.b.equals(vxsVar.b) && this.c == vxsVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f38217a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("GameVideoUrlModel(videoUrl=", this.f38217a, ", externalAuthUrl=", this.b, ", providerId="));
    }
}
