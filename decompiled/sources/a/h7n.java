package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class h7n implements j7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s6q0 f12584a;

    public final boolean equals(Object obj) {
        if (obj instanceof h7n) {
            return this.f12584a.equals(((h7n) obj).f12584a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12584a.hashCode();
    }

    public final String toString() {
        return "TextFieldFilled(model=" + this.f12584a + Separators.RPAREN;
    }
}
