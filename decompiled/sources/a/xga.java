package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40827a;
    public final u3i b;
    public final u3i c;
    public final u3i d;

    public xga(u3i u3iVar, u3i u3iVar2, u3i u3iVar3, String str) {
        str.getClass();
        this.f40827a = str;
        this.b = u3iVar;
        this.c = u3iVar2;
        this.d = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xga)) {
            return false;
        }
        xga xgaVar = (xga) obj;
        return Intrinsics.d(this.f40827a, xgaVar.f40827a) && this.b.equals(xgaVar.b) && this.c.equals(xgaVar.c) && this.d.equals(xgaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + vqd.c(this.c, (this.b.hashCode() + (this.f40827a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(tagLive=" + this.f40827a + ", broadcastButton=" + this.b + ", notificationButton=" + this.c + ", favoriteButton=" + this.d + Separators.RPAREN;
    }
}
