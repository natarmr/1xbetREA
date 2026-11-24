package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f15387a;
    public final wxl b;
    public final long c;

    public iua0(a4x a4xVar, wxl wxlVar, long j) {
        a4xVar.getClass();
        this.f15387a = a4xVar;
        this.b = wxlVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iua0)) {
            return false;
        }
        iua0 iua0Var = (iua0) obj;
        if (!Intrinsics.d(this.f15387a, iua0Var.f15387a) || this.b != iua0Var.b) {
            return false;
        }
        long j = iua0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f15387a.hashCode() * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iHashCode;
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sb = new StringBuilder("PolybetTimeFilterChipsUiState(timeFiltersChips=");
        sb.append(this.f15387a);
        sb.append(", timeFiltersChipsStyle=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return axq.n(sb, strI, Separators.RPAREN);
    }
}
