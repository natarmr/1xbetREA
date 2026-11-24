package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uwd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljg f36387a;
    public final ueh b;
    public final ypl0 c;
    public final g0e0 d;
    public final oxd0 e;

    public uwd0(ljg ljgVar, ueh uehVar, ypl0 ypl0Var, g0e0 g0e0Var, oxd0 oxd0Var) {
        ljgVar.getClass();
        uehVar.getClass();
        ypl0Var.getClass();
        g0e0Var.getClass();
        oxd0Var.getClass();
        this.f36387a = ljgVar;
        this.b = uehVar;
        this.c = ypl0Var;
        this.d = g0e0Var;
        this.e = oxd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwd0)) {
            return false;
        }
        uwd0 uwd0Var = (uwd0) obj;
        return Intrinsics.d(this.f36387a, uwd0Var.f36387a) && Intrinsics.d(this.b, uwd0Var.b) && Intrinsics.d(this.c, uwd0Var.c) && Intrinsics.d(this.d, uwd0Var.d) && Intrinsics.d(this.e, uwd0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f36387a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RainbowPostGameModel(lastMatchesInfoModel=" + this.f36387a + ", stageTableModel=" + this.b + ", sportSimpleModel=" + this.c + ", statisticMatches=" + this.d + ", playersComposition=" + this.e + Separators.RPAREN;
    }
}
