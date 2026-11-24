package a;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jjv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16636a;

    public jjv0(List list) {
        list.getClass();
        this.f16636a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jjv0.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.f16636a, ((jjv0) obj).f16636a);
    }

    public final int hashCode() {
        return this.f16636a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.b0(this.f16636a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
