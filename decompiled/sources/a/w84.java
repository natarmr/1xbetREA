package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class w84 implements y84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q84 f38703a;

    public w84(q84 q84Var) {
        this.f38703a = q84Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w84) && this.f38703a.equals(((w84) obj).f38703a);
    }

    public final int hashCode() {
        return this.f38703a.hashCode();
    }

    public final String toString() {
        return "ShowExitSessionDialog(authHistorySessionUiModel=" + this.f38703a + Separators.RPAREN;
    }
}
