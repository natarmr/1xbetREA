package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mqv f16407a;
    public final jjm b;

    public jf40(mqv mqvVar, jjm jjmVar) {
        this.f16407a = mqvVar;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf40)) {
            return false;
        }
        jf40 jf40Var = (jf40) obj;
        return this.f16407a.equals(jf40Var.f16407a) && this.b.equals(jf40Var.b);
    }

    @Override // a.tf40
    public final String getKey() {
        tre0 tre0Var = sre0.f32672a;
        return ohs0.n(tre0Var.b(jf40.class).J(), tre0Var.b(this.f16407a.getClass()).J());
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16407a.hashCode() * 31);
    }

    public final String toString() {
        return "Header(type=" + this.f16407a + ", model=" + this.b + Separators.RPAREN;
    }
}
