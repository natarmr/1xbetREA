package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f3k0 implements g3k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f8868a;

    public f3k0(hjm hjmVar) {
        this.f8868a = hjmVar;
    }

    @Override // a.g3k0
    public final String a() {
        return "TransactionHistoryTitleHeader";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3k0) && this.f8868a.equals(((f3k0) obj).f8868a);
    }

    public final int hashCode() {
        return this.f8868a.hashCode() + 1018049713;
    }

    public final String toString() {
        return "TransactionHistoryTitleHeader(itemKey=TransactionHistoryTitleHeader, dsHeaderModel=" + this.f8868a + Separators.RPAREN;
    }
}
