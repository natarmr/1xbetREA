package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ijs implements mjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14890a;

    public ijs(int i) {
        this.f14890a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijs) && this.f14890a == ((ijs) obj).f14890a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14890a);
    }

    public final String toString() {
        return ua80.e(this.f14890a, "ShowErrorMessage(messageId=", Separators.RPAREN);
    }
}
