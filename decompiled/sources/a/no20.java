package a;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class no20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f23849a;

    public no20(Map map) {
        this.f23849a = map;
    }

    public final Object a(float f) {
        Object next;
        Iterator it = this.f23849a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final Object b(float f, boolean z) {
        Object next;
        Iterator it = this.f23849a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? fFloatValue - f : f - fFloatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? fFloatValue2 - f : f - fFloatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final float c() {
        Float fK0 = CollectionsKt.k0(this.f23849a.values());
        if (fK0 != null) {
            return fK0.floatValue();
        }
        return Float.NaN;
    }

    public final float d(Object obj) {
        Float f = (Float) this.f23849a.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no20)) {
            return false;
        }
        return this.f23849a.equals(((no20) obj).f23849a);
    }

    public final int hashCode() {
        return this.f23849a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f23849a + ')';
    }
}
