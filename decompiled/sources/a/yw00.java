package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yw00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9x f43347a;
    public final wul b;
    public final wul c;

    public yw00(g9x g9xVar, wul wulVar, wul wulVar2) {
        this.f43347a = g9xVar;
        this.b = wulVar;
        this.c = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw00)) {
            return false;
        }
        yw00 yw00Var = (yw00) obj;
        return Intrinsics.d(this.f43347a, yw00Var.f43347a) && Intrinsics.d(this.b, yw00Var.b) && this.c.equals(yw00Var.c);
    }

    public final int hashCode() {
        g9x g9xVar = this.f43347a;
        int iHashCode = (g9xVar == null ? 0 : g9xVar.hashCode()) * 31;
        wul wulVar = this.b;
        return this.c.hashCode() + ((iHashCode + (wulVar != null ? wulVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LoginUiState(infoLineUiState=" + this.f43347a + ", loginButton=" + this.b + ", registrationButton=" + this.c + Separators.RPAREN;
    }
}
