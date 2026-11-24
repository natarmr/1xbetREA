package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zd0 implements ae0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final col f44190a;

    public zd0(col colVar) {
        this.f44190a = colVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd0) && this.f44190a.equals(((zd0) obj).f44190a);
    }

    public final int hashCode() {
        return this.f44190a.hashCode();
    }

    public final String toString() {
        return "Loading(providersCollectionUiModel=" + this.f44190a + Separators.RPAREN;
    }
}
