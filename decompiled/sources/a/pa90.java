package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pa90 implements ta90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26645a;
    public final Map b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final boolean f;

    public pa90(String str, Map map, boolean z, boolean z2, float f, boolean z3) {
        str.getClass();
        map.getClass();
        this.f26645a = str;
        this.b = map;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = z3;
    }

    @Override // a.ta90
    public final boolean a() {
        return this.c;
    }

    @Override // a.ta90
    public final float b() {
        return this.e;
    }

    @Override // a.ta90
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa90)) {
            return false;
        }
        pa90 pa90Var = (pa90) obj;
        return Intrinsics.d(this.f26645a, pa90Var.f26645a) && Intrinsics.d(this.b, pa90Var.b) && this.c == pa90Var.c && this.d == pa90Var.d && Float.compare(this.e, pa90Var.e) == 0 && this.f == pa90Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + defpackage.c.a(brm0.e(brm0.e(ohs0.f(this.b, this.f26645a.hashCode() * 31, 31), 31, this.c), 31, this.d), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(url=");
        sb.append(this.f26645a);
        sb.append(", extraHeaders=");
        sb.append(this.b);
        sb.append(", reloadEnable=");
        ua80.u(", deposit=", ", reloadButtonAlpha=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", webPageLoading=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
