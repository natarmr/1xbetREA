package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ic40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f14518a;

    public ic40(a4x a4xVar) {
        a4xVar.getClass();
        this.f14518a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic40) && Intrinsics.d(this.f14518a, ((ic40) obj).f14518a);
    }

    public final int hashCode() {
        return this.f14518a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f14518a, "MetaHeroesRoleBottomContent(items=", Separators.RPAREN);
    }
}
