package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f39910a;
    public final String b;

    public wx10(iz30 iz30Var, String str) {
        this.f39910a = iz30Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx10)) {
            return false;
        }
        wx10 wx10Var = (wx10) obj;
        return this.f39910a == wx10Var.f39910a && this.b.equals(wx10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39910a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemUfcModel(menuItem=" + this.f39910a + ", endIconUrl=" + this.b + Separators.RPAREN;
    }
}
