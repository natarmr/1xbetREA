package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;

/* JADX INFO: loaded from: classes6.dex */
public final class uyp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36503a;
    public final TennisSurfaceType b;
    public final nii0 c;
    public final jag0 d;

    public uyp0(String str, TennisSurfaceType tennisSurfaceType, nii0 nii0Var, jag0 jag0Var) {
        str.getClass();
        this.f36503a = str;
        this.b = tennisSurfaceType;
        this.c = nii0Var;
        this.d = jag0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyp0)) {
            return false;
        }
        uyp0 uyp0Var = (uyp0) obj;
        return Intrinsics.d(this.f36503a, uyp0Var.f36503a) && this.b == uyp0Var.b && this.c.equals(uyp0Var.c) && this.d.equals(uyp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f36503a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TennisSummaryModel(season=" + this.f36503a + ", surface=" + this.b + ", serviceStats=" + this.c + ", returnStats=" + this.d + Separators.RPAREN;
    }
}
