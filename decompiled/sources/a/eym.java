package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eym implements hym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8633a;
    public final String b;
    public final wxm c;
    public final String d;
    public final f2i e;

    public eym(String str, String str2, wxm wxmVar, String str3, f2i f2iVar) {
        brm0.B(str, str2, str3);
        this.f8633a = str;
        this.b = str2;
        this.c = wxmVar;
        this.d = str3;
        this.e = f2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eym)) {
            return false;
        }
        eym eymVar = (eym) obj;
        return Intrinsics.d(this.f8633a, eymVar.f8633a) && Intrinsics.d(this.b, eymVar.b) && this.c.equals(eymVar.c) && Intrinsics.d(this.d, eymVar.d) && Intrinsics.d(this.e, eymVar.e);
    }

    public final int hashCode() {
        int iB = ua80.b((this.c.hashCode() + ua80.b(this.f8633a.hashCode() * 961, 31, this.b)) * 31, 31, this.d);
        f2i f2iVar = this.e;
        return iB + (f2iVar == null ? 0 : f2iVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V2(opponentName=", this.f8633a, ", opponentIcon=null, infoLabel=", this.b, ", options=");
        sbN.append(this.c);
        sbN.append(", tagLiveText=");
        sbN.append(this.d);
        sbN.append(", broadcastIndicatorModel=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
