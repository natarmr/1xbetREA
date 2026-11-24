package a;

import android.gov.nist.core.Separators;
import org.xplatform.betting.core.zip.model.zip.BetZip;

/* JADX INFO: loaded from: classes3.dex */
public final class brg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0t f3079a;
    public final BetZip b;

    public brg(d0t d0tVar, BetZip betZip) {
        this.f3079a = d0tVar;
        this.b = betZip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brg)) {
            return false;
        }
        brg brgVar = (brg) obj;
        return this.f3079a.equals(brgVar.f3079a) && this.b.equals(brgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3079a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberGameWithBetsModel(game=" + this.f3079a + ", bet=" + this.b + Separators.RPAREN;
    }
}
