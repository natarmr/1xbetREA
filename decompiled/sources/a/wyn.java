package a;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class wyn implements t83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wyn f39982a = new wyn();

    @Override // a.t83
    public final gmk0 b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // a.t83
    public final Map c() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // a.t83
    public final swq d() {
        wm40 wm40VarD = rek.d(this);
        if (wm40VarD != null) {
            if (f2o.f(wm40VarD)) {
                wm40VarD = null;
            }
            if (wm40VarD != null) {
                return rek.c(wm40VarD);
            }
        }
        return null;
    }

    @Override // a.t83
    public final wsy getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
