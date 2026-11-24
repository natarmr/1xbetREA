package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10004a;
    public final o0x b;
    public final o0x c;
    public final String d;
    public final String e;
    public final er5 f;
    public final o0x g;

    public fr5(int i, o0x o0xVar, o0x o0xVar2, String str, String str2, er5 er5Var, o0x o0xVar3) {
        o0xVar.getClass();
        o0xVar2.getClass();
        str.getClass();
        this.f10004a = i;
        this.b = o0xVar;
        this.c = o0xVar2;
        this.d = str;
        this.e = str2;
        this.f = er5Var;
        this.g = o0xVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr5)) {
            return false;
        }
        fr5 fr5Var = (fr5) obj;
        return this.f10004a == fr5Var.f10004a && Intrinsics.d(this.b, fr5Var.b) && Intrinsics.d(this.c, fr5Var.c) && Intrinsics.d(this.d, fr5Var.d) && Intrinsics.d(this.e, fr5Var.e) && Intrinsics.d(this.f, fr5Var.f) && Intrinsics.d(this.g, fr5Var.g);
    }

    public final int hashCode() {
        int iB = ua80.b(w6x.d(this.c, w6x.d(this.b, Integer.hashCode(this.f10004a) * 31, 31), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        er5 er5Var = this.f;
        int iHashCode2 = (iHashCode + (er5Var == null ? 0 : er5Var.hashCode())) * 31;
        o0x o0xVar = this.g;
        return iHashCode2 + (o0xVar != null ? o0xVar.hashCode() : 0);
    }

    public final String toString() {
        return "BannerItemUiModel(bannerId=" + this.f10004a + ", image=" + this.b + ", fallbackImage=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", tag=" + this.f + ", decorationImage=" + this.g + Separators.RPAREN;
    }

    public /* synthetic */ fr5(int i, n0x n0xVar, n0x n0xVar2, String str, String str2, er5 er5Var, int i2) {
        this(i, n0xVar, (i2 & 4) != 0 ? n0xVar : n0xVar2, str, (i2 & 16) != 0 ? null : str2, er5Var, (o0x) null);
    }
}
