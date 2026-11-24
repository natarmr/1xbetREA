package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ehe implements cie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f7803a;

    public ehe(i4 i4Var) {
        i4Var.getClass();
        this.f7803a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehe) && Intrinsics.d(this.f7803a, ((ehe) obj).f7803a);
    }

    public final int hashCode() {
        return this.f7803a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f7803a, "EmptyWithGames(content=", Separators.RPAREN);
    }
}
