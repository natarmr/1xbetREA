package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3i f23475a;
    public final u3i b;

    public nga(u3i u3iVar, u3i u3iVar2) {
        this.f23475a = u3iVar;
        this.b = u3iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nga)) {
            return false;
        }
        nga ngaVar = (nga) obj;
        return this.f23475a.equals(ngaVar.f23475a) && this.b.equals(ngaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23475a.hashCode() * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(notificationButton=" + this.f23475a + ", favoriteButton=" + this.b + Separators.RPAREN;
    }
}
