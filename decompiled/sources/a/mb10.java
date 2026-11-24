package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mb10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb10 f21484a;
    public final mdm b;

    public mb10(lb10 lb10Var, mdm mdmVar) {
        this.f21484a = lb10Var;
        this.b = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb10)) {
            return false;
        }
        mb10 mb10Var = (mb10) obj;
        return this.f21484a == mb10Var.f21484a && Intrinsics.d(this.b, mb10Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f21484a.hashCode() * 31;
        mdm mdmVar = this.b;
        return iHashCode + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        return "LottieModel(lottieErrorType=" + this.f21484a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
