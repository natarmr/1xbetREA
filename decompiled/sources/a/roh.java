package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class roh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30836a;
    public final c280 b;

    public roh(c280 c280Var, String str) {
        this.f30836a = str;
        this.b = c280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roh)) {
            return false;
        }
        roh rohVar = (roh) obj;
        return this.f30836a.equals(rohVar.f30836a) && this.b.equals(rohVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30836a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberUFCResultEventOpponentUiModel(name=" + this.f30836a + ", logo=" + this.b + Separators.RPAREN;
    }
}
