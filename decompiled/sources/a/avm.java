package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class avm implements fvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gvm f1533a;
    public final gvm b;
    public final mpm c;
    public final String d;
    public final String e;
    public final String f;
    public final a4x g;
    public final zum h;
    public final boolean i;

    public avm(gvm gvmVar, gvm gvmVar2, mpm mpmVar, String str, String str2, String str3, a4x a4xVar, zum zumVar, boolean z) {
        str.getClass();
        a4xVar.getClass();
        this.f1533a = gvmVar;
        this.b = gvmVar2;
        this.c = mpmVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = a4xVar;
        this.h = zumVar;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avm)) {
            return false;
        }
        avm avmVar = (avm) obj;
        return this.f1533a.equals(avmVar.f1533a) && this.b.equals(avmVar.b) && this.c.equals(avmVar.c) && Intrinsics.d(this.d, avmVar.d) && this.e.equals(avmVar.e) && this.f.equals(avmVar.f) && Intrinsics.d(this.g, avmVar.g) && this.h.equals(avmVar.h) && this.i == avmVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + cs0.b(this.g, ua80.b(ua80.b(ua80.b(ohs0.e(this.c, (this.b.hashCode() + (this.f1533a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(firstOpponent=");
        sb.append(this.f1533a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", infoLabel=");
        sb.append(this.d);
        sb.append(", infoLabel2=");
        f140.v(sb, this.e, ", gameLabel=", this.f, ", cardOnTableList=");
        sb.append(this.g);
        sb.append(", options=");
        sb.append(this.h);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
