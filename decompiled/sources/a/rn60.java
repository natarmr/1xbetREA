package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class rn60 implements tn60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30773a;
    public final boolean b;

    public rn60(boolean z, boolean z2) {
        this.f30773a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn60)) {
            return false;
        }
        rn60 rn60Var = (rn60) obj;
        return this.f30773a == rn60Var.f30773a && this.b == rn60Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f30773a) * 31);
    }

    public final String toString() {
        return hne.n("ShowGameActionsDialog(favorite=", ", hasFavorite=", Separators.RPAREN, this.f30773a, this.b);
    }
}
