package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f11143a;
    public final String b;

    public gea(i4 i4Var, String str) {
        i4Var.getClass();
        str.getClass();
        this.f11143a = i4Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gea)) {
            return false;
        }
        gea geaVar = (gea) obj;
        return Intrinsics.d(this.f11143a, geaVar.f11143a) && Intrinsics.d(this.b, geaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11143a.hashCode() * 31);
    }

    public final String toString() {
        return "CardCricketCostUiModel(cards=" + this.f11143a + ", points=" + this.b + Separators.RPAREN;
    }
}
