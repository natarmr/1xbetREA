package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d020 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5250a;
    public final int b;
    public final String c;

    public d020(String str, int i, boolean z) {
        this.f5250a = z;
        this.b = i;
        this.c = str;
    }

    public static d020 a(d020 d020Var, boolean z, int i, String str, int i2) {
        if ((i2 & 1) != 0) {
            z = d020Var.f5250a;
        }
        if ((i2 & 2) != 0) {
            i = d020Var.b;
        }
        if ((i2 & 4) != 0) {
            str = d020Var.c;
        }
        d020Var.getClass();
        return new d020(str, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d020)) {
            return false;
        }
        d020 d020Var = (d020) obj;
        return this.f5250a == d020Var.f5250a && this.b == d020Var.b && this.c.equals(d020Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Boolean.hashCode(this.f5250a) * 31, 31);
    }

    public final String toString() {
        return axq.n(ohs0.t(this.b, "MainSettingsStateModel(isAuthorized=", ", userIconDrawableResId=", ", appInfo=", this.f5250a), this.c, Separators.RPAREN);
    }
}
