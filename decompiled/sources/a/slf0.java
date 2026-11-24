package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class slf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32397a;
    public final String b;
    public final int c;
    public final int d;

    public slf0(int i, String str, int i2, String str2) {
        this.f32397a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slf0)) {
            return false;
        }
        slf0 slf0Var = (slf0) obj;
        return this.f32397a.equals(slf0Var.f32397a) && this.b.equals(slf0Var.b) && this.c == slf0Var.c && this.d == slf0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, ua80.b(this.f32397a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", size=", Separators.RPAREN, b1j.n("ReportFilesModel(cephFullPath=", this.f32397a, ", fileName=", this.b, ", partNumber="));
    }
}
