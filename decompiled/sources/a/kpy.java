package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kpy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18696a;

    public kpy(String str) {
        str.getClass();
        this.f18696a = str;
    }

    @Override // a.hpy
    public final Object a() {
        return this.f18696a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpy) && Intrinsics.d(this.f18696a, ((kpy) obj).f18696a);
    }

    public final int hashCode() {
        return this.f18696a.hashCode();
    }
}
