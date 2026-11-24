package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zok implements hpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8m f44724a;

    public zok(m8m m8mVar) {
        this.f44724a = m8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zok) && this.f44724a.equals(((zok) obj).f44724a);
    }

    public final int hashCode() {
        return this.f44724a.hashCode();
    }

    public final String toString() {
        return "OnLeaderBoarItemClick(item=" + this.f44724a + Separators.RPAREN;
    }
}
