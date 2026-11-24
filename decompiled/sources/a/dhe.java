package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dhe implements die {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f6086a;

    public dhe(i4 i4Var) {
        i4Var.getClass();
        this.f6086a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhe) && Intrinsics.d(this.f6086a, ((dhe) obj).f6086a);
    }

    public final int hashCode() {
        return this.f6086a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f6086a, "EmptyWithGames(content=", Separators.RPAREN);
    }
}
