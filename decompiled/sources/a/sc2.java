package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sc2 implements uc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31966a;

    public /* synthetic */ sc2(String str) {
        this.f31966a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sc2) {
            return this.f31966a.equals(((sc2) obj).f31966a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31966a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchInput(value=", this.f31966a, Separators.RPAREN);
    }
}
