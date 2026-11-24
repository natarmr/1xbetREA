package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yz00 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6m f43493a;

    public yz00(o6m o6mVar) {
        this.f43493a = o6mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz00) && this.f43493a.equals(((yz00) obj).f43493a);
    }

    public final int hashCode() {
        return this.f43493a.hashCode();
    }

    public final String toString() {
        return "LolGameMapUiModel(mapModel=" + this.f43493a + Separators.RPAREN;
    }
}
