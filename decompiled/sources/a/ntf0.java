package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ntf0 implements qtf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f24098a;

    public ntf0(Exception exc) {
        this.f24098a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ntf0) && this.f24098a.equals(((ntf0) obj).f24098a);
    }

    public final int hashCode() {
        return this.f24098a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f24098a + Separators.RPAREN;
    }
}
