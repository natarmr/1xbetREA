package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class slr implements amr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uss f32413a;

    public slr(uss ussVar) {
        this.f32413a = ussVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slr) && this.f32413a.equals(((slr) obj).f32413a);
    }

    public final int hashCode() {
        return this.f32413a.hashCode();
    }

    public final String toString() {
        return "OnGameStreamAction(value=" + this.f32413a + Separators.RPAREN;
    }
}
