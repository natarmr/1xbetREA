package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iyr implements lyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5h0 f15602a;

    public iyr(p5h0 p5h0Var) {
        this.f15602a = p5h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iyr) && this.f15602a.equals(((iyr) obj).f15602a);
    }

    public final int hashCode() {
        return this.f15602a.hashCode();
    }

    public final String toString() {
        return axq.j("Score(value=", this.f15602a, Separators.RPAREN);
    }
}
