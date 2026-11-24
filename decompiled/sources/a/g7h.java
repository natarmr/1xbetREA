package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g7h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9s f10812a;
    public final ms2 b;
    public final List c;
    public final th90 d;
    public final th90 e;
    public final th90 f;
    public final th90 g;
    public final List h;
    public final long i;

    public g7h(m9s m9sVar, ms2 ms2Var, List list, th90 th90Var, th90 th90Var2, th90 th90Var3, th90 th90Var4, List list2, long j) {
        list.getClass();
        list2.getClass();
        this.f10812a = m9sVar;
        this.b = ms2Var;
        this.c = list;
        this.d = th90Var;
        this.e = th90Var2;
        this.f = th90Var3;
        this.g = th90Var4;
        this.h = list2;
        this.i = j;
    }

    public static g7h a(g7h g7hVar, m9s m9sVar, ms2 ms2Var, List list, th90 th90Var, th90 th90Var2, th90 th90Var3, th90 th90Var4, List list2, long j, int i) {
        if ((i & 1) != 0) {
            m9sVar = g7hVar.f10812a;
        }
        m9s m9sVar2 = m9sVar;
        if ((i & 2) != 0) {
            ms2Var = g7hVar.b;
        }
        ms2 ms2Var2 = ms2Var;
        if ((i & 4) != 0) {
            list = g7hVar.c;
        }
        List list3 = list;
        th90 th90Var5 = (i & 8) != 0 ? g7hVar.d : th90Var;
        th90 th90Var6 = (i & 16) != 0 ? g7hVar.e : th90Var2;
        th90 th90Var7 = (i & 32) != 0 ? g7hVar.f : th90Var3;
        th90 th90Var8 = (i & 64) != 0 ? g7hVar.g : th90Var4;
        List list4 = (i & 128) != 0 ? g7hVar.h : list2;
        long j2 = (i & 256) != 0 ? g7hVar.i : j;
        g7hVar.getClass();
        list3.getClass();
        th90Var5.getClass();
        th90Var6.getClass();
        th90Var7.getClass();
        th90Var8.getClass();
        list4.getClass();
        return new g7h(m9sVar2, ms2Var2, list3, th90Var5, th90Var6, th90Var7, th90Var8, list4, j2);
    }

    public final th90 b() {
        th90 th90Var = (th90) this.e.get(Long.valueOf(this.i));
        if (th90Var != null) {
            return th90Var;
        }
        uh90 uh90Var = uh90.g;
        uh90Var.getClass();
        return uh90Var;
    }

    public final long c() {
        Long l = (Long) this.d.get(Long.valueOf(this.i));
        if (l != null) {
            return l.longValue();
        }
        xum0 xum0Var = (xum0) CollectionsKt.firstOrNull(this.c);
        Long lValueOf = xum0Var != null ? Long.valueOf(xum0Var.b) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7h)) {
            return false;
        }
        g7h g7hVar = (g7h) obj;
        return Intrinsics.d(this.f10812a, g7hVar.f10812a) && Intrinsics.d(this.b, g7hVar.b) && Intrinsics.d(this.c, g7hVar.c) && this.d.equals(g7hVar.d) && this.e.equals(g7hVar.e) && this.f.equals(g7hVar.f) && this.g.equals(g7hVar.g) && Intrinsics.d(this.h, g7hVar.h) && this.i == g7hVar.i;
    }

    public final int hashCode() {
        m9s m9sVar = this.f10812a;
        int iHashCode = (m9sVar == null ? 0 : m9sVar.hashCode()) * 31;
        ms2 ms2Var = this.b;
        return Long.hashCode(this.i) + dw9.a((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + dw9.a((iHashCode + (ms2Var != null ? ms2Var.hashCode() : 0)) * 31, 31, this.c)) * 31)) * 31)) * 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberMarketsState(gameDetails=");
        sb.append(this.f10812a);
        sb.append(", entryPointType=");
        sb.append(this.b);
        sb.append(", subGames=");
        sb.append(this.c);
        sb.append(", selectedSubGameIdByCategory=");
        sb.append(this.d);
        sb.append(", marketsByCategory=");
        sb.append(this.e);
        sb.append(", userInteractedSubGamesByCategory=");
        sb.append(this.f);
        sb.append(", expandedCategorySubGamesByCategory=");
        sb.append(this.g);
        sb.append(", categories=");
        sb.append(this.h);
        sb.append(", selectedCategoryId=");
        return brm0.k(this.i, Separators.RPAREN, sb);
    }
}
