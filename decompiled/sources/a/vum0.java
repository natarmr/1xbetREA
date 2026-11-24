package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vum0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38056a;
    public final String b;
    public final boolean c;

    public vum0(String str, long j, boolean z) {
        this.f38056a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vum0)) {
            return false;
        }
        vum0 vum0Var = (vum0) obj;
        return this.f38056a == vum0Var.f38056a && this.b.equals(vum0Var.b) && this.c == vum0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f38056a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f38056a, "SubGame(id=", ", name=", this.b), ", favorite=", this.c, Separators.RPAREN);
    }
}
