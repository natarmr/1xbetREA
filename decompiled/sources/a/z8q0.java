package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z8q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f43981a;
    public final y9q0 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final w6k g;
    public final k6z h;
    public final mrq i;
    public final long j;

    public z8q0(j83 j83Var, y9q0 y9q0Var, List list, int i, boolean z, int i2, w6k w6kVar, k6z k6zVar, mrq mrqVar, long j) {
        this.f43981a = j83Var;
        this.b = y9q0Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = w6kVar;
        this.h = k6zVar;
        this.i = mrqVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8q0)) {
            return false;
        }
        z8q0 z8q0Var = (z8q0) obj;
        return Intrinsics.d(this.f43981a, z8q0Var.f43981a) && Intrinsics.d(this.b, z8q0Var.b) && Intrinsics.d(this.c, z8q0Var.c) && this.d == z8q0Var.d && this.e == z8q0Var.e && this.f == z8q0Var.f && Intrinsics.d(this.g, z8q0Var.g) && this.h == z8q0Var.h && Intrinsics.d(this.i, z8q0Var.i) && p4e.c(this.j, z8q0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + twn.a(this.f, brm0.e((dw9.a(brm0.g(this.b, this.f43981a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String strA = j9q0.a(this.f);
        String strM = p4e.m(this.j);
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f43981a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        brm0.v(this.d, ", maxLines=", ", softWrap=", sb, this.c);
        f140.s(", overflow=", strA, ", density=", sb, this.e);
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append(strM);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
