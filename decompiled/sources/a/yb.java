package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yb implements bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s8 f42318a = s8.f31777a;

    @Override // a.bc
    public final y3d a() {
        return null;
    }

    @Override // a.bc
    public final s8 b() {
        return this.f42318a;
    }

    @Override // a.bc
    public final y3d c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb) && this.f42318a == ((yb) obj).f42318a;
    }

    public final int hashCode() {
        return this.f42318a.hashCode();
    }

    public final String toString() {
        return "Clear(iconColor=null, colorStyle=" + this.f42318a + Separators.RPAREN;
    }
}
