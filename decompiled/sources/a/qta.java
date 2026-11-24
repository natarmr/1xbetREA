package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qta implements uta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29290a;
    public final int b;

    public qta(int i, int i2) {
        this.f29290a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qta)) {
            return false;
        }
        qta qtaVar = (qta) obj;
        return this.f29290a == qtaVar.f29290a && this.b == qtaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f29290a) * 31);
    }

    public final String toString() {
        return ohs0.m("OnMoveCard(fromIndex=", this.f29290a, ", toIndex=", Separators.RPAREN, this.b);
    }
}
