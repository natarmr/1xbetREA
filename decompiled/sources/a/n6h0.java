package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n6h0 implements r6h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7h0 f22997a;

    public n6h0(c7h0 c7h0Var) {
        c7h0Var.getClass();
        this.f22997a = c7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6h0) && Intrinsics.d(this.f22997a, ((n6h0) obj).f22997a);
    }

    public final int hashCode() {
        return this.f22997a.hashCode();
    }

    public final String toString() {
        return "InitGameField(gameResult=" + this.f22997a + Separators.RPAREN;
    }
}
