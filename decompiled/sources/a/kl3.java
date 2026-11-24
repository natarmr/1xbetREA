package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kl3 implements ml3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18466a;

    public kl3(int i) {
        this.f18466a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl3) && this.f18466a == ((kl3) obj).f18466a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18466a);
    }

    public final String toString() {
        return ua80.e(this.f18466a, "ThickLineWithIcon(icon=", Separators.RPAREN);
    }
}
