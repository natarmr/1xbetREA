package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hmy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13326a;
    public ghn b;

    public hmy(Object obj, ghn ghnVar) {
        this.f13326a = obj;
        this.b = ghnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hmy)) {
            return false;
        }
        hmy hmyVar = (hmy) obj;
        return Intrinsics.d(hmyVar.f13326a, this.f13326a) && Intrinsics.d(hmyVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.f13326a;
        return this.b.hashCode() + twn.a(0, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
