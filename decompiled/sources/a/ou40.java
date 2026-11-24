package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ou40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25859a;
    public final boolean b;

    public ou40(boolean z, boolean z2) {
        this.f25859a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou40)) {
            return false;
        }
        ou40 ou40Var = (ou40) obj;
        return this.f25859a == ou40Var.f25859a && this.b == ou40Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f25859a) * 31);
    }

    public final String toString() {
        return hne.n("MoveAnimationUiModel(playerHasBonus=", ", playerMoveBack=", Separators.RPAREN, this.f25859a, this.b);
    }
}
