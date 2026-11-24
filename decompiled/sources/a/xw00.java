package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xw00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9x f41587a;
    public final wul b;
    public final wul c;

    public xw00(f9x f9xVar, wul wulVar, wul wulVar2) {
        this.f41587a = f9xVar;
        this.b = wulVar;
        this.c = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw00)) {
            return false;
        }
        xw00 xw00Var = (xw00) obj;
        return Intrinsics.d(this.f41587a, xw00Var.f41587a) && Intrinsics.d(this.b, xw00Var.b) && this.c.equals(xw00Var.c);
    }

    public final int hashCode() {
        f9x f9xVar = this.f41587a;
        int iHashCode = (f9xVar == null ? 0 : f9xVar.hashCode()) * 31;
        wul wulVar = this.b;
        return this.c.hashCode() + ((iHashCode + (wulVar != null ? wulVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LoginUiState(infoLineUiState=" + this.f41587a + ", secondaryButtonUiModel=" + this.b + ", primaryButtonUiModel=" + this.c + Separators.RPAREN;
    }
}
