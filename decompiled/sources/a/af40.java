package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class af40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f760a;

    public af40(vbj vbjVar) {
        this.f760a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af40) && this.f760a.equals(((af40) obj).f760a);
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f760a;
    }

    public final int hashCode() {
        return this.f760a.hashCode();
    }

    public final String toString() {
        return "TournamentMonth(state=" + this.f760a + Separators.RPAREN;
    }
}
