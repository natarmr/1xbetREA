package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x8h0 implements e9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40461a;
    public final boolean b;

    public x8h0(String str, boolean z) {
        this.f40461a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8h0)) {
            return false;
        }
        x8h0 x8h0Var = (x8h0) obj;
        return this.f40461a.equals(x8h0Var.f40461a) && this.b == x8h0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + ((rek0.b.hashCode() + (this.f40461a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        rek0 rek0Var = rek0.b;
        StringBuilder sb = new StringBuilder("ShowSnackBarMessageForShareBet(title=");
        sb.append(this.f40461a);
        sb.append(", messageType=");
        sb.append(rek0Var);
        sb.append(", isBottomSheet=");
        return rw2.p(sb, this.b, Separators.RPAREN);
    }
}
