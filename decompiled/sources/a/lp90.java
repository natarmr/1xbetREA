package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lp90 implements op90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20429a;
    public final boolean b;

    public lp90(int i, boolean z) {
        this.f20429a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp90)) {
            return false;
        }
        lp90 lp90Var = (lp90) obj;
        return this.f20429a == lp90Var.f20429a && this.b == lp90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f20429a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f20429a, "ChoosePhoneCodeByManually(countryId=", ", countryAllowed=", Separators.RPAREN, this.b);
    }
}
