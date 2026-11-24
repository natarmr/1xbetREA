package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tyc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f34747a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public tyc0(pz40 pz40Var, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f34747a = pz40Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public static tyc0 a(tyc0 tyc0Var, pz40 pz40Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            pz40Var = tyc0Var.f34747a;
        }
        pz40 pz40Var2 = pz40Var;
        String str = tyc0Var.b;
        String str2 = tyc0Var.c;
        if ((i & 16) != 0) {
            z = tyc0Var.d;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = tyc0Var.e;
        }
        str.getClass();
        str2.getClass();
        return new tyc0(pz40Var2, str, str2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyc0)) {
            return false;
        }
        tyc0 tyc0Var = (tyc0) obj;
        return this.f34747a.equals(tyc0Var.f34747a) && Intrinsics.d(this.b, tyc0Var.b) && Intrinsics.d(this.c, tyc0Var.c) && this.d == tyc0Var.d && this.e == tyc0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(ua80.b(ua80.b(this.f34747a.hashCode() * 31, 31, this.b), 31, this.c), 31, true), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromocodeFieldStateModel(promocodeValue=");
        sb.append(this.f34747a);
        sb.append(", promocodeValuePlaceholder=");
        sb.append(this.b);
        sb.append(", promocodeSupportingText=");
        brm0.C(this.c, ", isVisibleActionButton=true, isActivatedButton=", ", isVisibleBadge=", sb, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
