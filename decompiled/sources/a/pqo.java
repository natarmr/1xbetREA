package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2v f27424a;
    public final swh0 b;
    public final boolean c;
    public final zvh0 d;
    public final boolean e;
    public final List f;
    public final List g;
    public final gie h;
    public final gie i;
    public final Set j;
    public final gd90 k;

    public pqo(g2v g2vVar, swh0 swh0Var, boolean z, zvh0 zvh0Var, boolean z2, List list, List list2, gie gieVar, gie gieVar2, Set set, gd90 gd90Var) {
        list.getClass();
        list2.getClass();
        set.getClass();
        this.f27424a = g2vVar;
        this.b = swh0Var;
        this.c = z;
        this.d = zvh0Var;
        this.e = z2;
        this.f = list;
        this.g = list2;
        this.h = gieVar;
        this.i = gieVar2;
        this.j = set;
        this.k = gd90Var;
    }

    public static pqo a(pqo pqoVar, swh0 swh0Var, boolean z, List list, List list2, gie gieVar, gie gieVar2, Set set, gd90 gd90Var, int i) {
        g2v g2vVar = pqoVar.f27424a;
        if ((i & 2) != 0) {
            swh0Var = pqoVar.b;
        }
        swh0 swh0Var2 = swh0Var;
        if ((i & 4) != 0) {
            z = pqoVar.c;
        }
        boolean z2 = z;
        zvh0 zvh0Var = pqoVar.d;
        boolean z3 = pqoVar.e;
        List list3 = (i & 32) != 0 ? pqoVar.f : list;
        List list4 = (i & 64) != 0 ? pqoVar.g : list2;
        gie gieVar3 = (i & 128) != 0 ? pqoVar.h : gieVar;
        gie gieVar4 = (i & 256) != 0 ? pqoVar.i : gieVar2;
        Set set2 = (i & 512) != 0 ? pqoVar.j : set;
        gd90 gd90Var2 = (i & 1024) != 0 ? pqoVar.k : gd90Var;
        pqoVar.getClass();
        list3.getClass();
        list4.getClass();
        set2.getClass();
        return new pqo(g2vVar, swh0Var2, z2, zvh0Var, z3, list3, list4, gieVar3, gieVar4, set2, gd90Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqo)) {
            return false;
        }
        pqo pqoVar = (pqo) obj;
        return this.f27424a.equals(pqoVar.f27424a) && this.b == pqoVar.b && this.c == pqoVar.c && this.d == pqoVar.d && this.e == pqoVar.e && Intrinsics.d(this.f, pqoVar.f) && Intrinsics.d(this.g, pqoVar.g) && this.h.equals(pqoVar.h) && this.i.equals(pqoVar.i) && Intrinsics.d(this.j, pqoVar.j) && Intrinsics.d(this.k, pqoVar.k);
    }

    public final int hashCode() {
        int iG = ohs0.g(this.j, (this.i.hashCode() + ((this.h.hashCode() + dw9.a(dw9.a(brm0.e((this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f27424a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31);
        gd90 gd90Var = this.k;
        return iG + (gd90Var == null ? 0 : gd90Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpressEventsState(lottieConfigurator=");
        sb.append(this.f27424a);
        sb.append(", selectedTab=");
        sb.append(this.b);
        sb.append(", needAllExpand=");
        sb.append(this.c);
        sb.append(", segmentControlStyle=");
        sb.append(this.d);
        sb.append(", isNewEventParams=");
        vqd.y(sb, ", liveOldItems=", this.f, ", lineOldItems=", this.e);
        sb.append(this.g);
        sb.append(", liveContentState=");
        sb.append(this.h);
        sb.append(", lineContentState=");
        sb.append(this.i);
        sb.append(", expandedSet=");
        sb.append(this.j);
        sb.append(", pendingForAdditionEvents=");
        sb.append(this.k);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
