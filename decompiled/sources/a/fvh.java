package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fvh extends hvh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10214a;
    public final String b;
    public final String c;
    public final int d;
    public final lho e;
    public final znq0 f;
    public final List g;

    public fvh(String str, String str2, String str3, int i, lho lhoVar, znq0 znq0Var, List list) {
        list.getClass();
        this.f10214a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = lhoVar;
        this.f = znq0Var;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvh)) {
            return false;
        }
        fvh fvhVar = (fvh) obj;
        return this.f10214a.equals(fvhVar.f10214a) && this.b.equals(fvhVar.b) && this.c.equals(fvhVar.c) && this.d == fvhVar.d && this.e == fvhVar.e && this.f.equals(fvhVar.f) && Intrinsics.d(this.g, fvhVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + rw2.b((this.e.hashCode() + twn.a(this.d, ua80.b(ua80.b(this.f10214a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31, this.f.f44687a);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Data(id=", this.f10214a, ", tournamentTitle=", this.b, ", trackTitle=");
        twn.w(this.d, this.c, ", trackId=", ", status=", sbN);
        sbN.append(this.e);
        sbN.append(", dateStart=");
        sbN.append(this.f);
        sbN.append(", menu=");
        return dw9.r(sbN, this.g, Separators.RPAREN);
    }
}
