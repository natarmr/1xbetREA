package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vfp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37345a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public vfp0(String str, String str2, String str3, boolean z, String str4) {
        str.getClass();
        str2.getClass();
        this.f37345a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfp0)) {
            return false;
        }
        vfp0 vfp0Var = (vfp0) obj;
        return Intrinsics.d(this.f37345a, vfp0Var.f37345a) && Intrinsics.d(this.b, vfp0Var.b) && this.c.equals(vfp0Var.c) && this.d.equals(vfp0Var.d) && this.e == vfp0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(ua80.b(this.f37345a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamModel(id=", this.f37345a, ", title=", this.b, ", imageTeamOne=");
        f140.v(sbN, this.c, ", imageTeamTwo=", this.d, ", pairTeam=");
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
