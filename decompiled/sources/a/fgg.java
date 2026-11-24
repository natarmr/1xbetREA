package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tfg f9491a;
    public final wfg b;
    public final a4x c;
    public final boolean d;

    public fgg(tfg tfgVar, wfg wfgVar, a4x a4xVar, boolean z) {
        tfgVar.getClass();
        a4xVar.getClass();
        this.f9491a = tfgVar;
        this.b = wfgVar;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgg)) {
            return false;
        }
        fgg fggVar = (fgg) obj;
        return Intrinsics.d(this.f9491a, fggVar.f9491a) && this.b.equals(fggVar.b) && Intrinsics.d(this.c, fggVar.c) && this.d == fggVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (this.f9491a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampionshipResultsUiState(calendarUiModel=");
        sb.append(this.f9491a);
        sb.append(", contentUiModel=");
        sb.append(this.b);
        sb.append(", uiItemList=");
        return rz4.m(sb, this.c, ", loading=", this.d, Separators.RPAREN);
    }
}
