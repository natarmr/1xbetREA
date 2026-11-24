package a;

import android.gov.nist.core.Separators;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class msw0 extends sqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22344a;
    public final h70 b;

    public msw0(String str, h70 h70Var) {
        this.f22344a = str;
        this.b = h70Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.b != h70.l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof msw0) {
            msw0 msw0Var = (msw0) obj;
            return msw0Var.f22344a.equals(this.f22344a) && msw0Var.b == this.b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(msw0.class, this.f22344a, this.b);
    }

    public final String toString() {
        return b1j.k("LegacyKmsAead Parameters (keyUri: ", this.f22344a, ", variant: ", String.valueOf(this.b), Separators.RPAREN);
    }
}
