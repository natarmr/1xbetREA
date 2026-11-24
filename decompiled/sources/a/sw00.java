package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sw00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32897a;
    public final boolean b;

    public sw00(boolean z, boolean z2) {
        this.f32897a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw00)) {
            return false;
        }
        sw00 sw00Var = (sw00) obj;
        return this.f32897a == sw00Var.f32897a && this.b == sw00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f32897a) * 31);
    }

    public final String toString() {
        return hne.n("LoginStateModel(authorized=", ", lastAuthorizedState=", Separators.RPAREN, this.f32897a, this.b);
    }
}
