package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44035a;
    public final List b;
    public final List c;
    public final Map d;
    public final Map e;
    public final List f;

    public z9s(List list, List list2, List list3, Map map, Map map2, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        map.getClass();
        map2.getClass();
        list4.getClass();
        this.f44035a = list;
        this.b = list2;
        this.c = list3;
        this.d = map;
        this.e = map2;
        this.f = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9s)) {
            return false;
        }
        z9s z9sVar = (z9s) obj;
        return Intrinsics.d(this.f44035a, z9sVar.f44035a) && Intrinsics.d(this.b, z9sVar.b) && Intrinsics.d(this.c, z9sVar.c) && Intrinsics.d(this.d, z9sVar.d) && Intrinsics.d(this.e, z9sVar.e) && Intrinsics.d(this.f, z9sVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ohs0.f(this.e, ohs0.f(this.d, dw9.a(dw9.a(this.f44035a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("GameEventExtrasModel(favoriteIds=", ", betEvents=", this.f44035a, ", trackCoefList=", this.b);
        sbT.append(this.c);
        sbT.append(", eventsGroups=");
        sbT.append(this.d);
        sbT.append(", events=");
        sbT.append(this.e);
        sbT.append(", subscriptions=");
        sbT.append(this.f);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
