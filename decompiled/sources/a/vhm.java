package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vhm implements yhm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37437a;
    public final boolean b;
    public final llm c;
    public final dmm d;
    public final tlm e;
    public final sd f;
    public final ee g;

    public vhm(String str, boolean z, llm llmVar, dmm dmmVar, tlm tlmVar, sd sdVar, ee eeVar) {
        str.getClass();
        this.f37437a = str;
        this.b = z;
        this.c = llmVar;
        this.d = dmmVar;
        this.e = tlmVar;
        this.f = sdVar;
        this.g = eeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhm)) {
            return false;
        }
        vhm vhmVar = (vhm) obj;
        return Intrinsics.d(this.f37437a, vhmVar.f37437a) && this.b == vhmVar.b && this.c.equals(vhmVar.c) && this.d.equals(vhmVar.d) && this.e.equals(vhmVar.e) && Intrinsics.d(this.f, vhmVar.f) && this.g.equals(vhmVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.f6327a.hashCode() + ((this.c.hashCode() + brm0.e(this.f37437a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31;
        sd sdVar = this.f;
        return this.g.hashCode() + ((iHashCode + (sdVar == null ? 0 : sdVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("Classic(title=", this.f37437a, ", enableDelete=", this.b, ", leftHeaderStyle=");
        sbU.append(this.c);
        sbU.append(", rightHeaderStyle=");
        sbU.append(this.d);
        sbU.append(", middleHeaderStyle=");
        sbU.append(this.e);
        sbU.append(", accountControlModel=");
        sbU.append(this.f);
        sbU.append(", accountControlStyle=");
        sbU.append(this.g);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
