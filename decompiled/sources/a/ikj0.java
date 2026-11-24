package a;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ikj0 implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14929a;
    public final List b;
    public final boolean c;

    public ikj0(String str, List list, boolean z) {
        this.f14929a = str;
        this.b = list;
        this.c = z;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        return new dee(bb10Var, tz5Var, this, fa10Var);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f14929a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
