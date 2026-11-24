package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e9j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7423a;

    public final boolean equals(Object obj) {
        if (obj instanceof e9j) {
            return this.f7423a.equals(((e9j) obj).f7423a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7423a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondPlayerTotal(value=", this.f7423a, Separators.RPAREN);
    }
}
