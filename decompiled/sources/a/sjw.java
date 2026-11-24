package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sjw implements ujw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f32321a;

    public sjw(xdk0 xdk0Var) {
        this.f32321a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjw) && this.f32321a.equals(((sjw) obj).f32321a);
    }

    public final int hashCode() {
        return this.f32321a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackbarMessage(model=", this.f32321a, Separators.RPAREN);
    }
}
