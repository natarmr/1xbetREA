package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xf6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mh6 f40777a;
    public final List b;

    public xf6(mh6 mh6Var, List list) {
        list.getClass();
        this.f40777a = mh6Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf6)) {
            return false;
        }
        xf6 xf6Var = (xf6) obj;
        return this.f40777a.equals(xf6Var.f40777a) && Intrinsics.d(this.b, xf6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40777a.hashCode() * 31);
    }

    public final String toString() {
        return "BetBuilderEventsModel(gameInfo=" + this.f40777a + ", events=" + this.b + Separators.RPAREN;
    }
}
