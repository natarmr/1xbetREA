package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kj60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18372a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public kj60(List list, List list2, List list3, List list4, List list5, List list6) {
        rz4.B(list, list2, list3, list4, list5);
        list6.getClass();
        this.f18372a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj60)) {
            return false;
        }
        kj60 kj60Var = (kj60) obj;
        return Intrinsics.d(this.f18372a, kj60Var.f18372a) && Intrinsics.d(this.b, kj60Var.b) && Intrinsics.d(this.c, kj60Var.c) && Intrinsics.d(this.d, kj60Var.d) && Intrinsics.d(this.e, kj60Var.e) && Intrinsics.d(this.f, kj60Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(this.f18372a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("OnboardingDataModel(sportList=", ", topLiveGames=", this.f18372a, ", topLineGames=", this.b);
        b1j.y(", topLiveChamps=", ", dayLiveExpress=", sbT, this.c, this.d);
        return kng0.n(", dayLineExpress=", Separators.RPAREN, sbT, this.e, this.f);
    }
}
