package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lml0 implements rml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sum f20302a;
    public final sum b;
    public final mpm c;
    public final String d;
    public final mum e;

    public lml0(sum sumVar, sum sumVar2, mpm mpmVar, String str, mum mumVar) {
        this.f20302a = sumVar;
        this.b = sumVar2;
        this.c = mpmVar;
        this.d = str;
        this.e = mumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lml0)) {
            return false;
        }
        lml0 lml0Var = (lml0) obj;
        return this.f20302a.equals(lml0Var.f20302a) && this.b.equals(lml0Var.b) && this.c.equals(lml0Var.c) && Intrinsics.d(this.d, lml0Var.d) && this.e.equals(lml0Var.e);
    }

    public final int hashCode() {
        int iE = ohs0.e(this.c, (this.b.hashCode() + (this.f20302a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        return this.e.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Cyber(teamOneModel=" + this.f20302a + ", teamTwoModel=" + this.b + ", scoreModel=" + this.c + ", infoLabel=" + this.d + ", options=" + this.e + Separators.RPAREN;
    }
}
