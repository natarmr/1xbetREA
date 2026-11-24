package a;

import android.gov.nist.core.Separators;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class muw0 extends sqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fhn f22431a;

    public muw0(fhn fhnVar) {
        this.f22431a = fhnVar;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.f22431a != fhn.l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof muw0) && ((muw0) obj).f22431a == this.f22431a;
    }

    public final int hashCode() {
        return Objects.hash(muw0.class, this.f22431a);
    }

    public final String toString() {
        return kng0.l("XChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.f22431a), Separators.RPAREN);
    }
}
