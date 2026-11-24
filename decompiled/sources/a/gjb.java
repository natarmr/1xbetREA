package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gjb implements ijb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f11389a;

    public gjb(uid uidVar) {
        this.f11389a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjb) && this.f11389a.equals(((gjb) obj).f11389a);
    }

    public final int hashCode() {
        return this.f11389a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f11389a, Separators.RPAREN);
    }
}
