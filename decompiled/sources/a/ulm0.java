package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ulm0 implements zlm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxm f35880a;
    public final lxm b;
    public final String c;
    public final ugm d;
    public final ugm e;

    public ulm0(lxm lxmVar, lxm lxmVar2, String str, ugm ugmVar, ugm ugmVar2) {
        str.getClass();
        this.f35880a = lxmVar;
        this.b = lxmVar2;
        this.c = str;
        this.d = ugmVar;
        this.e = ugmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulm0)) {
            return false;
        }
        ulm0 ulm0Var = (ulm0) obj;
        return this.f35880a.equals(ulm0Var.f35880a) && this.b.equals(ulm0Var.b) && Intrinsics.d(this.c, ulm0Var.c) && this.d.equals(ulm0Var.d) && this.e.equals(ulm0Var.e);
    }

    public final int hashCode() {
        return this.e.f35632a.hashCode() + ((this.d.f35632a.hashCode() + ua80.b((this.b.hashCode() + (this.f35880a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "MultiGame(firstOpponent=" + this.f35880a + ", secondOpponent=" + this.b + ", infoLabel=" + this.c + ", startResultIndicator=" + this.d + ", endResultIndicator=" + this.e + Separators.RPAREN;
    }
}
