package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ote implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yse f25825a;

    public final boolean equals(Object obj) {
        if (obj instanceof ote) {
            return this.f25825a.equals(((ote) obj).f25825a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25825a.hashCode();
    }

    public final String toString() {
        return "ScorePayload(value=" + this.f25825a + Separators.RPAREN;
    }
}
