package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r7p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9p0 f29988a;
    public final j7p0 b;
    public final a4x c;
    public final boolean d;

    public r7p0(p9p0 p9p0Var, j7p0 j7p0Var, a4x a4xVar, boolean z) {
        p9p0Var.getClass();
        this.f29988a = p9p0Var;
        this.b = j7p0Var;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7p0)) {
            return false;
        }
        r7p0 r7p0Var = (r7p0) obj;
        return Intrinsics.d(this.f29988a, r7p0Var.f29988a) && this.b.equals(r7p0Var.b) && this.c.equals(r7p0Var.c) && this.d == r7p0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (this.f29988a.f26619a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamDetailsAchievementUiState(toolbarModel=");
        sb.append(this.f29988a);
        sb.append(", contentUiModel=");
        sb.append(this.b);
        sb.append(", uiItemList=");
        return rz4.m(sb, this.c, ", loading=", this.d, Separators.RPAREN);
    }
}
