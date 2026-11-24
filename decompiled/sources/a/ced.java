package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ced implements eed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aed f4205a;

    public ced(aed aedVar) {
        aedVar.getClass();
        this.f4205a = aedVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ced) && Intrinsics.d(this.f4205a, ((ced) obj).f4205a);
    }

    public final int hashCode() {
        return this.f4205a.hashCode();
    }

    public final String toString() {
        return "OnGameClicked(completedMatchDataUiModel=" + this.f4205a + Separators.RPAREN;
    }
}
