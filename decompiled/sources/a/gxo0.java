package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12087a;
    public final String b;
    public final gmk c;
    public final boolean d;
    public final a4x e;

    public gxo0(String str, String str2, gmk gmkVar, boolean z, a4x a4xVar) {
        w6x.x(a4xVar, str, str2);
        this.f12087a = str;
        this.b = str2;
        this.c = gmkVar;
        this.d = z;
        this.e = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxo0)) {
            return false;
        }
        gxo0 gxo0Var = (gxo0) obj;
        return Intrinsics.d(this.f12087a, gxo0Var.f12087a) && Intrinsics.d(this.b, gxo0Var.b) && Intrinsics.d(this.c, gxo0Var.c) && this.d == gxo0Var.d && Intrinsics.d(this.e, gxo0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f12087a.hashCode() * 31, 31, this.b);
        gmk gmkVar = this.c;
        return this.e.hashCode() + brm0.e((iB + (gmkVar == null ? 0 : gmkVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TaxesUiModel(headerLabel=", this.f12087a, ", description=", this.b, ", differenceUiModel=");
        sbN.append(this.c);
        sbN.append(", isLoading=");
        sbN.append(this.d);
        sbN.append(", taxUiModelList=");
        return cs0.n(sbN, this.e, Separators.RPAREN);
    }
}
