package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class god implements znd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gdp0 f11625a;
    public final gdp0 b;
    public final j83 c;
    public final String d;

    public god(gdp0 gdp0Var, gdp0 gdp0Var2, j83 j83Var, String str) {
        str.getClass();
        this.f11625a = gdp0Var;
        this.b = gdp0Var2;
        this.c = j83Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof god)) {
            return false;
        }
        god godVar = (god) obj;
        return this.f11625a.equals(godVar.f11625a) && this.b.equals(godVar.b) && this.c.equals(godVar.c) && Intrinsics.d(this.d, godVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.f(this.c, (this.b.hashCode() + (this.f11625a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "RegularTeam(teamOne=" + this.f11625a + ", teamTwo=" + this.b + ", matchInfo=" + ((Object) this.c) + ", score=" + this.d + Separators.RPAREN;
    }
}
