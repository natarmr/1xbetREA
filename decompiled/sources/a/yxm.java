package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43429a;
    public final c280 b;
    public final String c;
    public final String d;
    public final String e;

    public yxm(c280 c280Var, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f43429a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxm)) {
            return false;
        }
        yxm yxmVar = (yxm) obj;
        return Intrinsics.d(this.f43429a, yxmVar.f43429a) && this.b.equals(yxmVar.b) && Intrinsics.d(this.c, yxmVar.c) && this.d.equals(yxmVar.d) && this.e.equals(yxmVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(hne.g(this.b, this.f43429a.hashCode() * 31, 961), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "Default(teamName=", this.f43429a, ", firstOpponentIconOfPair=", ", secondOpponentIconOfPair=null, infoLabel=");
        f140.v(sbP, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
