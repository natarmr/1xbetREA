package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class num implements rum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sum f24155a;
    public final sum b;
    public final mpm c;
    public final mum d;
    public final String e;
    public final boolean f;

    public num(sum sumVar, sum sumVar2, mpm mpmVar, mum mumVar, String str, boolean z) {
        str.getClass();
        this.f24155a = sumVar;
        this.b = sumVar2;
        this.c = mpmVar;
        this.d = mumVar;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof num)) {
            return false;
        }
        num numVar = (num) obj;
        return this.f24155a.equals(numVar.f24155a) && this.b.equals(numVar.b) && this.c.equals(numVar.c) && this.d.equals(numVar.d) && Intrinsics.d(this.e, numVar.e) && this.f == numVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b((this.d.hashCode() + ohs0.e(this.c, (this.b.hashCode() + (this.f24155a.hashCode() * 31)) * 31, 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(firstOpponentModel=");
        sb.append(this.f24155a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", options=");
        sb.append(this.d);
        sb.append(", infoLabel=");
        return defpackage.c.c(this.e, ", supportRtl=", Separators.RPAREN, sb, this.f);
    }
}
