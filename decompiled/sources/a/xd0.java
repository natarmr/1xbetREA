package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xd0 implements ae0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bol f40673a;

    public xd0(bol bolVar) {
        this.f40673a = bolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd0) && this.f40673a.equals(((xd0) obj).f40673a);
    }

    public final int hashCode() {
        return this.f40673a.hashCode();
    }

    public final String toString() {
        return "Content(providersCollectionUiModel=" + this.f40673a + Separators.RPAREN;
    }
}
