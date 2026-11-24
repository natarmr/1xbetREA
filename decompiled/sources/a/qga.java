package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3i f28673a;
    public final u3i b;

    public qga(u3i u3iVar, u3i u3iVar2) {
        this.f28673a = u3iVar;
        this.b = u3iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qga)) {
            return false;
        }
        qga qgaVar = (qga) obj;
        return this.f28673a.equals(qgaVar.f28673a) && this.b.equals(qgaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28673a.hashCode() * 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(notificationButton=" + this.f28673a + ", favoriteButton=" + this.b + Separators.RPAREN;
    }
}
