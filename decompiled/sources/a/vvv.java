package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vvv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38122a;
    public final String b;
    public final String c;

    public vvv(long j, String str, String str2) {
        this.f38122a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvv)) {
            return false;
        }
        vvv vvvVar = (vvv) obj;
        return this.f38122a == vvvVar.f38122a && this.b.equals(vvvVar.b) && this.c.equals(vvvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f38122a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f38122a, "HeroModel(id=", ", icon=", this.b), ", name=", this.c, Separators.RPAREN);
    }
}
