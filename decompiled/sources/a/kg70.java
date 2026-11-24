package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kg70 extends qg70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18227a;
    public final boolean b;

    public kg70(boolean z, boolean z2) {
        this.f18227a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg70)) {
            return false;
        }
        kg70 kg70Var = (kg70) obj;
        return this.f18227a == kg70Var.f18227a && this.b == kg70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f18227a) * 31);
    }

    public final String toString() {
        return hne.n("GameStarted(autoSpin=", ", raiseGame=", Separators.RPAREN, this.f18227a, this.b);
    }
}
