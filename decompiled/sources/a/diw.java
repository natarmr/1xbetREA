package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class diw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6157a;
    public final bvl b;

    public diw(String str, bvl bvlVar) {
        this.f6157a = str;
        this.b = bvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diw)) {
            return false;
        }
        diw diwVar = (diw) obj;
        return this.f6157a.equals(diwVar.f6157a) && this.b.equals(diwVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f6157a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6157a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeCategoryCardCollectionUiModel(key=" + this.f6157a + ", value=" + this.b + Separators.RPAREN;
    }
}
