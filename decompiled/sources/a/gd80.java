package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class gd80 implements kd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f11092a;

    public gd80(mdm mdmVar) {
        this.f11092a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd80) && this.f11092a.equals(((gd80) obj).f11092a);
    }

    public final int hashCode() {
        return this.f11092a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(config=", this.f11092a, Separators.RPAREN);
    }
}
