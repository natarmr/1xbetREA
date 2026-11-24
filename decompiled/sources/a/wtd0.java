package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wtd0 implements mud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ox f39735a;
    public final int b;

    public wtd0(ox oxVar, int i) {
        this.f39735a = oxVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtd0)) {
            return false;
        }
        wtd0 wtd0Var = (wtd0) obj;
        return this.f39735a.equals(wtd0Var.f39735a) && this.b == wtd0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f39735a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAdditionalInfoClick(action=" + this.f39735a + ", screenWidth=" + this.b + Separators.RPAREN;
    }
}
