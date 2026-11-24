package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dvc0 implements fvc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6736a;

    public dvc0(int i) {
        this.f6736a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvc0) && this.f6736a == ((dvc0) obj).f6736a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6736a);
    }

    public final String toString() {
        return ua80.e(this.f6736a, "Promocode(promoId=", Separators.RPAREN);
    }
}
