package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sxa implements txa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32966a;

    public sxa(String str) {
        this.f32966a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxa) && this.f32966a.equals(((sxa) obj).f32966a);
    }

    public final int hashCode() {
        return this.f32966a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChanged(query=", this.f32966a, Separators.RPAREN);
    }
}
