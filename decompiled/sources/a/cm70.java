package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cm70 extends im70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4592a;

    public cm70(int i) {
        this.f4592a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cm70) && this.f4592a == ((cm70) obj).f4592a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4592a);
    }

    public final String toString() {
        return ua80.e(this.f4592a, "SetAutoSpinAmountLeft(amount=", Separators.RPAREN);
    }
}
