package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fi50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9573a;
    public final String b;
    public final String c;

    public fi50(long j, String str, String str2) {
        this.f9573a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi50)) {
            return false;
        }
        fi50 fi50Var = (fi50) obj;
        return this.f9573a == fi50Var.f9573a && this.b.equals(fi50Var.b) && this.c.equals(fi50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f9573a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f9573a, "NearestGameDetailsSubSportModel(id=", ", name=", this.b), ", nameEng=", this.c, Separators.RPAREN);
    }
}
