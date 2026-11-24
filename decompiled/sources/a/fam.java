package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9215a;
    public final n0x b;
    public final ut90 c;
    public final tt90 d;
    public final String e;
    public final a4x f;

    public fam(String str, n0x n0xVar, ut90 ut90Var, tt90 tt90Var, String str2, i4 i4Var) {
        str.getClass();
        ut90Var.getClass();
        str2.getClass();
        i4Var.getClass();
        this.f9215a = str;
        this.b = n0xVar;
        this.c = ut90Var;
        this.d = tt90Var;
        this.e = str2;
        this.f = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fam)) {
            return false;
        }
        fam famVar = (fam) obj;
        return Intrinsics.d(this.f9215a, famVar.f9215a) && this.b.equals(famVar.b) && this.c == famVar.c && this.d.equals(famVar.d) && Intrinsics.d(this.e, famVar.e) && Intrinsics.d(this.f, famVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b((this.d.hashCode() + ((this.c.hashCode() + f140.f(this.b, this.f9215a.hashCode() * 31, 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "DsCyberRatingTableRowUiModel(leadingValue=" + this.f9215a + ", picture=" + this.b + ", pictureSize=" + this.c + ", picturePlaceholder=" + this.d + ", label=" + this.e + ", trailingValues=" + this.f + Separators.RPAREN;
    }
}
