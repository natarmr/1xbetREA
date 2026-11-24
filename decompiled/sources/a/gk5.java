package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11429a;
    public final boolean b;

    public gk5(boolean z, boolean z2) {
        this.f11429a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk5)) {
            return false;
        }
        gk5 gk5Var = (gk5) obj;
        return this.f11429a == gk5Var.f11429a && this.b == gk5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f11429a) * 31);
    }

    public final String toString() {
        return hne.n("BalanceManagementPaymentButtonsUiState(payInButtonUiState=", ", payOutButtonUiState=", Separators.RPAREN, this.f11429a, this.b);
    }
}
