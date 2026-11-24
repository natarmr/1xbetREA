package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mkp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21954a;

    public mkp(lc00 lc00Var) {
        lc00Var.getClass();
        this.f21954a = lc00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkp) && Intrinsics.d(this.f21954a, ((mkp) obj).f21954a);
    }

    public final int hashCode() {
        return this.f21954a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f21954a, "Loading(items=", Separators.RPAREN);
    }
}
