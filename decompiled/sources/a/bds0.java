package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bds0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f2415a;

    public bds0(hjm hjmVar) {
        this.f2415a = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bds0) && this.f2415a.equals(((bds0) obj).f2415a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "KEY_RECOMMENDS";
    }

    public final int hashCode() {
        return this.f2415a.hashCode() - 795767383;
    }

    public final String toString() {
        return "TrackedHeaderUiItem(key=KEY_RECOMMENDS, model=" + this.f2415a + Separators.RPAREN;
    }
}
