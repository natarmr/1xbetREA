package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p3o0 implements q3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2n f26308a;
    public final k2n b;
    public final String c;
    public final String d;

    public p3o0(k2n k2nVar, k2n k2nVar2, String str, String str2) {
        str.getClass();
        this.f26308a = k2nVar;
        this.b = k2nVar2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3o0)) {
            return false;
        }
        p3o0 p3o0Var = (p3o0) obj;
        return this.f26308a.equals(p3o0Var.f26308a) && this.b.equals(p3o0Var.b) && Intrinsics.d(this.c, p3o0Var.c) && this.d.equals(p3o0Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ua80.b(ua80.b((this.b.hashCode() + (this.f26308a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinningFormula(firstOpponent=");
        sb.append(this.f26308a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return ua80.m(sb, this.c, ", gameLabel=", this.d, ", enableEventStatusIndicator=true)");
    }
}
