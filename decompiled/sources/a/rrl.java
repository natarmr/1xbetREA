package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rrl implements trl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30990a;
    public final String b;
    public final String c;
    public final xrl d;

    public rrl(String str, String str2, String str3, xrl xrlVar) {
        str.getClass();
        str2.getClass();
        this.f30990a = str;
        this.b = str2;
        this.c = str3;
        this.d = xrlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrl)) {
            return false;
        }
        rrl rrlVar = (rrl) obj;
        return Intrinsics.d(this.f30990a, rrlVar.f30990a) && Intrinsics.d(this.b, rrlVar.b) && Intrinsics.d(this.c, rrlVar.c) && this.d.equals(rrlVar.d);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f30990a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(stageNumberText=", this.f30990a, ", titleText=", this.b, ", captionText=");
        sbN.append(this.c);
        sbN.append(", state=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
