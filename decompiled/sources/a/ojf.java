package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ojf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25355a;
    public final String b;

    public ojf(String str, String str2) {
        this.f25355a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojf)) {
            return false;
        }
        ojf ojfVar = (ojf) obj;
        return this.f25355a.equals(ojfVar.f25355a) && this.b.equals(ojfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25355a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Cs2CompositionSubTeamModel(title=", this.f25355a, ", image=", this.b, Separators.RPAREN);
    }
}
