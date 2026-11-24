package a;

import android.gov.nist.core.Separators;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class xtw0 extends sqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final arw0 f41484a;
    public final int b;

    public xtw0(arw0 arw0Var, int i) {
        this.f41484a = arw0Var;
        this.b = i;
    }

    public static xtw0 b(arw0 arw0Var, int i) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new xtw0(arw0Var, i);
        }
        hny.o("Salt size must be between 8 and 12 bytes");
        return null;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.f41484a != arw0.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xtw0)) {
            return false;
        }
        xtw0 xtw0Var = (xtw0) obj;
        return xtw0Var.f41484a == this.f41484a && xtw0Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(xtw0.class, this.f41484a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return dw9.n(this.b, "X-AES-GCM Parameters (variant: ", String.valueOf(this.f41484a), "salt_size_bytes: ", Separators.RPAREN);
    }
}
