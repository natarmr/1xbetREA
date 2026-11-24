package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v76 implements b86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2g f36908a;
    public final l2g b;
    public final mpm c;
    public final String d;
    public final mum e;

    public v76(l2g l2gVar, l2g l2gVar2, mpm mpmVar, String str, mum mumVar) {
        str.getClass();
        this.f36908a = l2gVar;
        this.b = l2gVar2;
        this.c = mpmVar;
        this.d = str;
        this.e = mumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v76)) {
            return false;
        }
        v76 v76Var = (v76) obj;
        return this.f36908a.equals(v76Var.f36908a) && this.b.equals(v76Var.b) && this.c.equals(v76Var.c) && Intrinsics.d(this.d, v76Var.d) && this.e.equals(v76Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ohs0.e(this.c, (this.b.hashCode() + (this.f36908a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "Cyber(firstOpponentModel=" + this.f36908a + ", secondOpponentModel=" + this.b + ", scoreModel=" + this.c + ", infoLabel=" + this.d + ", options=" + this.e + Separators.RPAREN;
    }
}
