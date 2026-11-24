package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class cw4 implements jw4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5063a;

    public cw4(String str) {
        this.f5063a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw4) && this.f5063a.equals(((cw4) obj).f5063a);
    }

    public final int hashCode() {
        return this.f5063a.hashCode();
    }

    public final String toString() {
        return kng0.l("BetExistsError(errorMessage=", this.f5063a, Separators.RPAREN);
    }
}
