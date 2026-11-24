package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yt30 implements bv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43198a;
    public final jam0 b;

    public yt30(int i, jam0 jam0Var) {
        this.f43198a = i;
        this.b = jam0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt30)) {
            return false;
        }
        yt30 yt30Var = (yt30) obj;
        return this.f43198a == yt30Var.f43198a && this.b == yt30Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f43198a) * 31);
    }

    public final String toString() {
        return "LastGameClick(tabId=" + this.f43198a + ", statisticBlockWidget=" + this.b + Separators.RPAREN;
    }
}
