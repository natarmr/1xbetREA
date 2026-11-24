package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26029a;
    public final int b;

    public oxt0(int i, int i2) {
        this.f26029a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxt0)) {
            return false;
        }
        oxt0 oxt0Var = (oxt0) obj;
        return this.f26029a == oxt0Var.f26029a && this.b == oxt0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f26029a) * 31);
    }

    public final String toString() {
        return ohs0.m("ValorantEconomyGraphValueModel(gold=", this.f26029a, ", round=", Separators.RPAREN, this.b);
    }
}
