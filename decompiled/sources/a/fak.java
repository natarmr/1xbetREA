package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fak implements hak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f9211a;

    public fak(ra10 ra10Var) {
        ra10Var.getClass();
        this.f9211a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fak) && Intrinsics.d(this.f9211a, ((fak) obj).f9211a);
    }

    public final int hashCode() {
        return this.f9211a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowError(lottieConfig=", this.f9211a, Separators.RPAREN);
    }
}
