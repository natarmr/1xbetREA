package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nxr implements rxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24295a;
    public final f5h0 b;
    public final String c;
    public final f5h0 d;

    public nxr(String str, f5h0 f5h0Var, String str2, f5h0 f5h0Var2) {
        this.f24295a = str;
        this.b = f5h0Var;
        this.c = str2;
        this.d = f5h0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxr)) {
            return false;
        }
        nxr nxrVar = (nxr) obj;
        return this.f24295a.equals(nxrVar.f24295a) && this.b == nxrVar.b && this.c.equals(nxrVar.c) && this.d == nxrVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f24295a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "ScoreTotal(firstRow=" + this.f24295a + ", firstRowStyle=" + this.b + ", secondRow=" + this.c + ", secondRowStyle=" + this.d + Separators.RPAREN;
    }
}
