package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ne40 implements df40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fyx f23366a;

    public ne40(fyx fyxVar) {
        this.f23366a = fyxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ne40) && this.f23366a.equals(((ne40) obj).f23366a);
    }

    @Override // a.df40
    public final fyx getState() {
        return this.f23366a;
    }

    public final int hashCode() {
        return this.f23366a.hashCode();
    }

    public final String toString() {
        return "CategoryCarousel(state=" + this.f23366a + Separators.RPAREN;
    }
}
