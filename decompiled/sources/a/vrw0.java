package a;

import android.gov.nist.core.Separators;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class vrw0 extends sqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y60 f37922a;

    public vrw0(y60 y60Var) {
        this.f37922a = y60Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.f37922a != y60.m;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vrw0) && ((vrw0) obj).f37922a == this.f37922a;
    }

    public final int hashCode() {
        return Objects.hash(vrw0.class, this.f37922a);
    }

    public final String toString() {
        return kng0.l("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.f37922a), Separators.RPAREN);
    }
}
