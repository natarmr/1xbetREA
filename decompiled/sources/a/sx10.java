package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f32951a;
    public final boolean b;

    public sx10(iz30 iz30Var, boolean z) {
        this.f32951a = iz30Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx10)) {
            return false;
        }
        sx10 sx10Var = (sx10) obj;
        return this.f32951a == sx10Var.f32951a && this.b == sx10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f32951a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemSimpleModel(menuItem=" + this.f32951a + ", bettingDisabled=" + this.b + Separators.RPAREN;
    }
}
