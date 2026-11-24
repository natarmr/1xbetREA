package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n3g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22848a;
    public final int b;
    public final v3g c;
    public final v3g d;
    public final List e;
    public final List f;

    public n3g(String str, int i, v3g v3gVar, v3g v3gVar2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f22848a = str;
        this.b = i;
        this.c = v3gVar;
        this.d = v3gVar2;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3g)) {
            return false;
        }
        n3g n3gVar = (n3g) obj;
        return this.f22848a.equals(n3gVar.f22848a) && this.b == n3gVar.b && this.c.equals(n3gVar.c) && this.d.equals(n3gVar.d) && Intrinsics.d(this.e, n3gVar.e) && Intrinsics.d(this.f, n3gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a((this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, this.f22848a.hashCode() * 31, 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "CyberCSMatchesStatisticMatchModel(mapName=", this.f22848a, ", mapNumber=", ", team1=");
        sbP.append(this.c);
        sbP.append(", team2=");
        sbP.append(this.d);
        sbP.append(", rounds=");
        return kng0.n(", overtime=", Separators.RPAREN, sbP, this.e, this.f);
    }
}
