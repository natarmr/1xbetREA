package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class edp implements fdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wcp f7629a;
    public final String b;

    public edp(wcp wcpVar) {
        this.f7629a = wcpVar;
        this.b = wcpVar.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edp) && this.f7629a.equals(((edp) obj).f7629a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f7629a.hashCode();
    }

    public final String toString() {
        return "TeamUiIModel(model=" + this.f7629a + Separators.RPAREN;
    }
}
