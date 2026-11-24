package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bdm implements ddm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mcm f2405a;

    public bdm(mcm mcmVar) {
        this.f2405a = mcmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdm) && this.f2405a.equals(((bdm) obj).f2405a);
    }

    public final int hashCode() {
        return this.f2405a.hashCode();
    }

    public final String toString() {
        return "Content(item=" + this.f2405a + Separators.RPAREN;
    }
}
