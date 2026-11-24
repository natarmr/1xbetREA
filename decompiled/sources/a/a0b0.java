package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mlr f18a;
    public final int b;
    public final String c;

    public a0b0(mlr mlrVar, int i, String str) {
        mlrVar.getClass();
        this.f18a = mlrVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0b0)) {
            return false;
        }
        a0b0 a0b0Var = (a0b0) obj;
        return Intrinsics.d(this.f18a, a0b0Var.f18a) && this.b == a0b0Var.b && this.c.equals(a0b0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f18a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameToOpen(game=");
        sb.append(this.f18a);
        sb.append(", subCategoryId=");
        sb.append(this.b);
        sb.append(", gameMetricsUid=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
