package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yfd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42536a;
    public final String b;
    public final boolean c;

    public yfd0(String str, String str2, boolean z) {
        this.f42536a = str;
        this.b = str2;
        this.c = z;
    }

    public static yfd0 a(yfd0 yfd0Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = yfd0Var.f42536a;
        }
        if ((i & 2) != 0) {
            str2 = yfd0Var.b;
        }
        boolean z = yfd0Var.c;
        yfd0Var.getClass();
        str.getClass();
        return new yfd0(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfd0)) {
            return false;
        }
        yfd0 yfd0Var = (yfd0) obj;
        return this.f42536a.equals(yfd0Var.f42536a) && this.b.equals(yfd0Var.b) && this.c == yfd0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f42536a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("UiState(code=", this.f42536a, ", mail=", this.b, ", cantGetCodeVisible="), this.c, Separators.RPAREN);
    }
}
