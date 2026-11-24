package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ej2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wcb f7887a;
    public final boolean b;
    public final g2v c;

    public ej2(wcb wcbVar, boolean z, g2v g2vVar) {
        wcbVar.getClass();
        g2vVar.getClass();
        this.f7887a = wcbVar;
        this.b = z;
        this.c = g2vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej2)) {
            return false;
        }
        ej2 ej2Var = (ej2) obj;
        return Intrinsics.d(this.f7887a, ej2Var.f7887a) && this.b == ej2Var.b && Intrinsics.d(this.c, ej2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f7887a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "AltSportTournamentsConfig(champImagesHolder=" + this.f7887a + ", isTablet=" + this.b + ", lottieEmptyConfigurator=" + this.c + Separators.RPAREN;
    }
}
