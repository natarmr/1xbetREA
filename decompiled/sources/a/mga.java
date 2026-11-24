package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3i f21732a;
    public final u3i b;

    public mga(u3i u3iVar, u3i u3iVar2) {
        this.f21732a = u3iVar;
        this.b = u3iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mga)) {
            return false;
        }
        mga mgaVar = (mga) obj;
        return this.f21732a.equals(mgaVar.f21732a) && this.b.equals(mgaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21732a.hashCode() * 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(notificationButton=" + this.f21732a + ", favoriteButton=" + this.b + Separators.RPAREN;
    }
}
