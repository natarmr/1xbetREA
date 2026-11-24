package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgy f12510a;
    public final Object b;

    public h63(y1h0 y1h0Var) {
        sgy sgyVarB = sre0.f32672a.b(y1h0Var.getClass());
        Object key = y1h0Var.getKey();
        this.f12510a = sgyVarB;
        this.b = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h63)) {
            return false;
        }
        h63 h63Var = (h63) obj;
        return Intrinsics.d(this.f12510a, h63Var.f12510a) && Intrinsics.d(this.b, h63Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12510a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatedSceneKey(clazz=" + this.f12510a + ", key=" + this.b + Separators.RPAREN;
    }
}
