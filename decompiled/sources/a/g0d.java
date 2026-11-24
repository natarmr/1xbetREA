package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class g0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10453a;
    public final String b;
    public final boolean c;

    public g0d(String str, String str2, boolean z) {
        this.f10453a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0d)) {
            return false;
        }
        g0d g0dVar = (g0d) obj;
        return this.f10453a.equals(g0dVar.f10453a) && this.b.equals(g0dVar.b) && this.c == g0dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f10453a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("CoefficientSettingsUiModel(titleText=", this.f10453a, ", subTitleText=", this.b, ", isVisible="), this.c, Separators.RPAREN);
    }
}
