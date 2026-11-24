package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class omm0 implements umm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1n f25511a;
    public final i1n b;
    public final String c;
    public final String d;
    public final String e;
    public final ogm f;
    public final ogm g;

    public omm0(i1n i1nVar, i1n i1nVar2, String str, String str2, String str3, ogm ogmVar, ogm ogmVar2) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        this.f25511a = i1nVar;
        this.b = i1nVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = ogmVar;
        this.g = ogmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omm0)) {
            return false;
        }
        omm0 omm0Var = (omm0) obj;
        if (!this.f25511a.equals(omm0Var.f25511a) || !this.b.equals(omm0Var.b) || !Intrinsics.d(this.c, omm0Var.c) || !this.d.equals(omm0Var.d) || !this.e.equals(omm0Var.e)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return this.f.equals(omm0Var.f) && this.g.equals(omm0Var.g);
    }

    public final int hashCode() {
        return this.g.f25227a.hashCode() + ((this.f.f25227a.hashCode() + ((x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f25511a.hashCode() * 31)) * 923521, 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("Cricket(firstOpponent=");
        sb.append(this.f25511a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreGameTitle=, scoreSetTitle=, scoreResultTitle=, infoLabel=");
        f140.v(sb, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        sb.append(this.e);
        sb.append(", lowerBracket=");
        sb.append(x0mVar);
        sb.append(", startResultIndicator=");
        sb.append(this.f);
        sb.append(", endResultIndicator=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
