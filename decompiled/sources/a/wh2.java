package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wcb f39145a;
    public final g2v b;
    public final i8l0 c;
    public final boolean d;

    public wh2(wcb wcbVar, g2v g2vVar, i8l0 i8l0Var, boolean z) {
        wcbVar.getClass();
        g2vVar.getClass();
        this.f39145a = wcbVar;
        this.b = g2vVar;
        this.c = i8l0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh2)) {
            return false;
        }
        wh2 wh2Var = (wh2) obj;
        return Intrinsics.d(this.f39145a, wh2Var.f39145a) && Intrinsics.d(this.b, wh2Var.b) && this.c == wh2Var.c && this.d == wh2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f39145a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AltSportTeamsConfig(champImagesHolder=" + this.f39145a + ", lottieEmptyConfigurator=" + this.b + ", iconStylePath=" + this.c + ", hasTeamBet=" + this.d + Separators.RPAREN;
    }
}
