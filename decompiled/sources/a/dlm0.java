package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dlm0 implements jlm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1n f6290a;
    public final i1n b;
    public final String c;
    public final String d;
    public final String e;

    public dlm0(i1n i1nVar, i1n i1nVar2, String str, String str2, String str3) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        this.f6290a = i1nVar;
        this.b = i1nVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlm0)) {
            return false;
        }
        dlm0 dlm0Var = (dlm0) obj;
        if (!this.f6290a.equals(dlm0Var.f6290a) || !this.b.equals(dlm0Var.b) || !Intrinsics.d(this.c, dlm0Var.c) || !this.d.equals(dlm0Var.d) || !this.e.equals(dlm0Var.e)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f6290a.hashCode() * 31)) * 923521, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("Cricket(firstOpponent=");
        sb.append(this.f6290a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreGameTitle=, scoreSetTitle=, scoreResultTitle=, infoLabel=");
        f140.v(sb, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        sb.append(this.e);
        sb.append(", lowerBracket=");
        sb.append(x0mVar);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
