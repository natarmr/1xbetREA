package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mkf implements nkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nus f21941a;

    public final boolean equals(Object obj) {
        if (obj instanceof mkf) {
            return this.f21941a.equals(((mkf) obj).f21941a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21941a.hashCode();
    }

    public final String toString() {
        return "OnToolbarAction(value=" + this.f21941a + Separators.RPAREN;
    }
}
