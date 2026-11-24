package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ste implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cue f32769a;

    public final boolean equals(Object obj) {
        if (obj instanceof ste) {
            return this.f32769a.equals(((ste) obj).f32769a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32769a.hashCode();
    }

    public final String toString() {
        return "TeamsPayload(value=" + this.f32769a + Separators.RPAREN;
    }
}
