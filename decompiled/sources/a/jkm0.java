package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jkm0 implements okm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxm f16677a;
    public final lxm b;
    public final String c;

    public jkm0(lxm lxmVar, lxm lxmVar2, String str) {
        str.getClass();
        this.f16677a = lxmVar;
        this.b = lxmVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkm0)) {
            return false;
        }
        jkm0 jkm0Var = (jkm0) obj;
        return this.f16677a.equals(jkm0Var.f16677a) && this.b.equals(jkm0Var.b) && Intrinsics.d(this.c, jkm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f16677a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiGame(firstOpponent=");
        sb.append(this.f16677a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
