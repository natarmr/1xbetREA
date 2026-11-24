package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zmh implements bnh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f44626a;

    public zmh(i4 i4Var) {
        i4Var.getClass();
        this.f44626a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmh) && Intrinsics.d(this.f44626a, ((zmh) obj).f44626a);
    }

    public final int hashCode() {
        return this.f44626a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f44626a, "Content(items=", Separators.RPAREN);
    }
}
