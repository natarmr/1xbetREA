package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z40 f12583a;
    public final q70 b;
    public final va5 c;
    public final xjq d;
    public final List e;
    public final List f;
    public final List g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;

    public h7m0(z40 z40Var, q70 q70Var, va5 va5Var, xjq xjqVar, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f12583a = z40Var;
        this.b = q70Var;
        this.c = va5Var;
        this.d = xjqVar;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = bool;
        this.i = bool2;
        this.j = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7m0)) {
            return false;
        }
        h7m0 h7m0Var = (h7m0) obj;
        return Intrinsics.d(this.f12583a, h7m0Var.f12583a) && Intrinsics.d(this.b, h7m0Var.b) && Intrinsics.d(this.c, h7m0Var.c) && Intrinsics.d(this.d, h7m0Var.d) && Intrinsics.d(this.e, h7m0Var.e) && Intrinsics.d(this.f, h7m0Var.f) && Intrinsics.d(this.g, h7m0Var.g) && Intrinsics.d(this.h, h7m0Var.h) && Intrinsics.d(this.i, h7m0Var.i) && Intrinsics.d(this.j, h7m0Var.j);
    }

    public final int hashCode() {
        z40 z40Var = this.f12583a;
        int iHashCode = (z40Var == null ? 0 : Integer.hashCode(z40Var.f43743a)) * 31;
        q70 q70Var = this.b;
        int iHashCode2 = (iHashCode + (q70Var == null ? 0 : Integer.hashCode(q70Var.f28225a))) * 31;
        va5 va5Var = this.c;
        int iHashCode3 = (iHashCode2 + (va5Var == null ? 0 : Integer.hashCode(va5Var.f37069a))) * 31;
        xjq xjqVar = this.d;
        int iHashCode4 = (iHashCode3 + (xjqVar == null ? 0 : Integer.hashCode(xjqVar.f40999a))) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.g;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "State3A(aeMode=" + this.f12583a + ", afMode=" + this.b + ", awbMode=" + this.c + ", flashMode=" + this.d + ", aeRegions=" + this.e + ", afRegions=" + this.f + ", awbRegions=" + this.g + ", aeLock=" + this.h + ", afLock=" + this.i + ", awbLock=" + this.j + ')';
    }
}
