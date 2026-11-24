package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12968a;
    public final mdm b;
    public final a4x c;
    public final boolean d;

    public hfd(mdm mdmVar, a4x a4xVar, String str, boolean z) {
        str.getClass();
        a4xVar.getClass();
        this.f12968a = str;
        this.b = mdmVar;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfd)) {
            return false;
        }
        hfd hfdVar = (hfd) obj;
        return Intrinsics.d(this.f12968a, hfdVar.f12968a) && Intrinsics.d(this.b, hfdVar.b) && Intrinsics.d(this.c, hfdVar.c) && this.d == hfdVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f12968a.hashCode() * 31;
        mdm mdmVar = this.b;
        return Boolean.hashCode(this.d) + cs0.b(this.c, (iHashCode + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedMatchesUiState(navBarTitle=");
        sb.append(this.f12968a);
        sb.append(", error=");
        sb.append(this.b);
        sb.append(", matchesResultList=");
        return rz4.m(sb, this.c, ", rtlSupport=", this.d, Separators.RPAREN);
    }
}
