package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s6g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final khg0 f31700a;
    public final String b;

    public s6g0(khg0 khg0Var, String str) {
        this.f31700a = khg0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6g0)) {
            return false;
        }
        s6g0 s6g0Var = (s6g0) obj;
        return this.f31700a == s6g0Var.f31700a && this.b.equals(s6g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31700a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultsGridColorDescriptionModel(color=" + this.f31700a + ", description=" + this.b + Separators.RPAREN;
    }
}
