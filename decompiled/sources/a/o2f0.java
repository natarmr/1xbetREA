package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o2f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24527a;
    public final boolean b;

    public o2f0(int i, boolean z) {
        this.f24527a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2f0)) {
            return false;
        }
        o2f0 o2f0Var = (o2f0) obj;
        return this.f24527a == o2f0Var.f24527a && this.b == o2f0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f24527a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f24527a, "OnAuthPickerPhoneCodeManuallyClick(countryId=", ", countryAllowed=", Separators.RPAREN, this.b);
    }
}
