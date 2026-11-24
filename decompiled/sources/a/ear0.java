package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ear0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7482a;
    public final String b;

    public ear0(String str, String str2) {
        this.f7482a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ear0)) {
            return false;
        }
        ear0 ear0Var = (ear0) obj;
        return this.f7482a.equals(ear0Var.f7482a) && this.b.equals(ear0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7482a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TopPlayersInfoRowUiModel(shortTitle=", this.f7482a, ", title=", this.b, Separators.RPAREN);
    }
}
