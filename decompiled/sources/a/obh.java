package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class obh implements qbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f24978a;

    public obh(uid uidVar) {
        this.f24978a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obh) && this.f24978a.equals(((obh) obj).f24978a);
    }

    public final int hashCode() {
        return this.f24978a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnGameCardAction(action=", this.f24978a, Separators.RPAREN);
    }
}
