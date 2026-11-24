package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41662a;
    public final String b;
    public final int c;

    public xxk(int i, int i2, String str) {
        this.f41662a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxk)) {
            return false;
        }
        xxk xxkVar = (xxk) obj;
        return this.f41662a == xxkVar.f41662a && this.b.equals(xxkVar.b) && this.c == xxkVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Integer.hashCode(this.f41662a) * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, vqd.r(this.f41662a, "DocumentModel(id=", ", title=", this.b, ", minAge="));
    }
}
