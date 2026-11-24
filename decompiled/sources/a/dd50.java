package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dd50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5881a;
    public final imm b;
    public final boolean c;
    public final String d;

    public dd50(String str, imm immVar, boolean z, String str2) {
        this.f5881a = str;
        this.b = immVar;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd50)) {
            return false;
        }
        dd50 dd50Var = (dd50) obj;
        return this.f5881a.equals(dd50Var.f5881a) && this.b.equals(dd50Var.b) && this.c == dd50Var.c && this.d.equals(dd50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(h97.a(this.b, this.f5881a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationBarUiState(title=");
        sb.append(this.f5881a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", isSearchActive=");
        return twn.q(", searchString=", this.d, Separators.RPAREN, sb, this.c);
    }
}
