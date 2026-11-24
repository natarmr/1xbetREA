package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yft0 implements agt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mim0 f42557a;
    public final uft0 b;

    public yft0(mim0 mim0Var, uft0 uft0Var) {
        this.f42557a = mim0Var;
        this.b = uft0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yft0)) {
            return false;
        }
        yft0 yft0Var = (yft0) obj;
        return this.f42557a.equals(yft0Var.f42557a) && this.b.equals(yft0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42557a.hashCode() * 31);
    }

    public final String toString() {
        return "UpcomingEventDataUiModel(card=" + this.f42557a + ", model=" + this.b + Separators.RPAREN;
    }
}
