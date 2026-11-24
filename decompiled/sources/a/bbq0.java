package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bbq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final taq0 f2320a;
    public final taq0 b;
    public final taq0 c;
    public final taq0 d;
    public final taq0 e;
    public final taq0 f;
    public final taq0 g;
    public final taq0 h;
    public final taq0 i;
    public final taq0 j;
    public final taq0 k;

    public /* synthetic */ bbq0(taq0 taq0Var, taq0 taq0Var2, taq0 taq0Var3, int i) {
        this(taq0Var, (i & 2) != 0 ? null : taq0Var2, (i & 4) != 0 ? null : taq0Var3, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbq0)) {
            return false;
        }
        bbq0 bbq0Var = (bbq0) obj;
        return Intrinsics.d(this.f2320a, bbq0Var.f2320a) && Intrinsics.d(this.b, bbq0Var.b) && Intrinsics.d(this.c, bbq0Var.c) && Intrinsics.d(this.d, bbq0Var.d) && Intrinsics.d(this.e, bbq0Var.e) && Intrinsics.d(this.f, bbq0Var.f) && Intrinsics.d(this.g, bbq0Var.g) && Intrinsics.d(this.h, bbq0Var.h) && Intrinsics.d(this.i, bbq0Var.i) && Intrinsics.d(this.j, bbq0Var.j) && Intrinsics.d(this.k, bbq0Var.k);
    }

    public final int hashCode() {
        int iHashCode = this.f2320a.hashCode() * 31;
        taq0 taq0Var = this.b;
        int iHashCode2 = (iHashCode + (taq0Var == null ? 0 : taq0Var.hashCode())) * 31;
        taq0 taq0Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (taq0Var2 == null ? 0 : taq0Var2.hashCode())) * 31;
        taq0 taq0Var3 = this.d;
        int iHashCode4 = (iHashCode3 + (taq0Var3 == null ? 0 : taq0Var3.hashCode())) * 31;
        taq0 taq0Var4 = this.e;
        int iHashCode5 = (iHashCode4 + (taq0Var4 == null ? 0 : taq0Var4.hashCode())) * 31;
        taq0 taq0Var5 = this.f;
        int iHashCode6 = (iHashCode5 + (taq0Var5 == null ? 0 : taq0Var5.hashCode())) * 31;
        taq0 taq0Var6 = this.g;
        int iHashCode7 = (iHashCode6 + (taq0Var6 == null ? 0 : taq0Var6.hashCode())) * 31;
        taq0 taq0Var7 = this.h;
        int iHashCode8 = (iHashCode7 + (taq0Var7 == null ? 0 : taq0Var7.hashCode())) * 31;
        taq0 taq0Var8 = this.i;
        int iHashCode9 = (iHashCode8 + (taq0Var8 == null ? 0 : taq0Var8.hashCode())) * 31;
        taq0 taq0Var9 = this.j;
        int iHashCode10 = (iHashCode9 + (taq0Var9 == null ? 0 : taq0Var9.hashCode())) * 31;
        taq0 taq0Var10 = this.k;
        return iHashCode10 + (taq0Var10 != null ? taq0Var10.hashCode() : 0);
    }

    public final String toString() {
        return "ThemeModel(light=" + this.f2320a + ", dark=" + this.b + ", night=" + this.c + ", lightBlue=" + this.d + ", darkBlue=" + this.e + ", lightRed=" + this.f + ", darkRed=" + this.g + ", lightGreen=" + this.h + ", darkGreen=" + this.i + ", lightYellow=" + this.j + ", darkYellow=" + this.k + Separators.RPAREN;
    }

    public bbq0(taq0 taq0Var, taq0 taq0Var2, taq0 taq0Var3, taq0 taq0Var4, taq0 taq0Var5, taq0 taq0Var6, taq0 taq0Var7, taq0 taq0Var8, taq0 taq0Var9, taq0 taq0Var10, taq0 taq0Var11) {
        taq0Var.getClass();
        this.f2320a = taq0Var;
        this.b = taq0Var2;
        this.c = taq0Var3;
        this.d = taq0Var4;
        this.e = taq0Var5;
        this.f = taq0Var6;
        this.g = taq0Var7;
        this.h = taq0Var8;
        this.i = taq0Var9;
        this.j = taq0Var10;
        this.k = taq0Var11;
    }
}
