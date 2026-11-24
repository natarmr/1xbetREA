package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ei5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb50 f7841a;

    public ei5(sb50 sb50Var) {
        sb50Var.getClass();
        this.f7841a = sb50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei5) && this.f7841a == ((ei5) obj).f7841a;
    }

    public final int hashCode() {
        return this.f7841a.hashCode();
    }

    public final String toString() {
        return "BalanceManagementCommonActionsDelegateState(navigatePath=" + this.f7841a + Separators.RPAREN;
    }
}
