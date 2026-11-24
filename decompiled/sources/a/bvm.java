package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bvm implements fvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hvm f3284a;
    public final hvm b;
    public final String c;
    public final String d;
    public final a4x e;
    public final sem f;
    public final zum g;

    public bvm(hvm hvmVar, hvm hvmVar2, String str, String str2, a4x a4xVar, sem semVar, zum zumVar) {
        a4xVar.getClass();
        this.f3284a = hvmVar;
        this.b = hvmVar2;
        this.c = str;
        this.d = str2;
        this.e = a4xVar;
        this.f = semVar;
        this.g = zumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvm)) {
            return false;
        }
        bvm bvmVar = (bvm) obj;
        return this.f3284a.equals(bvmVar.f3284a) && this.b.equals(bvmVar.b) && this.c.equals(bvmVar.c) && this.d.equals(bvmVar.d) && Intrinsics.d(this.e, bvmVar.e) && this.f.equals(bvmVar.f) && this.g.equals(bvmVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + cs0.b(this.e, ua80.b(ua80.b((this.b.hashCode() + (this.f3284a.hashCode() * 31)) * 961, 31, this.c), 31, this.d), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V1(firstOpponent=");
        sb.append(this.f3284a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=, infoLabel2=");
        f140.v(sb, this.c, ", gameLabel=", this.d, ", cardOnTableList=");
        sb.append(this.e);
        sb.append(", eventStatusIndicatorModel=");
        sb.append(this.f);
        sb.append(", options=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
