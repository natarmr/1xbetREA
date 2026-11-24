package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bms0 implements ams0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2852a;
    public final Object b;

    public bms0(Object obj, Object obj2) {
        this.f2852a = obj;
        this.b = obj2;
    }

    @Override // a.ams0
    public final Object b() {
        return this.b;
    }

    @Override // a.ams0
    public final Object d() {
        return this.f2852a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ams0)) {
            return false;
        }
        ams0 ams0Var = (ams0) obj;
        return Intrinsics.d(this.f2852a, ams0Var.d()) && Intrinsics.d(this.b, ams0Var.b());
    }

    public final int hashCode() {
        Object obj = this.f2852a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
