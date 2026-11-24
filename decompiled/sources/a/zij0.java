package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zij0 implements bjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f44442a;
    public final int b;

    public zij0(ank0 ank0Var, int i) {
        this.f44442a = ank0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zij0)) {
            return false;
        }
        zij0 zij0Var = (zij0) obj;
        return this.f44442a.equals(zij0Var.f44442a) && this.b == zij0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f44442a.f1159a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerNameAndScore(text=" + this.f44442a + ", background=" + this.b + Separators.RPAREN;
    }
}
