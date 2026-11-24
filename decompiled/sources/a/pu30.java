package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pu30 implements cv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wy30 f27595a;

    public pu30(wy30 wy30Var) {
        wy30Var.getClass();
        this.f27595a = wy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu30) && Intrinsics.d(this.f27595a, ((pu30) obj).f27595a);
    }

    public final int hashCode() {
        return this.f27595a.hashCode();
    }

    public final String toString() {
        return "OnMenuItemClick(item=" + this.f27595a + Separators.RPAREN;
    }
}
