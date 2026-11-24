package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class asr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final irq0 f1404a;
    public final hqq0 b;
    public final String c;

    public asr0(irq0 irq0Var, hqq0 hqq0Var, String str) {
        this.f1404a = irq0Var;
        this.b = hqq0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asr0)) {
            return false;
        }
        asr0 asr0Var = (asr0) obj;
        return this.f1404a.equals(asr0Var.f1404a) && this.b.equals(asr0Var.b) && this.c.equals(asr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f1404a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoJackpotTirageUiState(topBarState=");
        sb.append(this.f1404a);
        sb.append(", tirageListState=");
        sb.append(this.b);
        sb.append(", jackpotBannerUrl=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
