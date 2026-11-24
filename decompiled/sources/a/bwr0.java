package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bwr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vvr0 f3340a;
    public final plr0 b;
    public final boolean c;

    public bwr0(vvr0 vvr0Var, plr0 plr0Var, boolean z) {
        this.f3340a = vvr0Var;
        this.b = plr0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwr0)) {
            return false;
        }
        bwr0 bwr0Var = (bwr0) obj;
        return this.f3340a.equals(bwr0Var.f3340a) && this.b.equals(bwr0Var.b) && this.c == bwr0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f3340a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoTirageUiState(topBarState=");
        sb.append(this.f3340a);
        sb.append(", listState=");
        sb.append(this.b);
        sb.append(", isScrollToTopRequested=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
