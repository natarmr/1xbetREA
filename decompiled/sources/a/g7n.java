package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g7n implements j7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6q0 f10824a;

    public final boolean equals(Object obj) {
        if (obj instanceof g7n) {
            return this.f10824a.equals(((g7n) obj).f10824a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10824a.hashCode();
    }

    public final String toString() {
        return "TextFieldBasic(model=" + this.f10824a + Separators.RPAREN;
    }
}
