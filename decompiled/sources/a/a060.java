package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a060 implements d060 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11a;
    public final int b;

    public a060(int i, int i2) {
        this.f11a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a060)) {
            return false;
        }
        a060 a060Var = (a060) obj;
        return this.f11a == a060Var.f11a && this.b == a060Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f11a) * 31);
    }

    public final String toString() {
        return ohs0.m("OnFilterItemMoved(fromPosition=", this.f11a, ", toPosition=", Separators.RPAREN, this.b);
    }
}
