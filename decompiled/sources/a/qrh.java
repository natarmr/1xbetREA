package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qrh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrh f29209a;
    public final vrh b;

    public qrh(vrh vrhVar, vrh vrhVar2) {
        this.f29209a = vrhVar;
        this.b = vrhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrh)) {
            return false;
        }
        qrh qrhVar = (qrh) obj;
        return this.f29209a.equals(qrhVar.f29209a) && this.b.equals(qrhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29209a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberValorantPlayerCompositionModel(firstTeam=" + this.f29209a + ", secondTeam=" + this.b + Separators.RPAREN;
    }
}
