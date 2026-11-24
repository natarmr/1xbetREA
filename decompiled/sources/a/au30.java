package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class au30 implements bv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz10 f1460a;

    public final boolean equals(Object obj) {
        if (obj instanceof au30) {
            return this.f1460a.equals(((au30) obj).f1460a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1460a.hashCode();
    }

    public final String toString() {
        return "MenuActionClick(mainMenuTypeClickUiModel=" + this.f1460a + Separators.RPAREN;
    }
}
