package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x170 implements y170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f40107a;

    public x170(mdm mdmVar) {
        this.f40107a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x170) && this.f40107a.equals(((x170) obj).f40107a);
    }

    public final int hashCode() {
        return this.f40107a.hashCode();
    }

    public final String toString() {
        return b1j.j("UnderMaintenance(config=", this.f40107a, Separators.RPAREN);
    }
}
