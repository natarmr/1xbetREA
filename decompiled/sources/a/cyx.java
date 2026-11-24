package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cyx implements fyx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5198a;

    public cyx(Object obj) {
        this.f5198a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyx) && Intrinsics.d(this.f5198a, ((cyx) obj).f5198a);
    }

    public final int hashCode() {
        Object obj = this.f5198a;
        return Boolean.hashCode(false) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return f140.k(this.f5198a, "WithContent(content=", ", refreshable=false)");
    }
}
