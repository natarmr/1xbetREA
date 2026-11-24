package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class smf implements vmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wus f32442a;

    public final boolean equals(Object obj) {
        if (obj instanceof smf) {
            return this.f32442a.equals(((smf) obj).f32442a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32442a.hashCode();
    }

    public final String toString() {
        return "SendGameToolbarGameSideEffect(value=" + this.f32442a + Separators.RPAREN;
    }
}
