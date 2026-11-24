package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o3w implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24605a;
    public final String b;
    public final a4x c;

    public o3w(i4 i4Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        this.f24605a = str;
        this.b = str2;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3w)) {
            return false;
        }
        o3w o3wVar = (o3w) obj;
        return Intrinsics.d(this.f24605a, o3wVar.f24605a) && Intrinsics.d(this.b, o3wVar.b) && Intrinsics.d(this.c, o3wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f24605a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("HistoryItemTaxTextUiModel(taxItemId=", this.f24605a, ", titleText=", this.b, ", historyItemAmountTextUiModelList="), this.c, Separators.RPAREN);
    }
}
