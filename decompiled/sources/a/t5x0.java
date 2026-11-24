package a;

import android.gov.nist.core.Separators;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t5x0 extends fpw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4w0 f33391a;

    public t5x0(x4w0 x4w0Var) {
        this.f33391a = x4w0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return !((lpw0) this.f33391a.c).equals(lpw0.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t5x0)) {
            return false;
        }
        x4w0 x4w0Var = ((t5x0) obj).f33391a;
        x4w0 x4w0Var2 = this.f33391a;
        return ((lpw0) x4w0Var2.c).equals((lpw0) x4w0Var.c) && ((String) x4w0Var2.b).equals((String) x4w0Var.b) && ((sjw0) x4w0Var2.f40287a).equals((sjw0) x4w0Var.f40287a);
    }

    public final int hashCode() {
        x4w0 x4w0Var = this.f33391a;
        return Objects.hash((String) x4w0Var.b, (sjw0) x4w0Var.f40287a, (lpw0) x4w0Var.c);
    }

    public final String toString() {
        x4w0 x4w0Var = this.f33391a;
        return "(typeUrl=" + ((String) x4w0Var.b) + ", outputPrefixType=" + ((lpw0) x4w0Var.c) + Separators.RPAREN;
    }
}
