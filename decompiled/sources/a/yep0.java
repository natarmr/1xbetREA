package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42499a;
    public final String b;

    public yep0(String str, String str2) {
        this.f42499a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yep0)) {
            return false;
        }
        yep0 yep0Var = (yep0) obj;
        return this.f42499a.equals(yep0Var.f42499a) && this.b.equals(yep0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42499a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PlayerRowForTest(playerName=", this.f42499a, ", heroName=", this.b, Separators.RPAREN);
    }
}
