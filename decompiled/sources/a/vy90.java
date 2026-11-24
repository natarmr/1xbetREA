package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vy90 implements wy90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38237a;

    public vy90(i4 i4Var) {
        i4Var.getClass();
        this.f38237a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy90) && Intrinsics.d(this.f38237a, ((vy90) obj).f38237a);
    }

    public final int hashCode() {
        return this.f38237a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f38237a, "Tree(threeBranches=", Separators.RPAREN);
    }
}
