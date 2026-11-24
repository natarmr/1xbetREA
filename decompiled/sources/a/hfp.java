package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class hfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12981a;
    public final dqv0 b;

    public hfp(String str, dqv0 dqv0Var) {
        str.getClass();
        this.f12981a = str;
        this.b = dqv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfp)) {
            return false;
        }
        hfp hfpVar = (hfp) obj;
        return Intrinsics.d(this.f12981a, hfpVar.f12981a) && this.b.equals(hfpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12981a.hashCode() * 31);
    }

    public final String toString() {
        return "FavoritesGamesWorkerResponseContainerModel(requestId=" + this.f12981a + ", response=" + this.b + Separators.RPAREN;
    }
}
