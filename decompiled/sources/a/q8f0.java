package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q8f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28296a;
    public final boolean b;

    public q8f0(int i, boolean z) {
        this.f28296a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8f0)) {
            return false;
        }
        q8f0 q8f0Var = (q8f0) obj;
        return this.f28296a == q8f0Var.f28296a && this.b == q8f0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f28296a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f28296a, "OnAuthPickerPhoneCodeManuallyClick(countryId=", ", countryAllowed=", Separators.RPAREN, this.b);
    }
}
