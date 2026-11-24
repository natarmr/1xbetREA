package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gat implements hat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10986a;
    public final Throwable b;

    public gat(Throwable th, List list) {
        list.getClass();
        this.f10986a = list;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gat)) {
            return false;
        }
        gat gatVar = (gat) obj;
        return Intrinsics.d(this.f10986a, gatVar.f10986a) && Intrinsics.d(this.b, gatVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10986a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "Recommended(games=" + this.f10986a + ", favoritesError=" + this.b + Separators.RPAREN;
    }
}
