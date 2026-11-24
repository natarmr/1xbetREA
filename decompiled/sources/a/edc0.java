package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class edc0 implements fdc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7610a;
    public final a4x b;
    public final String c;
    public final mtl d;

    public edc0(String str, a4x a4xVar, String str2, mtl mtlVar) {
        str.getClass();
        a4xVar.getClass();
        str2.getClass();
        this.f7610a = str;
        this.b = a4xVar;
        this.c = str2;
        this.d = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edc0)) {
            return false;
        }
        edc0 edc0Var = (edc0) obj;
        return Intrinsics.d(this.f7610a, edc0Var.f7610a) && Intrinsics.d(this.b, edc0Var.b) && Intrinsics.d(this.c, edc0Var.c) && this.d.equals(edc0Var.d);
    }

    public final int hashCode() {
        return this.d.f22376a.hashCode() + ua80.b(cs0.b(this.b, this.f7610a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("DetailsPromo(promoCode=", this.f7610a, ", descriptions=", this.b, ", textAdditional=");
        sbU.append(this.c);
        sbU.append(", bottomBarModel=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
