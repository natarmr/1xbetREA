package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cgt0 implements egt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agt0 f4330a;

    public cgt0(agt0 agt0Var) {
        agt0Var.getClass();
        this.f4330a = agt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cgt0) && Intrinsics.d(this.f4330a, ((cgt0) obj).f4330a);
    }

    public final int hashCode() {
        return this.f4330a.hashCode();
    }

    public final String toString() {
        return "OnGameClicked(upcomingEventUiModel=" + this.f4330a + Separators.RPAREN;
    }
}
