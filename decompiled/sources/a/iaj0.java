package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iaj0 implements taj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14441a;

    public iaj0(String str) {
        this.f14441a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iaj0) && this.f14441a.equals(((iaj0) obj).f14441a);
    }

    public final int hashCode() {
        return this.f14441a.hashCode();
    }

    public final String toString() {
        return kng0.l("CheckTestSectionPass(pass=", this.f14441a, Separators.RPAREN);
    }
}
