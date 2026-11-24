package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d86 implements j86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2g f5629a;
    public final o2g b;
    public final a2m c;
    public final String d;
    public final String e;
    public final mum f;

    public d86(o2g o2gVar, o2g o2gVar2, a2m a2mVar, String str, String str2, mum mumVar) {
        str.getClass();
        str2.getClass();
        this.f5629a = o2gVar;
        this.b = o2gVar2;
        this.c = a2mVar;
        this.d = str;
        this.e = str2;
        this.f = mumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d86)) {
            return false;
        }
        d86 d86Var = (d86) obj;
        return this.f5629a.equals(d86Var.f5629a) && this.b.equals(d86Var.b) && this.c.equals(d86Var.c) && Intrinsics.d(this.d, d86Var.d) && Intrinsics.d(this.e, d86Var.e) && this.f.equals(d86Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f5629a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "Cyber(firstOpponentModel=" + this.f5629a + ", secondOpponentModel=" + this.b + ", scoreModel=" + this.c + ", infoLabel=" + this.d + ", tagLive=" + this.e + ", options=" + this.f + Separators.RPAREN;
    }
}
