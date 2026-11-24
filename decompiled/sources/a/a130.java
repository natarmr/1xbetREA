package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a130 implements g130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgl0 f51a;
    public final long b;
    public final String c;

    public a130(xgl0 xgl0Var, long j, String str) {
        xgl0Var.getClass();
        this.f51a = xgl0Var;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a130)) {
            return false;
        }
        a130 a130Var = (a130) obj;
        return Intrinsics.d(this.f51a, a130Var.f51a) && this.b == a130Var.b && this.c.equals(a130Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f51a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventCategoryBetClick(coefParams=");
        sb.append(this.f51a);
        sb.append(", subGameId=");
        sb.append(this.b);
        return rw2.o(sb, ", subGameName=", this.c, Separators.RPAREN);
    }
}
