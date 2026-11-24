package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lgg f34008a;
    public final kgg b;
    public final String c;

    public tig(lgg lggVar, kgg kggVar, String str) {
        this.f34008a = lggVar;
        this.b = kggVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tig)) {
            return false;
        }
        tig tigVar = (tig) obj;
        return this.f34008a.equals(tigVar.f34008a) && this.b.equals(tigVar.b) && this.c.equals(tigVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f34008a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampsPageUiState(contentState=");
        sb.append(this.f34008a);
        sb.append(", multiselect=");
        sb.append(this.b);
        sb.append(", searchQuery=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
