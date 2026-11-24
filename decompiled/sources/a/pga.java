package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26943a;
    public final u3i b;
    public final u3i c;

    public pga(u3i u3iVar, u3i u3iVar2, String str) {
        str.getClass();
        this.f26943a = str;
        this.b = u3iVar;
        this.c = u3iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pga)) {
            return false;
        }
        pga pgaVar = (pga) obj;
        return Intrinsics.d(this.f26943a, pgaVar.f26943a) && this.b.equals(pgaVar.b) && this.c.equals(pgaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vqd.c(this.b, this.f26943a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(infoLabel=" + this.f26943a + ", notificationButton=" + this.b + ", favoriteButton=" + this.c + Separators.RPAREN;
    }
}
