package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cfh0 implements efh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f4262a;

    @Override // a.efh0
    public final mdm a() {
        return this.f4262a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cfh0) {
            return this.f4262a.equals(((cfh0) obj).f4262a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4262a.hashCode();
    }

    public final String toString() {
        return b1j.j("LoadEmptyContent(config=", this.f4262a, Separators.RPAREN);
    }
}
