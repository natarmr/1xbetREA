package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m9e implements p9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f21406a;

    public m9e(ra10 ra10Var) {
        ra10Var.getClass();
        this.f21406a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9e) && Intrinsics.d(this.f21406a, ((m9e) obj).f21406a);
    }

    public final int hashCode() {
        return this.f21406a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(config=", this.f21406a, Separators.RPAREN);
    }
}
