package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lud0 implements mud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nus f20670a;

    public final boolean equals(Object obj) {
        if (obj instanceof lud0) {
            return this.f20670a.equals(((lud0) obj).f20670a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20670a.hashCode();
    }

    public final String toString() {
        return "OnToolbarAction(value=" + this.f20670a + Separators.RPAREN;
    }
}
