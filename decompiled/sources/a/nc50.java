package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final class nc50 implements qc50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee f23275a;
    public final sd b;
    public final rd c;

    public nc50(ee eeVar, sd sdVar) {
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        rd rdVar = new rd(new y3d(staticColors.m123getWhite0d7_KjU()), new y3d(staticColors.m123getWhite0d7_KjU()), new y3d(staticColors.m126getWhite200d7_KjU()));
        this.f23275a = eeVar;
        this.b = sdVar;
        this.c = rdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc50)) {
            return false;
        }
        nc50 nc50Var = (nc50) obj;
        return this.f23275a.equals(nc50Var.f23275a) && this.b.equals(nc50Var.b) && this.c.equals(nc50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e((this.b.hashCode() + (this.f23275a.hashCode() * 31)) * 31, 31, true);
    }

    public final String toString() {
        return "AccountControl(style=" + this.f23275a + ", model=" + this.b + ", reversed=true, colors=" + this.c + Separators.RPAREN;
    }
}
