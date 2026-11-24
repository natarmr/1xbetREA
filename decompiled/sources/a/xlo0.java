package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xlo0 implements ylo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41085a;

    public xlo0(String str) {
        this.f41085a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlo0) && this.f41085a.equals(((xlo0) obj).f41085a);
    }

    public final int hashCode() {
        return this.f41085a.hashCode();
    }

    public final String toString() {
        return kng0.l("Short(playerName=", this.f41085a, Separators.RPAREN);
    }
}
