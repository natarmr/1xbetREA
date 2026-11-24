package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tfz f14047a;
    public final a4x b;
    public final g2h c;
    public final l2h d;

    public i2h(tfz tfzVar, i4 i4Var, g2h g2hVar, l2h l2hVar) {
        i4Var.getClass();
        this.f14047a = tfzVar;
        this.b = i4Var;
        this.c = g2hVar;
        this.d = l2hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2h)) {
            return false;
        }
        i2h i2hVar = (i2h) obj;
        return this.f14047a.equals(i2hVar.f14047a) && Intrinsics.d(this.b, i2hVar.b) && this.c.equals(i2hVar.c) && this.d.equals(i2hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cs0.b(this.b, this.f14047a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "CyberLeaderboardAnalyticsCardContentUiModel(topModel=" + this.f14047a + ", analyticsPoints=" + this.b + ", bottomModel=" + this.c + ", style=" + this.d + Separators.RPAREN;
    }
}
