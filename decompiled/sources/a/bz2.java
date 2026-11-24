package a;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3444a;
    public final w6k b;
    public final long c;
    public final lh80 d;

    public bz2(Context context, w6k w6kVar, long j, lh80 lh80Var) {
        this.f3444a = context;
        this.b = w6kVar;
        this.c = j;
        this.d = lh80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bz2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        bz2 bz2Var = (bz2) obj;
        if (!Intrinsics.d(this.f3444a, bz2Var.f3444a) || !Intrinsics.d(this.b, bz2Var.b)) {
            return false;
        }
        long j = bz2Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d.equals(bz2Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3444a.hashCode() * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.d.hashCode() + rw2.b(iHashCode, 31, this.c);
    }
}
