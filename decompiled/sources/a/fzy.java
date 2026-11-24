package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lcp0 f10433a;
    public final lcp0 b;
    public final String c;
    public final String d;
    public final String e;
    public final hkv0 f;

    public fzy(lcp0 lcp0Var, lcp0 lcp0Var2, String str, String str2, String str3, hkv0 hkv0Var) {
        str.getClass();
        str2.getClass();
        this.f10433a = lcp0Var;
        this.b = lcp0Var2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = hkv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzy)) {
            return false;
        }
        fzy fzyVar = (fzy) obj;
        return this.f10433a.equals(fzyVar.f10433a) && this.b.equals(fzyVar.b) && Intrinsics.d(this.c, fzyVar.c) && Intrinsics.d(this.d, fzyVar.d) && this.e.equals(fzyVar.e) && this.f == fzyVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f10433a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastGameInfoUiModel(teamOne=");
        sb.append(this.f10433a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", date=");
        f140.v(sb, this.c, ", score=", this.d, ", statGameId=");
        sb.append(this.e);
        sb.append(", winningIndicator=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
