package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42576a;
    public final String b;
    public final u3i c;
    public final u3i d;
    public final u3i e;

    public yga(String str, String str2, u3i u3iVar, u3i u3iVar2, u3i u3iVar3) {
        str.getClass();
        str2.getClass();
        this.f42576a = str;
        this.b = str2;
        this.c = u3iVar;
        this.d = u3iVar2;
        this.e = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yga)) {
            return false;
        }
        yga ygaVar = (yga) obj;
        return Intrinsics.d(this.f42576a, ygaVar.f42576a) && Intrinsics.d(this.b, ygaVar.b) && this.c.equals(ygaVar.c) && this.d.equals(ygaVar.d) && this.e.equals(ygaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + vqd.c(this.d, (this.c.hashCode() + ua80.b(this.f42576a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LargeCardWatermark(tagLive=", this.f42576a, ", infoLabel=", this.b, ", broadcastButton=");
        sbN.append(this.c);
        sbN.append(", notificationButton=");
        sbN.append(this.d);
        sbN.append(", favoriteButton=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
