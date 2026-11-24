package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43624a;
    public final String b;

    public z1j0(String str, boolean z) {
        this.f43624a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1j0)) {
            return false;
        }
        z1j0 z1j0Var = (z1j0) obj;
        return this.f43624a == z1j0Var.f43624a && this.b.equals(z1j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f43624a) * 31);
    }

    public final String toString() {
        return ua80.k("SettingsMakeBetAutoMaxStateModel(hasAutoMaxToggleEnabled=", this.f43624a, ", subTitle=", this.b, Separators.RPAREN);
    }
}
