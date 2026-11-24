package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ued implements wed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdd f35521a;

    public ued(xdd xddVar) {
        xddVar.getClass();
        this.f35521a = xddVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ued) && Intrinsics.d(this.f35521a, ((ued) obj).f35521a);
    }

    public final int hashCode() {
        return this.f35521a.hashCode();
    }

    public final String toString() {
        return "OnGameClicked(completedMatchDataUiModel=" + this.f35521a + Separators.RPAREN;
    }
}
