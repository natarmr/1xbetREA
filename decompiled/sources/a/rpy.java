package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rpy extends x8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30907a;

    public rpy(String str) {
        str.getClass();
        this.f30907a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rpy) && Intrinsics.d(this.f30907a, ((rpy) obj).f30907a);
    }

    public final int hashCode() {
        return this.f30907a.hashCode();
    }

    public final String toString() {
        return axq.m(new StringBuilder("Class(name="), this.f30907a, ')');
    }
}
