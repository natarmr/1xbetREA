package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class juf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17150a;
    public final boolean b;
    public final boolean c;

    public juf(String str, boolean z, boolean z2) {
        this.f17150a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juf)) {
            return false;
        }
        juf jufVar = (juf) obj;
        return this.f17150a.equals(jufVar.f17150a) && this.b == jufVar.b && this.c == jufVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f17150a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(brm0.u("CupheadTeamUiModel(teamImage=", this.f17150a, ", win=", this.b, ", winVisibility="), this.c, Separators.RPAREN);
    }
}
