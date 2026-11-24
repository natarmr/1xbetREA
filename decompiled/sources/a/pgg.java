package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26954a;
    public final boolean b;
    public final hhq0 c;

    public pgg(boolean z, boolean z2, hhq0 hhq0Var) {
        hhq0Var.getClass();
        this.f26954a = z;
        this.b = z2;
        this.c = hhq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgg)) {
            return false;
        }
        pgg pggVar = (pgg) obj;
        return this.f26954a == pggVar.f26954a && this.b == pggVar.b && Intrinsics.d(this.c, pggVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f26954a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("CyberChampsFilterUiState(isStreamFilterEnabled=", ", isMultiselectEnabled=", ", timeFilterModel=", this.f26954a, this.b);
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
