package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gpc0 implements kpc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yrc0 f11676a;

    public gpc0(yrc0 yrc0Var) {
        this.f11676a = yrc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpc0) && this.f11676a.equals(((gpc0) obj).f11676a);
    }

    public final int hashCode() {
        return this.f11676a.hashCode();
    }

    public final String toString() {
        return "OnPromoCategoryClick(item=" + this.f11676a + Separators.RPAREN;
    }
}
