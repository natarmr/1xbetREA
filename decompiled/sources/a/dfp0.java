package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dfp0 implements efp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6010a;

    public dfp0(String str) {
        this.f6010a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfp0) && this.f6010a.equals(((dfp0) obj).f6010a);
    }

    public final int hashCode() {
        return this.f6010a.hashCode();
    }

    public final String toString() {
        return kng0.l("SingleTeamLogosUiModel(teamLogo=", this.f6010a, Separators.RPAREN);
    }
}
