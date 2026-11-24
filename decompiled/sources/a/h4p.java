package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h4p implements e5p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f12444a;
    public final String b;

    public h4p(hjm hjmVar) {
        this.f12444a = hjmVar;
        this.b = String.valueOf(hjmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4p) && this.f12444a.equals(((h4p) obj).f12444a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f12444a.hashCode();
    }

    public final String toString() {
        return "FavoriteCategoryHeaderUiModel(header=" + this.f12444a + Separators.RPAREN;
    }
}
