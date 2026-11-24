package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40475a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;
    public final zqe f;
    public final String g;
    public final Map h;

    public x8r0(String str, boolean z, String str2, int i, String str3, zqe zqeVar, String str4, Map map) {
        zqeVar.getClass();
        this.f40475a = str;
        this.b = z;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = zqeVar;
        this.g = str4;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8r0)) {
            return false;
        }
        x8r0 x8r0Var = (x8r0) obj;
        return this.f40475a.equals(x8r0Var.f40475a) && this.b == x8r0Var.b && this.c.equals(x8r0Var.c) && this.d == x8r0Var.d && this.e.equals(x8r0Var.e) && Intrinsics.d(this.f, x8r0Var.f) && this.g.equals(x8r0Var.g) && this.h.equals(x8r0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b((this.f.hashCode() + ua80.b(twn.a(this.d, ua80.b(brm0.e(this.f40475a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("TopPlayerModel(id=", this.f40475a, ", isSelected=", this.b, ", name=");
        twn.w(this.d, this.c, ", translationId=", ", shortName=", sbU);
        sbU.append(this.e);
        sbU.append(", country=");
        sbU.append(this.f);
        sbU.append(", image=");
        sbU.append(this.g);
        sbU.append(", statisticByColumn=");
        sbU.append(this.h);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
