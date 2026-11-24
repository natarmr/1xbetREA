package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43917a;
    public final String b;
    public final v7f0 c;

    public z7f0(boolean z, String str, v7f0 v7f0Var) {
        str.getClass();
        this.f43917a = z;
        this.b = str;
        this.c = v7f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7f0)) {
            return false;
        }
        z7f0 z7f0Var = (z7f0) obj;
        return this.f43917a == z7f0Var.f43917a && Intrinsics.d(this.b, z7f0Var.b) && this.c.equals(z7f0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f43917a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("RegistrationTypeChoiceDefaultUiState(isLoading=", ", title=", this.b, this.f43917a, ", content=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
