package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lac0 extends mac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19699a;
    public final boolean b;
    public final fic0 c;

    public lac0(String str, boolean z, fic0 fic0Var) {
        str.getClass();
        this.f19699a = str;
        this.b = z;
        this.c = fic0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lac0)) {
            return false;
        }
        lac0 lac0Var = (lac0) obj;
        return Intrinsics.d(this.f19699a, lac0Var.f19699a) && this.b == lac0Var.b && this.c.equals(lac0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f19699a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("PromoInfo(buttonText=", this.f19699a, ", isButtonEnable=", this.b, ", uiModel=");
        sbU.append(this.c);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
