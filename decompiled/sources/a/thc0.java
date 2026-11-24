package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class thc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33954a;
    public final String b;

    public thc0(String str, String str2) {
        this.f33954a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thc0)) {
            return false;
        }
        thc0 thc0Var = (thc0) obj;
        return this.f33954a.equals(thc0Var.f33954a) && this.b.equals(thc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33954a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PromoDialogData(title=", this.f33954a, ", message=", this.b, Separators.RPAREN);
    }
}
