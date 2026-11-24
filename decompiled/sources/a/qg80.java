package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qg80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28670a;

    public qg80(String str) {
        str.getClass();
        this.f28670a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qg80) && Intrinsics.d(this.f28670a, ((qg80) obj).f28670a);
    }

    public final int hashCode() {
        return this.f28670a.hashCode();
    }

    public final String toString() {
        return this.f28670a;
    }
}
