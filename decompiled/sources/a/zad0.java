package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44061a;
    public final d270 b;
    public final String c;

    public zad0(long j, d270 d270Var, String str) {
        str.getClass();
        this.f44061a = j;
        this.b = d270Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad0)) {
            return false;
        }
        zad0 zad0Var = (zad0) obj;
        return this.f44061a == zad0Var.f44061a && this.b == zad0Var.b && Intrinsics.d(this.c, zad0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f44061a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesPromoGroup(gameIdToOpen=");
        sb.append(this.f44061a);
        sb.append(", promoScreenToOpen=");
        sb.append(this.b);
        return rw2.o(sb, ", fromScreen=", this.c, Separators.RPAREN);
    }

    public /* synthetic */ zad0(d270 d270Var, String str) {
        this(0L, d270Var, str);
    }
}
