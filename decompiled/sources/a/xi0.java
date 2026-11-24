package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xi0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40920a;
    public final ti0 b;
    public final Integer c;
    public final int d;
    public final String e;
    public final boolean f;
    public final pc0 g;
    public final Integer h;

    public xi0(String str, ti0 ti0Var, Integer num, int i, String str2, boolean z, pc0 pc0Var, Integer num2) {
        str.getClass();
        str2.getClass();
        this.f40920a = str;
        this.b = ti0Var;
        this.c = num;
        this.d = i;
        this.e = str2;
        this.f = z;
        this.g = pc0Var;
        this.h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi0)) {
            return false;
        }
        xi0 xi0Var = (xi0) obj;
        return Intrinsics.d(this.f40920a, xi0Var.f40920a) && this.b.equals(xi0Var.b) && Intrinsics.d(this.c, xi0Var.c) && this.d == xi0Var.d && Intrinsics.d(this.e, xi0Var.e) && this.f == xi0Var.f && this.g == xi0Var.g && Intrinsics.d(this.h, xi0Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f40920a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int iHashCode2 = (this.g.hashCode() + brm0.e(ua80.b(twn.a(this.d, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.e), 31, this.f)) * 31;
        Integer num2 = this.h;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCarouselModel(id=");
        sb.append(this.f40920a);
        sb.append(", headerModel=");
        sb.append(this.b);
        sb.append(", categoryId=");
        sb.append(this.c);
        sb.append(", limit=");
        sb.append(this.d);
        sb.append(", filterType=");
        brm0.C(this.e, ", isInfinite=", ", layoutType=", sb, this.f);
        sb.append(this.g);
        sb.append(", partId=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
