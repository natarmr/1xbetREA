package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final atf0 f19179a;

    public l04(atf0 atf0Var) {
        this.f19179a = atf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l04) && Intrinsics.d(this.f19179a, ((l04) obj).f19179a);
    }

    public final int hashCode() {
        return this.f19179a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f19179a + ", loaderKey=null)";
    }
}
