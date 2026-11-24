package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wph implements xph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f39545a;

    public wph(a4x a4xVar) {
        a4xVar.getClass();
        this.f39545a = a4xVar;
    }

    @Override // a.xph
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wph) && Intrinsics.d(this.f39545a, ((wph) obj).f39545a);
    }

    public final int hashCode() {
        return this.f39545a.hashCode() * 31;
    }

    public final String toString() {
        return h97.i(this.f39545a, "HorizontalCell(cells=", ", timeLabel=null)");
    }
}
