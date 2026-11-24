package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class wi0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39191a;
    public final ti0 b;

    public wi0(String str, ti0 ti0Var) {
        this.f39191a = str;
        this.b = ti0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi0)) {
            return false;
        }
        wi0 wi0Var = (wi0) obj;
        return this.f39191a.equals(wi0Var.f39191a) && this.b.equals(wi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39191a.hashCode() * 31);
    }

    public final String toString() {
        return "DailyTaskWidgetModel(id=" + this.f39191a + ", headerModel=" + this.b + Separators.RPAREN;
    }
}
