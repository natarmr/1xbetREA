package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tg60 implements xg60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33894a;

    public tg60(int i) {
        this.f33894a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg60) && this.f33894a == ((tg60) obj).f33894a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33894a);
    }

    public final String toString() {
        return ua80.e(this.f33894a, "CountryDialog(selectedCountryId=", Separators.RPAREN);
    }
}
