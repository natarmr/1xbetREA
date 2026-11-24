package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ytk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43221a;
    public final String b;
    public final boolean c;

    public ytk(String str, String str2, boolean z) {
        this.f43221a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytk)) {
            return false;
        }
        ytk ytkVar = (ytk) obj;
        return this.f43221a.equals(ytkVar.f43221a) && this.b.equals(ytkVar.b) && this.c == ytkVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f43221a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("DisciplineModel(title=", this.f43221a, ", value=", this.b, ", isDefault="), this.c, Separators.RPAREN);
    }
}
