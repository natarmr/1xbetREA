package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38683a;
    public final Object b;
    public final Object c;
    public final List d;

    public w7o(Object obj, Object obj2, Object obj3, List list) {
        list.getClass();
        this.f38683a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7o)) {
            return false;
        }
        w7o w7oVar = (w7o) obj;
        Object obj2 = w7oVar.f38683a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f38683a, obj2) && Intrinsics.d(this.b, w7oVar.b) && Intrinsics.d(this.c, w7oVar.c) && Intrinsics.d(this.d, w7oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.c(twn.c(j0g0.b(this.f38683a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return rw2.m(j0g0.d(this.c), ", specialEventList=", Separators.RPAREN, b1j.n("EsportsWorldCupContentModel(liveGames=", j0g0.d(this.f38683a), ", lineGames=", j0g0.d(this.b), ", banners="), this.d);
    }
}
