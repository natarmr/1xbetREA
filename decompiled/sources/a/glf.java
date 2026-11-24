package a;

import android.gov.nist.core.Separators;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class glf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f11487a;
    public final ank0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ank0 i;
    public final String j;

    public glf(ank0 ank0Var, ank0 ank0Var2, String str, String str2, String str3, String str4, String str5, String str6, ank0 ank0Var3, String str7) {
        this.f11487a = ank0Var;
        this.b = ank0Var2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = ank0Var3;
        this.j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glf)) {
            return false;
        }
        glf glfVar = (glf) obj;
        return this.f11487a.equals(glfVar.f11487a) && this.b.equals(glfVar.b) && this.c.equals(glfVar.c) && this.d.equals(glfVar.d) && this.e.equals(glfVar.e) && this.f.equals(glfVar.f) && this.g.equals(glfVar.g) && this.h.equals(glfVar.h) && this.i.equals(glfVar.i) && this.j.equals(glfVar.j);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.j.hashCode() + dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(dw9.a(this.f11487a.f1159a.hashCode() * 31, 31, this.b.f1159a), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i.f1159a);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2GameLogKillUiModel(killer=");
        sb.append(this.f11487a);
        sb.append(", victim=");
        sb.append(this.b);
        sb.append(", weaponUrl=");
        f140.v(sb, this.c, ", headShotUrl=", this.d, ", penetratedUrl=");
        f140.v(sb, this.e, ", throughSmokeUrl=", this.f, ", noScopeUrl=");
        f140.v(sb, this.g, ", killerBlindUrl=", this.h, ", helpKiller=");
        sb.append(this.i);
        sb.append(", flashUrl=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
