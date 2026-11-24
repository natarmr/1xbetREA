package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class rfl0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjm f30394a;

    public rfl0(jjm jjmVar) {
        this.f30394a = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfl0) && this.f30394a.equals(((rfl0) obj).f30394a);
    }

    public final int hashCode() {
        return this.f30394a.hashCode();
    }

    public final String toString() {
        return "SportItemSubTitleUiModel(model=" + this.f30394a + Separators.RPAREN;
    }
}
