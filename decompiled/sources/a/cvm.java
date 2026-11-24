package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cvm implements fvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ivm f5037a;
    public final ivm b;
    public final mpm c;
    public final String d;
    public final String e;
    public final a4x f;
    public final String g;
    public final zum h;
    public final boolean i;

    public cvm(ivm ivmVar, ivm ivmVar2, mpm mpmVar, String str, String str2, a4x a4xVar, String str3, zum zumVar, boolean z) {
        a4xVar.getClass();
        str3.getClass();
        this.f5037a = ivmVar;
        this.b = ivmVar2;
        this.c = mpmVar;
        this.d = str;
        this.e = str2;
        this.f = a4xVar;
        this.g = str3;
        this.h = zumVar;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvm)) {
            return false;
        }
        cvm cvmVar = (cvm) obj;
        return this.f5037a.equals(cvmVar.f5037a) && this.b.equals(cvmVar.b) && this.c.equals(cvmVar.c) && this.d.equals(cvmVar.d) && this.e.equals(cvmVar.e) && Intrinsics.d(this.f, cvmVar.f) && Intrinsics.d(this.g, cvmVar.g) && this.h.equals(cvmVar.h) && this.i == cvmVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ua80.b(cs0.b(this.f, ua80.b(ua80.b(ohs0.e(this.c, (this.b.hashCode() + (this.f5037a.hashCode() * 31)) * 31, 961), 31, this.d), 31, this.e), 31), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V2(firstOpponent=");
        sb.append(this.f5037a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", infoLabel=, infoLabel2=");
        sb.append(this.d);
        sb.append(", gameLabel=");
        cs0.B(sb, this.e, ", cardOnTableList=", this.f, ", tagLiveText=");
        sb.append(this.g);
        sb.append(", options=");
        sb.append(this.h);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
