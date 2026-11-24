package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s540 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t540 f31639a;
    public final v540 b;
    public final u540 c;

    public s540(t540 t540Var, v540 v540Var, u540 u540Var) {
        this.f31639a = t540Var;
        this.b = v540Var;
        this.c = u540Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s540)) {
            return false;
        }
        s540 s540Var = (s540) obj;
        return this.f31639a == s540Var.f31639a && this.b == s540Var.b && this.c == s540Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f31639a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Action(reason=" + this.f31639a + ", type=" + this.b + ", time=" + this.c + Separators.RPAREN;
    }
}
