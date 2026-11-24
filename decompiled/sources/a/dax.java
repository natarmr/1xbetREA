package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dax implements jax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fad f5773a;
    public final sad b;

    public dax(fad fadVar, sad sadVar) {
        dja djaVar = dja.PENALTY;
        this.f5773a = fadVar;
        this.b = sadVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dax)) {
            return false;
        }
        dax daxVar = (dax) obj;
        dja djaVar = dja.PENALTY;
        return this.f5773a.equals(daxVar.f5773a) && this.b.equals(daxVar.b);
    }

    @Override // a.jax
    public final dja getType() {
        return dja.COMMON;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f5773a.hashCode() + (dja.COMMON.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CompactGameBoard(type=" + dja.COMMON + ", labels=" + this.f5773a + ", team=" + this.b + Separators.RPAREN;
    }
}
