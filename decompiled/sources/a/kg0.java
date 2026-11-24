package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18217a;
    public final mdm b;
    public final pq5 c;
    public final g3b d;
    public final b3b e;
    public final ya0 f;

    public kg0(String str, mdm mdmVar, pq5 pq5Var, g3b g3bVar, b3b b3bVar, ya0 ya0Var) {
        str.getClass();
        pq5Var.getClass();
        g3bVar.getClass();
        b3bVar.getClass();
        ya0Var.getClass();
        this.f18217a = str;
        this.b = mdmVar;
        this.c = pq5Var;
        this.d = g3bVar;
        this.e = b3bVar;
        this.f = ya0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg0)) {
            return false;
        }
        kg0 kg0Var = (kg0) obj;
        return Intrinsics.d(this.f18217a, kg0Var.f18217a) && Intrinsics.d(this.b, kg0Var.b) && Intrinsics.d(this.c, kg0Var.c) && Intrinsics.d(this.d, kg0Var.d) && Intrinsics.d(this.e, kg0Var.e) && Intrinsics.d(this.f, kg0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f18217a.hashCode() * 31;
        mdm mdmVar = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AggregatorCategoriesUiState(title=" + this.f18217a + ", emptyConfig=" + this.b + ", bannerSection=" + this.c + ", categorySection=" + this.d + ", partitionSection=" + this.e + ", authSectionUiState=" + this.f + Separators.RPAREN;
    }
}
