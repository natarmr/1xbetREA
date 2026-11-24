package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dfm0 f15765a;
    public final String b;

    public j240(dfm0 dfm0Var, String str) {
        this.f15765a = dfm0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j240)) {
            return false;
        }
        j240 j240Var = (j240) obj;
        return this.f15765a.equals(j240Var.f15765a) && this.b.equals(j240Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15765a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuUiModel(menuType=" + this.f15765a + ", title=" + this.b + Separators.RPAREN;
    }
}
