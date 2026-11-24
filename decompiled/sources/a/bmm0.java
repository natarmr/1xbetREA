package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bmm0 implements gmm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxm f2842a;
    public final lxm b;
    public final String c;
    public final ugm d;
    public final ugm e;

    public bmm0(lxm lxmVar, lxm lxmVar2, String str, ugm ugmVar, ugm ugmVar2) {
        str.getClass();
        this.f2842a = lxmVar;
        this.b = lxmVar2;
        this.c = str;
        this.d = ugmVar;
        this.e = ugmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmm0)) {
            return false;
        }
        bmm0 bmm0Var = (bmm0) obj;
        return this.f2842a.equals(bmm0Var.f2842a) && this.b.equals(bmm0Var.b) && Intrinsics.d(this.c, bmm0Var.c) && this.d.equals(bmm0Var.d) && this.e.equals(bmm0Var.e);
    }

    public final int hashCode() {
        return this.e.f35632a.hashCode() + ((this.d.f35632a.hashCode() + ua80.b((this.b.hashCode() + (this.f2842a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "MultiGame(firstOpponent=" + this.f2842a + ", secondOpponent=" + this.b + ", infoLabel=" + this.c + ", startResultIndicator=" + this.d + ", endResultIndicator=" + this.e + Separators.RPAREN;
    }
}
