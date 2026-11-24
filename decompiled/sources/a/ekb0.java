package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ekb0 implements pkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xkb0 f7945a;

    public final boolean equals(Object obj) {
        if (obj instanceof ekb0) {
            return this.f7945a.equals(((ekb0) obj).f7945a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7945a.hashCode();
    }

    public final String toString() {
        return "OnOnboardingStepAction(value=" + this.f7945a + Separators.RPAREN;
    }
}
