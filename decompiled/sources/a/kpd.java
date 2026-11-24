package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kpd implements ynd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udp0 f18668a;
    public final udp0 b;
    public final j83 c;
    public final mpm d;

    public kpd(udp0 udp0Var, udp0 udp0Var2, j83 j83Var, mpm mpmVar) {
        this.f18668a = udp0Var;
        this.b = udp0Var2;
        this.c = j83Var;
        this.d = mpmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpd)) {
            return false;
        }
        kpd kpdVar = (kpd) obj;
        return this.f18668a.equals(kpdVar.f18668a) && this.b.equals(kpdVar.b) && this.c.equals(kpdVar.c) && this.d.equals(kpdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.f(this.c, (this.b.hashCode() + (this.f18668a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "CompressedCardRegularTeamUiModel(teamOne=" + this.f18668a + ", teamTwo=" + this.b + ", topInfo=" + ((Object) this.c) + ", score=" + this.d + Separators.RPAREN;
    }
}
