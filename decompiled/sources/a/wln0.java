package a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class wln0 {
    public static final urm0 e = urm0.DEFAULT;
    public static final tln0[] f = {tln0.S720P_16_9, tln0.S1080P_4_3, tln0.S1080P_16_9, tln0.S1440P_16_9, tln0.UHD, tln0.X_VGA};
    public static final Map g;
    public static final LinkedHashMap h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vln0 f39363a;
    public final tln0 b;
    public final urm0 c;
    public final int d;

    static {
        Map mapF = xp20.f(new Pair(vln0.b, 35), new Pair(vln0.c, 256), new Pair(vln0.d, 4101), new Pair(vln0.e, 32), new Pair(vln0.f37634a, 34));
        g = mapF;
        Set<Map.Entry> setEntrySet = mapF.entrySet();
        int iA = wp20.a(r3d.q(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (vln0) entry.getKey());
        }
        h = linkedHashMap;
    }

    public wln0(vln0 vln0Var, tln0 tln0Var, urm0 urm0Var) {
        tln0Var.getClass();
        urm0Var.getClass();
        this.f39363a = vln0Var;
        this.b = tln0Var;
        this.c = urm0Var;
        Integer num = (Integer) g.get(vln0Var);
        this.d = num != null ? num.intValue() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wln0)) {
            return false;
        }
        wln0 wln0Var = (wln0) obj;
        return this.f39363a == wln0Var.f39363a && this.b == wln0Var.b && this.c == wln0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f39363a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.f39363a + ", configSize=" + this.b + ", streamUseCase=" + this.c + ')';
    }
}
