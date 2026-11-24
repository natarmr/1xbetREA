package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f39653a;
    public final dxh0 b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public wro(int i, a4x a4xVar, dxh0 dxh0Var) {
        a4xVar.getClass();
        this.f39653a = a4xVar;
        this.b = dxh0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wro)) {
            return false;
        }
        wro wroVar = (wro) obj;
        return Intrinsics.d(this.f39653a, wroVar.f39653a) && this.b.equals(wroVar.b) && this.c == wroVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c ? 1 : 0) + hne.h(this.b, this.f39653a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpressSegmentControlsUiModel(segments=");
        sb.append(this.f39653a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", currentPage=");
        return rz4.j(this.c ? 1 : 0, Separators.RPAREN, sb);
    }
}
