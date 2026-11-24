package a;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class sqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32640a;
    public final Map b;

    public sqp(String str, Map map) {
        this.f32640a = str;
        this.b = map;
    }

    public static sqp a(String str) {
        return new sqp(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqp)) {
            return false;
        }
        sqp sqpVar = (sqp) obj;
        return this.f32640a.equals(sqpVar.f32640a) && this.b.equals(sqpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32640a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f32640a + ", properties=" + this.b.values() + "}";
    }
}
