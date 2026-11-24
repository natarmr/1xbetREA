package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dsp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssp f6622a;
    public final ssp b;

    public dsp(ssp sspVar, ssp sspVar2) {
        this.f6622a = sspVar;
        this.b = sspVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsp)) {
            return false;
        }
        dsp dspVar = (dsp) obj;
        return this.f6622a.equals(dspVar.f6622a) && this.b.equals(dspVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6622a.hashCode() * 31);
    }

    public final String toString() {
        return "FightCardModel(opponentOne=" + this.f6622a + ", opponentTwo=" + this.b + Separators.RPAREN;
    }
}
