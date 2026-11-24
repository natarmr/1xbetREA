package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c3k0 implements g3k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f3680a;

    public c3k0(mdm mdmVar) {
        this.f3680a = mdmVar;
    }

    @Override // a.g3k0
    public final String a() {
        return "EmptyHistoryItem";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3k0) && this.f3680a.equals(((c3k0) obj).f3680a);
    }

    public final int hashCode() {
        return this.f3680a.hashCode() - 1057858330;
    }

    public final String toString() {
        return b1j.j("EmptyHistoryItem(itemKey=EmptyHistoryItem, dsEmptyConfig=", this.f3680a, Separators.RPAREN);
    }
}
