package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gh3 f13042a;
    public final eh3 b;
    public final fh3 c;

    public hh3(gh3 gh3Var, eh3 eh3Var, fh3 fh3Var) {
        this.f13042a = gh3Var;
        this.b = eh3Var;
        this.c = fh3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh3)) {
            return false;
        }
        hh3 hh3Var = (hh3) obj;
        return this.f13042a == hh3Var.f13042a && this.b == hh3Var.b && this.c == hh3Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f13042a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AppStartSettingsModel(appStartPreset=" + this.f13042a + ", appStartBackground=" + this.b + ", appStartLoader=" + this.c + Separators.RPAREN;
    }
}
