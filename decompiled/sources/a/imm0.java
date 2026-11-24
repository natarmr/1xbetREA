package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class imm0 implements nmm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kxm f15033a;
    public final kxm b;
    public final String c;
    public final rgm d;
    public final rgm e;

    public imm0(kxm kxmVar, kxm kxmVar2, String str, rgm rgmVar, rgm rgmVar2) {
        str.getClass();
        this.f15033a = kxmVar;
        this.b = kxmVar2;
        this.c = str;
        this.d = rgmVar;
        this.e = rgmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imm0)) {
            return false;
        }
        imm0 imm0Var = (imm0) obj;
        return this.f15033a.equals(imm0Var.f15033a) && this.b.equals(imm0Var.b) && Intrinsics.d(this.c, imm0Var.c) && this.d.equals(imm0Var.d) && this.e.equals(imm0Var.e);
    }

    public final int hashCode() {
        return this.e.f30444a.hashCode() + ((this.d.f30444a.hashCode() + ua80.b((this.b.hashCode() + (this.f15033a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "MultiGame(firstOpponent=" + this.f15033a + ", secondOpponent=" + this.b + ", infoLabel=" + this.c + ", startResultIndicator=" + this.d + ", endResultIndicator=" + this.e + Separators.RPAREN;
    }
}
