package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class syt0 implements zyt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33039a;

    public final boolean equals(Object obj) {
        if (obj instanceof syt0) {
            return this.f33039a.equals(((syt0) obj).f33039a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33039a.hashCode();
    }

    public final String toString() {
        return kng0.l("SelectAimPlayer(value=", this.f33039a, Separators.RPAREN);
    }
}
