package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class laa0 implements naa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19697a;

    public laa0(String str) {
        this.f19697a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof laa0) && this.f19697a.equals(((laa0) obj).f19697a);
    }

    public final int hashCode() {
        return this.f19697a.hashCode();
    }

    public final String toString() {
        return kng0.l("Captain(roleName=", this.f19697a, Separators.RPAREN);
    }
}
