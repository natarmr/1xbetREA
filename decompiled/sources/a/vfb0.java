package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vfb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37322a;
    public final List b;
    public final mdm c;

    public vfb0(long j, List list, mdm mdmVar) {
        list.getClass();
        this.f37322a = j;
        this.b = list;
        this.c = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfb0)) {
            return false;
        }
        vfb0 vfb0Var = (vfb0) obj;
        long j = vfb0Var.f37322a;
        int i = y3d.h;
        return h2t0.a(this.f37322a, j) && Intrinsics.d(this.b, vfb0Var.b) && Intrinsics.d(this.c, vfb0Var.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iA = dw9.a(Long.hashCode(this.f37322a) * 31, 31, this.b);
        mdm mdmVar = this.c;
        return iA + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        return cs0.m(defpackage.c.f("PopularOneXGamesUiModel(bgColor=", y3d.i(this.f37322a), ", content=", this.b, ", errorConfig="), this.c, Separators.RPAREN);
    }
}
