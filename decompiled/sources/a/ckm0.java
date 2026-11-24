package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ckm0 implements hkm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ixm f4514a;
    public final ixm b;
    public final String c;

    public ckm0(ixm ixmVar, ixm ixmVar2, String str) {
        str.getClass();
        this.f4514a = ixmVar;
        this.b = ixmVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckm0)) {
            return false;
        }
        ckm0 ckm0Var = (ckm0) obj;
        return this.f4514a.equals(ckm0Var.f4514a) && this.b.equals(ckm0Var.b) && Intrinsics.d(this.c, ckm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f4514a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiGame(firstOpponent=");
        sb.append(this.f4514a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
