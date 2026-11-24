package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e530 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7212a;
    public final c530 b;
    public final a4x c;
    public final boolean d;

    public e530(long j, c530 c530Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f7212a = j;
        this.b = c530Var;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e530)) {
            return false;
        }
        e530 e530Var = (e530) obj;
        return this.f7212a == e530Var.f7212a && this.b.equals(e530Var.b) && Intrinsics.d(this.c, e530Var.c) && this.d == e530Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (Long.hashCode(this.f7212a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "MarketsGroupCardUiModel(groupId=" + this.f7212a + ", marketsGroupCardHeaderUiModel=" + this.b + ", marketsRowsList=" + this.c + ", isExpanded=" + this.d + Separators.RPAREN;
    }
}
