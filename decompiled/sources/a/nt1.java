package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nt1 implements ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bml f24074a;

    public nt1(bml bmlVar) {
        this.f24074a = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt1) && this.f24074a.equals(((nt1) obj).f24074a);
    }

    public final int hashCode() {
        return this.f24074a.hashCode();
    }

    public final String toString() {
        return "TopGamesUiModel(uiModel=" + this.f24074a + Separators.RPAREN;
    }
}
