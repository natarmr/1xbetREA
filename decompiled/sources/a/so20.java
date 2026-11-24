package a;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class so20 implements Map.Entry, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32523a;
    public final Object b;

    public so20(Object obj, Object obj2) {
        this.f32523a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so20)) {
            return false;
        }
        so20 so20Var = (so20) obj;
        return Intrinsics.d(this.f32523a, so20Var.f32523a) && Intrinsics.d(this.b, so20Var.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f32523a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f32523a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f32523a + ", value=" + this.b + ')';
    }
}
