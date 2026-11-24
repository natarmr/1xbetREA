package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40347a;

    public final boolean equals(Object obj) {
        if (obj instanceof x67) {
            return this.f40347a.equals(((x67) obj).f40347a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40347a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSaleError(message=", this.f40347a, Separators.RPAREN);
    }
}
