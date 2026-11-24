package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f10 implements i10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8740a;
    public final String b;
    public final String c;
    public final mtl d;

    public f10(int i, String str, String str2, mtl mtlVar) {
        this.f8740a = i;
        this.b = str;
        this.c = str2;
        this.d = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f10)) {
            return false;
        }
        f10 f10Var = (f10) obj;
        return this.f8740a == f10Var.f8740a && Intrinsics.d(this.b, f10Var.b) && Intrinsics.d(this.c, f10Var.c) && Intrinsics.d(this.d, f10Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f8740a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        mtl mtlVar = this.d;
        return iHashCode3 + (mtlVar != null ? mtlVar.f22376a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f8740a, "Content(statusImage=", ", title=", this.b, ", description=");
        sbR.append(this.c);
        sbR.append(", bottomBarModel=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
