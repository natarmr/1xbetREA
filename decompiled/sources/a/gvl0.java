package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gvl0 implements hvl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11981a;

    public gvl0(String str) {
        this.f11981a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gvl0) && this.f11981a.equals(((gvl0) obj).f11981a);
    }

    public final int hashCode() {
        return this.f11981a.hashCode();
    }

    public final String toString() {
        return kng0.l("ToggleCircuits(name=", this.f11981a, Separators.RPAREN);
    }
}
