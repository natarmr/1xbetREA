package a;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class gji0 {
    public static final fji0 Companion = new fji0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new gei0((byte) 9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pji0 f11398a;
    public final pgq0 b;
    public final Map c;

    public /* synthetic */ gji0(int i, pji0 pji0Var, pgq0 pgq0Var, Map map) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, eji0.f7912a.getDescriptor());
            throw null;
        }
        this.f11398a = pji0Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = pgq0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static gji0 a(gji0 gji0Var, pji0 pji0Var, pgq0 pgq0Var, Map map, int i) {
        if ((i & 1) != 0) {
            pji0Var = gji0Var.f11398a;
        }
        if ((i & 2) != 0) {
            pgq0Var = gji0Var.b;
        }
        if ((i & 4) != 0) {
            map = gji0Var.c;
        }
        gji0Var.getClass();
        pji0Var.getClass();
        return new gji0(pji0Var, pgq0Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gji0)) {
            return false;
        }
        gji0 gji0Var = (gji0) obj;
        return Intrinsics.d(this.f11398a, gji0Var.f11398a) && Intrinsics.d(this.b, gji0Var.b) && Intrinsics.d(this.c, gji0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f11398a.hashCode() * 31;
        pgq0 pgq0Var = this.b;
        int iHashCode2 = (iHashCode + (pgq0Var == null ? 0 : Long.hashCode(pgq0Var.f26964a))) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f11398a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public gji0(pji0 pji0Var, pgq0 pgq0Var, Map map) {
        pji0Var.getClass();
        this.f11398a = pji0Var;
        this.b = pgq0Var;
        this.c = map;
    }
}
