package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ozl0 implements wzl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26106a;
    public final int b;

    public ozl0(int i, int i2) {
        this.f26106a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozl0)) {
            return false;
        }
        ozl0 ozl0Var = (ozl0) obj;
        return this.f26106a == ozl0Var.f26106a && this.b == ozl0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f26106a) * 31);
    }

    public final String toString() {
        return ohs0.m("OnClickTab(verticalTabPosition=", this.f26106a, ", horizontalTabPosition=", Separators.RPAREN, this.b);
    }
}
