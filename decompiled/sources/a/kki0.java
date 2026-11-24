package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kki0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18442a;

    public kki0(String str) {
        str.getClass();
        this.f18442a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kki0) && Intrinsics.d(this.f18442a, ((kki0) obj).f18442a);
    }

    public final int hashCode() {
        return this.f18442a.hashCode();
    }

    public final String toString() {
        return axq.m(new StringBuilder("SessionDetails(sessionId="), this.f18442a, ')');
    }
}
