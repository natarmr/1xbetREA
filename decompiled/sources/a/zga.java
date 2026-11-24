package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44334a;
    public final String b;
    public final u3i c;
    public final u3i d;
    public final u3i e;

    public zga(String str, String str2, u3i u3iVar, u3i u3iVar2, u3i u3iVar3) {
        str.getClass();
        str2.getClass();
        this.f44334a = str;
        this.b = str2;
        this.c = u3iVar;
        this.d = u3iVar2;
        this.e = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zga)) {
            return false;
        }
        zga zgaVar = (zga) obj;
        return Intrinsics.d(this.f44334a, zgaVar.f44334a) && Intrinsics.d(this.b, zgaVar.b) && this.c.equals(zgaVar.c) && this.d.equals(zgaVar.d) && this.e.equals(zgaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + vqd.c(this.d, (this.c.hashCode() + ua80.b(this.f44334a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MediumCardSmallTeamLogo(tagLive=", this.f44334a, ", infoLabel=", this.b, ", broadcastButton=");
        sbN.append(this.c);
        sbN.append(", notificationButton=");
        sbN.append(this.d);
        sbN.append(", favoriteButton=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
