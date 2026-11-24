package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lrl implements nrl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20538a;
    public final String b;
    public final a4x c;

    public lrl(a4x a4xVar, String str, String str2) {
        str.getClass();
        a4xVar.getClass();
        this.f20538a = str;
        this.b = str2;
        this.c = a4xVar;
        if (a4xVar.size() <= 3) {
            return;
        }
        jf4.o("Максимальное количество элементов 3");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrl)) {
            return false;
        }
        lrl lrlVar = (lrl) obj;
        return Intrinsics.d(this.f20538a, lrlVar.f20538a) && this.b.equals(lrlVar.b) && Intrinsics.d(this.c, lrlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f20538a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Content(headerTitle=", this.f20538a, ", headerButtonText=", this.b, ", items="), this.c, Separators.RPAREN);
    }
}
