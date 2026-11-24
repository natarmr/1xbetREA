package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rz implements yz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31335a;

    public rz(int i) {
        this.f31335a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rz) && this.f31335a == ((rz) obj).f31335a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31335a);
    }

    public final String toString() {
        return ua80.e(this.f31335a, "ShowCountryChoiceItemDialog(selectedCountryId=", Separators.RPAREN);
    }
}
