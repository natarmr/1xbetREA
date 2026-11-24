package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q5o0 implements s5o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4i f28162a;

    public final boolean equals(Object obj) {
        if (obj instanceof q5o0) {
            return this.f28162a.equals(((q5o0) obj).f28162a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28162a.hashCode();
    }

    public final String toString() {
        return rz4.l("MediumCardSmallTeamLogo(model=", this.f28162a, Separators.RPAREN);
    }
}
