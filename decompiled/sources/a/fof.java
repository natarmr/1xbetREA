package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fof implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final irf f9878a;
    public final trf b;
    public final trf c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public fof(irf irfVar, trf trfVar, trf trfVar2, List list, boolean z, boolean z2) {
        list.getClass();
        this.f9878a = irfVar;
        this.b = trfVar;
        this.c = trfVar2;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fof)) {
            return false;
        }
        fof fofVar = (fof) obj;
        return this.f9878a.equals(fofVar.f9878a) && this.b.equals(fofVar.b) && this.c.equals(fofVar.c) && Intrinsics.d(this.d, fofVar.d) && this.e == fofVar.e && this.f == fofVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(dw9.a((this.c.hashCode() + ((this.b.hashCode() + (this.f9878a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2InfoModel(gameStatisticModel=");
        sb.append(this.f9878a);
        sb.append(", firstTeamStatisticModel=");
        sb.append(this.b);
        sb.append(", secondTeamStatisticModel=");
        sb.append(this.c);
        sb.append(", playersStatisticList=");
        sb.append(this.d);
        sb.append(", hasStatistics=");
        return ohs0.p(", hasPlayerMovement=", Separators.RPAREN, sb, this.e, this.f);
    }
}
