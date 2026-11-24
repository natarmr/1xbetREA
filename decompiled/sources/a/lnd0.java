package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lnd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20339a;
    public final epd0 b;
    public final boolean c;

    public lnd0(String str, epd0 epd0Var, boolean z) {
        this.f20339a = str;
        this.b = epd0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnd0)) {
            return false;
        }
        lnd0 lnd0Var = (lnd0) obj;
        return this.f20339a.equals(lnd0Var.f20339a) && this.b.equals(lnd0Var.b) && this.c == lnd0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f20339a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickBetState(infoText=");
        sb.append(this.f20339a);
        sb.append(", fastBetsUiModel=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
