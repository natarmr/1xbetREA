package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p8h0 implements f9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26554a;
    public final aj00 b;
    public final String c;

    public p8h0(long j, aj00 aj00Var, String str) {
        aj00Var.getClass();
        str.getClass();
        this.f26554a = j;
        this.b = aj00Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8h0)) {
            return false;
        }
        p8h0 p8h0Var = (p8h0) obj;
        return this.f26554a == p8h0Var.f26554a && Intrinsics.d(this.b, p8h0Var.b) && Intrinsics.d(this.c, p8h0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f26554a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveExpressGames(sportId=");
        sb.append(this.f26554a);
        sb.append(", tabType=");
        sb.append(this.b);
        return rw2.o(sb, ", title=", this.c, Separators.RPAREN);
    }
}
