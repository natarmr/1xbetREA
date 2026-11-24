package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class elm0 implements jlm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jxm f8007a;
    public final jxm b;
    public final String c;

    public elm0(jxm jxmVar, jxm jxmVar2, String str) {
        str.getClass();
        this.f8007a = jxmVar;
        this.b = jxmVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elm0)) {
            return false;
        }
        elm0 elm0Var = (elm0) obj;
        return this.f8007a.equals(elm0Var.f8007a) && this.b.equals(elm0Var.b) && Intrinsics.d(this.c, elm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f8007a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiGame(firstOpponent=");
        sb.append(this.f8007a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
