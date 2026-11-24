package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gym implements hym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12137a;
    public final String b;
    public final wxm c;
    public final String d;

    public gym(String str, String str2, wxm wxmVar, String str3) {
        brm0.B(str, str2, str3);
        this.f12137a = str;
        this.b = str2;
        this.c = wxmVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gym)) {
            return false;
        }
        gym gymVar = (gym) obj;
        return Intrinsics.d(this.f12137a, gymVar.f12137a) && Intrinsics.d(this.b, gymVar.b) && this.c.equals(gymVar.c) && Intrinsics.d(this.d, gymVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f12137a.hashCode() * 961, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V4(opponentName=", this.f12137a, ", opponentIcon=null, infoLabel=", this.b, ", options=");
        sbN.append(this.c);
        sbN.append(", liveTag=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
