package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cym implements hym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5184a;
    public final String b;
    public final wxm c;

    public cym(String str, String str2, wxm wxmVar) {
        str.getClass();
        str2.getClass();
        this.f5184a = str;
        this.b = str2;
        this.c = wxmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cym)) {
            return false;
        }
        cym cymVar = (cym) obj;
        return Intrinsics.d(this.f5184a, cymVar.f5184a) && Intrinsics.d(this.b, cymVar.b) && this.c.equals(cymVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f5184a.hashCode() * 961, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Default(opponentName=", this.f5184a, ", opponentIcon=null, infoLabel=", this.b, ", options=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
