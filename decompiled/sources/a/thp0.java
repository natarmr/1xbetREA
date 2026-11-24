package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class thp0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f33973a;

    public thp0(mdm mdmVar) {
        this.f33973a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thp0) && this.f33973a.equals(((thp0) obj).f33973a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "KEY_RECOMMENDS_HEADER";
    }

    public final int hashCode() {
        return this.f33973a.hashCode() + 443487243;
    }

    public final String toString() {
        return b1j.j("TeamRecommendsHeaderUiItem(key=KEY_RECOMMENDS_HEADER, config=", this.f33973a, Separators.RPAREN);
    }
}
