package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ec2 implements ic2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6w f7545a;
    public final boolean b;

    public ec2(p6w p6wVar, boolean z) {
        this.f7545a = p6wVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec2)) {
            return false;
        }
        ec2 ec2Var = (ec2) obj;
        return this.f7545a.equals(ec2Var.f7545a) && this.b == ec2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f7545a.hashCode() * 31);
    }

    public final String toString() {
        return "LargeItemSpaceSeparator(historyResultUiState=" + this.f7545a + ", isRefreshing=" + this.b + Separators.RPAREN;
    }
}
