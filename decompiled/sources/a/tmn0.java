package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tmn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f34202a;
    public final LinkedHashMap b;
    public final int c;

    public tmn0(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i) {
        this.f34202a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmn0)) {
            return false;
        }
        tmn0 tmn0Var = (tmn0) obj;
        return this.f34202a.equals(tmn0Var.f34202a) && this.b.equals(tmn0Var.b) && this.c == tmn0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.f34202a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.f34202a);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.b);
        sb.append(", maxSupportedFrameRate=");
        return brm0.n(sb, this.c, ')');
    }
}
