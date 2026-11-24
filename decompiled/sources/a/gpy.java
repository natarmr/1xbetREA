package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gpy extends ppy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11705a;

    public gpy(String str) {
        str.getClass();
        this.f11705a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpy) && Intrinsics.d(this.f11705a, ((gpy) obj).f11705a);
    }

    public final int hashCode() {
        return this.f11705a.hashCode();
    }

    public final String toString() {
        return axq.m(new StringBuilder("KClassValue("), this.f11705a, ')');
    }
}
