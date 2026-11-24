package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1675a;
    public final c280 b;
    public final String c;
    public final String d;
    public final String e;

    public aym(c280 c280Var, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f1675a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aym)) {
            return false;
        }
        aym aymVar = (aym) obj;
        return Intrinsics.d(this.f1675a, aymVar.f1675a) && this.b.equals(aymVar.b) && Intrinsics.d(this.c, aymVar.c) && this.d.equals(aymVar.d) && this.e.equals(aymVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(hne.g(this.b, this.f1675a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "V2(teamName=", this.f1675a, ", opponentIcon=", ", infoLabel=");
        f140.v(sbP, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
