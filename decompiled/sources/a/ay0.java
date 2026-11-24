package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ay0 {
    public static final zx0 Companion = new zx0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1647a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new mg0((byte) 22)), maz.a(wezVar, new mg0((byte) 23))};
    }

    public /* synthetic */ ay0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f1647a = null;
        } else {
            this.f1647a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay0)) {
            return false;
        }
        ay0 ay0Var = (ay0) obj;
        return Intrinsics.d(this.f1647a, ay0Var.f1647a) && Intrinsics.d(this.b, ay0Var.b);
    }

    public final int hashCode() {
        List list = this.f1647a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("AggregatorGamesResponse(games=", ", categoriesList=", this.f1647a, Separators.RPAREN, this.b);
    }
}
