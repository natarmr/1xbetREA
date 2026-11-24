package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iyt0 implements zyt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ox f15605a;
    public final int b;

    public iyt0(ox oxVar, int i) {
        this.f15605a = oxVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyt0)) {
            return false;
        }
        iyt0 iyt0Var = (iyt0) obj;
        return this.f15605a.equals(iyt0Var.f15605a) && this.b == iyt0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f15605a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalInfo(action=" + this.f15605a + ", screenWidth=" + this.b + Separators.RPAREN;
    }
}
