package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d2n implements h2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2n f5364a;
    public final k2n b;
    public final String c;
    public final String d;

    public d2n(k2n k2nVar, k2n k2nVar2, String str, String str2) {
        str.getClass();
        this.f5364a = k2nVar;
        this.b = k2nVar2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2n)) {
            return false;
        }
        d2n d2nVar = (d2n) obj;
        return this.f5364a.equals(d2nVar.f5364a) && this.b.equals(d2nVar.b) && Intrinsics.d(this.c, d2nVar.c) && this.d.equals(d2nVar.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ua80.b(ua80.b((this.b.hashCode() + (this.f5364a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V1(firstOpponent=");
        sb.append(this.f5364a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return ua80.m(sb, this.c, ", gameLabel=", this.d, ", enableEventStatusIndicator=true)");
    }
}
