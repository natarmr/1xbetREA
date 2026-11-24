package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m730 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21300a;
    public final Map b;
    public final l9s c;
    public final long d;
    public final aw20 e;
    public final boolean f;
    public final ycs g;
    public final oxk0 h;

    public m730(List list, Map map, l9s l9sVar, long j, aw20 aw20Var, boolean z, ycs ycsVar, oxk0 oxk0Var) {
        list.getClass();
        this.f21300a = list;
        this.b = map;
        this.c = l9sVar;
        this.d = j;
        this.e = aw20Var;
        this.f = z;
        this.g = ycsVar;
        this.h = oxk0Var;
    }

    public static m730 a(m730 m730Var, List list, LinkedHashMap linkedHashMap, l9s l9sVar, long j, aw20 aw20Var, ycs ycsVar, int i) {
        if ((i & 1) != 0) {
            list = m730Var.f21300a;
        }
        List list2 = list;
        Map map = linkedHashMap;
        if ((i & 2) != 0) {
            map = m730Var.b;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            l9sVar = m730Var.c;
        }
        l9s l9sVar2 = l9sVar;
        long j2 = (i & 8) != 0 ? m730Var.d : j;
        aw20 aw20Var2 = (i & 16) != 0 ? m730Var.e : aw20Var;
        boolean z = m730Var.f;
        ycs ycsVar2 = (i & 64) != 0 ? m730Var.g : ycsVar;
        oxk0 oxk0Var = m730Var.h;
        m730Var.getClass();
        list2.getClass();
        aw20Var2.getClass();
        return new m730(list2, map2, l9sVar2, j2, aw20Var2, z, ycsVar2, oxk0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m730)) {
            return false;
        }
        m730 m730Var = (m730) obj;
        return Intrinsics.d(this.f21300a, m730Var.f21300a) && this.b.equals(m730Var.b) && Intrinsics.d(this.c, m730Var.c) && this.d == m730Var.d && this.e.equals(m730Var.e) && this.f == m730Var.f && Intrinsics.d(this.g, m730Var.g) && this.h == m730Var.h;
    }

    public final int hashCode() {
        int iF = ohs0.f(this.b, this.f21300a.hashCode() * 31, 31);
        l9s l9sVar = this.c;
        int iE = brm0.e((this.e.hashCode() + rw2.b((iF + (l9sVar == null ? 0 : l9sVar.hashCode())) * 31, 31, this.d)) * 31, 31, this.f);
        ycs ycsVar = this.g;
        return this.h.hashCode() + ((iE + (ycsVar != null ? ycsVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MarketsStateModel(totalExactSelectedModels=" + this.f21300a + ", markets=" + this.b + ", gameDetailsModel=" + this.c + ", currentSabGameId=" + this.d + ", marketPropertiesModel=" + this.e + ", rtlSupport=" + this.f + ", gameHighlightModel=" + this.g + ", supportedSpecialType=" + this.h + Separators.RPAREN;
    }
}
