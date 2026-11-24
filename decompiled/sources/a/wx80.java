package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wx80 implements yx80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f39920a;

    public wx80(i4 i4Var) {
        i4Var.getClass();
        this.f39920a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wx80) && Intrinsics.d(this.f39920a, ((wx80) obj).f39920a);
    }

    public final int hashCode() {
        return this.f39920a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f39920a, "Content(partners=", Separators.RPAREN);
    }
}
