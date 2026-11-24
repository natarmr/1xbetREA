package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lka0 implements mka0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20191a;

    public lka0(int i) {
        this.f20191a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lka0) && this.f20191a == ((lka0) obj).f20191a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20191a);
    }

    public final String toString() {
        return ua80.e(this.f20191a, "OnTeamTabSelected(position=", Separators.RPAREN);
    }
}
