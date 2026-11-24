package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30500a;
    public final boolean b;

    public rho(boolean z, boolean z2) {
        this.f30500a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rho)) {
            return false;
        }
        rho rhoVar = (rho) obj;
        return this.f30500a == rhoVar.f30500a && this.b == rhoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f30500a) * 31);
    }

    public final String toString() {
        return hne.n("EventSubscriptionModel(canSubscribe=", ", subscribed=", Separators.RPAREN, this.f30500a, this.b);
    }
}
