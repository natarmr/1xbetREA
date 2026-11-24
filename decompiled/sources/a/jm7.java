package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class jm7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16752a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public jm7(String str, String str2, boolean z, boolean z2) {
        this.f16752a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm7)) {
            return false;
        }
        jm7 jm7Var = (jm7) obj;
        return this.f16752a.equals(jm7Var.f16752a) && this.b == jm7Var.b && this.c == jm7Var.c && this.d.equals(jm7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(this.f16752a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return twn.q(", betSystemTitle=", kng0.l("BetSystemTitleUiModel(value=", this.d, Separators.RPAREN), Separators.RPAREN, brm0.u("BetSettingsUiModel(betChangeSettingsDescription=", this.f16752a, ", betSystemIsVisible=", this.b, ", betSystemIsLoading="), this.c);
    }
}
