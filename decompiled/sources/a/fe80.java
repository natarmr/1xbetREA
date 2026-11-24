package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fe80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yvl f9394a;
    public final String b;
    public final a4x c;

    public fe80(yvl yvlVar, String str, i4 i4Var) {
        str.getClass();
        i4Var.getClass();
        this.f9394a = yvlVar;
        this.b = str;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe80)) {
            return false;
        }
        fe80 fe80Var = (fe80) obj;
        return this.f9394a.equals(fe80Var.f9394a) && Intrinsics.d(this.b, fe80Var.b) && Intrinsics.d(this.c, fe80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f9394a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutcomesContainerUiModel(checkboxUiModel=");
        sb.append(this.f9394a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", outcomesChipsList=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
