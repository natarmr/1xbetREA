package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mc30 implements oc30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad30 f21533a;
    public final boolean b;

    public mc30(ad30 ad30Var, boolean z) {
        this.f21533a = ad30Var;
        this.b = z;
    }

    @Override // a.oc30
    public final boolean a() {
        return this.b;
    }

    @Override // a.oc30
    public final ad30 b() {
        return this.f21533a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc30)) {
            return false;
        }
        mc30 mc30Var = (mc30) obj;
        return this.f21533a.equals(mc30Var.f21533a) && this.b == mc30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21533a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f21533a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
