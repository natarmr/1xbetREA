package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6055a;
    public final String b;
    public final int c;
    public final List d;
    public final List e;
    public final List f;

    public dgs(int i, String str, String str2, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f6055a = str;
        this.b = str2;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgs)) {
            return false;
        }
        dgs dgsVar = (dgs) obj;
        return this.f6055a.equals(dgsVar.f6055a) && this.b.equals(dgsVar.b) && this.c == dgsVar.c && Intrinsics.d(this.d, dgsVar.d) && Intrinsics.d(this.e, dgsVar.e) && Intrinsics.d(this.f, dgsVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(twn.a(this.c, ua80.b(this.f6055a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GameInfoModel(id=", this.f6055a, ", periodTitle=", this.b, ", stadiumId=");
        ohs0.v(this.c, ", gameStatistics=", ", periods=", sbN, this.d);
        return kng0.n(", menus=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
