package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qmc0 implements smc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28977a;

    public qmc0(String str) {
        str.getClass();
        this.f28977a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmc0) && Intrinsics.d(this.f28977a, ((qmc0) obj).f28977a);
    }

    public final int hashCode() {
        return this.f28977a.hashCode() * 31;
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(title=", this.f28977a, ", message=null)");
    }
}
