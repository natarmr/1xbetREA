package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xfe0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f40787a;

    public xfe0(mdm mdmVar) {
        this.f40787a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfe0) && this.f40787a.equals(((xfe0) obj).f40787a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "KEY_RECOMMENDS_HEADER";
    }

    public final int hashCode() {
        return this.f40787a.hashCode() + 443487243;
    }

    public final String toString() {
        return b1j.j("RecommendsHeaderUiItem(key=KEY_RECOMMENDS_HEADER, config=", this.f40787a, Separators.RPAREN);
    }
}
