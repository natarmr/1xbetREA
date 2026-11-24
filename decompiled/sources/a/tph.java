package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tph implements xph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f34332a;

    public tph(a4x a4xVar) {
        a4xVar.getClass();
        this.f34332a = a4xVar;
    }

    @Override // a.xph
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tph) && Intrinsics.d(this.f34332a, ((tph) obj).f34332a);
    }

    public final int hashCode() {
        return this.f34332a.hashCode() * 31;
    }

    public final String toString() {
        return h97.i(this.f34332a, "CellIconProgressIndicator(cells=", ", timeLabel=null)");
    }
}
