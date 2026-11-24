package a;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bbw0 f30856a;
    public final Map b;
    public final Set c;
    public onf0 d;

    public /* synthetic */ rot0(bbw0 bbw0Var, LinkedHashMap linkedHashMap, onf0 onf0Var, int i) {
        this((i & 1) != 0 ? new bbw0((byte) 16) : bbw0Var, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : onf0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rot0)) {
            return false;
        }
        rot0 rot0Var = (rot0) obj;
        return Intrinsics.d(this.f30856a, rot0Var.f30856a) && Intrinsics.d(this.b, rot0Var.b) && Intrinsics.d(this.c, rot0Var.c) && Intrinsics.d(this.d, rot0Var.d);
    }

    public final int hashCode() {
        int iG = ohs0.g(this.c, ohs0.f(this.b, this.f30856a.hashCode() * 31, 31), 31);
        onf0 onf0Var = this.d;
        return iG + (onf0Var == null ? 0 : Integer.hashCode(onf0Var.f25544a));
    }

    public final String toString() {
        return "InfoBundle(options=" + this.f30856a + ", tags=" + this.b + ", listeners=" + this.c + ", template=" + this.d + ')';
    }

    public rot0(bbw0 bbw0Var, Map map, Set set, onf0 onf0Var) {
        bbw0Var.getClass();
        map.getClass();
        this.f30856a = bbw0Var;
        this.b = map;
        this.c = set;
        this.d = onf0Var;
    }
}
