package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lg4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19989a;

    public lg4(lc00 lc00Var) {
        lc00Var.getClass();
        this.f19989a = lc00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg4) && Intrinsics.d(this.f19989a, ((lg4) obj).f19989a);
    }

    public final int hashCode() {
        return this.f19989a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f19989a, "AuthLoginSimpleSurfaceState(background=", Separators.RPAREN);
    }
}
