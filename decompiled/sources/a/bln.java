package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bln implements fln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2803a;
    public final j43 b;

    public bln(String str, j43 j43Var) {
        str.getClass();
        this.f2803a = str;
        this.b = j43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bln)) {
            return false;
        }
        bln blnVar = (bln) obj;
        return Intrinsics.d(this.f2803a, blnVar.f2803a) && this.b.equals(blnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2803a.hashCode() * 31);
    }

    public final String toString() {
        return "CoefficientParamUiItem(title=" + this.f2803a + ", animatedCoefficientModel=" + this.b + Separators.RPAREN;
    }
}
