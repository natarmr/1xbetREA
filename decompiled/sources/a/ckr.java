package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ckr implements dkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4521a;

    public ckr(String str) {
        this.f4521a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckr) && this.f4521a.equals(((ckr) obj).f4521a);
    }

    public final int hashCode() {
        return this.f4521a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowResultDialog(message=", this.f4521a, Separators.RPAREN);
    }
}
