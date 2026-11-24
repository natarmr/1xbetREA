package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32633a;
    public final j0g0 b;
    public final btk c;
    public final btk d;

    public sqk(boolean z, j0g0 j0g0Var, btk btkVar, btk btkVar2) {
        this.f32633a = z;
        this.b = j0g0Var;
        this.c = btkVar;
        this.d = btkVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqk)) {
            return false;
        }
        sqk sqkVar = (sqk) obj;
        return this.f32633a == sqkVar.f32633a && Intrinsics.d(this.b, sqkVar.b) && this.c.equals(sqkVar.c) && this.d.equals(sqkVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f32633a) * 31;
        j0g0 j0g0Var = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31)) * 31);
    }

    public final String toString() {
        return "DisciplineDetailsEventFocusToolbarMapModel(loading=" + this.f32633a + ", headerResult=" + this.b + ", liveEvents=" + this.c + ", lineEvents=" + this.d + Separators.RPAREN;
    }
}
