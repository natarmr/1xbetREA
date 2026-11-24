package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class f77 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9045a;

    public final boolean equals(Object obj) {
        if (obj instanceof f77) {
            return this.f9045a.equals(((f77) obj).f9045a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9045a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSingleBetHidden(message=", this.f9045a, Separators.RPAREN);
    }
}
