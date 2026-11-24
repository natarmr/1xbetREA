package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ztd0 implements mud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uss f44953a;

    public final boolean equals(Object obj) {
        if (obj instanceof ztd0) {
            return this.f44953a.equals(((ztd0) obj).f44953a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44953a.hashCode();
    }

    public final String toString() {
        return "OnGameStreamAction(value=" + this.f44953a + Separators.RPAREN;
    }
}
