package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n8v0 implements o8v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23109a;

    public n8v0(int i) {
        this.f23109a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8v0) && this.f23109a == ((n8v0) obj).f23109a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23109a);
    }

    public final String toString() {
        return ua80.e(this.f23109a, "OnBonusClicked(id=", Separators.RPAREN);
    }
}
