package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class swn0 implements uwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32930a;

    public final boolean equals(Object obj) {
        if (obj instanceof swn0) {
            return this.f32930a.equals(((swn0) obj).f32930a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32930a.hashCode();
    }

    public final String toString() {
        return kng0.l("Score(value=", this.f32930a, Separators.RPAREN);
    }
}
