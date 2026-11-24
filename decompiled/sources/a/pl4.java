package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pl4 implements xl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx00 f27164a;

    public pl4(kx00 kx00Var) {
        kx00Var.getClass();
        this.f27164a = kx00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pl4) && Intrinsics.d(this.f27164a, ((pl4) obj).f27164a);
    }

    public final int hashCode() {
        return this.f27164a.hashCode();
    }

    public final String toString() {
        return "UpdateVerified(logonModel=" + this.f27164a + Separators.RPAREN;
    }
}
