package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x1b0 implements b2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40115a;
    public final fza0 b;
    public final Integer c;

    public x1b0(long j, fza0 fza0Var, Integer num) {
        this.f40115a = j;
        this.b = fza0Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1b0)) {
            return false;
        }
        x1b0 x1b0Var = (x1b0) obj;
        return this.f40115a == x1b0Var.f40115a && this.b == x1b0Var.b && Intrinsics.d(this.c, x1b0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.f40115a) * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OnGameFavoriteClick(gameId=" + this.f40115a + ", popularCategory=" + this.b + ", subCategoryId=" + this.c + Separators.RPAREN;
    }
}
