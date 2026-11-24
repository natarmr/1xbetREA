package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k5j0 implements m5j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17724a;

    public k5j0(lc00 lc00Var) {
        lc00Var.getClass();
        this.f17724a = lc00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5j0) && Intrinsics.d(this.f17724a, ((k5j0) obj).f17724a);
    }

    public final int hashCode() {
        return this.f17724a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f17724a, "Content(list=", Separators.RPAREN);
    }
}
