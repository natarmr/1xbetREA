package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yjl implements akl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f42744a;

    public yjl(i4 i4Var) {
        i4Var.getClass();
        this.f42744a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjl) && Intrinsics.d(this.f42744a, ((yjl) obj).f42744a);
    }

    public final int hashCode() {
        return this.f42744a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f42744a, "Content(items=", Separators.RPAREN);
    }
}
