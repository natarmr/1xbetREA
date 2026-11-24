package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ll9 implements ml9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jl9 f20236a;

    public ll9(jl9 jl9Var) {
        this.f20236a = jl9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ll9) && this.f20236a.equals(((ll9) obj).f20236a);
    }

    public final int hashCode() {
        return this.f20236a.hashCode();
    }

    public final String toString() {
        return "ResultState(value=" + this.f20236a + Separators.RPAREN;
    }
}
