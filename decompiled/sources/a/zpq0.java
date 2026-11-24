package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zpq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44772a;
    public final int b;

    public zpq0(String str, int i) {
        this.f44772a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpq0)) {
            return false;
        }
        zpq0 zpq0Var = (zpq0) obj;
        return this.f44772a.equals(zpq0Var.f44772a) && this.b == zpq0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f44772a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "TirageItemStatusUiModel(statusText=", this.f44772a, ", tagStyleRes=", Separators.RPAREN);
    }
}
