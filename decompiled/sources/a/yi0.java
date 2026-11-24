package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class yi0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42662a;
    public final ti0 b;

    public yi0(String str, ti0 ti0Var) {
        this.f42662a = str;
        this.b = ti0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi0)) {
            return false;
        }
        yi0 yi0Var = (yi0) obj;
        return this.f42662a.equals(yi0Var.f42662a) && this.b.equals(yi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42662a.hashCode() * 31);
    }

    public final String toString() {
        return "JackpotWidgetModel(id=" + this.f42662a + ", headerModel=" + this.b + Separators.RPAREN;
    }
}
