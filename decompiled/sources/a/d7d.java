package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class d7d {
    public static final c7d Companion = new c7d();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new a7d(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p070 f5589a;
    public final List b;

    public /* synthetic */ d7d(int i, p070 p070Var, List list) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, b7d.f2102a.getDescriptor());
            throw null;
        }
        this.f5589a = p070Var;
        this.b = list;
    }

    public static d7d a(d7d d7dVar, p070 p070Var) {
        List list = d7dVar.b;
        list.getClass();
        return new d7d(p070Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7d)) {
            return false;
        }
        d7d d7dVar = (d7d) obj;
        return Intrinsics.d(this.f5589a, d7dVar.f5589a) && Intrinsics.d(this.b, d7dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5589a.hashCode() * 31);
    }

    public final String toString() {
        return "CombinedGameResult(oneXGames=" + this.f5589a + ", bonusGames=" + this.b + Separators.RPAREN;
    }

    public d7d(p070 p070Var, List list) {
        list.getClass();
        this.f5589a = p070Var;
        this.b = list;
    }
}
