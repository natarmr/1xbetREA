package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mt1 implements ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjm f22348a;

    public mt1(jjm jjmVar) {
        this.f22348a = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt1) && this.f22348a.equals(((mt1) obj).f22348a);
    }

    public final int hashCode() {
        return this.f22348a.hashCode();
    }

    public final String toString() {
        return "TopGamesHeaderUiModel(model=" + this.f22348a + Separators.RPAREN;
    }
}
