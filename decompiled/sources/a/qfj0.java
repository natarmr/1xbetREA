package a;

import android.gov.nist.core.Separators;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class qfj0 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yg f28638a;
    public final ksh0 b;

    public qfj0(yg ygVar, ksh0 ksh0Var) {
        this.f28638a = ygVar;
        this.b = ksh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfj0)) {
            return false;
        }
        qfj0 qfj0Var = (qfj0) obj;
        return this.f28638a.equals(qfj0Var.f28638a) && this.b.equals(qfj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28638a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return "SettingsWidgetsUiModel(accountWidget=" + this.f28638a + ", securityProgressWidget=" + this.b + Separators.RPAREN;
    }
}
