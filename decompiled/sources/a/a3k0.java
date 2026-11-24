package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a3k0 implements g3k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul f176a;

    public a3k0(wul wulVar) {
        this.f176a = wulVar;
    }

    @Override // a.g3k0
    public final String a() {
        return "ArchiveButton";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3k0) && this.f176a.equals(((a3k0) obj).f176a);
    }

    public final int hashCode() {
        return this.f176a.hashCode() - 43957236;
    }

    public final String toString() {
        return "ArchiveButton(itemKey=ArchiveButton, dsButtonUiModel=" + this.f176a + Separators.RPAREN;
    }
}
