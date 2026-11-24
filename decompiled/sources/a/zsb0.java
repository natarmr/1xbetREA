package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zsb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44898a;

    public zsb0(String str) {
        str.getClass();
        this.f44898a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zsb0)) {
            return false;
        }
        return Intrinsics.d(this.f44898a, ((zsb0) obj).f44898a);
    }

    public final int hashCode() {
        return this.f44898a.hashCode();
    }

    public final String toString() {
        return this.f44898a;
    }
}
