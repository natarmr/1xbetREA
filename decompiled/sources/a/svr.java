package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class svr implements uvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5h0 f32882a;

    public svr(p5h0 p5h0Var) {
        this.f32882a = p5h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof svr) && this.f32882a.equals(((svr) obj).f32882a);
    }

    public final int hashCode() {
        return this.f32882a.hashCode();
    }

    public final String toString() {
        return axq.j("Score(value=", this.f32882a, Separators.RPAREN);
    }
}
