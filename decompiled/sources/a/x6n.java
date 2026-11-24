package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x6n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40371a;
    public final String b;
    public final int c;
    public final String d;
    public final a4x e;

    public x6n(String str, String str2, int i, String str3, i4 i4Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        i4Var.getClass();
        this.f40371a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6n)) {
            return false;
        }
        x6n x6nVar = (x6n) obj;
        return Intrinsics.d(this.f40371a, x6nVar.f40371a) && Intrinsics.d(this.b, x6nVar.b) && this.c == x6nVar.c && Intrinsics.d(this.d, x6nVar.d) && Intrinsics.d(this.e, x6nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.a(this.c, ua80.b(this.f40371a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DsTeamModel(id=", this.f40371a, ", title=", this.b, ", translationId=");
        kng0.w(this.c, ", image=", this.d, ", subTeams=", sbN);
        return cs0.n(sbN, this.e, Separators.RPAREN);
    }
}
