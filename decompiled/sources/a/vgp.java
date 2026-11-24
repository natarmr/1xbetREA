package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f37392a;
    public final a4x b;
    public final boolean c;

    public vgp(mdm mdmVar, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f37392a = mdmVar;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgp)) {
            return false;
        }
        vgp vgpVar = (vgp) obj;
        return Intrinsics.d(this.f37392a, vgpVar.f37392a) && Intrinsics.d(this.b, vgpVar.b) && this.c == vgpVar.c;
    }

    public final int hashCode() {
        mdm mdmVar = this.f37392a;
        return Boolean.hashCode(this.c) + cs0.b(this.b, (mdmVar == null ? 0 : mdmVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureMatchTeamUiState(dsEmptyConfig=");
        sb.append(this.f37392a);
        sb.append(", matchesResultList=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
