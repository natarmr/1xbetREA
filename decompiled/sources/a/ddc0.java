package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ddc0 implements fdc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5890a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final mtl f;

    public ddc0(String str, String str2, String str3, boolean z, String str4, mtl mtlVar) {
        cs0.x(str, str2, str3, str4);
        this.f5890a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddc0)) {
            return false;
        }
        ddc0 ddc0Var = (ddc0) obj;
        return Intrinsics.d(this.f5890a, ddc0Var.f5890a) && Intrinsics.d(this.b, ddc0Var.b) && Intrinsics.d(this.c, ddc0Var.c) && this.d == ddc0Var.d && Intrinsics.d(this.e, ddc0Var.e) && this.f.equals(ddc0Var.f);
    }

    public final int hashCode() {
        return this.f.f22376a.hashCode() + ua80.b(brm0.e(ua80.b(ua80.b(this.f5890a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Default(promoCodeValue=", this.f5890a, ", firstText=", this.b, ", labelText=");
        brm0.C(this.c, ", hasError=", ", errorText=", sbN, this.d);
        sbN.append(this.e);
        sbN.append(", bottomBarModel=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
