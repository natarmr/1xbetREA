package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljg f6514a;
    public final ueh b;
    public final smg c;
    public final omg d;
    public final d4g e;
    public final boolean f;

    public dqg(ljg ljgVar, ueh uehVar, smg smgVar, omg omgVar, d4g d4gVar, boolean z) {
        ljgVar.getClass();
        uehVar.getClass();
        smgVar.getClass();
        omgVar.getClass();
        d4gVar.getClass();
        this.f6514a = ljgVar;
        this.b = uehVar;
        this.c = smgVar;
        this.d = omgVar;
        this.e = d4gVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqg)) {
            return false;
        }
        dqg dqgVar = (dqg) obj;
        return Intrinsics.d(this.f6514a, dqgVar.f6514a) && Intrinsics.d(this.b, dqgVar.b) && Intrinsics.d(this.c, dqgVar.c) && Intrinsics.d(this.d, dqgVar.d) && Intrinsics.d(this.e, dqgVar.e) && this.f == dqgVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f6514a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CyberGameStatisticModel(lastMatchesInfoModel=" + this.f6514a + ", stageTableModel=" + this.b + ", compositionModel=" + this.c + ", dotaMatchesStatisticModel=" + this.d + ", csMatchesStatisticModel=" + this.e + ", tournamentBracketAvailable=" + this.f + Separators.RPAREN;
    }
}
