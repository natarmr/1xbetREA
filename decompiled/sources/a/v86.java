package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v86 implements z86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36967a;
    public final String b;
    public final wxm c;
    public final String d;
    public final f2i e;

    public v86(String str, String str2, wxm wxmVar, String str3, f2i f2iVar) {
        str.getClass();
        str3.getClass();
        this.f36967a = str;
        this.b = str2;
        this.c = wxmVar;
        this.d = str3;
        this.e = f2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v86)) {
            return false;
        }
        v86 v86Var = (v86) obj;
        return Intrinsics.d(this.f36967a, v86Var.f36967a) && this.b.equals(v86Var.b) && this.c.equals(v86Var.c) && Intrinsics.d(this.d, v86Var.d) && Intrinsics.d(this.e, v86Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b((this.c.hashCode() + ua80.b(this.f36967a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        f2i f2iVar = this.e;
        return iB + (f2iVar == null ? 0 : f2iVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OneOpponent(opponentName=", this.f36967a, ", infoLabel=", this.b, ", options=");
        sbN.append(this.c);
        sbN.append(", tagLiveText=");
        sbN.append(this.d);
        sbN.append(", broadcastIndicatorModel=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
