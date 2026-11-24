package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class d74 implements l74 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q84 f5578a;

    public d74(q84 q84Var) {
        this.f5578a = q84Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d74) && this.f5578a.equals(((d74) obj).f5578a);
    }

    public final int hashCode() {
        return this.f5578a.hashCode();
    }

    public final String toString() {
        return "OnExitSessionClick(authHistorySessionUiModel=" + this.f5578a + Separators.RPAREN;
    }
}
