package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tnb0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f34226a;

    public tnb0(i4 i4Var) {
        i4Var.getClass();
        this.f34226a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tnb0) && Intrinsics.d(this.f34226a, ((tnb0) obj).f34226a);
    }

    public final int hashCode() {
        return this.f34226a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f34226a, "PostGameMapsUiModel(maps=", Separators.RPAREN);
    }
}
