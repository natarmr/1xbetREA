package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w1b0 implements b2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38391a;
    public final fza0 b;
    public final Integer c;

    public w1b0(long j, fza0 fza0Var, Integer num) {
        this.f38391a = j;
        this.b = fza0Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1b0)) {
            return false;
        }
        w1b0 w1b0Var = (w1b0) obj;
        return this.f38391a == w1b0Var.f38391a && this.b == w1b0Var.b && Intrinsics.d(this.c, w1b0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.f38391a) * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OnGameClick(gameId=" + this.f38391a + ", popularCategory=" + this.b + ", subCategoryId=" + this.c + Separators.RPAREN;
    }
}
