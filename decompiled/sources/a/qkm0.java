package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qkm0 implements vkm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxm f28893a;
    public final lxm b;
    public final String c;

    public qkm0(lxm lxmVar, lxm lxmVar2, String str) {
        str.getClass();
        this.f28893a = lxmVar;
        this.b = lxmVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkm0)) {
            return false;
        }
        qkm0 qkm0Var = (qkm0) obj;
        return this.f28893a.equals(qkm0Var.f28893a) && this.b.equals(qkm0Var.b) && Intrinsics.d(this.c, qkm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f28893a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiGame(firstOpponent=");
        sb.append(this.f28893a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
