package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xkv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41047a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final lho f;
    public final znq0 g;
    public final List h;

    public xkv0(String str, long j, String str2, String str3, int i, lho lhoVar, znq0 znq0Var, List list) {
        list.getClass();
        this.f41047a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = lhoVar;
        this.g = znq0Var;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkv0)) {
            return false;
        }
        xkv0 xkv0Var = (xkv0) obj;
        return this.f41047a.equals(xkv0Var.f41047a) && this.b == xkv0Var.b && this.c.equals(xkv0Var.c) && this.d.equals(xkv0Var.d) && this.e == xkv0Var.e && this.f == xkv0Var.f && this.g.equals(xkv0Var.g) && Intrinsics.d(this.h, xkv0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + rw2.b((this.f.hashCode() + twn.a(this.e, ua80.b(ua80.b(rw2.b(this.f41047a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31)) * 31, 31, this.g.f44687a);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "WinterGameModel(id=", this.f41047a, ", sportId=");
        f140.v(sbO, ", title=", this.c, ", trackTitle=", this.d);
        sbO.append(", trackId=");
        sbO.append(this.e);
        sbO.append(", status=");
        sbO.append(this.f);
        sbO.append(", dateStart=");
        sbO.append(this.g);
        sbO.append(", menu=");
        sbO.append(this.h);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
