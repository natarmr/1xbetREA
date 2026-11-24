package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class spy extends x8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32606a;

    public spy(String str) {
        str.getClass();
        this.f32606a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof spy) && Intrinsics.d(this.f32606a, ((spy) obj).f32606a);
    }

    public final int hashCode() {
        return this.f32606a.hashCode();
    }

    public final String toString() {
        return axq.m(new StringBuilder("TypeAlias(name="), this.f32606a, ')');
    }
}
