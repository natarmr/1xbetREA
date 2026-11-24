package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jw implements kw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17227a;

    public jw(int i) {
        this.f17227a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw) && this.f17227a == ((jw) obj).f17227a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17227a);
    }

    public final String toString() {
        return ua80.e(this.f17227a, "ShowChooseCurrencyDialog(selectedCurrencyId=", Separators.RPAREN);
    }
}
