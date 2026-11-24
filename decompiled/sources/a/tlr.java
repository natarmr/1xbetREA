package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tlr implements amr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34160a;

    public tlr(String str) {
        this.f34160a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlr) && this.f34160a.equals(((tlr) obj).f34160a);
    }

    public final int hashCode() {
        return this.f34160a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnHeadToHeadCardClick(statId=", this.f34160a, Separators.RPAREN);
    }
}
