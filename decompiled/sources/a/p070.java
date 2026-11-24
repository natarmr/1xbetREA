package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class p070 {
    public static final o070 Companion = new o070();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26136a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new fq60((byte) 18)), maz.a(wezVar, new fq60((byte) 19))};
    }

    public /* synthetic */ p070(int i, List list, List list2) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, n070.f22688a.getDescriptor());
            throw null;
        }
        this.f26136a = list;
        this.b = list2;
    }

    public static p070 a(p070 p070Var, List list) {
        List list2 = p070Var.b;
        p070Var.getClass();
        list.getClass();
        list2.getClass();
        return new p070(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p070)) {
            return false;
        }
        p070 p070Var = (p070) obj;
        return Intrinsics.d(this.f26136a, p070Var.f26136a) && Intrinsics.d(this.b, p070Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26136a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("OneXGamesPreviewResult(games=", ", categories=", this.f26136a, Separators.RPAREN, this.b);
    }

    public p070(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f26136a = list;
        this.b = list2;
    }
}
