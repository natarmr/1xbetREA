package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class frz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f10042a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final mdm e;

    public frz(a4x a4xVar, boolean z, boolean z2, boolean z3, mdm mdmVar) {
        a4xVar.getClass();
        this.f10042a = a4xVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frz)) {
            return false;
        }
        frz frzVar = (frz) obj;
        return Intrinsics.d(this.f10042a, frzVar.f10042a) && this.b == frzVar.b && this.c == frzVar.c && this.d == frzVar.d && this.e.equals(frzVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(brm0.e(this.f10042a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitSelfExcludeReasonAfricaUiState(availableReasons=");
        sb.append(this.f10042a);
        sb.append(", acceptButtonEnabled=");
        sb.append(this.b);
        sb.append(", isLoading=");
        ua80.u(", isError=", ", lottieConfig=", sb, this.c, this.d);
        return cs0.m(sb, this.e, Separators.RPAREN);
    }
}
