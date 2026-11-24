package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class y9u0 implements bau0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42266a;
    public final String b;
    public final String c;
    public final mtl d;

    public y9u0(int i, String str, String str2, mtl mtlVar) {
        this.f42266a = i;
        this.b = str;
        this.c = str2;
        this.d = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9u0)) {
            return false;
        }
        y9u0 y9u0Var = (y9u0) obj;
        return this.f42266a == y9u0Var.f42266a && Intrinsics.d(this.b, y9u0Var.b) && Intrinsics.d(this.c, y9u0Var.c) && Intrinsics.d(this.d, y9u0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f42266a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        mtl mtlVar = this.d;
        return iHashCode3 + (mtlVar != null ? mtlVar.f22376a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f42266a, "Content(statusImage=", ", title=", this.b, ", description=");
        sbR.append(this.c);
        sbR.append(", bottomBarModel=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
