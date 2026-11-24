package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w1g implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38396a;
    public final wnq0 b;
    public final v1g c;
    public final v1g d;
    public final String e;

    public w1g(String str, wnq0 wnq0Var, v1g v1gVar, v1g v1gVar2, String str2) {
        str.getClass();
        this.f38396a = str;
        this.b = wnq0Var;
        this.c = v1gVar;
        this.d = v1gVar2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1g)) {
            return false;
        }
        w1g w1gVar = (w1g) obj;
        return Intrinsics.d(this.f38396a, w1gVar.f38396a) && this.b.equals(w1gVar.b) && this.c.equals(w1gVar.c) && this.d.equals(w1gVar.d) && this.e.equals(w1gVar.e);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "BAKKARA_KEY";
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ua80.b(-1851593425, 31, this.f38396a)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberBakkaraUiModel(key=BAKKARA_KEY, matchInfo=");
        sb.append(this.f38396a);
        sb.append(", timer=");
        sb.append(this.b);
        sb.append(", player=");
        sb.append(this.c);
        sb.append(", banker=");
        sb.append(this.d);
        sb.append(", fieldImage=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
