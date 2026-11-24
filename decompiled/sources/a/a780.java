package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f354a;
    public final f7k0 b;
    public final j1h0 c;
    public final asb0 d;
    public final String e;
    public final yzp f;
    public final vi9 g;
    public final vi9 h;
    public final vi9 i;
    public final luo j;

    public a780(Context context, f7k0 f7k0Var, j1h0 j1h0Var, asb0 asb0Var, String str, yzp yzpVar, vi9 vi9Var, vi9 vi9Var2, vi9 vi9Var3, luo luoVar) {
        this.f354a = context;
        this.b = f7k0Var;
        this.c = j1h0Var;
        this.d = asb0Var;
        this.e = str;
        this.f = yzpVar;
        this.g = vi9Var;
        this.h = vi9Var2;
        this.i = vi9Var3;
        this.j = luoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a780)) {
            return false;
        }
        a780 a780Var = (a780) obj;
        return Intrinsics.d(this.f354a, a780Var.f354a) && Intrinsics.d(this.b, a780Var.b) && this.c == a780Var.c && this.d == a780Var.d && Intrinsics.d(this.e, a780Var.e) && Intrinsics.d(this.f, a780Var.f) && this.g == a780Var.g && this.h == a780Var.h && this.i == a780Var.i && Intrinsics.d(this.j, a780Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f354a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.f20682a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f354a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + Separators.RPAREN;
    }
}
