package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f2p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cie f8823a;
    public final zpv b;
    public final boolean c;
    public final boolean d;

    public f2p(cie cieVar, zpv zpvVar, boolean z, boolean z2) {
        this.f8823a = cieVar;
        this.b = zpvVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2p)) {
            return false;
        }
        f2p f2pVar = (f2p) obj;
        return this.f8823a.equals(f2pVar.f8823a) && this.b.equals(f2pVar.b) && this.c == f2pVar.c && this.d == f2pVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f8823a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteAggregatorUiState(contentState=");
        sb.append(this.f8823a);
        sb.append(", headerActionsState=");
        sb.append(this.b);
        sb.append(", refreshing=");
        return ohs0.p(", scrollTop=", Separators.RPAREN, sb, this.c, this.d);
    }
}
