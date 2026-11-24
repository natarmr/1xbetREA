package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class th40 implements uh40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nus f33945a;

    public final boolean equals(Object obj) {
        if (obj instanceof th40) {
            return this.f33945a.equals(((th40) obj).f33945a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33945a.hashCode();
    }

    public final String toString() {
        return "OnToolbarAction(value=" + this.f33945a + Separators.RPAREN;
    }
}
