package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xkm0 implements clm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kxm f41035a;
    public final kxm b;
    public final String c;

    public xkm0(kxm kxmVar, kxm kxmVar2, String str) {
        str.getClass();
        this.f41035a = kxmVar;
        this.b = kxmVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkm0)) {
            return false;
        }
        xkm0 xkm0Var = (xkm0) obj;
        return this.f41035a.equals(xkm0Var.f41035a) && this.b.equals(xkm0Var.b) && Intrinsics.d(this.c, xkm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f41035a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiGame(firstOpponent=");
        sb.append(this.f41035a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
