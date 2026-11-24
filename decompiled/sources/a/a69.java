package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a69 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efu0 f306a;
    public final eke b;
    public final boolean c;
    public final mdm d;
    public final boolean e;

    public a69(efu0 efu0Var, eke ekeVar, boolean z, mdm mdmVar, boolean z2) {
        this.f306a = efu0Var;
        this.b = ekeVar;
        this.c = z;
        this.d = mdmVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a69)) {
            return false;
        }
        a69 a69Var = (a69) obj;
        return Intrinsics.d(this.f306a, a69Var.f306a) && Intrinsics.d(this.b, a69Var.b) && this.c == a69Var.c && Intrinsics.d(this.d, a69Var.d) && this.e == a69Var.e;
    }

    public final int hashCode() {
        efu0 efu0Var = this.f306a;
        int iHashCode = (efu0Var == null ? 0 : efu0Var.hashCode()) * 31;
        eke ekeVar = this.b;
        int iE = brm0.e((iHashCode + (ekeVar == null ? 0 : ekeVar.hashCode())) * 31, 31, this.c);
        mdm mdmVar = this.d;
        return Boolean.hashCode(this.e) + ((iE + (mdmVar != null ? mdmVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BroadcastingVideoFullScreenUiState(videoPlayerUiModel=");
        sb.append(this.f306a);
        sb.append(", controlPanelUiModel=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", errorConfig=");
        sb.append(this.d);
        sb.append(", isNetworkAvailable=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
