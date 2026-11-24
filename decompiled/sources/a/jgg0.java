package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jgg0 extends lgg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16478a;
    public final ngg0 b;
    public final ngg0 c;

    public jgg0(String str, ngg0 ngg0Var, ngg0 ngg0Var2) {
        this.f16478a = str;
        this.b = ngg0Var;
        this.c = ngg0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgg0)) {
            return false;
        }
        jgg0 jgg0Var = (jgg0) obj;
        return this.f16478a.equals(jgg0Var.f16478a) && this.b.equals(jgg0Var.b) && this.c.equals(jgg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f16478a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Result(roundNumber=" + this.f16478a + ", firstTeamRoundResult=" + this.b + ", secondTeamRoundResult=" + this.c + Separators.RPAREN;
    }
}
