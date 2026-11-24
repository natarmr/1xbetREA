package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f5994a;
    public final a4x b;
    public final boolean c;

    public dfd(mdm mdmVar, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f5994a = mdmVar;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfd)) {
            return false;
        }
        dfd dfdVar = (dfd) obj;
        return Intrinsics.d(this.f5994a, dfdVar.f5994a) && Intrinsics.d(this.b, dfdVar.b) && this.c == dfdVar.c;
    }

    public final int hashCode() {
        mdm mdmVar = this.f5994a;
        return Boolean.hashCode(this.c) + cs0.b(this.b, (mdmVar == null ? 0 : mdmVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedMatchesTeamUiState(dsEmptyConfig=");
        sb.append(this.f5994a);
        sb.append(", matchesResultList=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
