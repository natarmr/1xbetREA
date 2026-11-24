package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wqe0 extends qqe0 implements m8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swq f39587a;

    public wqe0(swq swqVar) {
        swqVar.getClass();
        this.f39587a = swqVar;
    }

    @Override // a.m8y
    public final cqe0 a(swq swqVar) {
        swqVar.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wqe0) {
            return Intrinsics.d(this.f39587a, ((wqe0) obj).f39587a);
        }
        return false;
    }

    @Override // a.m8y
    public final Collection getAnnotations() {
        return iun.f15405a;
    }

    public final int hashCode() {
        return this.f39587a.hashCode();
    }

    public final String toString() {
        return wqe0.class.getName() + ": " + this.f39587a;
    }
}
