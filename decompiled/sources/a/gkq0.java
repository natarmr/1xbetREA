package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gkq0 implements hkq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11457a;

    public final boolean equals(Object obj) {
        if (obj instanceof gkq0) {
            return this.f11457a.equals(((gkq0) obj).f11457a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11457a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowServerErrorDialog(message=", this.f11457a, Separators.RPAREN);
    }
}
