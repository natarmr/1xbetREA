package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fbm implements hbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f9266a;

    public fbm(n0x n0xVar) {
        this.f9266a = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbm) && this.f9266a.equals(((fbm) obj).f9266a);
    }

    public final int hashCode() {
        return this.f9266a.hashCode();
    }

    public final String toString() {
        return "Content(icon=" + this.f9266a + Separators.RPAREN;
    }
}
